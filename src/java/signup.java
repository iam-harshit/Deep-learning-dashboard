import ExamplePackage.ConnectionManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletException;

public class signup extends HttpServlet {
    
//    static Connection currentCon;
    
    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, java.io.IOException
    {
        PrintWriter out=rs.getWriter();
        ResultSet r1;
        
       try
       {
           
           String fullName=rq.getParameter("fullName");
           String email=rq.getParameter("email");
           String password=rq.getParameter("password");
           
           rs.setContentType("text/html");
               
//           currentCon = ConnectionManager.getConnection();
           Class.forName("com.mysql.jdbc.Driver");
           
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject?autoReconnect=true&useSSL=false","root","root");
           
           PreparedStatement ps1=con.prepareStatement("select * from userdb where EmailID=?");
           ps1.setString(1, email);
           r1=ps1.executeQuery();
           
           if(!r1.next()){               
               PreparedStatement ps2=con.prepareStatement("Insert into userdb (Name, EmailID, Password) values(?,?,?)");
               ps2.setString(1, fullName);
               ps2.setString(2, email);
               ps2.setString(3, password);
               ps2.executeUpdate();
//               out.print("<script language='JavaScript'>alert('Thankyou, your data has been submitted');</script>");
               rs.sendRedirect("index.html"); 
           }
           else{
               
           out.print("<script language='JavaScript'>alert('User already exist.');</script>");
           rq.getRequestDispatcher("signup.jsp").include(rq, rs);
           }
          
           
       }
       catch(Exception e)
       {
           out.println(e.getMessage());
           
       }
    }

    
    

}
