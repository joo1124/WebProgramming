<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="uage" class="com.test.age1" />
<%
	int year = Integer.parseInt(request.getParameter("age"));
	out.print("당신의 나이는"+ uage.inputage(year));
%>
</body>
</html>
