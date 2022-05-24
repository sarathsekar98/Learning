<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ include file="header.jsp" %>  

<div class="container-fluid">
<div class="row">
<div class="col-md-12 col-md-12 d-flex justify-content-md-center py-5 py-5">
<form:form action="signup" cssClass="w-50" name="asdadads" method="get" modelAttribute="signup">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="email"><b>Email</b></label>
    <form:input type="text"  path="email" cssClass="form-control" placeholder="Enter Password" />
    
    <label for="psw"><b>Password</b></label>
    <input type="password" class="form-control" placeholder="Enter Password" name="password" required />

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" class="form-control" placeholder="Repeat Password" name="psw-repeat" required />

    <label>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px" /> Remember me
    </label>
    <input type="hidden" name="form-check" value="submitted">
    <p>By creating an account you agree to our <a href="#" class="text-info text-underline">Terms & Privacy</a>.</p>
    <div class="clearfix">
      <button type="button" class="btn btn-warning">Cancel</button>
      <button type="submit" class="btn btn-primary">Sign Up</button>
    </div>
  </div>
</form:form>
</div>
</div>
</div>

<%@ include file="footer.jsp" %>  