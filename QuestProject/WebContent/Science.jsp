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
		
		System.out.println(p);
		%>
		<h5><p><a href = "Particular.jsp?val=<%=str%>"><%=p %></a></p></h5>
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