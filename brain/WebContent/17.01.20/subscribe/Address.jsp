<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%
	// 전 페이지에서 파라미터를 통해 보낸 값들을 받는다
	request.setCharacterEncoding("euc-kr");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");

	// 받아 온 값을 세션에 넣어준다
	session.setAttribute("id", id);
	session.setAttribute("pw", pw);
	session.setAttribute("name", name);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
추가 정보 입력
	<form action="Agreement.jsp" method="post">
	주소 : <input type="text" name="address"><br>
	전화번호 : <input type="text" name="phone"><br>
	이메일 : <input type="text" name="email"><br>
	<input type="submit"> 
	</form>
</body>
</html>