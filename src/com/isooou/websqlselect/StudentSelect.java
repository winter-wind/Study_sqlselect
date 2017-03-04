/*
 * ����һ��Servlet������̳�HttpServlet,����doGet()����
 * ����һ��DAO��������һ�����ݿ��������ļ�תȥ========>StudentDao.java�鿴
 * ����daoc����
 * ||
 * ||
 * ||
 * ||
 * ת����selectsql.jsp
 * */


package com.isooou.websqlselect;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/studentselect")
public class StudentSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentDao studentdao = new StudentDao();
		List<Student> students = studentdao.getAll();//��Dao�е�List���ϸ����������
		//System.out.println(students.get(0)+"����doGet");
		request.setAttribute("students", students);
		request.getRequestDispatcher("/selectsql.jsp").forward(request, response);
		//ת����selectsql.jsp
	}

}
