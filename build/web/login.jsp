<!DOCTYPE html>
<html>
<head>
     <title>LogIn</title>
	 <!link rel="stylesheet" type="text/css" href="css/style.css">
         <style>
         body{
	margin: 0;
	padding: 0;
	background-image:url(img/Background.jpg);
	font-family: Century Gothic;
	background-position: center;
	height: 100vh;
	background-size: cover;
}
.box{
	width: 320px;
	height: 380px;
	background-color: #000000b3;
	color: #fff;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%,-50%);
	padding: 70px 30px;
	box-sizing: border-box;
	border-radius: 10px;

}

.avatar{
	width: 120px;
	height: 120px;
	border-radius: 50%;
	position: absolute;
	top: -20%;
	left: calc(50% - 50px);
}

h1{
	margin: 0;
	padding: 0 0 20px;
	text-align: center;
	font-size: 22px;
}

.box input{
	width: 100%;
	margin-bottom: 20px;

}

.box input[type= "text"],input[type="password"]
{
	border: none;
	border-bottom: 1px solid #fff;
	background-color: transparent;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 16px;
}

.box input[type= "submit"]{
	border: none;
	background-color:#fb2525;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 18px;
	border-radius: 20px;
	transition: 0.4s;
}

.box input[type= "submit"]:hover{
	cursor: pointer
	background-color:#ffc107;
	color: #000;

}

.box a{
	text-decoration: none;
	font-size: 12px;
	line-height: 20px;
	color: darkgrey;
	transition: 0.4s ease;
}
.box a:hover{
	color: #ffc107;
}
</style>

</head>
<body>
 <div class="box"/>
 	<img src="img/avatar.png" class="avatar"/>
 	<h2>Login here</h2>
 	<form>
 		<input type="text" name"" placeholder="Enter Username">
 		<input type="password" name"" placeholder="Enter Password">
 		<!--input type="submit" name"" value="Login"-->
                <!--form action = "http://localhost:8080/SchoolMAnagementSystem/home.jsp">
                    <input type ="submit" value ="Login"
                </form-->
                <!--a href ="http://localhost:8080/SchoolMAnagementSystem/home.jsp"><!button>Login</button></a-->
              <a href="home.jsp">login</a>



	</body>
</html>