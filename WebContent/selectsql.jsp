<%@page import="java.util.List"%>
<%@page import="com.isooou.websqlselect.Student"%>
<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>

<%
	List<Student> stus = (List<Student>)request.getAttribute("students"); 
%>



	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<td>用户名</td>
			<td>密码</td>
			<td>删除</td>
		</tr>
	
	<%
		for(Student stu:stus){
	%>
		<tr>
			<td><%= stu.getUsername()%> </td><!-- 这里可以调用getUsername是因为创建了一个Student类的变量stu -->
			<td><%= stu.getUserpassword()%> </td>
			<td><a href="deletServlet?username=<%=stu.getUsername()%>">DELET</a></td>
		</tr>
		
	<%	
		}
	%>
	
	</table>

</body>
</html>