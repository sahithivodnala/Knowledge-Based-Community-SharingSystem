<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
function validate()
{
 var FirstName = document.form.FirstName.value;
 var LastName = document.form.LastName.value;
 var Email = document.form.Email.value;
 var UserName = document.form.UserName.value;
 var Password = document.form.Password.value;
 var ContactNo= document.form.ContactNo.value;
 var RollType = document.form.RollType.value;
 
 if (FirstName==null || FirstName=="")
 {
 alert("FirstName can't be blank");
 return false;
 }
 else if (LastName==null || LastName=="" )
	 {
	 alert("LastName can't be blank");
	 return false;
	 }
 else if (Email==null || Email=="")
 {
 alert("Email can't be blank");
 return false;
 }
 else if (UserName==null || UserName=="")
 {
 alert("Username can't be blank");
 return false;
 }
 else if(password.length<4)
 {
 alert("Password must be at least 4 characters long.");
 return false;
 }
  else if (ContactNo==null || ContactNo=="")
 {
 alert("contact can't be blank");
 return false;
 }
 else if (RollType==null || RollType=="")
 {
 alert("RollType should be selected");
 return false;
 }
 
 }
 </script>
</head>
<body>
<html>
<style>
input[type=text], input[type=password] {
    width: 30%;
    padding: 5px 5px;
    margin: 2px 0;
    display: inline-block;
    border: 2px solid #ccc;
    box-sizing: border-box;
}
button {
    background-color: #000000;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 20%;
}
}
.signupbtn {
    float: left;
    width: 20%;
}
.container {
    padding: 16px;
}
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}
@media screen and (max-width: 100px) {
     .signupbtn {
       width: 50%;
    }
}
</style>
<body>


<style>
body {margin:0;}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
    background-color: #000000;
    color: white;
}


.container {
    padding: 10px;
    text-align: left;
    font-size : 30px;
}
.head {
    padding:30px;
    text-align:center;
    }
    input:required {
    background-color: white;
}
</style>
<BODY STYLE = "background-color :#F5F5F5">
</head>
<body>


<div class="topnav">
  <a class="active" href="Home.jsp">Home</a>
  <a href="Login.jsp">login</a>
  <a href="register.jsp">register</a>


</div>
<div id="head">
<h1><center> KNOWLEDGE BASED COMMUNITY SHARING SYSTEM</center></h1>
</div>
<h1><b>Sign up Form</b></h1>

<form action="Register" method = "post" onsubmit= return validate()>
  <div class="container">
   <label>FirstName</label><br>
    <input type="text" placeholder="Enter FirstName" name="FirstName" input required><br>
    <label>LastName</label><br>
    <input type="text" placeholder="Enter LastName" name="LastName" required><br>
    <label>Email</label><br>
    <input type="text" placeholder="Enter Email" name="Email" required><br>
    <label>UserName</label><br>
    <input type="text" placeholder="Enter UserName" name="UserName" required><br>
    <label>Password</label><br>
    <input type="password" placeholder="Enter Password" name="Password" required><br>
    <label>ContactNo</label><br>
    <input type="text" placeholder="ContactNo" name="ContactNo" required><br>
   
   <label>RollType</label><br>
  <input type="radio" name="RollType" value="Student" checked> Student<br>
  <input type="radio" name="RollType" value="Faculty"> Faculty<br>
  <input type="radio" name="RollType" value="Industryexpert"> Industry expert<br>

   
    <div class="clearfix">
       <button type="submit" class="signupbutton">Sign Up</button>
    </div>
  </div>
</form>

</body>
</html>



