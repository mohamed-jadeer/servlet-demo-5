/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jadeer
 */
public class DBCon {
    public static Connection getConnection() throws SQLException{
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3036/student","root", "");
        }
        catch(Exception e){
           PreparedStatement s = con.prepareStatement("create database student");
            s.executeUpdate();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3036/student","root", "12345");
            e.printStackTrace();            
        }
        return con;
    }
}
