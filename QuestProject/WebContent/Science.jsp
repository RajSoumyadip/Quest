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
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta charset="UTF-8">
<style type="text/css">
body{
   margin: 45px;
  
  }
</style>
<title>Science And Technology</title>
<script src="Scripts/post.js" type="text/javascript"></script>
</head>
<body  background="sciencebg.jpg">

<form action="add_Answer">
<% 
	
	int k=0;
	DataBaseDAO data = new DataBaseDAO();
	ArrayList<String> hold = new ArrayList<String>();
	hold = data.ShowAllQuestionScience();
	for (String str : hold) {
			k=0;
		for(int i = 0 ; i < str.length(); i++)
		{
			if (str.charAt(i)=='#')
			{
				break;
			}
			k++;	
			
		}
		
		String p = str.substring(k);
		
		%>
		
		

		<div margin=75px class="card">
  			<div class="card-header">
   				UserName
 		 	</div>
  			<div class="card-body">
    		<blockquote class="blockquote mb-0">
    			 <p><a href = "Particular.jsp?val=<%=str%>"><%=p %></a></p>
    		</blockquote>
  			</div>
		</div>
		<br>
		
		<%
		
     }  
	%>
</form>

	
	
	<form action="Add_Question" method="post">
		Question : <input type="text" name="t1" /><br> 
		<input type="submit">
		</form>
		

</body>
</html>