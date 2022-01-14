<%@page import="DatAccess.ReserveDAO"%>
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function sub()
		{
			if ((document.form1.no.value>0)) 
			{
				alert("Check Your Email for Your Verification")
			}
		}
	</script>
    <script type="text/javascript">
  window.totalIt= function() {
  var input = document.getElementsByName("destination");
  var total = 0;
  for (var i = 0; i < input.length; i++) {
    if (input[i].checked) {
      total += parseFloat(input[i].value);
    }
  }
  document.getElementById("total").value = "0" + total.toFixed(2);
  return total;
}

window.totalAll = function()
{
  document.getElementById("total").value = (totalIt() + totalPrisClass()).toFixed(2) ;
}

window.totalPrisClass= function() {
  var input = document.getElementsByName("class");
  var total = 0;
  for (var i = 0; i < input.length; i++) {
    if (input[i].checked) {
      total += parseFloat(input[i].value);
    }
  }
  document.getElementById("total").value = "0" + total.toFixed(2);
  return total;
}


</script>
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
            background: #fff rgb(0,0,0,0.9);
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
        .dest
        {

        }

</style>
</head>
<body>
         <%@page import="Model.Reserve"%>

          <% 
            String id=request.getParameter("reserveid");
            Reserve b=ReserveDAO.getRecordById(Integer.parseInt(id));
        %>
