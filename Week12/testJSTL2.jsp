<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="db" class="com.test.dbData"/>
<table border=1>
<c:forEach var="lang" items="${db.list}" varStatus="sts" begin="0" end="3" step="1">
<tr>
	<td>${sts.index} </td>
	<td>${sts.count}</td>
	<td> ${lang}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
