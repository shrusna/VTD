/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatAccess;


import Model.Reserve;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ARUL
 */
public class ReserveDAO {
    
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
        public static int save(Reserve u)
        {
            int status = 0;
            try
            {
                Connection con = getConnection();
                PreparedStatement ps=con.prepareStatement
                         ("insert into reserve (nik, reservfirst, reservlast, gender, datebd, datebm, dateby, "
                                 + "address, reservemail, reservphone1, reservphone2, datedd, datedm, datedy, destination, transportation, memo, total)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1,u.getNik());
                ps.setString(2,u.getReservfirst());
                ps.setString(3,u.getReservlast());
                ps.setString(4,u.getGender());
                ps.setString(5,u.getDatebd());
                ps.setString(6,u.getDatebm());
                ps.setString(7,u.getDateby());
                ps.setString(8,u.getAddress());
                ps.setString(9,u.getReservemail());
                ps.setString(10,u.getReservphone1());
                ps.setString(11,u.getReservphone2());
                ps.setString(12,u.getDatedd());          
                ps.setString(13,u.getDatedm());          
                ps.setString(14,u.getDatedy());          
                ps.setString(15,u.getDestination());
                ps.setString(16,u.getTransportation());
                ps.setString(17,u.getMemo());
                ps.setString(18,u.getTotal());
                status = ps.executeUpdate();
            }
            catch ( SQLException ex) {
                    return status;
            }
            return status;
        }
   
    public static List<Reserve> getAllRecords(){  
    List<Reserve> list=new ArrayList<Reserve>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from reserve");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Reserve u=new Reserve();  
            u.setReserveid(rs.getInt("reserveid"));  
            u.setNik(rs.getInt("nik"));  
            u.setReservfirst(rs.getString("reservfirst"));  
            u.setReservlast(rs.getString("reservlast"));  
            u.setGender(rs.getString("gender"));  
            u.setDatebd(rs.getString("datebd"));  
            u.setDatebm(rs.getString("datebm"));  
            u.setDateby(rs.getString("dateby"));  
            u.setAddress(rs.getString("address"));  
            u.setReservemail(rs.getString("reservemail"));  
            u.setReservphone1(rs.getString("reservphone1"));  
            u.setReservphone2(rs.getString("reservphone2"));  
            u.setDatedd(rs.getString("datedd"));             
            u.setDatedm(rs.getString("datedm"));             
            u.setDatedy(rs.getString("datedy"));             
            u.setDestination(rs.getString("destination"));  
            u.setTransportation(rs.getString("transportation"));  
            u.setMemo(rs.getString("memo"));  
            u.setTotal(rs.getString("total"));  
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
    
           public static Reserve getRecordById(int reserveid){
    Reserve u=null;
    try{
        Connection con=getConnection();
        PreparedStatement ps=con.prepareStatement
                ("select * from reserve where reserveid=?");
                ps.setInt(1,reserveid);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            u=new Reserve();  
            u.setReserveid(rs.getInt("reserveid"));  
            u.setNik(rs.getInt("nik"));  
            u.setReservfirst(rs.getString("reservfirst"));  
            u.setReservlast(rs.getString("reservlast"));  
            u.setGender(rs.getString("gender"));  
            u.setDatebd(rs.getString("datebd"));  
            u.setDatebm(rs.getString("datebm"));  
            u.setDateby(rs.getString("dateby"));  
            u.setAddress(rs.getString("address"));  
            u.setReservemail(rs.getString("reservemail"));  
            u.setReservphone1(rs.getString("reservphone1"));  
            u.setReservphone2(rs.getString("reservphone2"));  
            u.setDatedd(rs.getString("datedd"));             
            u.setDatedm(rs.getString("datedm"));             
            u.setDatedy(rs.getString("datedy"));             
            u.setDestination(rs.getString("destination"));  
            u.setTransportation(rs.getString("transportation"));  
            u.setMemo(rs.getString("memo"));  
            u.setTotal(rs.getString("total"));  
        }
    }catch (Exception e){
        System.out.println(e);
    }
        return u;
}
                   public static int delete (Reserve b)
        {
            int status = 0;
            try
            {
                Connection con = getConnection();
                PreparedStatement ps=con.prepareStatement("delete from reserve where reserveid=?");
                ps.setInt(1,b.getReserveid());
                ps.executeUpdate();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            return status;
        }
        public static int update (Reserve b)
        {
            int status = 0;
            try
            {
                Connection con = getConnection();
                PreparedStatement ps=con.prepareStatement("UPDATE reserve SET nik=?,reservfirst=?,reservlast=?,gender=?,datebd=?,datebm=?,dateby=?,address=?,reservemail=?,reservphone1=?,reservphone2=?,"
                        + "datedd=?,datedm=?,datedy=?,destination=?,transportation=?,memo=?,total=? WHERE reserveid=?");
                ps.setInt(1,b.getNik());
                ps.setString(2,b.getReservfirst());
                ps.setString(3,b.getReservlast());
                ps.setString(4,b.getGender());
                ps.setString(5,b.getDatebd());
                ps.setString(6,b.getDatebm());
                ps.setString(7,b.getDateby());
                ps.setString(8,b.getAddress());
                ps.setString(9,b.getReservemail());
                ps.setString(10,b.getReservphone1());
                ps.setString(11,b.getReservphone2());
                ps.setString(12,b.getDatedd());          
                ps.setString(13,b.getDatedm());          
                ps.setString(14,b.getDatedy());          
                ps.setString(15,b.getDestination());
                ps.setString(16,b.getTransportation());
                ps.setString(17,b.getMemo());
                ps.setString(18,b.getTotal());
                ps.setInt(19,b.getReserveid());
                status = ps.executeUpdate();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            return status;
        }
}

