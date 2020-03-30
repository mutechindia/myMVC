<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<form:form action="submitlogin.do" modelAttribute="use1" method="POST">
<tr>
<td>Name</td><td><form:input path="name"/></td>
</tr>
<tr><td>Password</td>
<td><form:password path="password" />
</td>
</tr>
<tr>
<td><input type="submit"></td>
</tr>
</form:form>
</table>
</body>
</html>