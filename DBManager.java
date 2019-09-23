/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hackms
 */
public class DBManager {
    Connection con=null;
     PreparedStatement pst =null;
     ResultSet rs = null;

     
   
        public static Connection ConnectDB(){
             try{
           
          Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","kiki");
          return con;
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }      
}
        public static void close(Connection con) {
          try  {
              con.close();
          }
          catch(Exception ex) {
              JOptionPane.showMessageDialog(null, ex);
          }
      }

}


