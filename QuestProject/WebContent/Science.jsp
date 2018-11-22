<%@page import="java.io.PrintWriter"%>
<%@page import="Model.DataBaseDAO" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Science And Technology</title>
<script src="Scripts/post.js" type="text/javascript"></script>
</head>
<body>
<h1><center>Science And Technology</center></h1>
<%  PrintWriter ob = response.getWriter();
	DataBaseDAO data = new DataBaseDAO();
	ArrayList<String> hold = new ArrayList<String>();
	hold = data.ShowAllQuestionScience();
	for (String str : hold) {
		%>
		<h5><p><%= str %></p></h5>
		<%
     }  
	%>
	
	<form action="Add_Question" method="post">
		Question : <input type="text" name="t1" /><br> 
		<input type="submit">
		</form>
		
	
</body>
</html>