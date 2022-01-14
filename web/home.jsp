<!DOCTYPE html>
<html>
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

		.main{
			width: 100%;
			height: 100vh;
			background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)), url(img/bgutama.jpg);
			background-size: cover;
		}

		nav{
			width: 100%;
			height: 50px;
			line-height: 40px;
			z-index: 999;
		}

		nav img{
			margin-top: -15px;
		}

		nav ul{
			float: right;
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

		img{
			margin-top: 13px;
            padding-left: 40px;
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

.title1{
	position: absolute;
	top: 17%;
	left: 8%;
}

.title1 h3{
	background-color: #000;
	padding: 5px 10px;
	color: #fff;
	font-size: 17px;
	text-decoration: none;
	margin-top: 110px;
}

.title{
	position: absolute;
	top: 25%;
	left: 8%;

}

.title h1{
	border: 5px solid #fff;
	color: #fff;
	font-size: 40px;
	margin-top: 100px;
}

.button{
	position: absolute;
	top: 54%;
	left: 8%;
}

.btn{
	padding: 10px 20px;
	color: #fff;
	text-decoration: none;
	font-weight: bold;
	font-size: 15px;
}

.btn:hover{
	background-color: #000;
	color: #fff;
}

.followus
{
    font-size: 16px;
    color: white;
    width: 100px;
}
.tulisan
{
    font-size: 12px;
}
.contactus
{
    font-size: 15px;
    color: white;
    width: 150px;
}
.drop1 ul 
{
    position:absolute;
    left:-9999px;
    top:-9999px;
    list-style-type:none;
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



	<div class="main">
		<nav>
			<a href="home.jsp"><img src="img/tours.png" width="150" height="110"></a>
			<ul class="drop1">
				<li class="active"><a href="home.jsp">Home</a></li>
				<li><a href="destination.html">Destinations</a>
					<ul>
					    <li><a href='west.html'>Western Indonesia</a></li><br>
					    <li><a href='central.html'>Central Indonesia</a></li><br>
					    <li><a href='east.html'>Eastern Indonesia</a></li><br>
				   </ul> 
				</li>
				<li><a href="galeri.html">Gallery</a>
					<ul>
					    <li><a href='mountain.html'>Mountain</a></li><br>
					    <li><a href='beach.html'>Beach</a></li><br>
					    <li><a href='park.html'>Park</a></li><br>
					    <li><a href='sea.html'>Sea</a></li><br>
				   </ul>
				</li>
				<li><a href="reservform.jsp">Reservation</a></li>
				<li><a href="kontak.jsp">Contact</a></li>
				<li><a href="#"><img src="img/000.png" width="15" height="15"></a>
					<ul>
					    <li><a href="Logout">Logout</a></li><br>
				   </ul>
				</li>
			</ul>

		</nav>

	</div>
	      <div class="title1">
     		 <h3>Who Am I ?</h3>
          </div>
     	  <div class="title">
     	     <h1>VILLE DE TOURS</h1>	
          </div>
          <div class="button">
     	     <a href="read.html" class="btn">READ MORE..</a>
          </div>

<footer>
    <table>
        <tr>
            <td class="followus" >Follow Us :</td>
            <td ><img src="img/ig.png" width="30" height="30"></td>
            <td class="tulisan" >@VillaDeToure</td>
            <td><img src="img/twitter.png" width="35" height="35"><td>
            <td class="tulisan" >@VillaDeToure</td>
            <td width="400"></td>
            <td class="contactus" >Contact Us :</td>
            <td class="tulisan" >villadetour@vdt.com</td>
        </tr>
    </table>
</footer>
</html>