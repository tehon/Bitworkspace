<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.io.*, java.util.*"%>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	//System.out.println(name+"	"+title+"	"+content);
	Date date = new Date();
	Long time = date.getTime();
	String filename = time + ".txt";
	String result;
	PrintWriter writer = null;
	try
	{	
		String filePath = application.getRealPath("/WEB-INF/bbs/" + filename);
		//System.out.println(filePath);
		writer = new PrintWriter(filePath);
		writer.printf("제목: %s %n", title);
		writer.printf("글쓴이: %s %n", name);
		writer.println(content);
		result = "SUCCESS";
	} catch (IOException e)
	{
		result = "FAIL";
	} finally
	{
		try
		{
			writer.close();
		} catch (Exception e)
		{

		}
	}
	response.sendRedirect("BBSPostResult.jsp?RESULT=" + result);
%>
