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
			<td>�û���</td>
			<td>����</td>
			<td>ɾ��</td>
		</tr>
	
	<%
		for(Student stu:stus){
	%>
		<tr>
			<td><%= stu.getUsername()%> </td><!-- ������Ե���getUsername����Ϊ������һ��Student��ı���stu -->
			<td><%= stu.getUserpassword()%> </td>
			<td><a href="deletServlet?username=<%=stu.getUsername()%>">DELET</a></td>
		</tr>
		
	<%	
		}
	%>
	
	</table>

</body>
</html>