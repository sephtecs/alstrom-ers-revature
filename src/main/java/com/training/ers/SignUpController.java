package com.training.ers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUpController
 */
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");

		String gender = request.getParameter("gender");
		String notification[] = request.getParameterValues("notification");
		String qualification[] = request.getParameterValues("qualification");
		
		out.println("<html><body>");
		out.println("Welcome " + uname);
		out.println("Your password is :" + pwd);
		out.println("Your gender is :" + gender);
		out.println("Your notifications are :" + notification);
		out.println("Your qualification is :" + qualification);
		
		out.println("</body></html>");
	}

}
