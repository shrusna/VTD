<!DOCTYPE html>
<html>
</html>
<head>
	<title>Ville de Tours</title>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, intial-scale=1.0">
	<style type="text/css">
		*{
			margin: 0;
			padding: 0;
            font-family: Century Gothic;
		}

		footer {
            position: fixed;
            padding-top: -5px;
            left: 0;
            bottom: 0;
            height: 40px;
            width: 100%;
            background-color: black;
            color: white;
            font-size: 15px;
       }

       	nav{
			width: 100%;
			height: 50px;
			line-height: 40px;
			z-index: 999;
		}

		nav img {
			margin-top: -40px;
			margin-left: 0%;
		}

		nav ul{
			float: left;
			margin-right: 95px;
			
		}

		nav ul li{
			list-style-type: none;
			display: inline-block;
			transition: 0.5s all;
		}

		nav ul li:hover{
			background-color: #000;	
		}

		nav ul li.active{
			background-color: #000;
	        color: #fff;
		}

		nav ul li a{
			text-decoration: none;
			color: #fff;
			padding: 30px;
			font-weight: bold;
		}

       .tblmember {
       		border-collapse: collapse;
       		border: 2px solid #000;
       		margin-top: 4%;
       		position: absolute;
       		margin-left: 4%;
       		margin-top: 4%;
       }

       .tblmember th {
       		text-align: left;
       		background-color: #fff;
       		color: #000;
       		padding: 4px 20px 4px 8px;
       }

       .tblmember td {
       		padding: 4px 8px;
       		background-color: #000;
       		color: #fff;
       }

		.main{
			width: 120%;
			height: 100vh;
			background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)), url(duda.jpg);
			background-size: cover;
		}

		.drop1 ul 
		{
		    position:absolute;
		    left:-9999px;
		    top:-9999px;
		    list-style-type:none;
		    z-index: 999;
		}
		.drop1 li:hover { position:relative; background:black; }
		.drop1 li:hover ul 
		{
		    left:0px;
		    top:38px;
		    background:black;
		    padding:0px;
		}

		.drop1 li:hover ul li a 
		{
		    padding:5px;
		    display:block;
		    width:200px;
		    text-indent:5px;
		    background-color:black;
		}
		.drop1 li:hover ul li a:hover { background:red; }

	</style>
</head>
<body>
    <%@page import="Model.Reserve,DatAccess.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
	<div class="main">
		<nav>
			<img src="img/tours.png" width="270" height="190">
			<ul class="drop1">
				<li class="active"><a href="membereserv.jsp">Reservation Member</a></li>
				<li><a href="memberakun.jsp">Member Account</a><br></li>
				<li><a href="memberfeedback.jsp">Member Feedback</a></li>
                <li><img src="img/000.png" width="15" height="15"></a>
                    <ul>
                        <li><a href='utama.html'>Homepage</a></li><br>
                        <li><a href="LogoutA">Logout</a></li><br>
                   </ul>
                </li>				
			</ul>
		</nav>
					<div class="tblmember">
<%
List<Reserve> list=ReserveDAO.getAllRecords();
request.setAttribute("list",list);
%>
						<table>
				         <tr>
				            <th>Reservation ID</th>
				            <th>NIK</th>
				            <th>First Name</th>
				            <th>Last Name</th>
				            <th>Gender</th>
				            <th colspan="3">Date of Birth</th>
				            <th>Address</th>
				            <th>Email</th>
				            <th>Phone Number</th>
				            <th>Phone Number</th>
				            <th colspan="3">Departure</th>
 				            <th>Destination</th>
				            <th>Memo</th>   
				            <th>Edit</th>   
                                                                                    <th>Delete</th>
				         </tr>
                                         <c:forEach items="${list}" var="b">
				         <tr>
				         	<td>${b.getReserveid()}</td>
				         	<td>${b.getNik()}</td>
				         	<td>${b.getReservfirst()}</td>
				         	<td>${b.getReservlast()}</td>
				         	<td>${b.getGender()}</td>
				         	<td>${b.getDatebd()}</td>
				         	<td>${b.getDatebm()}</td>
				         	<td>${b.getDateby()}</td>
				         	<td>${b.getAddress()}</td>
				         	<td>${b.getReservemail()}</td>
				         	<td>${b.getReservphone1()}</td>
				         	<td>${b.getReservphone2()}</td>
				         	<td>${b.getDatedd()}</td>
				         	<td>${b.getDatedm()}</td>
				         	<td>${b.getDatedy()}</td>
				         	<td>${b.getDestination()}</td>
				         	<td>${b.getMemo()}</td>
            <td><a href="editreservform.jsp?reserveid=${b.getReserveid()}">Edit</a></td>                                                            
            <td><a href="deletereserv.jsp?reserveid=${b.getReserveid()}">Delete</a></td></tr>
				         </tr>
                                         </c:forEach>
				       </table> 
				    </div>   
	</div>
</body>
</html>