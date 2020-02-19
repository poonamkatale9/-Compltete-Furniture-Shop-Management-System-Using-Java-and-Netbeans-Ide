/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package royalfurniture;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Acer
 */
public class DBConnect {
    static Connection conn=null;
    static final String DB_URL="jdbc:mysql://localhost/royal_furniture";
    static final String USER="root";
    static final String PASS="";
    
    public static Connection connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
        }
        catch(Exception e)
        {
            
        }
        return conn;
    }
}
