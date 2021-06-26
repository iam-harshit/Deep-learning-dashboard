<%-- 
    Document   : admin
    Created on : 12 Dec, 2020, 9:00:56 PM
    Author     : Harshit Saxena
--%>

<%@ page 
         contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"
         import="ExamplePackage.UserBean"        
   %>

<jsp:useBean id="UserBean" class="ExamplePackage.UserBean"/>  
<% UserBean currentUser = (UserBean) session.getAttribute("currentSessionUser");%>

   <!DOCTYPE html>
    <html>
        <head>      
        <meta charset="utf-8" />
        <!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />-->
        <title>
          Home | Admin
        </title>
        <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />
        <meta http-equiv="Pragma" content="no-cache" />
        <meta http-equiv="Expires" content="-1" />
        <!--     Fonts and icons     -->
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
        <!-- CSS Files -->
        <link href="../assets/css/material-dashboard.css?v=2.1.2" rel="stylesheet" />
        <link href="../assets/css/demo.css" rel="stylesheet" />
        
        <style>
            .center{
                display: block;
                margin-left: auto;
                margin-right: auto;
            }
        </style>
        </head>
	
        <body class="" style="background-color: #fff;">
  <div class="wrapper ">
    <div class="sidebar" data-color="purple" data-background-color="white" data-image="assets/images/sidebar-1.jpg">
        <div class="logo"><a class="simple-text logo-normal" style="text-transform: none;">
             Hello, <%= currentUser.getEmail()%>
        </a></div>
      <div class="sidebar-wrapper">
        <ul class="nav">
          <li class="nav-item ">
            <a class="nav-link" href="view-user.jsp">
              <i class="material-icons">person</i>
              <p>View User</p>
            </a>
          </li>
          <li class="nav-item ">
            <a class="nav-link" href="money.jsp">
              <i class="material-icons">person</i>
              <p>Money</p>
            </a>
          </li>
          <li class="nav-item ">
            <a class="nav-link" href="referral.jsp">
              <i class="material-icons">notifications</i>
              <p>Referral</p>
            </a>
          </li>
          <li class="nav-item ">
            <a class="nav-link" href="chat.jsp">
              <i class="material-icons">language</i>
              <p>Chat</p>
            </a>
          </li>
        </ul>
      </div>
    </div>
    <div class="main-panel">
      <!-- Navbar -->
      <nav class="navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top ">
        <div class="container-fluid">
      
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
                  <a class="dropdown-item" href="../logoutAdmin" name="logout">Log out</a>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <!-- End Navbar -->
      <div class="content">
        <div class="container-fluid">
            <div>
                <img src="../assets/images/admin-bg-1.gif" alt="" class="center">
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
        
              
  <!--   Core JS Files   -->
  <script src="../assets/js/jquery.min.js"></script>
  <script src="../assets/js/popper.min.js"></script>
  <script src="../assets/js/bootstrap-material-design.min.js"></script>
  <script src="../assets/js/perfect-scrollbar.jquery.min.js"></script> 
  <script src="../assets/js/material-dashboard.js?v=2.1.2" type="text/javascript"></script>
  <script src="../assets/js/demo.js"></script>

</body>
</html>
