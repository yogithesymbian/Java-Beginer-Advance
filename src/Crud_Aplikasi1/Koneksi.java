/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud_Aplikasi1;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class Koneksi
{
    //connection db_model
    
    private static Connection mysqlConnect;
    public static Connection connectDB() throws SQLException
    {
        if (mysqlConnect == null)
        {
            try 
            {
                String db_delta = "jdbc:mysql://127.0.0.1:3306/delta_db";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlConnect = (Connection) DriverManager.getConnection(db_delta,user,pass);
                
            } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, "gagal koneksi");
            }
        }
        
        return mysqlConnect;
    }
}
