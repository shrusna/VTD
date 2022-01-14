package Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class koneksidb {
    Connection con;
    Statement stm;
    
    
    private Connection connection = null;    
    

    public Connection setConnection(){
        try
        {
            String url = "jdbc:mysql://localhost:3306/vtd";
            String user = "root";
            String pass = "";
            String db = "vtd";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        } 
        catch (ClassNotFoundException | SQLException e) {
        }
        return connection;
    }
}
