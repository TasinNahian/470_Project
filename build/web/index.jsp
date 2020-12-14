<!DOCTYPE html>
<html>
<head>
     <title>Mastermind School</title>
	 <!link rel="stylesheet" type="text/css" href="css/style.css">
         <style>
             *{
	margin: 0;
	padding: 0;
	font-family: Century Gothic;
}
header{
	background-image:linear-gradient(rgba(0,0,0,1),rgba(0,0,0,0.1)), url(img/Background.jpg);
	height: 100vh;
	background-size: cover;
	background-position: center;
	
}
ul{
	float: right;
	list-style-type: none;
	margin-top: 25px;
}
ul li{
	display: inline-block;
	
}
ul li a{
	text-decoration: none;
	color: #fff;
	padding: 5px 20px;
	border: 1px solid transparent;
	transition: 0.6s ease;
	
}
ul li a:hover{
	background-color: #fff;
	color: #000;
	
}
ul li.active a{
	background-color:#fff;
	color: #000;
}
.logo img{
	float: left;
	width: 170px;
	height: 150px;
	
}

.main{
	max-width: 18000px;
	margin: auto
}
.title {
	position: absolute;
	top: 35%;
	left: 50%;
	transform: translate(-50%,-50%);
}
.title h1{
	color: #fff;
	font-size: 45px;
	
}
.button{
	position: absolute;
	top: 60%;
	left: 50%;
	transform: translate(-50%,-50%);
	
}
.btn{
	border: 1px solid #fff;
	padding:10px 30px;
	color: #fff;
	text-decoration: none;
	transition:1s ease;
}
.btn:hover{
	background-color: #fff;
	color: #000;
        
}

         </style>
</head>
<body>
     <header>
	 <div class="main">
	     <div class="logo">
		     
                 <img src="img/logo.jpg" />
	     <ul>
		    <!--<li class="active"><a href="#">Home</a></li>-->
			
			<li><a href="#">About</a></li>
			<li><a href="#">Contact Us & Feedback</a></li>
		 </ul>
		 <div class="title">
		     <h1> Mastermind School </h1>
		 </div>
		 <div class="button">
		     <a href="login.jsp" class="btn">LOGIN IN</a>
			 <a href="Signup.jsp" class="btn">SIGN UP</a>
		 </div>
	 </div>
	 </header>
</body>
</html>