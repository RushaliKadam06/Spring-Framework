<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Brand</th>
</tr>

<c:forEach var="pen" items="${pens}">
<tr>
<td>${pen.getId()}</td>
<td>${pen.getName()}</td>
<td>${pen.getBrand()}</td>
<td> <a href="delete?id=${pen.getId()}">Delete</a> </td>
<td><a href="update">Update</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>