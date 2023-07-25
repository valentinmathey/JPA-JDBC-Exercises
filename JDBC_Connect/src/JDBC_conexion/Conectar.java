
package JDBC_conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// @author Valentin Mathey
 
public class Conectar {
    
    public static final String URL = "jdbc:mysql://localhost:3306/nba";
    public static final String USER = "root";
    public static final String CLAVE = "root";
    
    	
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}
