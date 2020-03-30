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
<tr>
<td><tiles:insertAttribute name="header" /></td>
</tr>
<tr>
<td><tiles:insertAttribute name="body" /></td>
</tr>
<tr>
<td><tiles:insertAttribute name="footer" /></td>
</tr>
</table>
</body>
</html>