package web_gradle_mem_mgn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_gradle_mem_mgn.dto.Member;
import web_gradle_mem_mgn.service.MemberService;


@WebServlet("/MemGetServlet")
public class MemGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MemberService service;
	
    public MemGetServlet() {
    	service = new MemberService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id").trim();
		
		Member member = new Member(id);
		
		Member memberinfo = service.getMember(member);
		
		request.setAttribute("member", memberinfo);
		request.getRequestDispatcher("admin/MemInfo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
