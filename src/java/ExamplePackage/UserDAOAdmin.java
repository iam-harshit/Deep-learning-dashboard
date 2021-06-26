package ExamplePackage;

import java.text.*;
import java.util.*;
import java.sql.*;

public class UserDAOAdmin 	
{
    static Connection currentCon;
    static ResultSet rs;  
	
    
    public static UserBean loginAdmin(UserBean bean){
        Statement stmt=null;    
	
        String email = bean.getEmail();    
        String password = bean.getPassword();   

	    
      try 
      {
          
         currentCon = ConnectionManager.getConnection();
         PreparedStatement st=currentCon.prepareStatement("select * from admindb where Name=? and Password=? ");
         st.setString(1, email);
         st.setString(2, password);	 
         rs=st.executeQuery();
         boolean more = rs.next();
           
         // if user does not exist set the isValid variable to false
         if (!more) 
         {
            System.out.println("Sorry, you are not a registered user");
            bean.setValid(false);
         } 
	        
         //if user exists set the isValid variable to true
         else if (more) 
         {
            bean.setValid(true);
         }
         
      } 

      catch (Exception ex) 
      {
         System.out.println("Log In failed: An Exception has occurred! " + ex);
      } 
	    
      finally 
      {
         if (rs != null)	{
            try {
               rs.close();
            } catch (Exception e) {}
               rs = null;
            }
	
         if (stmt != null) {
            try {
               stmt.close();
            } catch (Exception e) {}
               stmt = null;
            }
	
         if (currentCon != null) {
            try {
               currentCon.close();
            } catch (Exception e) {
            }

            currentCon = null;
         }
      }

return bean;
	
      }	
   }

