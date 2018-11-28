<%@page import="java.io.PrintWriter"%>
<%@page import="Model.DataBaseDAO" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<style type="text/css">
body{
   margin-left: 145px;
   margin-right: 145px;
   margin-top: 60px;
   margin-bottom: 60px;
  
  }
</style>
<title>Answers</title>
</head>
<body background="bggg.jpg">
<% 
String q = request.getParameter("val"); 
DataBaseDAO dataP = new DataBaseDAO();
ArrayList<String> hold = new ArrayList<String>();
int km=0;
int m=0;
String ques = dataP.DisplayQuestion(q);
for(int i = 0 ; i < ques.length(); i++)
{	
	if (ques.charAt(i)==':')
	{
		km=km+3;
		break;
		
	}
	km++;	
	
}
String q2 = ques.substring(km);
String as = ques.substring(0, km-2);
km=0;
%>
<div margin=75px class="card">
  			<div class="card-header">
 			
   				<%=as %>
 		 	</div>
  			<div class="card-body">
    		<blockquote class="blockquote mb-0">
    			 <p><%= q2 %></p>
    		</blockquote>
  			</div>
		</div><br>


<% 
hold = dataP.ShowAllAnswersScience(q);
	
	for(String str : hold)
	{
		m=0;
	for(int i = 0 ; i < str.length(); i++)
	{	
		if (str.charAt(i)==':')
		{
			m=m+3;
			break;
			
		}
		m++;	
		
	}
	String ans = str.substring(m);
	String ansby = str.substring(0, m-2);
	%>
	<div margin=75px class="card">
  			<div class="card-header">
 			
   				<%=ansby %>
 		 	</div>
  			<div class="card-body">
    		<blockquote class="blockquote mb-0">
    			 <p><%= ans %></p>
    		</blockquote>
  			</div>
		</div>
	
<%} %>





</body>
</html>