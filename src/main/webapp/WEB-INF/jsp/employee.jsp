<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management</title>
</head>
<body>
<form: form action="employee.do" method="POST" commandName="employee">
<table>
	<tr>
		<td>Empoyee id</td>
		<td><form:input path="employee id"/></td>
	</tr>
	<tr>
		<td>name</td>
		<td><form:input path="name"/></td>
	</tr>
	<tr>
		<td colspan="2"> 
			<input type="submit" name="action" value="Add" />
			<input type="submit" name="action" value="Search" />
		</td>
	</tr>
</table>
</form: form>
<br>
<table>
	<tr>Id</tr>
	<tr>name</tr>
</table>
</body>
</html>