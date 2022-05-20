
package dao;

import java.sql.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conn 
{
    public Statement conn()
    {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("Connecting to Database...");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "BRYAN", "Adminroot123");
            Statement statement = connection.createStatement();
            return statement;
        } catch (SQLException ex) {
            Logger.getLogger(Conn.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public LinkedList<String> query(String querys)
    {
        
        try {
            Statement stmt = conn();
            ResultSet rs = stmt.executeQuery(querys);
            
            LinkedList<String> result = new LinkedList();
            
            while (rs.next())
            {                
                for (int i = 1; i < rs.getMetaData().getColumnCount() + 1; i++)
                {
                    result.add(rs.getString(i));
                }
            }
            
            return result;            
        } catch (SQLException ex) {
            Logger.getLogger(Conn.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
