import ExamplePackage.ConnectionManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;

public class profile extends HttpServlet {
    static Connection currentCon;
    
    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException
    {
        PrintWriter out=rs.getWriter();
        
           Cookie ck[]=rq.getCookies();  

        
       try
       {
           
           
           String fullName = rq.getParameter("fullName");
           String password = rq.getParameter("password");
           rs.setContentType("text/html");
           
           if(fullName == null || "".equals(fullName)){
               
           out.print("<script language='JavaScript'>alert('Please enter your full name');</script>");
           rq.getRequestDispatcher("profile.jsp").include(rq, rs);
           
           }
           else if(password == null || "".equals(password)){   
               
           rq.getRequestDispatcher("profile.jsp").include(rq, rs);
           out.print("<script language='JavaScript'>alert('Please enter your password');</script>");
           
           }
           
           String emailCookies=ck[1].getValue();
           currentCon = ConnectionManager.getConnection();
           PreparedStatement ps=currentCon.prepareStatement("update userdb set Name=?, Password=? where EmailID=?");
           ps.setString(1, fullName);
           ps.setString(2, password); 
           ps.setString(3, emailCookies);
           int row = ps.executeUpdate();
           
           if(row>0) 
           {
            
            rq.getRequestDispatcher("profile.jsp").include(rq, rs);   
            out.print("<script language='JavaScript'>alert('Your new record updated successfully.');</script>");
            
           }
           else
           {
               
            out.print("<script language='JavaScript'>alert('Something went wrong.');</script>");
            rq.getRequestDispatcher("profile.jsp").include(rq, rs);
            
           }  
           
       }
       catch(Exception e)
       {
           out.println(e.getMessage());
       }
    }

}
