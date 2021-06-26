import ExamplePackage.ConnectionManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class delete_referral extends HttpServlet {
    
    static Connection currentCon;
    
    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException
    {
        
        PrintWriter out=rs.getWriter();
        int row;
        
       try
       {
           String referralCode = rq.getParameter("referralCode");
           
           rs.setContentType("text/html");
               
           currentCon = ConnectionManager.getConnection();
           PreparedStatement st=currentCon.prepareStatement("delete from referraldb where referral_code=? ");
           st.setString(1, referralCode);
           row=st.executeUpdate();
           
           if(row>0)
           {
            rs.sendRedirect("admin/referral.jsp");   
            out.print("<script language='JavaScript'>alert('Referral deleted successfully');</script>");
           }
               
           else{
               
               rs.sendRedirect("admin/referral.jsp");   
               out.print("<script language='JavaScript'>alert('This referral code doesn't exist.);</script>");
           }
           
           }
           
       
       catch(Exception e)
       {
           out.println(e.getMessage());
       }
    }

    
    

}
