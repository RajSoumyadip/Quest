<%@page import="java.util.ArrayList"%>
<%@page import="Model.DataBaseDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<link rel="stylesheet" href="css/style.css">
	<link href="https://fonts.googleapis.com/css?family=Charmonman" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta charset="UTF-8">
<style type="text/css">
.bapar
  {
  margin-left: 145px;
   margin-right: 145px;
   margin-top: 60px;
   margin-bottom: 60px;
  }
  
   .navbar {
  width: 100%;
  background-color: #f4f4f4 ;
  overflow: auto;
}

/* Navbar links */
.navbar a {
  float: left;
  text-align: center;
  padding: 12px;
  color: white;
  text-decoration: none;
  font-size: 17px;
}

/* Navbar links on mouse-over */
.navbar a:hover {
  background-color: #000;
}
  
</style>
<title>User Question & Answers</title>
</head>
<body>
<% String username = (String)session.getAttribute("uname"); %>
<div class ="bgimg-1">
  <div class="navbar">
    <a href="#"><button type="button" class="btn btn-outline-secondary" onclick="location.href='topic.jsp'">Home</button></a> 

  <a href="#"><button type="button" class="btn btn-outline-secondary"> <%= username %> Questions</button></a> 
    <a href="#"><button type="button" class="btn btn-outline-secondary" onclick="location.href='Science.jsp'">Log out</button></a> 

	</div>
<%
String userid = (String)session.getAttribute("userid");
DataBaseDAO dataBaseDAO = new DataBaseDAO();
ArrayList<String> hold = new ArrayList<String>();
hold = dataBaseDAO.QuestionOfUser(userid);
int c = 0;
for(String str : hold)
{
	for(int i = 0;i<str.length();i++)
	{
		if(str.charAt(i)==':')
			break;
		c++;
	}
	String show = str.substring(c+1);
	String qid = str.substring(0,c);
	%>
	<div class="bapar">
<div class="card">
  <div class="card-header">
    Your Contributions
  </div>
  <div class="card-body">
  <div class="jumbotron">
  <h1 class="display-4"></p><%=show %></h1>
  <hr class="my-4">
  <%
  ArrayList<String> anshold = new ArrayList<String>();
  anshold = dataBaseDAO.AnswerOfUser(qid);
  for(String ans : anshold)
  {
	  
  
  %>
  <p class="lead"><%=ans %></p>
  <hr class="my-4">
  <%} %>
</div>
  </div>
</div>
</div>
<%	
}
%>
</body>
</html>