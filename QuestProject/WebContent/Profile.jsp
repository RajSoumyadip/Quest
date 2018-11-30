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
<title>User Profile</title>
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
<div class="card">
  <div class="card-header">
    Team Quest
  </div>
  <div class="card-body">
  <div class="jumbotron">
  <h1 class="display-4"><p>Dear,</p><%=username %></h1>
  <p class="lead">Thanks for being a part of this family of Quest. We hope that our team is being able to cater to all your expectations. </p>
  <hr class="my-4">
  <p>You can view all your valuable contributions by clicking on the button below.... </p>
  <button type="button" class="btn btn-outline-primary" onclick="location.href='ProfileQuestion&Ans.jsp'">Your Questions</button>
 
  
</div>
  </div>
</div>
</div>

</body>
</html>