<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String uid = request.getParameter("id");
	String res = "<h3>사용자 아이디: " + uid + "</h3>";
	out.print(res);
%>
<br>
<%
	request.setCharacterEncoding("utf-8");
	String upw = request.getParameter("pw");
	String res1 = "<h3>사용자 비밀번호: " + upw + "</h3>";
	out.print(res1);
%>
</body>
</html>
