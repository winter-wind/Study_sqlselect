/*
 * 这是一个Servlet容器类继承HttpServlet,调用doGet()方法
 * 创建一个DAO，这里是一个数据库连接用文件转去========>StudentDao.java查看
 * 创建daoc对象
 * ||
 * ||
 * ||
 * ||
 * 转发到selectsql.jsp
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
		List<Student> students = studentdao.getAll();//将Dao中的List集合赋给这个集合
		//System.out.println(students.get(0)+"这是doGet");
		request.setAttribute("students", students);
		request.getRequestDispatcher("/selectsql.jsp").forward(request, response);
		//转发到selectsql.jsp
	}

}
