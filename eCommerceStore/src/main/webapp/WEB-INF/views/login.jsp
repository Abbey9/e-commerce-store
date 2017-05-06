<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="header.jsp"></c:import>

<!--Login Form Code starts here --> 
<div class="container">
 <div class="col-sm-6 col-md-4 col-md-offset-4">
   <form class="form-signin">
     <h2 class="form-signin-heading">Please sign in</h2>
       <label class="sr-only" for="inputEmail">Email address</label>
          <input id="inputEmail" class="form-control" placeholder="Email address" required="" autofocus="" type="email">
       <label class="sr-only" for="inputPassword">Password</label>
          <input id="inputPassword" class="form-control" placeholder="Password" required="" type="password"> 
        <div class="checkbox">
         <label>
          <input value="remember me" type="checkbox">
           Remember me
          </label>
        </div>
         <button class="btn btn-primary btn-block" type="submit">Sign in</button>
		 <a href="#" class="pull-left need-help">Forgot Password?</a><a href="#" class="pull-right new-account">Create an account </a><span class="clearfix"></span>
		</form>
		 </div>
     </div> 

<c:import url="footer.jsp"></c:import>