<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%
	// �� ���������� �Ķ���͸� ���� ���� ������ �޴´�
	request.setCharacterEncoding("euc-kr");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");

	// �޾� �� ���� ���ǿ� �־��ش�
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
�߰� ���� �Է�
	<form action="Agreement.jsp" method="post">
	�ּ� : <input type="text" name="address"><br>
	��ȭ��ȣ : <input type="text" name="phone"><br>
	�̸��� : <input type="text" name="email"><br>
	<input type="submit"> 
	</form>
</body>
</html>