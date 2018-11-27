<%@page import="java.io.PrintWriter"%>
<%@page import="Model.DataBaseDAO" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String q = request.getParameter("val"); 
DataBaseDAO dataP = new DataBaseDAO();
ArrayList<String> hold = new ArrayList<String>();

String ques = dataP.DisplayQuestion(q);
%>

<h1><%=ques %></h1>
<% 
hold = dataP.ShowAllAnswersScience(q);
for (String st : hold) {
	%>
	<h1><%= st %></h1><br>
<%} %>





</body>
</html>