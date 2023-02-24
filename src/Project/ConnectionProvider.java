/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.*;

/*
 *
 * @author amna
 */
public class ConnectionProvider {
     public static Connection getCon()
    {
         Connection con=null;
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             System.out.println(" driverr loaded ");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","admin","root");
              System.out.println(" connection done ");
             return con;
        }
            catch(ClassNotFoundException e)
        {
           System.out.println(" Exception "+e.getMessage());
        }
        
        catch(SQLException e)
        {
             System.out.println(" SQL Exception "+e.getMessage());
            
        }
      return null;
    }
    
}
