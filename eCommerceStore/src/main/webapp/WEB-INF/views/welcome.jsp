<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Welcome-Landing Page</title>
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous" rel="stylesheet">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous" rel="stylesheet">
</head>
<body>

	<!-- Collapsing static top Navbar code here -->

	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<a href="<c:url value="/home"/>" class="navbar-brand">e-BookStore</a>

			<button class="navbar-toggle" data-toggle="collapse"
				data-target=".navHeaderCollapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse navHeaderCollapse">

				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a
						href="<c:url value="/home"/>">Home</a></li>
						

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span>
							Account<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/login"/>"><span
									class="glyphicon glyphicon-hand-right"></span> Login</a></li>
							<li><a href="<c:url value="/signUp"/>"><span class="glyphicon glyphicon-pencil"></span>
									SignUp</a></li>
						</ul>
					<li><a href="#"><span
							class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
				</ul>
			</div>
		</div>
	</div>

	<!--Jumbotron code here-->

	<div class="container">
		<div class="jumbotron">
			<center>
				<h2>The Journey of a Lifetime starts with the turning of a
					Page.</h2>
				<p>Reading a good book is like taking a journey.</p>
				<a href="<c:url value="/products"/>"><span class="btn btn-default">Browse all
						books</span></a> <a href="<c:url value="/signUp"/>"><span class="btn btn-primary">SignUp
						for free</span></a>
			</center>
		</div>
	</div>

	<!--Grid System Code here -->

	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<h3>
					<a href="<c:url value="/products/literature"/>">Literature & Fiction</a>
				</h3>
				<p>While their works of literature & fiction may be very
					different, these critically lauded authors share an uncanny ability
					to serve up complex, absorbing novels that are rich and
					multilayered. Indeed, there's something for every kind of reader to
					discover in our pages of literature & fiction,from the bare, arid
					prose of McCarthy to the lush magical realism of Marquez, the
					emotional dynamics of family to the psychological upheaval of war.
					Fiction & Literature Books grab hold of our imaginations and keeps
					us close.</p>
				<a href="<c:url value="/products/literature"/>" class="btn btn-default">Find all Literature & Fiction</a>
			</div>
			<div class="col-md-3">
				<h3>
					<a href="<c:url value="/products/biographies"/>">Biograhies </a>
				</h3>
				<p>Whether it's the final journey of a spiritual mentor or the
					art of innovation from a young computer genius, the courage to
					survive insurmountable odds, or the private and personal
					autobiography of a public personality, you'll find these stories
					and much more in our Biographies section. When you shop biographies
					and memoirs with you read more and spend less.</p>
				<a href="<c:url value="/products/biographies"/>" class="btn btn-default">Find all Biograhies</a>
			</div>
			<div class="col-md-3">
				<h3>
					<a href="<c:url value="/products/romance"/>">Romance</a>
				</h3>
				<p>Love can fill your sails or dash your ship against the rocks,
					depending on which way the wind is blowing. That's why there are so
					many Romance Books dedicated to depicting the helium-filled highs
					and subterranean lows brought about by true passion. Sometimes the
					story is a sinfully sexy one, like E L James's notorious Fifty
					Shades trilogy, and sometimes it's an epic fantasy, like you'll
					find in Diana Gabaldon's Outlander series. But whatever kind of
					love story gets your kindling glowing in the fireplace, you'll find
					it among our ample offerings of Romance Books.</p>
				<a href="<c:url value="/products/romance"/>" class="btn btn-default">Find all Romance Books</a>
			</div>
			<div class="col-md-3">
				<h3>
					<a href="<c:url value="/products/bestsellers"/>">Best-Sellers</a>
				</h3>
				<p>Choose from thousands of best sellers and hundreds of new
					releases every week at our e-BookStore</p>
				<a href="<c:url value="/products/bestsellers"/>" class="btn btn-default">Find out all BestSellers</a>
			</div>
		</div>
	</div>

	<!--fixed Bottom Nav bar code here  -->

	<div class="navbar navbar-default navbar-static-bottom">
		<div class="container">
			<p class="navbar-text pull-left">e-BookStore &copy 2017. All
				rights reserved.</p>
			<a href="#" class="navbar-text pull-right">Site Build by Abhishek
				Singh</a>
		</div>
	</div>
	
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
		integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
		crossorigin="anonymous"></script>
</body>
</html>
</body>
</html>