<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>파일 업로드</title>
</head>
<body>
	<form action="/spring_20170221/upload.do" method="post" enctype="multipart/form-data">
		<input type="text" name="title" />
		<br />
		<input type="text" name="content" />
		<br />
		<input type="file" name="up" />
		<br />
		<input type="submit" value="업로드" />
	</form>
</body>
</html>