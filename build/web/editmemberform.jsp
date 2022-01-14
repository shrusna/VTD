<%@page import="java.lang.String"%>
<%@page import="DatAccess.MemberDAO"%>
<!DOCTYPE html>
<html>
	<head>
	<script type="text/javascript">
		
	</script>	
		<meta charset="utf-8">
		<title>Ville de Tours</title>
	<style type="text/css">
body
{
	margin: 0;
	padding: 0;
	background-image: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)), url(park/boro.jpg);
	background-size: cover;
	font-family: sans-serif;
}
.loginBox
{
	border-radius: 5%;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%,-50%);
	width: 350px;
	height: 650px;
	padding: 80px 40px;
	box-sizing: border-box;
	background: rgba(0,0,0,.5);
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

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover 
{
  opacity: 0.8;
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


</style>	
</head>
	<body>	
                     <%@page import="Model.Member"%>

<% 
            String id=request.getParameter("userid");
            Member b=MemberDAO.getRecordById(Integer.parseInt(id));
%>
			<div class="loginBox">
				<h2>Register In Here</h2>
				<div id="id01" class="modal">
					<form class="modal" action="editmember.jsp" method="post" >
                                                                                              <input type="hidden" name="userid" value="<%=b.getUserid()%>"/>

						<div class="closeh">
						<a href="login.jsp"><span class="close" title="Close Modal">&times;</a></span>
						<p>Username</p>
                                                                                                            <input type="text" value="<%=b.getUsername() %>" name="username" >
                                                				<p>Password</p>
						<input value="<%=b.getPassword() %>" type="password" name="password" >
						<p>First Name</p>
                                                                                                            <input type="text" value="<%=b.getFirst() %>" name="first">
						<p>Last Name</p>
						<input type="text" value="<%=b.getLast() %>" name="last" >
						<p>Email</p>
                                                                                                            <input type="Email" value="<%=b.getEmail() %>" name="email">
						<p>Phone Number</p>
						<input type="text" value="<%=b.getPhone() %>" name="phone" >
				
						<input type="submit" name="" value="Register">
						</div>
				    </form>
				</div>
			</div>
	</body>
</html>
