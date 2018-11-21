<%@page import="java.io.PrintWriter"%>
<%@page import="Model.DataBaseDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Science And Technology</title>
</head>
<body>
<h1><center>Science And Technology</center></h1>
<% PrintWriter ob = response.getWriter();
	DataBaseDAO data = new DataBaseDAO();
	String con = data.ShowAllQuestionScience();
	out.println(con);
	%>
</body>
</html>