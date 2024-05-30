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
<hr>
Name : <jsp:getProperty property="name" name="person"/><br>
Adult : <jsp:getProperty property="adult" name="person"/><br>
<hr>
Name : ${person.name} <br>
Adult : ${person.adult} <br>
</body>
</html>
