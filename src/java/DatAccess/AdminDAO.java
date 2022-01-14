/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatAccess;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.Admin;

/**
 *
 * @author ARUL
 */
public class AdminDAO {
    
    public static Connection getConnection() 
    {
        Connection con=null;
        try
        {
            String url = "jdbc:mysql://localhost:3306/vtd";
            String user = "root";
            String pass = "";
            String db = "vtd";
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url,user,pass);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return con;
    }

           public static Admin getRecordById(String username){
    Admin u=null;
    try{
        Connection con=getConnection();
        PreparedStatement ps=con.prepareStatement
                ("select * from member where username=?");
                ps.setString(1,username);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            u=new Admin();  
            u.setUsername(rs.getString("username"));  
            u.setPassword(rs.getString("password"));  
        }
    }catch (Exception e){
        System.out.println(e);
    }
        return u;
}
}