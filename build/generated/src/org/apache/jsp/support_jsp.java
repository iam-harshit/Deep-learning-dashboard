package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ExamplePackage.UserBean;

public final class support_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      ExamplePackage.UserBean UserBean = null;
      synchronized (_jspx_page_context) {
        UserBean = (ExamplePackage.UserBean) _jspx_page_context.getAttribute("UserBean", PageContext.PAGE_SCOPE);
        if (UserBean == null){
          UserBean = new ExamplePackage.UserBean();
          _jspx_page_context.setAttribute("UserBean", UserBean, PageContext.PAGE_SCOPE);
        }
      }
      out.write("  \n");
 UserBean currentUser = (UserBean) session.getAttribute("currentSessionUser");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("  <title>\n");
      out.write("    User Profile\n");
      out.write("  </title>\n");
      out.write("  <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />\n");
      out.write("  <!--     Fonts and icons     -->\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\">\n");
      out.write("  <!-- CSS Files -->\n");
      out.write("  <link href=\"assets/css/material-dashboard.css?v=2.1.2\" rel=\"stylesheet\" />\n");
      out.write("  <link href=\"assets/css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"\">\n");
      out.write("    \n");
      out.write("<div class=\"wrapper \">\n");
      out.write("    <div class=\"sidebar\" data-color=\"purple\" data-background-color=\"white\" data-image=\"assets/images/sidebar-1.jpg\">\n");
      out.write("      <div class=\"logo\"><a href=\"profile.jsp\" class=\"simple-text logo-normal\">\n");
      out.write("          Profile\n");
      out.write("        </a></div>\n");
      out.write("      <div class=\"sidebar-wrapper\">\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("          <li class=\"nav-item  \">\n");
      out.write("            <a class=\"nav-link\" href=\"home.jsp\">\n");
      out.write("              <i class=\"material-icons\">dashboard</i>\n");
      out.write("              <p>Dashboard</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item active \">\n");
      out.write("            <a class=\"nav-link\" href=\"profile.jsp\">\n");
      out.write("              <i class=\"material-icons\">person</i>\n");
      out.write("              <p>User Profile</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item \">\n");
      out.write("            <a class=\"nav-link\" href=\"./notifications.html\">\n");
      out.write("              <i class=\"material-icons\">notifications</i>\n");
      out.write("              <p>Notifications</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item \">\n");
      out.write("            <a class=\"nav-link\" href=\"support.jsp\">\n");
      out.write("              <i class=\"material-icons\">language</i>\n");
      out.write("              <p>Support</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"main-panel\">\n");
      out.write("      <!-- Navbar -->\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top \">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"navbar-wrapper\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"javascript:;\">User Profile</a>\n");
      out.write("          </div>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"navbar-toggler-icon icon-bar\"></span>\n");
      out.write("            <span class=\"navbar-toggler-icon icon-bar\"></span>\n");
      out.write("            <span class=\"navbar-toggler-icon icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"collapse navbar-collapse justify-content-end\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("              <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link\" href=\"http://example.com\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                  <i class=\"material-icons\">notifications</i>\n");
      out.write("                  <span class=\"notification\">5</span>\n");
      out.write("                  <p class=\"d-lg-none d-md-block\">\n");
      out.write("                    Some Actions\n");
      out.write("                  </p>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">Mike John responded to your email</a>\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">You have 5 new tasks</a>\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">You're now friend with Andrew</a>\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">Another Notification</a>\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">Another One</a>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link\" href=\"javascript:;\" id=\"navbarDropdownProfile\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                  <i class=\"material-icons\">person</i>\n");
      out.write("                  <p class=\"d-lg-none d-md-block\">\n");
      out.write("                    Account\n");
      out.write("                  </p>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownProfile\">\n");
      out.write("                  <a class=\"dropdown-item\" href=\"profile.jsp\">Profile</a>\n");
      out.write("                  <div class=\"dropdown-divider\"></div>\n");
      out.write("                  <a class=\"dropdown-item\" href=\"logout\" name=\"logout\">Log Out</a>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("      <!-- End Navbar -->\n");
      out.write("      <div class=\"content\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                <div class=\"card-header card-header-primary\">\n");
      out.write("                  <h4 class=\"card-title\"></h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"\" method=\"post\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label class=\"bmd-label-floating\">Email Address</label>\n");
      out.write("                          <input type=\"email\" class=\"form-control\" name=\"email\" value=\"");
      out.print( currentUser.getEmail());
      out.write("\" disabled=\"true\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label class=\"bmd-label-floating\">Issue Type</label>\n");
      out.write("                          <input type=\"text\" class=\"form-control\" name=\"issueType\" >\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label class=\"bmd-label-floating\">Severity</label>\n");
      out.write("                          <input type=\"password\" class=\"form-control\" name=\"password\" value=\"\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label class=\"bmd-label-floating\">Date</label>\n");
      out.write("                          <input type=\"text\" class=\"form-control\" value=\"\" disabled=\"true\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label>Description</label>\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                            <textarea class=\"form-control\" rows=\"5\"></textarea>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                    <input type=\"submit\" class=\"btn btn-primary pull-right\" name=\"submit\" value=\"Update Profile\">\n");
      out.write("\n");
      out.write("                  </form>\n");
      out.write("                    \n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <footer class=\"footer\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"copyright float-center\">\n");
      out.write("            &copy;\n");
      out.write("            <script>\n");
      out.write("              document.write(new Date().getFullYear())\n");
      out.write("            </script>, made with <i class=\"material-icons\">favorite</i> by\n");
      out.write("            <a>us</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("     Core JS Files   \n");
      out.write("  <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("  <script src=\"assets/js/popper.min.js\"></script>\n");
      out.write("  <script src=\"assets/js/bootstrap-material-design.min.js\"></script>\n");
      out.write("  <script src=\"assets/js/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("  <script src=\"assets/js/material-dashboard.js?v=2.1.2\" type=\"text/javascript\"></script>\n");
      out.write("  <script src=\"assets/js/demo.js\"></script>\n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
