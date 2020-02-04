/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectMSSQL {
    public Connection connection;
            
    public static Connection  connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection;
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Bloodbank;selectMethod=cursor", "sa", "123456");

           

           return connection;
            
            
            
          
            
        } catch (ClassNotFoundException | SQLException e) {
        }return null;
    }
    
    public static void main(String[] args) {
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
    }
    
}
