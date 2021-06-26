import ExamplePackage.ConnectionManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;

public class chat_reply extends HttpServlet {
    static Connection currentCon;
    
    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException
    {
        PrintWriter out=rs.getWriter();
 
        
       try
       {
           
           
           String chatID = rq.getParameter("chatID");
           String reply = rq.getParameter("reply");
           rs.setContentType("text/html");

           currentCon = ConnectionManager.getConnection();
           PreparedStatement ps=currentCon.prepareStatement("update chatdb set Resolved_Problem=? where chat_ID=?");
           ps.setString(1, reply);
           ps.setString(2, chatID); 
           int row = ps.executeUpdate();
           
           if(row>0) 
           {
            
            rs.sendRedirect("admin/chat.jsp");   
            out.print("<script language='JavaScript'>alert('Your reply has been sent successfully.');</script>");
            
           }
           else
           {
               
            out.print("<script language='JavaScript'>alert('Something went wrong.');</script>");
            rs.sendRedirect("admin/chat.jsp");
            
           }  
           
       }
       catch(Exception e)
       {
           out.println(e.getMessage());
       }
    }

}
