<!DOCTYPE html>
<html>
<head>
	<title>Ville de Tours</title>
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

.footer 
		{
            position: absolute;
            right: 120%;
            bottom: 5%;
            height: 30px;
            width: 15%;
            background-color: black linear-gradient(rgba(0,0,0,0.10),rgba(0,0,0,0.10));
            color: white;
            font-size: 20px;


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

.contact-form
        {
            position: absolute;
            top: 60%;
            left: 75%;
            transform: translate(-50%,-50%);
            width: 900px;
            height: 590px;
            padding: 0px 0px;
            box-sizing: border-box;
            background: rgba(0,0,0,0);
        }
        .contact-form p
        {
            margin: 0;
            padding: 0;
            font-weight: bold;
            color: #fff;
        }
        .contact-form input
        {
            width: 100%;
            margin-bottom: 20px;
        }
        .contact-form input[type="text"],
        .contact-form input[type="password"],
        .contact-form input[type="date"],
        .contact-form select,
        .contact-form input[type="email"],
        .contact-form input[type="phone"],
        .contact-form input[type="number"],
        .contact-form datalist,
        .contact-form input[list="stat"]
        {
            border: none;
            border-bottom: 2px solid #fff;
            background: transparent;
            outline: none;
            height: 40px;
            color: #fff;
            font-size: 16px;
        }

        .contact-form textarea,
        {
        	border: none;
            border-bottom: 2px solid #fff;
            background: transparent;
            outline: none;
            height: 130px;
            width: 50px;
            color: #fff;
            font-size: 14px;
        }
        .contact-form input[type="submit"] {
            height: 40px;
            width: 310px;
            color: #000;
            font-size: 20px;
            background: #000, linear-gradient(rgba(0,0,0,0),rgba(0,0,0,0));
            cursor: pointer;
            border-radius: 10px;
            border: none;
            outline: none;
            margin-top: 0%;
            font-weight: bold;
            left: 50px;
        }
        .contact-form a
        {
            color: #fff;
            font-size: 14px;
            font-weight: bold;
            text-decoration: none;
        }

        .input-container {
          margin: 3em auto;
          max-width: 300px;
          background-color: #EDEDED;
          border: 1px solid #DFDFDF;
          border-radius: 5px;
          margin-right: 66%;

        }

        input[type='file'] {
          display: none;
        }

        .file-info {
          font-size: 0.9em;
        }

        .browse-btn {
          background: #000;
          color: #fff;
          min-height: 35px;
          padding: 10px;
          border: none;
          border-top-left-radius: 5px;
          border-bottom-left-radius: 5px;
        }

        .browse-btn:hover {
          background: #0009;

        }

        @media (max-width: 300px) {
          button {
            width: 100%;
            border-top-right-radius: 5px;
            border-bottom-left-radius: 0;
          }
          
          .file-info {
            display: block;
            margin: 10px 5px;
          }
        }

     </style>
</head>

	<div class="main">
		<nav>
			<img src="img/tours.png" width="150" height="110">
			<ul class="drop1">
				<li><a href="home.html">Home</a></li>
				<li class="des1"><a href="destination.html">Destinations</a>
					<ul>
					    <li><a href='west.html'>Western Indonesia</a></li><br>
					    <li><a href='central.html'>Central Indonesia</a></li><br>
					    <li><a href='east.html'>Eastern Indonesia</a></li><br>
				   </ul> 
				</li>
				<li><a href="galeri.html">Gallery</a><br>
                   <ul>
					    <li><a href='mountain.html'>Mountain</a></li><br>
					    <li><a href='beach.html'>Beach</a></li><br>
					    <li><a href='park.html'>Park</a></li><br>
					    <li><a href='sea.html'>Sea</a></li><br>
				   </ul>
				</li>
				<li><a href="reservform.jsp">Reservation</a></li>
				<li class="active"><a href="kontak.jsp">Contact</a></li>
                <li><a href="#"><img src="img/000.png" width="15" height="15"></a>
                    <ul>
                        <li><a href='Logout'>Logout</a></li><br>
                   </ul>
                </li>
			</ul>
		</nav>
	</div>
	<div class="contact-form">
    <form>
    	<table class="table1">
    <tfoot>
    	<tr>
    		<td colspan="7"> <input type="submit" name="" value="SUBMIT"></td>
    	</tr>
    </tfoot>
    <tr>
    	<td><p>Email*</p></td>
    	<td><p> : </p></td>
    	<td><br><input type="Email" name="feedemail" placeholder="Enter Your Email" required=""></br></br></td>
    </tr>
    <tr>
    	<td><p>First Name*</p></td>
    	<td><p> : </p></td>
    	<td><input type="text" name="feedfirst" placeholder="First Name" required=""></td>
   		<td width="100"></td>
   	<tr>
    	<td><p>Last Name</p></td>
    	<td><p> : </p></td>
    	<td><input type="text" name="feedlast" placeholder="Last Name"></td>
    </tr>
	<tr>
		<td><p>Feedback</p></td>
    	<td><p>:</p></td>
        <td><input type="text" name='feedback' rows="5" cols="30"></td>
    </tr>
 
    	</table>
    </form>
    <table class="footer">
        <tr>
            <td class="followus" >FollowUs</td>
            <td class="followus">:</td>
            <td ><img src="img/ig.png" width="35" height="35"></td>
            <td class="tulisan" >@VillaDeToure</td>
           	<td></td>
           	<td><img src="img/twitter.png" width="35" height="35"><td>
            <td class="tulisan" >@VillaDeToure</td>
         	<td><img src="img/ea.png"></td>
       	    <td></td>
       		<td class="tulisan" >villadetour@vdt.com</td>
       		<td><img src="img/ph.png" width="35" height="35"></td>
       		<td class="tulisan">(+62)81317755407</td>
        </tr>
    </table>
<script type="text/javascript" src="jquery-3.4.1.min.js"></script>
<script type="text/javascript">
    const uploadButton = document.querySelector('.browse-btn');
const fileInfo = document.querySelector('.file-info');
const realInput = document.getElementById('real-input');

uploadButton.addEventListener('click', (e) => {
  realInput.click();
});

realInput.addEventListener('change', () => {
  const name = realInput.value.split(/\\|\//).pop();
  const truncated = name.length > 20 
    ? name.substr(name.length - 20) 
    : name;
  
  fileInfo.innerHTML = truncated;
});
</script>	 	
</body>
</html>