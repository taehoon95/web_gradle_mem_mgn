package web_gradle_mem_mgn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutProcess")
public class LogoutProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LogoutProcess() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		session.invalidate();
		
		response.setHeader("pragma","No-cache");
		response.setHeader("Cache-Control","no-cache");
		response.addHeader("Cache-Control","No-store");
		response.setDateHeader("Expires",1L);



		response.sendRedirect("loginForm.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
