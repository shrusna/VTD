<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
	<title>Ville de Tours</title>
	<style type="text/css">
*{
   margin: 0;
   padding: 0;
   font-family: Century Gothic;
   color: #000;
}
ul{
	float: right;
	list-style-type: none;
	margin: 50px;
	padding-right: 45px;
    word-spacing: 10px;
    font-weight: bold;
    font-size: 20px;
	}	

	ul li
	{
	display: inline-block;
	}

	ul li a
	{
	text-decoration: none;
	color: #000;
	padding: 5px 20px;
	transition: 0.6s ease;
	}

	ul li a:hover
	{
	background-color: #000;
	color: #fff;
	}

	ul li.active a
	{
	background-color: #000;
	color: #fff;
	}

.logo img
	{
	margin: 25px;
	padding-left: 35px;
	float: left;
	width: 150px;
	height: auto;
	}

body{
        margin: 0;
        padding: 0;
    }
        body:before{
            content: '';
            position: fixed;
            width: 100vw;
            height: 100vh;
            background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)), url("duda.jpg");
            background-position: center center;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
            -webkit-filter: blur(10px);
            -moz-filter: blur(10px);
            -o-filter: blur(10px);
            -ms-filter: blur(10px);
            filter: blur(10px);
        }

        .contact-form
        {
            position: absolute;
            top: 120%;
            left: 49%;
            transform: translate(-50%,-50%);
            width: 700px;
            height: 1300px;
            padding: 30px 40px;
            box-sizing: border-box;
            background: #fff;
            border-radius: 50px;
        }
        
        .contact-form2
        {
            margin: 0;
            padding: 0 0 20px;
            text-align: center;
            position: absolute;
            top: 3%;
            left: 48.5%;
            transform: translate(-50%,-50%);
            width: 800px;
            height: 5px;
            padding: 40px 20px;
            box-sizing: border-box;
            background: rgba(0,0,0,0);
            font-weight: bold;
        }
        
        .form
        {
        	margin: 0;
            padding: 0 0 20px;
            position: fixed;
            top: 10%;
            right: 18%;
            transform: translate(-50%,-50%);
            width: 50px;
            height: 80px;
            padding: 40px 20px;
            box-sizing: border-box;
            background: rgba(0,0,0,0);
            font-weight: bold;
        }
        .butt1
        {
        	margin: 0;
            padding: 0 0 20px;
            position: fixed;
            top: 35%;
            right: 12%;
            transform: translate(-50%,-50%);
            width: 50px;
            height: 50px;
            padding: 40px 20px;
            box-sizing: border-box;
            background: rgba(0,0,0,0);
            font-weight: bold;
        }
         .butt2
        {
        	margin: 0;
            padding: 0 0 20px;
            position: fixed;
            top: 54%;
            right: 12.5%;
            transform: translate(-50%,-50%);
            width: 50px;
            height: 50px;
            padding: 40px 20px;
            box-sizing: border-box;
            background: rgba(0,0,0,0);
            font-weight: bold;
        }
         .butt3
        {
        	margin: 0;
            padding: 0 0 20px;
            position: fixed;
            top: 75%;
            right: 12%;
            transform: translate(-50%,-50%);
            width: 50px;
            height: 50px;
            padding: 40px 20px;
            box-sizing: border-box;
            background: rgba(0,0,0,0);
            font-weight: bold;
        }
        .contact-form p
        {
            margin: 0;
            padding: 0;
            width: 150px;
            font-weight: bold;
            color: #000;
            font-size: 15px;
        }
        .contact-form input
        {
            width: 100%;
            margin-bottom: 20px;
            padding-top: 15px;
            font-size: 15px;
        }
        .contact-form input[type="text"],
        .contact-form input[type="password"],
        .contact-form input[type="date"],
        .contact-form select,
        .contact-form textarea,
        .contact-form input[type="email"],
        .contact-form input[type="phone"],
        .contact-form input[type="number"],
        .contact-form datalist,
        .contact-form input[list="stat"]
        {
            border: none;
            border-bottom: 4px solid #000;
            background: transparent;
            outline: none;
            height: 25px;
            color: #000;
            font-size: 13px;
        }
        .contact-form input[type="submit"] {
            height: 40px;
            color: #fff;
            font-size: 15px;
            background: #000;
            cursor: pointer;
            border-radius: 5px;
            border: none;
            outline: none;
            margin-top: 0%;
            font-weight: bold;
            border-color: #000;
            position: relative;
        }
        .contact-form a
        {
            color: #000;
            font-size: 20px;
            font-weight: bold;
            text-decoration: none;
        }
        input[type="checkbox"] 
        {
            width: 20%;
        }
       .tr1 input[type="text"]
        {
            text-align: center;
        }
        .tr2 input[type="text"]
        {
            text-align: center;
        }
