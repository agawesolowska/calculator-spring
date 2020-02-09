<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Calculator</title>
</head>
<body>
	<h1 style="text-align: center">Calculator</h1>

	<form method="post">
		<input type="text" name="firstNumber" /> <select name="action">
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="*">*</option>
			<option value="/">/</option>
		</select> <input type="text" name="secondNumber" />
		<button>Calculate</button>
	</form>

	<c:if test="${not empty(result)}">
		<div class="welcome">
			Result: <strong>${result}</strong>
		</div>
	</c:if>
</body>
</html>