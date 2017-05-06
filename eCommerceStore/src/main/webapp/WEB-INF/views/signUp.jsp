<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="header.jsp"></c:import>

<!-- SignUp Code starts here --> 

<div class="container">
 <div class="col-sm-6 col-md-4 col-md-offset-4">
   <form class="form-signin">
     <h2 class="form-signin-heading">Create Account</h2>
       <label class="sr-only" for="inputEmail">Email address</label>
          <b></b><input id="inputEmail" class="form-control" placeholder="Email Address" required="" autofocus="" type="email">
	   <label class="sr-only" for="inputFullName">Full Name</label>
          <b></b><input id="inputFullName" class="form-control" placeholder="Full Name" required="" type="fullName"> 
       <label class="sr-only" for="inputMobile">Mobile</label>
         <b></b><input id="inputMobile" class="form-control" placeholder="Mobile" required="" type="mobile"> 		  
       <label class="sr-only" for="inputPassword">Password</label>
          <b></b><input id="inputPassword" class="form-control" placeholder="Password" required="" type="password"> 
		  <div>
		  <p class="text-center">We will send you a text to verify your phone. 
		     Message and Data rates may apply.
          </p>
		  </div>
         <button class="btn btn-primary btn-block" type="submit">SignUp</button>
         
           </form>
		</div>
     </div>
	 

<c:import url="footer.jsp"></c:import>