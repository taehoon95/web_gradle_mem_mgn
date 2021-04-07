package web_gradle_mem_mgn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web_gradle_mem_mgn.dto.Member;
import web_gradle_mem_mgn.service.MemberService;

@WebServlet("/loginProcess")
public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private MemberService service = new MemberService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpServletRequest  httpRequest = (HttpServletRequest) request;
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("pass");
		
		Member member = service.loginMember(new Member(id,passwd));
		request.getSession().setAttribute("member", member);
		
		
		
		if(member !=null){
			System.out.println(member);
			System.out.println(httpRequest.getContextPath());
			((HttpServletResponse)response).sendRedirect(httpRequest.getContextPath()+"/admin/main.jsp");
//			request.getRequestDispatcher(httpRequest.getContextPath()+"/admin/main.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("loginForm.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
