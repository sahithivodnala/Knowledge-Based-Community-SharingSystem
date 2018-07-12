<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<style>
body {margin:0;}

.topnav {
  overflow: hidden;
  background-color: #000000;
}

.topnav a {
  float: left;
  display: block;
  color: #f5f5f5;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 20px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
    background-color: #000000;
    color: white;
}
</style>
</head>
<body>

<div class="topnav">
  <a class="active" href="Home.jsp">Home</a>
  <a href="Login.jsp">login</a>
  <a href="register.jsp">register</a>
 
  </div>

<div style="padding-left:25px">
</div>

<style>
form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
    width: 25%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #000000;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 15%;
}



.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 50%;
    border-radius: 50%;
}

.container {
    padding: 10px;
    text-align: center;
    font-size : 30px;
}
.head {
    padding:30px;
    text-align:center;
    }

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 100px) {
}
</style>
<body style = "background-color:#F5F5F5">
<body>
<div id="head">
<h1><center> KNOWLEDGE BASED COMMUNITY SHARING SYSTEM</center></h1>
</div>
<h2>Login Form</h2>

<form action="LoginServlet" method = "post">
  <div class="imgcontainer">
    <img src="login.png" alt="login" class="login" style = "width:500px;height:300px;">
  </div>

  <div class="container">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="Username" required><br></br>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pwd" required><br></br>
      
    <button type="submit"><b>Login</b></button><br></br>
     </div><br></br>
    
</form>

</body>
</html>