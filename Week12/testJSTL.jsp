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
<%
	int p=7, q=5;
	int sum=p+q;
	out.print(p+ "+" + q + "=" + sum);
%>
<br>
<c:set var="p" value="7"></c:set>
<c:set var="q" value="5"/>
${p} + ${q} = ${p+q}
<hr>
<c:choose>
	<c:when test="${p>0}">
		Positive
	</c:when>
	<c:when test="${p<0}">
		Negative
	</c:when>
	<c:otherwise>
		Zero
	</c:otherwise>
</c:choose>
<hr>
<c:choose>
	<c:when test="${empty param.name}">
		<a href="">로그인하세요</a>
	</c:when>
	<c:otherwise>
		환영합니다.<br>
		당신의 이름은 ${param.name}이고 나이는 ${param.age}세 입니다.
	</c:otherwise>
</c:choose>
<c:if test="${param.name==''}">
	<a href="">로그인하세요</a>
</c:if>
<hr>
${param.name}
</body>
</html>
