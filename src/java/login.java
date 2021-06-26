import ExamplePackage.ConnectionManager;
import ExamplePackage.UserDAO;
import ExamplePackage.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet {
  
    static Connection currentCon;

@Override
public void doPost(HttpServletRequest request, HttpServletResponse response) 
			           throws ServletException, java.io.IOException {
    
    PrintWriter out=response.getWriter();
    ResultSet r1;

try
{	
     String email = request.getParameter("email");

     UserBean user = new UserBean();
     user.setEmail(request.getParameter("email"));
     user.setPassword(request.getParameter("password"));

     user = UserDAO.login(user);
	   		    
     if (user.isValid())
     {
	        
          HttpSession session = request.getSession(true);	    
          session.setAttribute("currentSessionUser",user); 
          
          //Create cookie
          Cookie ck=new Cookie("email", email); 
          response.addCookie(ck); 
          
          currentCon = ConnectionManager.getConnection();
          PreparedStatement st1=currentCon.prepareStatement("select Money_Paid from userdb where EmailID=? and Money_Paid='NO'");
          st1.setString(1, email);
          r1=st1.executeQuery();
          
          if(r1.next()){
              response.sendRedirect("get-started.jsp");
          }
          else{
              response.sendRedirect("home.jsp");
          }

     }
	        
     else{
          out.print("<script language='JavaScript'>alert(' Sorry, you are not a registered user! Please first register yourself.');</script>"); //error page
          request.getRequestDispatcher("index.html").include(request, response);
     }
} 
		
		
catch (Exception e) 	    
{
     out.println(e.getMessage()); 
}
    
}

}