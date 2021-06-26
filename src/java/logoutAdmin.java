import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

public class logoutAdmin extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException
    {
        
        PrintWriter out=rs.getWriter();
        
       try
       {
          rs.setContentType("text/html"); 
          
          Cookie cookie = new Cookie("email", null);
          cookie.setPath("/FinalProject");
          cookie.setHttpOnly(true);
          cookie.setMaxAge(0);
          rs.addCookie(cookie);
//          
//          HttpSession session = rq.getSession(false);
//          session.invalidate();   
//          rs.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of the page from the origin server
//          rs.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
//          rs.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
//          rs.setHeader("Pragma","no-cache");
//          
////          String userName = (String) session.getAttribute("currentSessionUser");
////            if (null == userName) {
////               
////               rq.setAttribute("Error", "Session has ended.  Please login.");
////               RequestDispatcher rd = rq.getRequestDispatcher("index.html");
////               rd.forward(rq, rs);
////            }
//             	  rs.sendRedirect("index.html");

            HttpSession ss = rq.getSession(false);
            ss.setAttribute("currentSessionUser", null); 
            if (ss.getAttribute("currentSessionUser") == null ) {
                rs.sendRedirect("admin/index.html");
            }

            rs.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            rs.addHeader("Cache-Control", "post-check=0, pre-check=0");
            rs.setHeader("Pragma", "no-cache");
            rs.setDateHeader("Expires", 0);        
            ss.invalidate();
            rs.sendRedirect("admin/index.html");
         
          
       }
       
       catch(Exception e)
       {
           out.println(e.getMessage());
           
       }
    }
}
