<%@ page import = "javaproject.QuestionBean" %>
<%@ page import = "java.util.*" %>
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
  <a class="active" href="Home.jsp">Home</a>
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
    </style>
<body style = "background-color:#F5F5F5">
<body>
<div id="head">
<h1><center> KNOWLEDGE BASED COMMUNITY SHARING SYSTEM</center></h1>
</div>
</body>
</body>
<body>
<%

String user = (String)session.getAttribute("un");

if (user == null) {
	response.sendRedirect("Login.jsp");
} else {
	out.println("<P align ='center'> Welcome "+ user+"</P>");
}

%>
<%
ArrayList<QuestionBean> qList = (ArrayList<QuestionBean>)request.getAttribute("qList");
out.println("<table bgcolor = '#FFFF99'");
out.println("<table>"); 
for(QuestionBean qb: qList){
	out.println("<TR>");
		out.println("<TD bgcolor='#80FFAA'>"+qb.getQid() +  "</TD><TD> " + qb.getQuestionmsg() +"</TD>");
		out.println("<TD bgcolor='#AABBFF'>"+"<A HREF = '/KBCSS_8/AddAnswer.jsp?qid="+qb.getQid()+"'>Answer</A>"+"</TD>");
		out.println("<TD bgcolor='#AABBFF'>"+"<A HREF = '/KBCSS_8/ShowalAnsServlet?qid="+qb.getQid()+"'> Show all Answer</A>"+"</TD>");
		out.println("</TR>");
		
 }
out.println("</table>");
%>


</body>
</html>