/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatAccess;

import Model.Feedback;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ARUL
 */
public class FeedbackDAO {
    
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
        public static int save(Feedback d)
        {
            int status = 0;
            try
            {
                Connection con = getConnection();
                PreparedStatement ps=con.prepareStatement("insert into feedback (feedemail, feedfirst, feedlast, feedback) values(?,?,?,?)");
                ps.setString(1,d.getFeedemail());
                ps.setString(2,d.getFeedfirst());
                ps.setString(3,d.getFeedlast());
                ps.setString(4,d.getFeedback());
                status = ps.executeUpdate();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            return status;
        }
   
    public static List<Feedback> getAllRecords(){  
    List<Feedback> list=new ArrayList<Feedback>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from feedback");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Feedback u=new Feedback();  
            u.setFeedid(rs.getInt("feedid"));  
            u.setFeedemail(rs.getString("feedemail"));  
            u.setFeedfirst(rs.getString("feedfirst"));  
            u.setFeedlast(rs.getString("feedlast"));  
            u.setFeedback(rs.getString("feedback"));  
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}
}