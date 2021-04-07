<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/ul.css">
</head>
<body>
	<form action="MemUpdateServlet" name = "MemUpdateServlet" id = "MemUpdateServlet">
	<fieldset class="insertTitle">
		<legend>회원 상세 정보</legend>
		<ul>
			<li>
				<label for="id">아이디 :</label>
				<input type="text" name="id" id= "id"  value="${member.id}"> <br>
			</li>
			<li>
				<label for="name">이름 :</label>
				<input type="text" name="name" id="name" value="${member.name}"> <br>
			</li>
			<li>
				<label for="age">나이 :</label>
				<input type="text" name="age" id= "age"  value="${member.age}"> <br>
			</li>
			<li>
				<label for="gender">성별 :</label>
				<input type="text" name="gender" id="gender" value="${member.gender}"> <br>
			</li>
			<li>
				<label for="email">이메일 :</label>
				<input type="email" name="email" id="email" value="${member.email}"> <br>
			</li>
			<li>
				<a href="javascript:MemUpdateServlet.submit()">수정</a>
				<a href="javascript:MemUpdateServlet.reset()">지우기</a>
				<a href="MemListServlet">목록 으로</a>
			</li>
			
		</ul>
	</fieldset>
	</form>
</body>
</html>