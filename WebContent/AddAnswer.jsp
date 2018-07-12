<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
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
  
  <a href="Login.jsp">Logout</a>
  

 
  </div>

<div style="padding-left:25px">
</div>
<body style = "background-color:#F5F5F5">
<body>
<div id="head">
<h1><center> KNOWLEDGE BASED COMMUNITY SHARING SYSTEM</center></h1>
</div>
<body>
	<form action="AnswerServlet" method="post">
	<input type = "hidden" name = "qid" value = "<%=(String)request.getParameter("qid") %>">
		Answer:<br> <input type="text" name="atext" required value=""><br>
		<input type="submit" value="Post Answer">
	</form>
</body>
</html>