<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="person" class="com.test.checkP" scope="request"></jsp:useBean>
<%
/*	String name = "hong";
	String id = "idhong";
	person.setId(id);
	person.setName(name);
*/%>
<jsp:setProperty property="*" name="person"/>

<jsp:forward page="out.jsp"></jsp:forward>
</body>
</html>
