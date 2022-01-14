/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatAccess;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.Member;

/**
 *
 * @author ARUL
 */
public class MemberDAO {
    
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
        public static int save(Member u)
        {
            int status = 0;
            try
            {
                Connection con = getConnection();
                PreparedStatement ps=con.prepareStatement("insert into member (username, password, first, last, email, phone) values(?,?,?,?,?,?)");
                ps.setString(1,u.getUsername());
                ps.setString(2,u.getPassword());
                ps.setString(3,u.getFirst());
                ps.setString(4,u.getLast());
                ps.setString(5,u.getEmail());
                ps.setString(6,u.getPhone());
                status = ps.executeUpdate();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            return status;
        }
   
    public static List<Member> getAllRecords(){  
    List<Member> list=new ArrayList<Member>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from member");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Member u=new Member();  
            u.setUserid(rs.getInt("userid"));  
            u.setUsername(rs.getString("username"));  
            u.setPassword(rs.getString("password"));  
            u.setFirst(rs.getString("first"));  
            u.setLast(rs.getString("last"));  
            u.setEmail(rs.getString("email"));  
            u.setPhone(rs.getString("phone"));  
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}
        
           public static Member getRecordById(int userid){
    Member b=null;
    try{
        Connection con=getConnection();
        PreparedStatement ps=con.prepareStatement
                ("select * from member where userid=?");
                ps.setInt(1 ,userid);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            b =new Member();  
            b.setUserid(rs.getInt("userid"));  
            b.setUsername(rs.getString("username"));  
            b.setPassword(rs.getString("password"));  
            b.setFirst(rs.getString("first"));  
            b.setLast(rs.getString("last"));  
            b.setEmail(rs.getString("email"));  
            b.setPhone(rs.getString("phone"));  
        }
    }catch (Exception e){
        System.out.println(e);
    }
        return b;
}
                   public static int delete (Member b)
        {
            int status = 0;
            try
            {
                Connection con = getConnection();
                PreparedStatement ps=con.prepareStatement("delete from member where userid=?");
                ps.setInt(1,b.getUserid());
                ps.executeUpdate();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            return status;
        }
                   
        public static int update (Member b)
        {
            int status = 0;
            try
            {
                Connection con = getConnection();
                PreparedStatement ps=con.prepareStatement("UPDATE member SET username=?,password=?,first=?,last=?,email=?,phone=? WHERE userid=?");
                 ps.setString(1,b.getUsername());
                ps.setString(2,b.getPassword());
                ps.setString(3,b.getFirst());
                ps.setString(4,b.getLast());
                ps.setString(5,b.getEmail());
                ps.setString(6,b.getPhone());
                ps.setInt(7,b.getUserid());
                status = ps.executeUpdate();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            return status;
        }
}