</style>
</head>
<body>
<%@page import="Model.Reserve"%>
<%@page import="DatAccess.ReserveDAO"%>
          <% 
            String id=request.getParameter("reserveid");
            Reserve b=ReserveDAO.getRecordById(Integer.parseInt(id));
        %>
<div class="contact-form">
    <form action="editreserv.jsp" name="form1" >
    <input type="hidden" name="reservid" value="<%=b.getReserveid()%>"/>        
    	<table class="table1">
    <tfoot>
    </tfoot>
    <tr>
        <td><p>NIK*</p></td>
        <td colspan="2"><input type="text" name="nik" value="<%=b.getNik()%>"></td>
    </tr>
    <tr>
        <td><p>First Name*</p></td>
        <td colspan="2"><input type="text" name="reservfirst" value="<%=b.getReservfirst()%>"></td>
    </tr>
    <tr>
        <td><p>Last Name</p></td>
        <td colspan="2"><input type="text" name="reservlast" value="<%=b.getReservlast()%>"></td>
    </tr>
    <tr>
        <td><p>Gender*</p></td>
        <td><input name="gender" value="<%=b.getGender()%>" type="text" /><p align="center"></p></td>
    </tr>
    <tr class="tr1">
        <td><p>Date of Birth*</p></td>
        <td><input name="datebd" type="text" value="<%=b.getDatebd()%>"></td>
        <td><input name="datebm" type="text" value="<%=b.getDatebm()%>"></td>
        <td><input name="dateby" type="text"  value="<%=b.getDateby()%>"></td>
    </tr>
    <tr>
        <td><p>ADDRESS*</p></td>
        <td colspan="2"><input type="text" name="address" value="<%=b.getAddress()%>"></td>
    </tr>
    <tr>
        <td><p>Email*</p></td>
        <td colspan="2"><input type="Email" name="reservemail" value="<%=b.getReservemail()%>"></td>
    </tr>
    <tr>    
        <td><p>Phone No.*</p></td>
        <td colspan="2"><input type="text" name="reservphone1" value="<%=b.getReservphone1()%>"></td>
    </tr>
    <tr>    
        <td><p>Phone No.</p></td>
        <td colspan="2"><input type="text" name="reservphone2" value="<%=b.getReservphone2()%>"></td>
    </tr>
    <tr class="tr2">    
        <td><p>Date of Departure*</p></td>
        <td><input  name="datedd" type="text" value="<%=b.getDatedd()%>"></td>
        <td><input  name="datedm" type="text" value="<%=b.getDatedm()%>"></td>
        <td><input  name="datedy" type="text" value="<%=b.getDatedy()%>"</td>
    </tr>
    <tr>
        <td><p>Destination</p></td>
        <td><input name="destination" value="<%=b.getDestination()%>" type="text" /> </td> 
    <tr>
        <td><p>Transportation</p></td>
        <td><input name="transportation" value="<%=b.getTransportation()%>" type="text"/></td>
    </tr>
    <tr>
        <td><p>MEMO</p></td>
        <td colspan="2"><input type="text" name="memo"  value="<%=b.getMemo()%>" ></td>
    </tr>
    <tr>
        <td><p>Total Price</p></td>
        <td colspan="2"><input name="total" type="text" value="<%=b.getTotal()%>" /></td>
        
        <td colspan="6"> <input type="submit" name="" value="SUBMIT"></td>
    </tr>
        <tr>
            <td height="20"></td>
        </tr>
    	</table>
    </form>
</body>
</html>