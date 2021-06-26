import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;

public class payment extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws IOException, ServletException
    {
        PrintWriter out=rs.getWriter();
        int r1;
        
       try
       {
           
           
           String transcationID=rq.getParameter("ORDER_ID");
           String email=rq.getParameter("CUST_ID");
           String paymentDate=rq.getParameter("INDUSTRY_TYPE_ID");
           String amount = rq.getParameter("TXN_AMOUNT");
           
           rs.setContentType("text/html");
               
           Class.forName("com.mysql.jdbc.Driver");
           
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject?autoReconnect=true&useSSL=false","root","root");
           
           PreparedStatement ps1=con.prepareStatement("Insert into moneydb (TransactionID, mailID, Amount, Payment_Date) values(?,?,?, ?)");
           ps1.setString(1, transcationID);
           ps1.setString(2, email);
           ps1.setString(3, amount);
           ps1.setString(4, paymentDate);
          r1= ps1.executeUpdate();
           
          if(r1 > 0 ){
           PreparedStatement st2=con.prepareStatement("update userdb set Money_Paid ='YES', Paid_By='Payment Gateway' where EmailID=?");
           st2.setString(1, email);
           st2.executeUpdate();
           rq.getRequestDispatcher("pgRedirect.jsp").include(rq, rs);
          }
          else{
              
           out.print("<script language='JavaScript'>alert('Something went wrong.');</script>");
          }
          
       }
       catch(Exception e)
       {
           out.println(e.getMessage());
           
       }
    }

}
