import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.Cookie;


public class home extends HttpServlet {
    
    ResultSet r1, r2;
    
    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException
    {
        
        PrintWriter out=rs.getWriter();
       try
       {
          rs.setContentType("text/html");
           
           Cookie ck[]=rq.getCookies();
           
           if(ck == null || ck.equals("")){  
                      
               rq.getRequestDispatcher("error.html").include(rq, rs);
               
           }else{ 
                       
            String email=ck[1].getValue();  
            if(!email.equals("") || email!=null){  
            rq.getRequestDispatcher("home.jsp").include(rq, rs);
               
           }
            
           }
                 
       }
       catch(Exception e)
       {
           out.println(e.getMessage());
           
       }
    }
}
