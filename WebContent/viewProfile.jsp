<%@ page import = "javaproject.javaproject.RegisterBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  <a class="active" href="Profile.jsp">Back</a>
  <a href="Login.jsp">Logout</a>
  
 
  </div>

<div style="padding-left:25px">
</div>

<style>
form {
    border: 3px solid #f1f1f1;
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
<%
RegisterBean rb = (RegisterBean)session.getAttribute("user");

out.println("<table>");
out.println("<tr><td>First Name :</td><td>"+rb.getFirstName()+"</td></tr>");
out.println("<tr><td>Last Name  :</td><td>"+rb.getLastName()+"</td></tr>");
out.println("<tr><td>Contact No :</td><td>"+rb.getContactNo()+"</td></tr>");
out.println("<tr><td>Roll Type  :</td><td>"+rb.getRollType()+"</td></tr>");
out.println("<tr><td>Email      :</td><td>"+rb.getEmail()+"</td></tr>");
out.println("</table>");

%>

</body>
</html>