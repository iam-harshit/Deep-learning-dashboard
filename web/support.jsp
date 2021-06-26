<%-- 
    Document   : support
    Created on : 11 Dec, 2020, 11:59:02 PM
    Author     : Harshit Saxena
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"
        import="ExamplePackage.UserBean"
%>

<jsp:useBean id="UserBean" class="ExamplePackage.UserBean"/>  
<% UserBean currentUser = (UserBean) session.getAttribute("currentSessionUser");%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Expires" content="-1">
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate">
  <title>
    Support
  </title>
  
  <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />
  <!--     Fonts and icons     -->
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
  <!-- CSS Files -->
  <link href="assets/css/material-dashboard.css?v=2.1.2" rel="stylesheet" />
  <link href="assets/css/demo.css" rel="stylesheet" />
</head>

<body class="">
    
<div class="wrapper ">
    <div class="sidebar" data-color="purple" data-background-color="white" data-image="assets/images/sidebar-1.jpg">
      <div class="logo"><a href="support.jsp" class="simple-text logo-normal">
          Support
        </a></div>
      <div class="sidebar-wrapper">
        <ul class="nav">
          <li class="nav-item  ">
            <a class="nav-link" href="home.jsp">
              <i class="material-icons">dashboard</i>
              <p>Python Instance</p>
            </a>
          </li>
          <li class="nav-item  ">
            <a class="nav-link" href="spam-calssifier.jsp">
              <i class="material-icons">dashboard</i>
              <p>Spam Classifier</p>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="profile.jsp">
              <i class="material-icons">person</i>
              <p>User Profile</p>
            </a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="support.jsp">
              <i class="material-icons">language</i>
              <p>Support</p>
            </a>
          </li>
          <li class="nav-item ">
            <a class="nav-link" href="received-message.jsp">
              <i class="material-icons">message</i>
              <p>Received Message</p>
            </a>
          </li>
        </ul>
      </div>
    </div>
    <div class="main-panel">
      <!-- Navbar -->
      <nav class="navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top ">
        <div class="container-fluid">
          <div class="navbar-wrapper">
            <a class="navbar-brand" href="javascript:;">Support</a>
          </div>
          <button class="navbar-toggler" type="button" data-toggle="collapse" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
            <span class="sr-only">Toggle navigation</span>
            <span class="navbar-toggler-icon icon-bar"></span>
            <span class="navbar-toggler-icon icon-bar"></span>
            <span class="navbar-toggler-icon icon-bar"></span>
          </button>
          <div class="collapse navbar-collapse justify-content-end">
            <ul class="navbar-nav">
              
              <li class="nav-item dropdown">
                <a class="nav-link" href="javascript:;" id="navbarDropdownProfile" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="material-icons">person</i>
                  <p class="d-lg-none d-md-block">
                    Account
                  </p>
                </a>
                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownProfile">
                  <a class="dropdown-item" href="profile.jsp">Profile</a>
                  <div class="dropdown-divider"></div>
                  <a class="dropdown-item" href="logout" name="logout">Log Out</a>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <!-- End Navbar -->
      <div class="content">
        <div class="container-fluid">
          <div class="row">
            <div class="col-md-8">
              <div class="card">
                <div class="card-header card-header-primary">
                  <h4 class="card-title"></h4>
                </div>
                <div class="card-body">
                    <form action="support" method="post">
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Email Address</label>
                          <input type="email" class="form-control" name="email" value="<%= currentUser.getEmail()%>" disabled="true">
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Issue Type (Optional)</label>
                          <input type="text" class="form-control" name="issueType" value="" >
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-4">
                        <div class="form-group">
                          <label class="bmd-label-floating">Severity (Optional)</label>
                          <input type="text" class="form-control" name="severity" value="">
                        </div>
                      </div>
                      <div class="col-md-4">
                        <div class="form-group">
                          <label class="bmd-label-floating">Date</label>
                          <input type="date" class="form-control" id="date" name="date" value="">
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-12">
                        <div class="form-group">
                            <label class="bmd-label-floating">Description</label>
                          <div class="form-group">
                            <textarea class="form-control" name="description" rows="5"></textarea>
                          </div>
                        </div>
                      </div>
                    </div>
                        
                    <input type="submit" class="btn btn-primary pull-right" name="submit" value="Send">

                  </form>
                    
                    <div class="clearfix"></div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <footer class="footer">
        <div class="container-fluid">
          <div class="copyright float-center">
            &copy;
            <script>
              document.write(new Date().getFullYear())
            </script>, made with <i class="material-icons">favorite</i> by
            <a>us</a>
          </div>
        </div>
      </footer>
    </div>
  </div>
    <!-- Core JS Files -->  
  <script src="assets/js/jquery.min.js"></script>
  <script src="assets/js/popper.min.js"></script>
  <script src="assets/js/bootstrap-material-design.min.js"></script>
  <script src="assets/js/perfect-scrollbar.jquery.min.js"></script>
  <script src="assets/js/material-dashboard.js?v=2.1.2" type="text/javascript"></script>
  <script src="assets/js/demo.js"></script>
  
  <script type="text/javascript">
  var field = document.querySelector('#date');
var date = new Date();

// Set the date
field.value = date.getFullYear().toString() + '-' + (date.getMonth() + 1).toString().padStart(2, 0) + 
    '-' + date.getDate().toString().padStart(2, 0);
</script>
  
</body>
</html>

