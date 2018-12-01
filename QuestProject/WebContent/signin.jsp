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
	body{
background-color: #D6EAF8;
}
	 .bapar
  {
  margin-left: 550px;
   margin-right: 145px;
   margin-top: 180px;
   margin-bottom: 60px;
  }
	</style>

</head>


<body>

<div class="bapar">
<form action="signinServlet" method="post">
    <div class="card" style="max-width: 20rem;">
  <div class="card-header">
    Sign In
  </div>
  <div class="card-body">
  <div class="jumbotron">
  <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" name="email" required>
  <br>
  <div class="form-group">
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="pass" required>
  </div>
  </div>
  <button type="submit" class="btn btn-primary">Sign In</button>
  <br>
   <center><a href="signup.jsp">Don't have an account?</a></center><br>
 </form>
 
</div>
  </div>
</div>
 
</div>

	</div>
</body>
</html>