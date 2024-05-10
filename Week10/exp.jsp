<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="exp" class="week10.exp3" />
<%
	int n=3;
	int num = exp.getExp(n);
	out.print(num);
%>
</body>
</html>
