<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%System.out.println("=> 홈 메인.jsp로 입장"); %>
<h1>메인 메뉴</h1>
		<input type="hidden" name="action" value="logout" /> <br />
		<input type="submit" id="btn" value="logout" />
	<br /><a href="account.do">계좌관리</a><br />
	<a href="article.do">게시판</a><br />
	<a href="admin.do">관리자</a><br />
	<a href="">홈으로</a>
</body>
</html>