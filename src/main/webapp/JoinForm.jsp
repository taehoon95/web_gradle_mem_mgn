<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">
	<head>
	<meta charset="UTF-8">
	<title>로그인 폼</title>
<link rel ="stylesheet" href ="css/loginForm.css">
</head>
<body>

<form name = "joinform" action="joinProcess" method = "post" class="signUp" id="signupForm">
   <h1 class="signUpTitle">회원가입</h1>
   
   <input type="text" class="signUpInput" placeholder="아이디를 입력해주세요" name = "id"  autofocus required>
   <input type="password" class="signUpInput" placeholder="비밀번호를 입력해주세요"  name ="pass" required>
   <input type="text" class="signUpInput" placeholder="이름" name = "name" required>
   <input type="number" class="signUpInput" placeholder="나이" name = "age" required>
   
   남자<input type="radio" class="signUpInput" name = "gender" value="남자" checked id ="gender1"/>
   여자<input type="radio" class="signUpInput" name = "gender" value="여자" checked id ="gender2"/>
   
   <input type="email" class="signUpInput" placeholder="이메일 주소" name = "email" required>
   
   <a class="signUpButton" href = "javascript:joinform.submit()">회원 가입</a>
   <a class="signUpButton" href = "javascript:joinform.reset()">다시 작성</a>
</form>

</body>
</html>
