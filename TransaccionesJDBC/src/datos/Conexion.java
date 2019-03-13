/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chelo
 */
public class Conexion {
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/javas?zeroDateTimeBehavior=convertToNull";
    private static String user = "root";
    private static Driver driver = null;
    
    
    
    public static synchronized Connection getConnection() throws SQLException{
        if (driver == null) {
            try {
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            } catch (Exception e) {
                System.out.println("Fallo en la carga");
                e.printStackTrace();
            }
            
        }
        return DriverManager.getConnection(URL, user,"");
    } 
    
    public static void close(ResultSet rs){
        try {
            if(rs != null){
                rs.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void close(PreparedStatement stat){
        try {
            if(stat != null){
                stat.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void close(Connection conn){
        try {
            if(conn != null){
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    
    
    
    
    
    
}
