import ExamplePackage.ConnectionManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletException;

public class create_referral extends HttpServlet {
    
    static Connection currentCon;
    
    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, java.io.IOException
    {
        PrintWriter out=rs.getWriter();
        int r1;
        
       try
       {
           
           String referralCode=rq.getParameter("referralCode");
           String validity=rq.getParameter("validity");
           String validityUpto=rq.getParameter("validityUpto");
           String status=rq.getParameter("status");
           
           rs.setContentType("text/html");
               
           currentCon = ConnectionManager.getConnection();
                    
               PreparedStatement ps2=currentCon.prepareStatement("Insert into referraldb values(?, ?, ?, ?)");
               ps2.setString(1, referralCode);
               ps2.setString(2, validity);
               ps2.setString(3, validityUpto);
               ps2.setString(4, status);
               r1 = ps2.executeUpdate();
           
           if(r1>0){      
               rs.sendRedirect("admin/referral.jsp");   
            out.print("<script language='JavaScript'>alert('Referral created successfully.');</script>");
           }
           else{
     
               rs.sendRedirect("admin/referral.jsp");   
              out.print("<script language='JavaScript'>alert('Something went wrong.');</script>");
           }
          
           
       }
       catch(Exception e)
       {
           out.println(e.getMessage());
           
       }
    }

    
    

}
