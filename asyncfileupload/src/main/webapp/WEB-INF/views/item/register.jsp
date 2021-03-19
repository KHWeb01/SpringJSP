<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script src="https://code.jquery.com/jquery-latest.min.js"></script>

<script>
	$(document).ready(function () {
		var formObj = $("#board")
		
		$("#btnRegister").on("click", function () {
			formObj.attr("action", "/board/register")
			formObj.attr("method", "post")
			formObj.submit();
		})
		
		$("#btnList").on("click", function () {
			self.location = "/board/list"
		})
	})
</script>

<body>
	<h2>상품 등록</h2>
	
	<form:form modelAttribute="item" 
				action="register" 
				enctype="multipart/form-data">
		<table>
			<tr>
				<td>상품명</td>
				<td><form:input path="itemName"/></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><form:input path="price"/>&nbsp;원</td>
			</tr>
			<tr>
				<td>파일</td>
				<td>
					<input type="file" id="inputFile">
					<div class="uploadedList"></div>
				</td>
			</tr>
			<tr>
				<td>상품 설명</td>
				<td><form:textarea path="description"/></td>
			</tr>
		</table>
	</form:form>
	
	<div>
		<button type="submit" id="btnRegister">등록</button>
		<button type="submit" id="btnList">게시글 보기</button>
	</div>
</body>
</html>