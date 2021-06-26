<%-- 
    Document   : signup
    Created on : 5 Dec, 2020, 3:29:47 PM
    Author     : Harshit Saxena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Sign Up
  </title>
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <!--Fonts and icons -->
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
  <!-- CSS Files -->
  <link href="assets/css/style.css" rel="stylesheet" />
  <link href="assets/css/demo.css" rel="stylesheet" />
</head>

<body class="signup-page sidebar-collapse">
 
  <div class="page-header header-filter" filter-color="purple" style="background-image: url('assets/images/signup-bg.jpg'); background-size: cover; background-position: top center;">
    <div class="container">
      <div class="row">
        <div class="col-md-6 ml-auto mr-auto">
          <div class="card card-signup">
            <h2 class="card-title text-center">Register Yourself</h2>
            <div class="card-body">
              <div class="row">
                <div class="col-md-8 ml-auto mr-auto">
                    <form class="form" method="post" action="signup"> 
                    <div class="form-group">
                      <div class="input-group">
                        <div class="input-group-prepend">
                          <span class="input-group-text">
                            <i class="material-icons">face</i>
                          </span>
                        </div>
                          <input type="text" name="fullName" id="fullName" class="form-control" placeholder="Full Name">
                          <label id="fullName-error" style="display: none; "></label>
                      </div>
                    </div>
                    <div class="form-group">
                      <div class="input-group">
                        <div class="input-group-prepend">
                          <span class="input-group-text">
                            <i class="material-icons">mail</i>
                          </span>
                        </div>
                          <input type="text" name="email" id="email" class="form-control" placeholder="Email">
                          <label id="email-error" style="display: none; "></label>
                          <span class="bmd-help">Alert! You won't be able to update your email in future.</span>
                      </div>
                    </div>
                    <div class="form-group">
                      <div class="input-group">
                        <div class="input-group-prepend">
                          <span class="input-group-text">
                            <i class="material-icons">lock_outline</i>
                          </span>
                        </div>
                          <input type="password" name="password" id="password" placeholder="Password" class="form-control" />
                          <label id="password-error" style="display: none; "></label>
                      </div>
                    </div>
                    <div class="text-center">
                        <input type="submit" class="btn btn-primary btn-round" name="submit" value="Get Started">
                    </div>
                        <div style="padding-top: 30px;">   
                    <p class="card-description text-center">Already have an account? <a href="index.html">Log In</a></p>
                        </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <footer class="footer">
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
  </div>
  <!--   Core JS Files   -->
<!--  <script src="assets/js/jquery.min.js" type="text/javascript"></script>
  <script src="assets/js/popper.min.js" type="text/javascript"></script>
  <script src="assets/js/bootstrap-material-design.min.js" type="text/javascript"></script>-->

 
</body>

</html>

