package web_gradle_mem_mgn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_gradle_mem_mgn.service.MemberService;


@WebServlet("/MemDelServlet")
public class MemDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MemberService service;
	
    public MemDelServlet() {
    	service = new MemberService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		service.delMember(id);
		
		response.sendRedirect("MemListServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
