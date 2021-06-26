<%-- 
    Document   : get-started
    Created on : 7 Dec, 2020, 12:45:40 AM
    Author     : Harshit Saxena
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="ExamplePackage.UserBean"
    import="java.util.*"%>

 <%
 	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(1000000);
 %>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Step 2 | Payment
  </title>
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <!--     Fonts and icons     -->
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
  
  <!-- CSS Files -->
  <link rel="stylesheet" href="assets/css/bootstrap.min.css">
  <link href="assets/css/demo.css" rel="stylesheet" />
  <link href="assets/css/style.css" rel="stylesheet" />
  <link rel="stylesheet" href="assets/css/mdb.css">
</head>

<body class="ecommerce-page sidebar-collapse">
    
  <div class="page-header header-filter header-small" data-parallax="true" style="background-image: url('assets/images/bg-header.gif');">
    <div class="container">
      <div class="row">
        <div class="col-md-8 ml-auto mr-auto text-center">
          <div class="brand">
              
            <jsp:useBean id="UserBean" class="ExamplePackage.UserBean"/> 
           <% UserBean currentUser = (UserBean) session.getAttribute("currentSessionUser");%>
	
            <h3 class="title">Welcome, <%=  currentUser.getEmail()%></h3>
            
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="section section-blog">
    <div class="container">
      <h2 class="section-title"></h2>
      <div class="row">
        <div class="col-md-4">
          <div class="card card-blog">
            <div class="card-header card-header-image">
              <a>
                <img src="assets/images/card-bg-1.gif" alt="">
              </a>
            </div>
            <div class="card-body">
              <h4 class="card-title">
                <a>Do you have any referral code?</a>
              </h4>
                <form class="form" method="post" action="referral_code">
                <span class="bmd-form-group">
                  <div class="input-group" style="margin-top: 20px; margin-right: 20px;">
                    <div class="input-group-prepend">
                      <span class="input-group-text">
                        <i class="material-icons">card_giftcard</i>
                      </span>
                    </div>
                      <input type="text" name="referral" class="form-control" placeholder="Referral Code">
                  </div>       
                    <div class="card-footer justify-content-center">
                         <button type="submit" class="btn btn-rose btn-link btn-lg">Submit</button>
                    </div>  
                </span>
                </form>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card card-blog">
            <div class="card-header card-header-image">
              <a>
                <img src="assets/images/card-bg.gif" alt="">
              </a>
            </div>
            <div class="card-body">
              <h4 class="card-title">
                <a>Life time access to the Deep Learning portal just 1000 rupees away.</a>
              </h4>
                <p>
                    
                    <a type="button" data-toggle="modal" data-target="#modalPoll-1">Pay now </a>
                </p>
             
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
        
   <!-- Modal: modalPoll -->
<div class="modal fade right" id="modalPoll-1" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
  aria-hidden="true" data-backdrop="false">
  <div class="modal-dialog modal-full-height modal-right modal-notify modal-info" role="document">
    <div class="modal-content">
      <!--Header-->
      <div class="modal-header">
        <p class="heading lead">We're are warm welcome you!
        </p>

        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true" class="white-text">×</span>
        </button>
      </div>

      <!--Body-->
      <div class="modal-body">
        <div class="text-center">
          <i class="far fa-file-alt fa-4x mb-3 animated rotateIn"></i>
        </div>
          
          <br>
       <form action="payment" method="post">
        <div class="form-group">
            <div class="input-group">
               <div class="input-group-prepend">
               <span class="input-group-text">
               <i class="material-icons"></i>
               </span>
            </div>
                <input id="ORDER_ID" tabindex="1" maxlength="20" class="form-control" size="20" name="ORDER_ID"  autocomplete="off" value="TRANS_<%= randomInt %>" readonly>
            </div>
        </div>
            
                
        <div class="form-group">
            <div class="input-group">
            <div class="input-group-prepend">
               <span class="input-group-text">
                  <i class="material-icons"></i>
               </span>
            </div>
                <input type="text" id="CUST_ID" name="CUST_ID" class="form-control" placeholder="Email" value="<%= currentUser.getEmail()%>" readonly>
                
            </div>
        </div>
                
        <div class="form-group">
            <div class="input-group">
            <div class="input-group-prepend">
               <span class="input-group-text">
                  <i class="material-icons"></i>
               </span>
            </div>
                <input class="form-control" type="date" id="INDUSTRY_TYPE_ID" name="INDUSTRY_TYPE_ID" placeholder="Payment Date" readonly>
            </div>
        </div> 
                
        <div class="form-group">
            <div class="input-group">
            <div class="input-group-prepend">
               <span class="input-group-text">
                  <i class="material-icons"></i>
               </span>
            </div>
                <input title="TXN_AMOUNT" class="form-control" tabindex="10" type="text" name="TXN_AMOUNT" placeholder="Amount" value="1000" readonly>
            </div>
        </div>
        
<!--        <div class="form-group">
            <div class="input-group">
            <div class="input-group-prepend">
               <span class="input-group-text">
                  <i class="material-icons"></i>
               </span>
            </div>
                <input type="hidden" id="CUST_ID" tabindex="2" maxlength="30" size="12" name="CUST_ID" autocomplete="off" value="CUST001">
            </div>
        </div>-->
                
<!--        <div class="form-group">
            <div class="input-group">
            <div class="input-group-prepend">
               <span class="input-group-text">
                  <i class="material-icons"></i>
               </span>
            </div>
                <input type="hidden" id="INDUSTRY_TYPE_ID" tabindex="4" maxlength="12" size="12" name="INDUSTRY_TYPE_ID" autocomplete="off" value="Retail">
            </div>
        </div>-->
                
        <div class="form-group">
            <div class="input-group">
            <div class="input-group-prepend">
               <span class="input-group-text">
                  <i class="material-icons"></i>
               </span>
            </div>
                <input type="hidden" id="CHANNEL_ID" tabindex="4" maxlength="12" size="12" name="CHANNEL_ID" autocomplete="off" value="WEB">
            </div>
        </div>
                
                
        <div class="modal-footer justify-content-center">
        <input type="submit" class="btn btn-primary waves-effect waves-light" value="Pay Now">
        <a type="button" class="btn btn-outline-primary waves-effect" data-dismiss="modal">Cancel</a>
      </div>        
        </form>
      </div>

      <!--Footer-->
      
    </div>
  </div>
</div>
<!-- Modal: modalPoll -->

  <footer class="footer footer-black footer-big">
    <div class="container">
        <div class="copyright float-center">
          &copy;
          <script>
            document.write(new Date().getFullYear())
          </script>, made with <i class="material-icons">favorite</i> by
          <a target="_blank">us</a>
        </div>
    </div>
  </footer>

  <!-- jQuery -->
  <script type="text/javascript" src="assets/js/jquery.min.js"></script>
  <script type="text/javascript" src="assets/js/popper.min.js"></script>
  <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="assets/js/mdb.min.js"></script>
  
  <script type="text/javascript">
  var field = document.querySelector('#INDUSTRY_TYPE_ID');
var date = new Date();

// Set the date
field.value = date.getFullYear().toString() + '-' + (date.getMonth() + 1).toString().padStart(2, 0) + 
    '-' + date.getDate().toString().padStart(2, 0);
</script>

</body>

</html>
