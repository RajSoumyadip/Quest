<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<title>Quest||SignIn</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<style type="text/css">
	.try{
	{
    margin: 0;
    width:100%
    position: absolute;
    top: 50%;
    left: 50%;
    margin-right: -50%;
    transform: translate(-50%, -50%) }
	}
	</style>

</head>


<body background="sciencebg.jpg">


<form action="signinServlet" method="post">
<div class="card text-white bg-secondary mb-3 try" style="max-width: 20rem;">
  <div class="card-header"><center>Sign In</div>
  <div class="card-body">
  <BR>
    <div class="form-group">
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" name="email">
  </div>
  <div class="form-group">
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="pass">
  </div>
  
  <button type="submit" class="btn btn-primary">Sign Up</button>
  </div>
  </form>
  <center><a href="signup.jsp">Don't have an account?</a></center><br>
</div>

	
</body>
</html>