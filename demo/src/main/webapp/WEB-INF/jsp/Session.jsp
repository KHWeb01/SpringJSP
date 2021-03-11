<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Session 예제</h1>
	<hr><h2>Session 주요 정보 조회</h2>
	Session ID: <%= session.getId() %><br>
	Session MaxInactiveInterval: <%= session.getMaxInactiveInterval() %><br>
	
	<%
		long mseconds = session.getCreationTime();
		Date time = new Date(mseconds);
	%>
	
	Session CreationTime: <%= mseconds %> <br>
</body>
</html>