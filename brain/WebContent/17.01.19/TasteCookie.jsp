<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<% Cookie[] cookies = request.getCookies();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	if(cookies!= null){ 
		if(cookies.length==0){ 
			out.println("cookie nono"); 
		}
		for(int i=0; i<cookies.length; i++){
		if(cookies[i].getName().equals("id") || cookies[i].getName().equals("pw")){
%>
	cookie name : <%=cookies[i].getName()%> <br>
	cookie value : <%=cookies[i].getValue()%><br>
	<%
	}
	}
}
%>
	
</body>
</html>