<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Ville de Tours</title>
	<style type="text/css">
body
{
	margin: 0;
	padding: 0;
	background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.5)), url(img/bgmember.jpg);
	background-size: cover;
	font-family: sans-serif;
}

.loginBox
{
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%,-50%);
	width: 350px;
	height: 440px;
	padding: 80px 40px;
	box-sizing: border-box;
	background: rgba(0,0,0,.5);
	border-radius: 20px;
}
.user
{
	width: 100px;
	height: 100px;
	border-radius: 50%;
	overflow: hidden;
	position: absolute;
	top: calc(-100px/2);
	left: calc(50% - 50px);
}
h2
{
	margin: 0;
	padding: 0 0 20px;
	color: #fff;
	text-align: center;
}
.loginBox p
{
	margin: 0;
	padding: 0;
	font-weight: bold;
	color: #fff;
}
.loginBox input
{
	width: 100%;
	margin-bottom: 20px;
}
.loginBox input[type="text"],
.loginBox input[type="password"]
{
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 16px;
}
::placeholder
{
	color: rgba(255,255,255,.5);
}
.loginBox input[type="submit"]
{
	border: none;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 16px;
	background: #000;
	cursor: pointer;
	border-radius: 20px;
}
.loginBox input[type="submit"]:hover
{
	background: #efed40;
	color: #262626;
}
.loginBox a
{
	color: #fff;
	font-size: 14px;
	font-weight: bold;
	text-decoration: none;
}


.close{
  position: absolute;
  right: 25px;
  top: 0;
  color: #000;
  font-size: 35px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: red;
  cursor: pointer;
}

.awe{
	position: relative;
	bottom: 50%;
}


</style>	
</head>
	<body>	
			<div class="loginBox">
				<img src="img/user.png" class="user">
				<h2>Log In Member</h2>
				<div id="id01" class="modal">
					<form class="modal" action="Login" method="post" >
						<a href="utama.html"><span onclick="document.getElementById('id01').style.display='none'" class="close" title="Back Menu">&times;</span></a>
						<p>Username</p>
						<input type="text" name="username" placeholder="Enter Username" required="">
						<p>Password</p>
						<input type="password" name="password" placeholder="??????" required="">
						<input type="submit" name="" value="Log In">
						<div class="awe">
						<h5>*don't have an account? please register</h5>
						</div>
						<a href="regis.jsp">Register Account</a>
				    </form>
				</div>
			</div>
	</body>
</html>
