<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String name = request.getParameter("name");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 성공</h1>
	<h3>반갑습니다. <%=name %>님 </h3><br />
	<br />
	<h3><a href="../account/main.jsp">계좌관리</a></h3>
	<h3><a href="">게시판 (준비중)</a></h3>
	<h3><a href="../index.jsp">홈으로</a></h3>
</body>
</html>