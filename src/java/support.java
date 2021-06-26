import ExamplePackage.ConnectionManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;

public class support extends HttpServlet {
    static Connection currentCon;
    
    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException
    {
        PrintWriter out=rs.getWriter();
        
           Cookie ck[]=rq.getCookies();  
         
        
       try
       {
           
//           String email = rq.getParameter("email");
           String issueType = rq.getParameter("issueType");
           String severity = rq.getParameter("severity");
           String date = rq.getParameter("date");
           String description = rq.getParameter("description");
           
           rs.setContentType("text/html");

           
           String emailCookies=ck[1].getValue();
           currentCon = ConnectionManager.getConnection();
           PreparedStatement ps=currentCon.prepareStatement("insert into chatdb (User_Mail, Description, Issue_Type, Severity, Date) values(?, ?, ?, ?, ?)");
           ps.setString(1, emailCookies);
           ps.setString(2, description); 
           ps.setString(3, issueType);
           ps.setString(4, severity);
           ps.setString(5, date);
           int row = ps.executeUpdate();
           
           if(row>0) 
           {
            
            rq.getRequestDispatcher("support.jsp").include(rq, rs);   
            out.print("<script language='JavaScript'>alert('Your support record stored successfully.');</script>");
            
           }
           else
           {
               
            out.print("<script language='JavaScript'>alert('Something went wrong.');</script>");
            rq.getRequestDispatcher("support.jsp").include(rq, rs);
            
           }  
           
       }
       catch(Exception e)
       {
           out.println(e.getMessage());
       }
    }

}
