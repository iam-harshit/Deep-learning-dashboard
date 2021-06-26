import ExamplePackage.ConnectionManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.Cookie;

public class profile_delete extends HttpServlet {
    
    static Connection currentCon;
    
    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException
    {
        
        PrintWriter out=rs.getWriter();
        int row;
        
       try
       {
           
      
           Cookie ck[]=rq.getCookies();
           rs.setContentType("text/html");
           
           String emailCookies=ck[1].getValue();
               
           currentCon = ConnectionManager.getConnection();
           PreparedStatement st=currentCon.prepareStatement("delete from userdb where EmailID=? ");
           st.setString(1, emailCookies);
           row=st.executeUpdate();
           
           if(row>0)
           {
               
               rq.getRequestDispatcher("index.html").include(rq, rs);
               out.print("<script language='JavaScript'>alert('Your data has been deleted successfully. Now you redirect on login page.');</script>");
               
               PreparedStatement st1=currentCon.prepareStatement("delete from moneydb where mailID=? ");
               st1.setString(1, emailCookies);
               st1.executeUpdate();
               
//               PreparedStatement st2=currentCon.prepareStatement("delete from moneydb where mailID=? ");
//               st2.setString(1, emailCookies);
//               st2.executeUpdate();
               
           }
               
           else{
               
               out.print("<script language='JavaScript'>alert('Enter current login email id.');</script>");
               rq.getRequestDispatcher("delete-profile.html").include(rq, rs);
               
           }
           
           }
           
       
       catch(Exception e)
       {
           out.println(e.getMessage());
       }
    }

    
    

}
