<%@ include file="header.jsp" %>  

<div class="container-fluid">
<div class="row">
<div class="col-md-6 py-5">
<h3 class="text-center">Login</h3>
            <form action="login" method="post">
            <label class="text-left">Email : </label>
            <br>   
            <input type="text" class="form-control" placeholder="Enter Email" name="username" required> 
            <br> 
            <label>Password : </label>
            <br>    
            <input type="password" class="form-control" placeholder="Enter Password" name="password" required>  
            <br> 
            <input type="checkbox"  checked="checked"> Remember me   
            <br> <br> 
            <button type="submit" class="btn btn-primary">Login</button>   
            <button type="button"  class="btn btn-warning"> Cancel</button>   
            <br> <br> 
            Forgot <a href="#"> password? </a> 
            </form>  
</div>
</div>
</div>

<%@ include file="footer.jsp" %>  