/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Kashmir Singh
 */
public class Connect {
   public  static Connection con;
   public  static Statement st;
   
   public static void getConnection()
   {
   try
   {
       Class.forName("com.mysql.jdbc.Driver");
       con = DriverManager.getConnection("jdbc:mysql:///bankmanagement","root","");
       st = con.createStatement();
   }
   catch(Exception e)
   {
       System.out.println(e);
   }
   }
}
   
