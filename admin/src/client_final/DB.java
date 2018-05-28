package client_final;



/**
 *
 * @author veivesh
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DB {
    Connection conn = null;
    static String driver = "com.mysql.jdbc.Driver"; //initializing the driver
    static String url = "jdbc:mysql://localhost/video_lending";// Initializing the path to the database
    static String UserName = "root";
    static String Password = "1234"; //database username and password
    
    public static Connection getConnect(){    
        //Class used to connect to the database

	try{
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url, UserName, Password);
            return conn;
//            JOptionPane.showMessageDialog(null,"Connection to MySQL server Established");
	}
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
	}
    }
}
