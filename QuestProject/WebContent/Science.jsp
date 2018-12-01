<%@page import="java.io.PrintWriter"%>
<%@page import="Model.DataBaseDAO" %>
<%@page import="java.util.ArrayList"%>
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
body{
background-color: #D6EAF8;
}

.navbar {
  width: 100%;
  background-color: #f4f4f4;
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


  .bapar
  {
  margin-left: 145px;
   margin-right: 145px;
   margin-top: 60px;
   margin-bottom: 60px;
  }
</style>
<title>Science And Technology</title>
<script src="Scripts/post.js" type="text/javascript"></script>
</head>
<body>
<% String username = (String)session.getAttribute("uname"); %>
<div class ="bgimg-1">
  <div class="navbar">
    <button type="button" class="btn btn-outline-secondary" onclick="location.href='topic.jsp'">Home</button>

  <button type="button" class="btn btn-outline-secondary" onclick="location.href='Profile.jsp'">Welcome <%= username %></button> 
   
   <form action="logout" method="post">
   <button type="submit" class="btn btn-outline-secondary">Log out</button> 
</form>
	</div>

<div class="bapar">
<% 
	
	int k=0,km=0;
	DataBaseDAO data = new DataBaseDAO();
	ArrayList<String> hold = new ArrayList<String>();
	hold = data.ShowAllQuestionScience();
	for (String str : hold) {
			k=0;
			km=0;
		for(int i = 0 ; i < str.length(); i++)
		{
			if (str.charAt(i)=='#')
			{
				break;
			}
			k++;	
			
		}
		
		String p = str.substring(k);
		for(int i = 0 ; i < p.length(); i++)
		{	
			if (p.charAt(i)==':')
			{
				km=km+3;
				break;
				
			}
			km++;	
			
		}
		String pm = p.substring(km);
		
		
		%>
		
		

		<div margin=75px class="card">
  			<div class="card-header">
   				<%String tt="";
   				for(int i = 0 ; i < p.length();i++)
   					{
   					if(p.charAt(i)==':')
   					{
   						break;
   					}
   					tt=tt+p.charAt(i);
   					}
   					%>
   					<%=tt %>
 		 	</div>
  			<div class="card-body">
    		<blockquote class="blockquote mb-0">
    			 <p><a href = "Particular.jsp?val=<%=str%>"><%=pm %></a></p>
    		</blockquote>
  			</div>
  			
		</div>
		<br>
		
		<%
		
     }  
	%>


<div class="card">
  <div class="card-header">
    <h3>Post your Question</h3>
  </div>
  <div class="card-body">
    <h5 class="card-title">
    <form action="Add_Question_Science" method="post">
  <div class="form-group">
    <input class="form-control" type="text" placeholder="Question" name="t1" required /><br> 
  </div>
  <button type="submit" class="btn btn-primary">Post</button>
</form></h5>
   
  </div>
</div>


	
	
	
		</div>

</body>
</html>