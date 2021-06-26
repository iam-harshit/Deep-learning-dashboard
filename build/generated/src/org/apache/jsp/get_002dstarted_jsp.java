package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ExamplePackage.UserBean;
import java.util.*;

public final class get_002dstarted_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");

 	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(1000000);
 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("  <title>\n");
      out.write("    Step 2 | Payment\n");
      out.write("  </title>\n");
      out.write("  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("  <!--     Fonts and icons     -->\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\">\n");
      out.write("  \n");
      out.write("  <!-- CSS Files -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("  <link href=\"assets/css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("  <link href=\"assets/css/style.css\" rel=\"stylesheet\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/css/mdb.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"ecommerce-page sidebar-collapse\">\n");
      out.write("    \n");
      out.write("  <div class=\"page-header header-filter header-small\" data-parallax=\"true\" style=\"background-image: url('assets/images/bg-header.gif');\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-8 ml-auto mr-auto text-center\">\n");
      out.write("          <div class=\"brand\">\n");
      out.write("              \n");
      out.write("            ");
      ExamplePackage.UserBean UserBean = null;
      synchronized (_jspx_page_context) {
        UserBean = (ExamplePackage.UserBean) _jspx_page_context.getAttribute("UserBean", PageContext.PAGE_SCOPE);
        if (UserBean == null){
          UserBean = new ExamplePackage.UserBean();
          _jspx_page_context.setAttribute("UserBean", UserBean, PageContext.PAGE_SCOPE);
        }
      }
      out.write(" \n");
      out.write("           ");
 UserBean currentUser = (UserBean) session.getAttribute("currentSessionUser");
      out.write("\n");
      out.write("\t\n");
      out.write("            <h3 class=\"title\">Welcome, ");
      out.print(  currentUser.getEmail());
      out.write("</h3>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"section section-blog\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h2 class=\"section-title\"></h2>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <div class=\"card card-blog\">\n");
      out.write("            <div class=\"card-header card-header-image\">\n");
      out.write("              <a href=\"#pablo\">\n");
      out.write("                <img src=\"assets/images/card-bg-1.gif\" alt=\"\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("              <h4 class=\"card-title\">\n");
      out.write("                <a href=\"#pablo\">Have you any referral code?</a>\n");
      out.write("              </h4>\n");
      out.write("                <form class=\"form\" method=\"post\" action=\"referral_code\">\n");
      out.write("                <span class=\"bmd-form-group\">\n");
      out.write("                  <div class=\"input-group\" style=\"margin-top: 20px; margin-right: 20px;\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                      <span class=\"input-group-text\">\n");
      out.write("                        <i class=\"material-icons\">card_giftcard</i>\n");
      out.write("                      </span>\n");
      out.write("                    </div>\n");
      out.write("                      <input type=\"text\" name=\"referral\" class=\"form-control\" placeholder=\"Referral Code\">\n");
      out.write("                  </div>       \n");
      out.write("                    <div class=\"card-footer justify-content-center\">\n");
      out.write("                         <button type=\"submit\" class=\"btn btn-rose btn-link btn-lg\">Submit</button>\n");
      out.write("                    </div>  \n");
      out.write("                </span>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <div class=\"card card-blog\">\n");
      out.write("            <div class=\"card-header card-header-image\">\n");
      out.write("              <a href=\"#pablo\">\n");
      out.write("                <img src=\"assets/images/card-bg.gif\" alt=\"\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("              <h4 class=\"card-title\">\n");
      out.write("                <a href=\"#pablo\">Paid by payment gateway</a>\n");
      out.write("              </h4>\n");
      out.write("                <p>\n");
      out.write("                    <a type=\"button\" data-toggle=\"modal\" data-target=\"#modalPoll-1\">Click here </a>\n");
      out.write("                </p>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        \n");
      out.write("   <!-- Modal: modalPoll -->\n");
      out.write("<div class=\"modal fade right\" id=\"modalPoll-1\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\n");
      out.write("  aria-hidden=\"true\" data-backdrop=\"false\">\n");
      out.write("  <div class=\"modal-dialog modal-full-height modal-right modal-notify modal-info\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <!--Header-->\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <p class=\"heading lead\">Feedback request\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\" class=\"white-text\">×</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!--Body-->\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("          <i class=\"far fa-file-alt fa-4x mb-3 animated rotateIn\"></i>\n");
      out.write("          <p>Have some ideas how to improve our product?\n");
      out.write("            <strong>Give us your feedback.</strong>\n");
      out.write("          </p>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("          <br>\n");
      out.write("       <form action=\"payment\" method=\"post\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("               <div class=\"input-group-prepend\">\n");
      out.write("               <span class=\"input-group-text\">\n");
      out.write("               <i class=\"material-icons\"></i>\n");
      out.write("               </span>\n");
      out.write("            </div>\n");
      out.write("                <input id=\"ORDER_ID\" tabindex=\"1\" maxlength=\"20\" class=\"form-control\" size=\"20\" name=\"ORDER_ID\"  autocomplete=\"off\" value=\"TRANS_");
      out.print( randomInt );
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("            <div class=\"input-group-prepend\">\n");
      out.write("               <span class=\"input-group-text\">\n");
      out.write("                  <i class=\"material-icons\"></i>\n");
      out.write("               </span>\n");
      out.write("            </div>\n");
      out.write("                <input type=\"text\" id=\"CUST_ID\" name=\"CUST_ID\" class=\"form-control\" placeholder=\"Email\" value=\"");
      out.print( currentUser.getEmail());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("            <div class=\"input-group-prepend\">\n");
      out.write("               <span class=\"input-group-text\">\n");
      out.write("                  <i class=\"material-icons\"></i>\n");
      out.write("               </span>\n");
      out.write("            </div>\n");
      out.write("                <input class=\"form-control\" type=\"date\" id=\"INDUSTRY_TYPE_ID\" name=\"INDUSTRY_TYPE_ID\" placeholder=\"Payment Date\">\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("                \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("            <div class=\"input-group-prepend\">\n");
      out.write("               <span class=\"input-group-text\">\n");
      out.write("                  <i class=\"material-icons\"></i>\n");
      out.write("               </span>\n");
      out.write("            </div>\n");
      out.write("                <input title=\"TXN_AMOUNT\" class=\"form-control\" tabindex=\"10\" type=\"text\" name=\"TXN_AMOUNT\" placeholder=\"Amount\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("<!--        <div class=\"form-group\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("            <div class=\"input-group-prepend\">\n");
      out.write("               <span class=\"input-group-text\">\n");
      out.write("                  <i class=\"material-icons\"></i>\n");
      out.write("               </span>\n");
      out.write("            </div>\n");
      out.write("                <input type=\"hidden\" id=\"CUST_ID\" tabindex=\"2\" maxlength=\"30\" size=\"12\" name=\"CUST_ID\" autocomplete=\"off\" value=\"CUST001\">\n");
      out.write("            </div>\n");
      out.write("        </div>-->\n");
      out.write("                \n");
      out.write("<!--        <div class=\"form-group\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("            <div class=\"input-group-prepend\">\n");
      out.write("               <span class=\"input-group-text\">\n");
      out.write("                  <i class=\"material-icons\"></i>\n");
      out.write("               </span>\n");
      out.write("            </div>\n");
      out.write("                <input type=\"hidden\" id=\"INDUSTRY_TYPE_ID\" tabindex=\"4\" maxlength=\"12\" size=\"12\" name=\"INDUSTRY_TYPE_ID\" autocomplete=\"off\" value=\"Retail\">\n");
      out.write("            </div>\n");
      out.write("        </div>-->\n");
      out.write("                \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("            <div class=\"input-group-prepend\">\n");
      out.write("               <span class=\"input-group-text\">\n");
      out.write("                  <i class=\"material-icons\"></i>\n");
      out.write("               </span>\n");
      out.write("            </div>\n");
      out.write("                <input type=\"hidden\" id=\"CHANNEL_ID\" tabindex=\"4\" maxlength=\"12\" size=\"12\" name=\"CHANNEL_ID\" autocomplete=\"off\" value=\"WEB\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        <div class=\"modal-footer justify-content-center\">\n");
      out.write("        <input type=\"submit\" class=\"btn btn-primary waves-effect waves-light\" value=\"Send\">\n");
      out.write("        <a type=\"button\" class=\"btn btn-outline-primary waves-effect\" data-dismiss=\"modal\">Cancel</a>\n");
      out.write("      </div>        \n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!--Footer-->\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- Modal: modalPoll -->\n");
      out.write("\n");
      out.write("  <footer class=\"footer footer-black footer-big\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"copyright float-center\">\n");
      out.write("          &copy;\n");
      out.write("          <script>\n");
      out.write("            document.write(new Date().getFullYear())\n");
      out.write("          </script>, made with <i class=\"material-icons\">favorite</i> by\n");
      out.write("          <a target=\"_blank\">us</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("  <!-- jQuery -->\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/popper.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/mdb.min.js\"></script>\n");
      out.write("  \n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("  var field = document.querySelector('#INDUSTRY_TYPE_ID');\n");
      out.write("var date = new Date();\n");
      out.write("\n");
      out.write("// Set the date\n");
      out.write("field.value = date.getFullYear().toString() + '-' + (date.getMonth() + 1).toString().padStart(2, 0) + \n");
      out.write("    '-' + date.getDate().toString().padStart(2, 0);\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
