<%-- 
    Document   : chat
    Created on : 13 Dec, 2020, 6:27:35 PM
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
            Chat | Admin
        </title>
        <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />
        <meta http-equiv="Pragma" content="no-cache" />
        <meta http-equiv="Expires" content="-1" />
        <!--     Fonts and icons     -->
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
        <!-- CSS Files -->
        <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
        <link href="../assets/css/material-dashboard.css?v=2.1.2" rel="stylesheet" />
        <link href="../assets/css/demo.css" rel="stylesheet" />
        <link href="../assets/css/table-style.css" rel="stylesheet">
        <link rel="stylesheet" href="../assets/css/mdb.css">
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

                PreparedStatement st2 = connection.prepareStatement("select chat_ID, User_Mail,Description, Date, Resolved_Problem from chatdb");
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
<!--                        <li class="nav-item">
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
                        <li class="nav-item ">
                            <a class="nav-link" href="referral.jsp">
                                <i class="material-icons">notifications</i>
                                <p>Referral</p>
                            </a>
                        </li>
                        <li class="nav-item active">
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
                                            <th>Chat ID</th>
                                            <th>Email</th>
                                            <th>Message</th>
                                            <th>Get message on</th>
                                            <th>Replied Msg</th>
                                            <th>Reply a message</th>
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
                                            <td><%=rs.getString(5)%></td>
                                            <td><a href="" data-toggle="modal" data-target="#modalContactForm">Reply</a></td>
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


        <!--Modal Form -->

        <div class="modal fade" id="modalContactForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header text-center">
                        <h4 class="modal-title w-100 font-weight-bold">Connect to User</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form action="../chat_reply" method="post">

                    <div class="modal-body mx-3">
                        <div class="form-group">
                            <label class="bmd-label-floating">Enter user Chat ID</label>
                            <div class="input-group">
                                <input class="form-control" type="text" name="chatID">
                            </div>
                            
                        </div> 
                            
                        <div class="form-group">
                            <label class="bmd-label-floating">Enter your reply</label>
                            <div class="input-group">
                                <textarea class="form-control" type="text" name="reply"></textarea>
                            </div>
                        </div>

                    </div>
                    <div class="modal-footer d-flex justify-content-center" style="border-top: none;">
                        <input type="submit" class="btn btn-unique" value="Send">
                    </div>
                    </form>
                </div>
            </div>
        </div>

        <!--End Modal Form -->


        <!--   Core JS Files   -->
        <script src="../assets/js/jquery.min.js"></script>
        <script src="../assets/js/popper.min.js"></script>
        <script src="../assets/js/bootstrap-material-design.min.js"></script>
        <script src="../assets/js/perfect-scrollbar.jquery.min.js"></script> 
        <script src="../assets/js/material-dashboard.js?v=2.1.2" type="text/javascript"></script>
        <script src="../assets/js/demo.js"></script>

    </body>
</html>