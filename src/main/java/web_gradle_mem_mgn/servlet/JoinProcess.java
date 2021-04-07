package web_gradle_mem_mgn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_gradle_mem_mgn.dto.Member;
import web_gradle_mem_mgn.service.MemberService;

@WebServlet("/joinProcess")
public class JoinProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService service = new MemberService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String passwd = request.getParameter("pass");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");

		Member member = new Member(id, passwd, name, age, gender, email);
		int res = service.joinMember(member);

		Member m = (Member) request.getSession().getAttribute("member");
		
		if (m == null) {
				if (res == 1) {
					request.getRequestDispatcher("loginForm.jsp").forward(request, response);
				} else {
					request.getRequestDispatcher("JoinForm.jsp").forward(request, response);
				}
			}else if (m.getId().contentEquals("admin")) {
			request.getRequestDispatcher("MemListServlet").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}