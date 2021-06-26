<%-- 
    Document   : received-message
    Created on : 13 Dec, 2020, 9:22:59 PM
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
        <meta http-equiv=[COLOR=red]"cache-control"[/COLOR] content=[COLOR=red]"max-age=0, must-revalidate, no-cache, no-store, private"[/COLOR]>
        <meta http-equiv=[COLOR=red]"expires"[/COLOR] content=[COLOR=red]"-1"[/COLOR]>
        <meta http-equiv=[COLOR=red]"pragma"[/COLOR] content=[COLOR=red]"no-cache"[/COLOR]>
        <meta charset="utf-8" />
        <!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />-->
        <title>
            Received Message
        </title>
        <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />
        <meta http-equiv="Pragma" content="no-cache" />
        <meta http-equiv="Expires" content="-1" />
        <!--     Fonts and icons     -->
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
        <!-- CSS Files -->
        <link href="assets/css/material-dashboard.css?v=2.1.2" rel="stylesheet" />
        <link href="assets/css/demo.css" rel="stylesheet" />
        <link href="assets/css/table-style.css" rel="stylesheet">
    </head>

    <body class="">

        <%

            ResultSet rs = null;

            try {
            } finally {

                Statement statement = null;

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject?autoReconnect=true&useSSL=false", "root", "root");
                statement = connection.createStatement();

                PreparedStatement st2 = connection.prepareStatement("select * from chatdb where User_Mail=?");
                st2.setString(1, currentUser.getEmail());
                rs = st2.executeQuery();

            }
        %>

        <div class="wrapper ">
            <div class="sidebar" data-color="purple" data-background-color="white" data-image="assets/images/sidebar-1.jpg">
                <div class="logo"><a  class="simple-text logo-normal">
                        Received Message
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
                        <li class="nav-item ">
                            <a class="nav-link" href="profile.jsp">
                                <i class="material-icons">person</i>
                                <p>User Profile</p>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link" href="support.jsp">
                                <i class="material-icons">language</i>
                                <p>Support</p>
                            </a>
                        </li>
                        <li class="nav-item active">
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
                            <a class="navbar-brand" href="javascript:;">Received Message</a>
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
                                        <a class="dropdown-item" href="logout" name="logout">Log out</a>
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
                                            <th>Email</th>
                                            <th>Message</th>
                                            <th>Issue Type</th>
                                            <th>Severity</th>
                                            <th>Date</th>
                                            <th>Reply From Admin</th>
                                        </tr>

                                    </thead>
                                </table>
                            </div>
                            <div class="tbl-content">
                                <table cellpadding="0" cellspacing="0" border="0">
                                    <tbody>
                                        <%while (rs.next()) {%>
                                        <tr>
                                            <td><%=rs.getString(2)%></td>
                                            <td><%=rs.getString(3)%></td>
                                            <td><%=rs.getString(4)%></td>
                                            <td><%=rs.getString(5)%></td>
                                            <td><%=rs.getString(6)%></td>
                                            <td><%=rs.getString(7)%></td>
                                        </tr>
                                        <% }%>
                                    </tbody>
                                </table>
                            </div>
                        </section>

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
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/popper.min.js"></script>
        <script src="assets/js/bootstrap-material-design.min.js"></script>
        <script src="assets/js/perfect-scrollbar.jquery.min.js"></script> 
        <script src="assets/js/material-dashboard.js?v=2.1.2" type="text/javascript"></script>
        <script src="assets/js/demo.js"></script>

    </body>
</html>
