import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;


public class referral_code extends HttpServlet {
    
    ResultSet r1, r2, r3;
    
    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws IOException, ServletException
    {
        
        PrintWriter out=rs.getWriter();
        
        Cookie ck[]=rq.getCookies();
       
        
       try
       {
          
           String referral_code=rq.getParameter("referral");
           rs.setContentType("text/html");
             
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject?autoReconnect=true&useSSL=false","root","root");
           PreparedStatement st=con.prepareStatement("select * from referraldb where referral_code=?");
           st.setString(1, referral_code);
           r1=st.executeQuery();
           
           if(r1.next())
           {
               PreparedStatement st1=con.prepareStatement("select validity_upto from referraldb where referral_code=? and validity_upto < CURDATE()");
               st1.setString(1, referral_code);
               r2=st1.executeQuery();
               
               if(r2.next()){
                   
                    out.print("<script language='JavaScript'>alert('Sorry! this referral code is experied.');</script>");
                    rq.getRequestDispatcher("get-started.jsp").include(rq, rs);
                   
               } 
               else{
                   String emailCookies=ck[1].getValue();  
                   
                   PreparedStatement st2=con.prepareStatement("update userdb set Money_Paid ='YES', Paid_By='Referaal Code' where EmailID=?");
                   st2.setString(1, emailCookies);
                   st2.executeUpdate();
                   rq.getRequestDispatcher("thank-you.jsp").include(rq, rs);
               }
           }
           else{
                              
           out.print("<script language='JavaScript'>alert('This referral code does not exists.');</script>");
           rq.getRequestDispatcher("get-started.jsp").include(rq, rs);
           
           }
                 
       }
       catch(Exception e)
       {
           out.println(e.getMessage());
           
       }
    }
}
