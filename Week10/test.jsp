<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="test.jsp" method="post">
		<select name="car">
		<option value="" >select</option>
		<option value="sedan" >SEDAN</option>
		<option value="suv" >SUV</option>
		</select>
	<input type="submit" value="제출">
	</form>
<%
	String car = request.getParameter("car");
	if(car !=null){
%>
<jsp:include page="displayImage.jsp">
	<jsp:param value='<%=car%>' name='car' />
</jsp:include>
<%
	}	
%>
</body>
</html>
