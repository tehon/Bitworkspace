<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%
	// 전 페이지에서 파라미터로 넘긴 리졀트 값 받아오기
	String result = request.getParameter("RESULT");
	// 잘들어 갔는지 체크용
	session.getId();
	String id = (String) session.getAttribute("id");
	String pw = (String) session.getAttribute("pw");
	String name = (String) session.getAttribute("name");
	String address = (String) session.getAttribute("address");
	String phone = (String) session.getAttribute("phone");
	String email = (String) session.getAttribute("email");
	session.invalidate();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	결과
	<br>
	<%
		if (result.equals("SUCCESS"))
		{
			out.println("가입됨");
		} else
		{
			out.println("가입안됨");
		}
	%>
	<br>
	<%=id%><br>
	<%=pw%><br>
	<%=name%><br>
	<%=address%><br>
	<%=phone%><br>
	<%=email%><br>

</body>
</html>