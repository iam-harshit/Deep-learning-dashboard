package ExamplePackage;

import java.sql.*;
import java.util.*;


public class ConnectionManager {

   static Connection con;
            
   public static Connection getConnection()
   {
        
    try
    {

        Class.forName("com.mysql.jdbc.Driver");
            
        try
        {            	
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject?autoReconnect=true&useSSL=false","root","root"); 
                 
        }
            
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }

        catch(ClassNotFoundException e)
        {
           System.out.println(e);
        }

    return con;
}

}
