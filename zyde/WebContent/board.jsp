<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>리스트</title>
</head>
<body>
<table>
<tr>
<td>번호</td>
<td>제목</td>
<td>글쓴이</td>
</tr>
<c:forEach items="${boardList}" var="board">
<tr>
<td>${board.num}</td>
<td>${board.title}</td>
<td>${board.member.memberid}</td>
</tr>
</c:forEach>
</table>
</body>
</html>