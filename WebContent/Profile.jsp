<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
	margin: 0;
}

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
	padding: 30px;
	text-align: center;
}

</style>
</head>
<body>

	<div class="topnav">
		<a href="Login.jsp">logout</a>

	</div>

	<div style="padding-left: 25px"></div>

	


</head>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Profile</title>

</head>
<head>

<title>Profile</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
</script>
</head>
<body style="background-color: #F5F5F5">
<body>
	<div id="head">
		<h1>
			<center>KNOWLEDGE BASED COMMUNITY SHARING SYSTEM</center>
		</h1>
	</div>
	<a href = "/KBCSS_8/viewProfile.jsp"> View Profile</a> 
	<%
		String user = (String) session.getAttribute("un");

		if (user == null) {
			response.sendRedirect("Login.jsp");
		} else {
			out.println("<P align ='center'> Welcome " + user + "</P>");
		}
	%>
	
	


<body>
<div class="imgcontainer">
    <img src="Profile.jpg" alt="login" class="login" style = "width:500px;height:300px;">
  </div>
	
	<form action="AddQuestionServlet" method="post">
		<div class="container">
			<!-- Trigger the modal with a button -->
			<button type="button" class="btn btn-info btn-lg" data-toggle="modal"
				data-target="#myModal">Post a Question</button>
				</body>
</body>




<!-- Modal -->
<div class="modal fade" id="myModal" role="dialog">
	<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Type the Question</h4>
			</div>
			<div class="modal-body">
				Question:<br> <input type="text" name="qtext" value=""><br>

			</div>
			<div class="modal-footer">
				<input type="submit" value="Post Question">
			</div>

		</div>

	</div>
</div>

</div>
</form>
</body>
<head>
<style>
.button {
	background-color: #00b8e6;
	border: none;
	color: white;
	button-align:center;
	padding: 14px 20px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 12px;
	margin: 4px 2px;
	cursor: pointer;
}

.button {
	border-radius: 12px;
}
.center{
margin:auto;
width:100%;
border:3px;
padding:10px;
text-align:center;
border:3px;

}
</style>
</head>


<body>


	<form action="QuestionDispalyServlet" method="post">
	<div class ="center">
		<button class="button button">Show all Questions</button>
	</div>
	</form>
	
</body>


</html>