<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Ajax Home</h1>
	
	<form>
		게시물 번호: <input type="text" name="boardNo" value="" id="boardNo"><br>
		제목: <input type="text" name="title" value="" id="title"><br>
		내용: <input type="text" name="content" value="" id="content"><br>
		작성자: <input type="text" name="writer" value="" id="writer"><br>
	</form>
	
	<div>
		<button id="getBtn">Read</button>
		<button id="getJsonBtn">Read Json</button>
		<button id="getXmlBtn">Read Xml</button>
	</div>
</body>
</html>