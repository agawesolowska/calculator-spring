<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Action History</title>
</head>
<body>
	<h1 style="text-align: center">History of calculator operations</h1>
	<ul>
		<c:forEach var="element" items="${listOfActions}">
			<li>${element}</li>
		</c:forEach>
	</ul>
</body>
</html>