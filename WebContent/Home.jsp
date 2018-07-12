<!DOCTYPE html>
<html>
<head>
<style>
body {
    font-family: "Lato", sans-serif;
}

.sidenav {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: #cdb0ce;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
}

.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration: none;
    font-size: 25px;
    color: #8c888e;
    display: block;
    transition: 0.3s;
}

.sidenav a:hover, .offcanvas a:focus{
    color:black;
}

.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 25px;
    font-size: 36px;
    margin-left: 50px;
}

#main {
    transition: margin-left .5s;
    padding-top: 5px;
    text-align:center;
    color: blue;
}
#content {
color:black;
padding-top:10px;
text-align:center;
}
#tag {
color:#00697c;
padding:0px;
text-align:center;
}


@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
html {
   background : url("picture.jpg") no-repeat center fixed;
   background-size:cover;
   }
</style>
</head>
<body>

<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="Home.jsp">Home</a>
  <a href="Login.jsp">Login</a>
  <a href="register.jsp">Register</a>
  
</div>

<div id="main">
  <h1>KNOWLEDGE BASED COMMUNITY SHARING SYSTEM</h1></div>
  <div id = "tag"><p><h2><b>A platform to share knowledge</b></h2></p></div>
  <div>
  <span style="font-size:30px;cursor:pointer" onclick="openNav()"> <b>Menu</b></span>
</div>
<div id ="content">
<p style="font-size:20px;">The basic idea of KBCSS is to provide an environment for the students and faculty of a university to enhance their technical skills and to share their knowledge with their fellow students or faculty/researchers/industrial experts.</p></div>

<script>
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("main").style.marginLeft= "0";
}
</script>
    
</body>
</html> 