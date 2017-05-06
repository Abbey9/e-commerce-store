<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="header.jsp">
	<c:param name="title" value="Customers-Home Page"></c:param>
</c:import>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Customers</h1>
			<p class="lead">Checkout all the registered Customers at
				BookStore!</p>
		</div>

		<table class="table table-striped table-hover">

			<thead>
				<tr class="bg-sucess">
					<th>Customer Id</th>
					<th>Customer Name</th>
					<th>Customer Address</th>
					<th>No. of Orders Made</th>
					<th>Customer Email</th>
					<th>Customer Phone</th>
				</tr>
			</thead>
			<div class="coloumn">
				<c:forEach items="${customers}" var="customer">
					<tr>
						<td>${customer.customerId}</td>
						<td>${customer.name}</td>
						<td>${customer.address}</td>
						<td>${customer.noOfOrdersMade}</td>
						<td>${customer.email}</td>
						<td>${customer.mobile}</td>
					</tr>
				</c:forEach>
			</div>
		</table>

	</div>
</div>


<c:import url="footer.jsp"></c:import>