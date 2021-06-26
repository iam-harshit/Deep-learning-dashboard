<%-- 
    Document   : referral
    Created on : 13 Dec, 2020, 5:54:57 PM
    Author     : Harshit Saxena
--%>

<%@ page 
         contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"
         import="ExamplePackage.UserBean"        
   %>

<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>

<jsp:useBean id="UserBean" class="ExamplePackage.UserBean"/>  
<% UserBean currentUser = (UserBean) session.getAttribute("currentSessionUser");%>


   <!DOCTYPE html>
    <html>
        <head>      
        <meta charset="utf-8" />
        <!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />-->
        <title>
          Referral | Admin
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
        <link href="../assets/css/table-style.css" rel="stylesheet">
        </head>
	
  <body class="">
      
<%
     
 ResultSet rs = null;
 
try{
}
finally{

Statement statement = null;

Class.forName("com.mysql.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject?autoReconnect=true&useSSL=false","root","root");
statement = connection.createStatement();

PreparedStatement st2=connection.prepareStatement("select * from referraldb");
rs = st2.executeQuery();

}
%>
      
  <div class="wrapper ">
    <div class="sidebar" data-color="purple" data-background-color="white" data-image="assets/images/sidebar-1.jpg">
        <div class="logo"><a class="simple-text logo-normal" style="text-transform: none;">
            Hello, <%= currentUser.getEmail()%>
        </a></div>
      <div class="sidebar-wrapper">
        <ul class="nav">
<!--          <li class="nav-item">
            <a class="nav-link" href="admin.jsp">
              <i class="material-icons">dashboard</i>
              <p>Dashboard</p>
            </a>
          </li>-->
          <li class="nav-item ">
            <a class="nav-link" href="view-user.jsp">
              <i class="material-icons">person</i>
              <p>View User</p>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="money.jsp">
              <i class="material-icons">person</i>
              <p>Money</p>
            </a>
          </li>
          <li class="nav-item active">
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
                  <a class="dropdown-item" href="../logout" name="logout">Log out</a>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <!-- End Navbar -->
      <div class="content">
        <div class="container-fluid">
                <section>

                   
  <div class="tbl-header">
    <table cellpadding="0" cellspacing="0" border="0">
      <thead>
          
        <tr>
          <th>Referral Code</th>
          <th>Validity</th>
          <th>Validity Upto</th>
          <th>Status</th>
        </tr>
        
      </thead>
    </table>
  </div>
  <div class="tbl-content">
    <table cellpadding="0" cellspacing="0" border="0">
      <tbody>
          <%while (rs.next()) {%>
        <tr>
          <td><%=rs.getString(1)%></td>
          <td><%=rs.getString(2)%></td>
          <td><%=rs.getString(3)%></td>
          <td><%=rs.getString(4)%></td>
        </tr>
        <% } %>
      </tbody>
    </table>
  </div>
     
</section>
      
      <div class="container">
         <div class="row">
            <div class="col-md-12 ml-auto mr-auto">
                    
               <a href="" type="button" data-toggle="modal" data-target="#modalPoll-1" class="btn btn-primary" name="submit" style="color: #ffff; margin-right: 40px;">Create Referral</a>
               
               <a type="button" data-toggle="modal" data-target="#modalPoll-2" class="btn btn-primary" name="submit" style="color: #ffff; margin-right: 40px;">Delete Referral</a>
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
      
      
   <!-- Create Referral Modal -->
<div class="modal fade right" id="modalPoll-1" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
  aria-hidden="true" data-backdrop="false">
  <div class="modal-dialog modal-full-height modal-right modal-notify modal-info" role="document">
    <div class="modal-content">
      <!--Header-->
      <div class="modal-header">
        <p class="heading lead">
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
       <form action="../create_referral" method="post">
                 
       <div class="form-group">
            <div class="input-group">
            <div class="input-group-prepend">
               <span class="input-group-text">
                  <i class="material-icons"></i>
               </span>
            </div>
                <input type="text" name="referralCode" class="form-control" placeholder="Referral Code" value="">
                
            </div>
        </div>
                
        <div class="form-group">
            <div class="input-group">
            <div class="input-group-prepend">
               <span class="input-group-text">
                  <i class="material-icons"></i>
               </span>
            </div>
                <input class="form-control" type="date" id="date" name="validity" placeholder="Validity">
            </div>
        </div> 
                
        <div class="form-group">
            <div class="input-group">
            <div class="input-group-prepend">
               <span class="input-group-text">
                  <i class="material-icons"></i>
               </span>
            </div>
                <input class="form-control" type="date" name="validityUpto" placeholder="Validity upto">
            </div>
        </div>
                
        <div class="form-group">
            <div class="input-group">
            <div class="input-group-prepend">
               <span class="input-group-text">
                  <i class="material-icons"></i>
               </span>
            </div>
                <input type="hidden" name="status" placeholder="Status" value="active">
            </div>
        </div>
                
                
        <div class="modal-footer justify-content-center">
        <input type="submit" class="btn btn-primary waves-effect waves-light" value="Create Referral">
        <a type="button" class="btn btn-outline-primary waves-effect" data-dismiss="modal">Cancel</a>
      </div>        
        </form>
      </div>

      <!--Footer-->
      
    </div>
  </div>
</div>
<!-- Create Referral Modal -->    


   <!-- delete Referral Modal -->
<div class="modal fade right" id="modalPoll-2" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
  aria-hidden="true" data-backdrop="false">
  <div class="modal-dialog modal-full-height modal-right modal-notify modal-info" role="document">
    <div class="modal-content">
      <!--Header-->
      <div class="modal-header">
        <p class="heading lead">
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
       <form action="../delete_referral">
                 
       <div class="form-group">
            <div class="input-group">
            <div class="input-group-prepend">
               <span class="input-group-text">
                  <i class="material-icons"></i>
               </span>
            </div>
                <input type="text" name="referralCode" class="form-control" placeholder="Referral Code" value="">
                
            </div>
        </div> 
                
        <div class="modal-footer justify-content-center">
        <input type="submit" class="btn btn-primary waves-effect waves-light" value="Delete Referral">
        <a type="button" class="btn btn-outline-primary waves-effect" data-dismiss="modal">Cancel</a>
      </div>        
        </form>
      </div>

      <!--Footer-->
      
    </div>
  </div>
</div>
<!-- delete Referral Modal -->
      
              
  <!--   Core JS Files   -->
  <script src="../assets/js/jquery.min.js"></script>
  <script src="../assets/js/popper.min.js"></script>
  <script src="../assets/js/bootstrap-material-design.min.js"></script>
  <script src="../assets/js/perfect-scrollbar.jquery.min.js"></script> 
  <script src="../assets/js/material-dashboard.js?v=2.1.2" type="text/javascript"></script>
  <script src="../assets/js/demo.js"></script>
  
<script type="text/javascript">
  var field = document.querySelector('#date');
var date = new Date();

// Set the date
field.value = date.getFullYear().toString() + '-' + (date.getMonth() + 1).toString().padStart(2, 0) + 
    '-' + date.getDate().toString().padStart(2, 0);
</script>

</body>
</html>
