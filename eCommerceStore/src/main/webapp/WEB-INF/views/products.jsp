<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<c:import url="header.jsp">
	<c:param name="title" value="Products-Home Page"></c:param>
</c:import>

<section>
	<div class="container">
		<div class="jumbotron">
			<center>
				<p class="lead">
					Checkout all the <b>available Books</b> at e-BookStore!
				</p>
			</center>
		</div>
	</div>
</section>

<section class="container">
	<div class="row">
		<c:forEach items="${products}" var="product">
			<div class="col-md-6 col-md-3" style="padding-bottom: 15px">
				<div class="thumbnail">
					<div class="caption">
						<h3>
						<b>${product.name}</b>
						</h3>
						<p>${product.description}</p>
						<p>Price:${product.unitPrice} IndianRupees</p>
						<p>Available ${product.unitsInStock} units in stock</p>
						<p>
							<a
								href="<spring:url value="/products/product?id=${product.productId}"/>"
								class="btn btn-primary"><span
								class="glyphicon glyphicon-info-sign" /></span> Details </a>
						</p>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</section>

<c:import url="footer.jsp"></c:import>