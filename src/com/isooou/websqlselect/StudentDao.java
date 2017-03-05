package com.isooou.websqlselect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//�������ݿ⣬��ɾ��usernameָ��������
public class StudentDao {

	public void DeletByusername(String username){
		
		Connection connection = null;
		PreparedStatement statement = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/websql";
			
			String user1= "root";
			String password1 = "Cddd";
			connection = DriverManager.getConnection(url, user1, password1);
			
			String sql = "DELETE FROM user WHERE username=?";//���ݿ�ɾ�����
			statement = connection.prepareStatement(sql);
			statement.setString(1, username);
			//����������һ��"?"��ֵusername,���Ǹ���������
			statement.executeUpdate();
			//�������ݿ�
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(statement !=null){
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(connection !=null){
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	//�������ݿⲢ��ѯ����󷵻�List����
	public List<Student> getAll(){
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		List<Student> students = new ArrayList<Student>();
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/Websql";
			
			String user1= "root";
			String password1 = "Cddd";
			connection = DriverManager.getConnection(url, user1, password1);
			
			String sql = "SELECT username,userpassword FROM user ";
			statement = connection.prepareStatement(sql);
			resultset = statement.executeQuery();
			
			while(resultset.next()){
				String username = resultset.getString(1);
				String userpassword = resultset.getString(2);
				//����      ��ȡ����--�������󲢴�ֵ----����List����
				Student student = new Student(username,userpassword);
				students.add(student);//��List�������
				//System.out.println(students);
				//System.out.println(students.get(0).toString()+"����Dao");
			}
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(resultset !=null){
					resultset.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(statement !=null){
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(connection !=null){
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return students;
	}
}
