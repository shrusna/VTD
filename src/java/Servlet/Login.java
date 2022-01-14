package Servlet;

import Connection.koneksidb;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name ="Login", urlPatterns={"/Login"})
public class Login extends HttpServlet {
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    public Login() { 
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Username = request.getParameter("username");
        String Password = request.getParameter("password");

        try {
            conn = new koneksidb().setConnection();
            ps = conn.prepareStatement("select * from member where username = ? and password = ?");
            ps.setString(1, Username);
            ps.setString(2, Password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
                request.setAttribute("username", Username);
                rd.forward(request, response);
                
                HttpSession session=request.getSession();  
                session.setAttribute("username",Username); 
                

            } else{
                            response.sendRedirect("error-login.jsp");
            }
        } catch (Exception e) {
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
