package web_gradle_mem_mgn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_gradle_mem_mgn.dto.Member;
import web_gradle_mem_mgn.service.MemberService;

@WebServlet("/loginProcess")
public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private MemberService service = new MemberService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String passwd = request.getParameter("pass");
		
		Member member = service.loginMember(new Member(id,passwd));
		System.out.println(member);
		request.getSession().setAttribute("member", member);
		
		if(member !=null){
			request.getRequestDispatcher("admin/main.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("loginForm.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
