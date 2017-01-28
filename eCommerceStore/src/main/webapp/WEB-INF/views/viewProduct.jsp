<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
 <head>
 <title>Product Details</title>
 <meta name="viewport" content="width=device-width,initial-scale=1.0">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
 </head>
<body>
<! Collapsing static top Nav bar code here>
<div class="navbar navbar-inverse navbar-static-top">
  <div class="container">
   <a href="index.html" class="navbar-brand">e-ShoppinStop</a>
   
   <button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
    <span class = "icon-bar"></span>
	<span class = "icon-bar"></span>
	<span class = "icon-bar"></span>
   </button>
   <div class="collapse navbar-collapse navHeaderCollapse">
 
   <ul class="nav navbar-nav navbar-right">
   <li class="active"><a href="index.html">Home</a></li>
   <li class="dropdown">
     <a href="#" class="dropdown-toggle" data-toggle="dropdown">All Categories<b class="caret"></b></a>
	  <ul class="dropdown-menu">
	   <li><a href= "#">Literature & Fiction</a></li>
	   <li><a href= "#">Biographies</a></li>
	   <li><a href="#">Romance</a></li>
	   <li><a href="#">Best-Sellers</a></li>
	 </ul>
   <li class="dropdown">
     <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> Account<b class="caret"></b></a>
	  <ul class="dropdown-menu">
	   <li><a href= "login.html"><span class="glyphicon glyphicon-hand-right"></span> Login</a></li>
	   <li><a href= "signup.html"><span class="glyphicon glyphicon-pencil"></span> SignUp</a></li>
	 </ul>
   <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
   </ul>
  </div>
 </div>
</div>
<div class="container-wrapper">
   <div class="container">
       <div class="page-header">
          <h1>Product Details</h1>
           <p class="lead"> Here is the  details of the product</p>
       </div>

  <div class="container">
      <div class="row">
         <div class="col-md-5">
           <img src="#" alt="image" style="width:100%;height:300px" />
         </div>
		 
   <div class="col-md-5">
           <h3>${product.name}</h3>
           <p>${product.description}</p>
           <p><b>Author:</b>${product.author}</p>
           <p><b>Published By:</b>${product.publisher}</p>
           <p><b>Price:</b>${product.unitPrice} Rupees</p>
           <p><b>Delivery within 4-7 business Days</b></p>

   </div>
  </div>
</div>

<!fixed Bottom Nav bar code here>
<div class="navbar navbar-default navbar-fixed-bottom">
 <div class="container">
  <p class="navbar-text pull-left">@Copyright 2017 e-ShoppinStop,Inc. All rights reserved.</p>
  <a href="#" class="navbar-text pull-right">Site Build by Abhishek Singh</a>
 </div>
</div>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
 </body>
</html>
    