package web_gradle_mem_mgn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_gradle_mem_mgn.dto.Member;
import web_gradle_mem_mgn.service.MemberService;

@WebServlet("/MemUpdateServlet")
public class MemUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MemberService service;
	
    public MemUpdateServlet() {

    	service = new MemberService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		Member member = new Member(id, name, age, gender, email);
	
		service.modiMember(member);
		System.out.println(member);
		response.sendRedirect("MemListServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