<div class="contact-form">
<form action="editreserv.jsp" method="post">  
<input type="hidden" name="id" value="<%=b.getReserveid() %>"/>  
    	<table class="table1">
    <tfoot>
    	<tr>
            <td colspan="6"> <input id="button" type="submit" name="" value="SUBMIT"></td>
        </tr>
    </tfoot>
    <tr>
        <td><p>NIK*</p></td>
        <td><H1> : </H1></td>
        <td colspan="2"><input type="text" value="<%=b.getNik() %>" name="nik" ></td>
    </tr>
    <tr>    
        <td width="100"></td>
    </tr>   
    <tr>
        <td><p>First Name*</p></td>
        <td><H1> : </H1></td>
        <td colspan="2"><input type="text" value="<%=b.getReservfirst() %>" name="reservfirst" ></td>
    </tr>
    <tr>
        <td><p>Last Name</p></td>
        <td><H1> : </H1></td>
        <td colspan="2"><input type="text" value="<%=b.getReservlast() %>" name="reservlast" ></td>
    </tr>
    <tr>
        <td><p>Gender*</p></td>
        <td><H1> : </H1></td>
        <td><input name="gender" value="MALE" type="radio" id="p1"/><p align="center">Male</p></td>
        <td><input name="gender" value="FEMALE" type="radio" id="p2" /><p align="center">Female</p></td>
        </td>
    </tr>
    <tr class="tr1">
        <td><p>Date of Birth*</p></td>
        <td><H1> : </H1></td>
        <td><input value="<%=b.getDatebd() %>" align="center" name="datebd"  type="number" min="1" max="30" ></td>
        <td><input value="<%=b.getDatebm() %>" align="center" name="datebm" type="text" max="20" ></td>
        <td><input value="<%=b.getDateby() %>" align="center" name="dateby" type="number" min="1970" max="2019" ></td>
    </tr>
    <tr>
        <td><p>ADDRESS*</p></td>
        <td><H1> : </H1></td>
        <td colspan="2"><input value="<%=b.getAddress() %>" type="text" name="address" rows="5" cols="30"></td>
    </tr>
    <tr>
        <td><p>Email*</p></td>
        <td><H1> : </H1></td>
        <td colspan="2"><input value="<%=b.getReservemail() %>" type="email" name="reservemail" ></td>
    </tr>
    <tr>    
        <td><p>Phone No.*</p></td>
        <td><H1> : </H1></td>
        <td colspan="2"><input  type="text" value="<%=b.getReservphone1() %>" name="reservphone1" ></td>
    </tr>
    <tr>    
        <td><p>Phone No.</p></td>
        <td><H1> : </H1></td>
        <td colspan="2"><input value="<%=b.getReservphone2() %>" type="text"  name="reservphone2" ></td>
    </tr>
    <tr class="tr2">    
        <td><p>Date of Departure*</p></td>
        <td><H1> : </H1></td>
        <td><input align="center" value="<%=b.getDatedd() %>" name="datedd" type="number" min="1" max="30" ></td>
        <td><input align="center" value="<%=b.getDatedm() %>" name="datedm" type="text" max="20" ></td>
        <td><input align="center" value="<%=b.getDateby() %>" name="datedy" type="number" min="2010" max="2019"></td>
    </tr>
    <tr>
        <td><p>Destination</p></td>
        <td><h1> : </h1></td>
        <td><input align="center" name="destination" value="4833055" type="radio" id="p1" onclick="totalAll()" /><p align="center">Ngarai Sianok</p>  </td>
        <td><input align="center" name="destination" value="4717060" type="radio" id="p2" onclick="totalAll()" /><p align="center">Fort Marlborough</p></td>
        <td><input align="center" name="destination" value="9201995" type="radio" id="p3" onclick="totalAll()" /><p align="center">Tangkuban Perahu</p></td>
        </td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td><input align="center" name="destination" value="5042824" type="radio" id="4" onclick="totalAll()" /><p align="center">Pantai Sumurtiga</p></td>
        <td><input align="center" name="destination" value="3239000" type="radio" id="p5" onclick="totalAll()" /><p align="center">Pantai Peucang Banten</p></td>
        <td><input align="center" name="destination" value="7999550" type="radio" id="p6" onclick="totalAll()" /><p align="center">Kelingking Beachi</p></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td><input align="center" name="destination" value="7864593" type="radio" id="p7" onclick="totalAll()" /><p align="center">Gunung Rinjani</p></td>
        <td><input align="center" name="destination" value="3832000" type="radio" id="p8" onclick="totalAll()" /><p align="center">Taman Laut Bunaken</p></td>
        <td><input align="center" name="destination" value="6314544" type="radio" id="p9" onclick="totalAll()" /><p align="center">Pulau Wakatobi</p></td>
    </tr>       
    <tr>
        <td></td>
        <td></td>
        <td><input align="center" name="destination" value="8698400" type="radio" id="p10" onclick="totalAll()" /><p align="center">Halmahera</p></td>
        <td><input align="center" name="destination" value="8867500" type="radio" id="p11" onclick="totalAll()" /><p align="center">Pantai Ora</p></td>
        <td><input align="center" name="destination" value="10257907" type="radio" id="p12" onclick="totalAll()" /><p align="center">Raja Ampat</p></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td><input align="center" name="destination" value="4080000" type="radio" id="p13" onclick="totalAll()" /><p align="center">Danau Sentani</p></td>
        <td></td>
    </tr>   
    <tr>
            <td height="20"></td>
        </tr>     
    <tr>
        <td><p>Transportation</p></td>
        <td><h1> : </h1></td>
        <td><input name="transportation" value="500000" type="radio" id="p14" onclick="totalAll()"/><p align="center">Rent Car</p></td>
        <td><input name="transportation" value="100000" type="radio" id="p15" onclick="totalAll()"/><p align="center">MIGO</p></td>    
        <td></td>
    </tr>
    <tr>
        <td><p>MEMO</p></td>
        <td><H1> : </H1></td>
        <td colspan="2"><input value="<%=b.getMemo() %>" type="text" name="memo" rows="5" cols="30"></td>
    </tr>
    <tr>
        <td><p>Total Price</p></td>
        <td><H1> : </H1></td>
        <td colspan="2"><input value="<%=b.getTotal() %>" name="total" value="0" readonly type="text" id="total" /></td>
        <td><p>Rp</p></td>
    </tr>
        <tr>
            <td height="20"></td>
        </tr>
        </c:forEach>
    	</table>
    </form>
</div>
<div class="contact-form2">
	<a href="about.html"><img src="img/reserve.png"></a>
</div>
<div class="form">
	<a href="home.html"><img src="img/tours.png"></a>
</div>
<div class="butt1">
	<a href="destination.html"><img src="img/888.png">
</div>
<div class="butt2">
	<a href="galeri.html"><img src="img/galeri.png">
</div>
<div class="butt3">
	<a href="kontak.html"><img src="img/kontak.png">
</div>
</body>
</html>