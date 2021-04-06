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


<form name = "loginform" action="loginProcess" method = "post" class="signUp" id="signupForm">
   <h1 class="signUpTitle">로그인</h1>
   <input type="text" class="signUpInput" placeholder="아이디를 입력해주세요" name = "id"  autofocus>
   <input type="password" class="signUpInput" placeholder="비밀번호를 입력해주세요"  name ="pass">
   <a class="signUpButton" href = "javascript:loginform.submit()">로그인</a>
   <a class="signUpButton" href = "JoinForm.jsp">회원가입</a>
</form>

</body>
</html>
