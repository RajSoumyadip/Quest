<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<link rel="stylesheet" href="css/style.css">
	<link href="https://fonts.googleapis.com/css?family=Charmonman" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<style >


* {
  box-sizing: border-box;
}

.bg-img-science {
  /* The image used */
  background-image: url("science.jpg");

  /* Control the height of the image */
  min-height: 380px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
  margin : 10px;
}

.bg-img-politics {
  /* The image used */
  background-image: url("politics.jpg");

  /* Control the height of the image */
  min-height: 380px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
  margin : 10px;
}
.bg-img-sports {
  /* The image used */
  background-image: url("sports.jpg");

  /* Control the height of the image */
  min-height: 380px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
  margin : 10px;
}
.bg-img-CE {
  /* The image used */
  background-image: url("career.jpg");

  /* Control the height of the image */
  min-height: 380px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
  margin : 10px;
}

/* Add styles to the form container */
.
}

/* Full-width input fields */
  input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit button */
.btn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}
.navbar {
  width: 100%;
  background-color: #555;
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

/* Current/active navbar link */
.active {
  background-color: #4CAF50;
}
.container {
  min-height: 380px;

  /* Center and scale the image nicely */
  
}

.image {
 
  display: block;
  width: 100%;
  height: auto;
}

.overlay {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  height: 100%;
  width: 100%;
  opacity: 0;
  transition: .5s ease;
  background-color: #000000;
}

.container:hover .overlay {
  opacity: 0.7;
}

.text {
  color: white;
  font-size: 20px;
  position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
  text-align: center;
}

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String username = (String)session.getAttribute("uname"); 
if (username==null)
	response.sendRedirect("toSignin");

%>
<div class ="bgimg-1">
  <div class="navbar">
    <a href="#"><button type="button" class="btn btn-outline-secondary" onclick="location.href='topic.jsp'">Home</button></a> 

  <a href="#"><button type="button" class="btn btn-outline-secondary" onclick="location.href='Profile.jsp'">Welcome <%= username %></button></a> 
  <form action="logout" method="post">
    <a href="#"><button type="submit" class="btn btn-outline-secondary">Log out</button></a> 
</form>
	</div>

<div class="bg-img-science">
    <div class="container">
    <div class="overlay">
    <div class="text"><h1><button type="button" class="btn btn-outline-secondary" onclick="location.href='Science.jsp'">SCIENCE AND TECHNOLOGY</button></h1></div>
    </div>
    </div>
</div>
<div class="bg-img-CE">
    <div class="container">
    <div class="overlay">
    <div class="text"><h1><button type="button" class="btn btn-outline-success" onclick="location.href='Career.jsp'">CAREER AND EDUCATION</button></h1></div>
    </div>
    </div>
</div>

<div class="bg-img-politics">
    <div class="container">
    <div class="overlay">
   <div class="text"><H1><button type="button" class="btn btn-outline-dark" onclick="location.href='Politics.jsp'">POLITICS</button></H1></div>
    </div>
    </div>
</div>

<div class="bg-img-sports">
    <div class="container">
    <div class="overlay">
    <div class="text"><H1><button type="button" class="btn btn-outline-dark" onclick="location.href='Sports.jsp'">SPORTS</button></H1></div>
    </div>
    </div>
</div>

  </div>
</body>
</html>