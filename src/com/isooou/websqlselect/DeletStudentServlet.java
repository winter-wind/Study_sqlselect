package com.isooou.websqlselect;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deletServlet")
public class DeletStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		StudentDao sd = new StudentDao();
		sd.DeletByusername(username);
		request.getRequestDispatcher("/okDelet.jsp").forward(request, response);
	}

}
