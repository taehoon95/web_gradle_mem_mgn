<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
<link rel="stylesheet" href="css/list.css">
<link rel="stylesheet" href="css/table.css">
</head>
<body>
		<table border="1">
			<thead>
				<tr>
					<td colspan="2">회원 목록</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="member" items="${list }">
					<tr>
						<td><a href=
						"MemGetServlet?id=${member.id}">${member.id}</a></td>
						<td><a href="MemDelServlet?id=${member.id }">삭제</a></td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="2"><a href="JoinForm.jsp">추가하기</a></td>
				</tr>	
			</tfoot>
		</table>
</body>
</html>