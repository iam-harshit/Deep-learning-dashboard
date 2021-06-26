import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

public class logout extends HttpServlet {
    
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


            HttpSession ss = rq.getSession(false);
            ss.setAttribute("currentSessionUser", null); 
            if (ss.getAttribute("currentSessionUser") == null ) {
                rs.sendRedirect("index.html");
            }
      
            ss.invalidate();
            
            rs.setHeader("Cache-Control","no-cache"); 
            rs.setHeader("Cache-Control","no-store"); 
            rs.setDateHeader("Expires", 0); 
            rs.sendRedirect("index.html");
                 
          
       }
       
       catch(Exception e)
       {
           out.println(e.getMessage());
           
       }
    }
}
