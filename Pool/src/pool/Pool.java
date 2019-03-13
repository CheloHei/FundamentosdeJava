/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool;
import capadatos.pool.PoolConexionesMySql;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Chelo
 */
public class Pool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            conn = PoolConexionesMySql.getConexion();
            System.out.println("utilizamos el pool de Mysql");
            ps = conn.prepareStatement("select * from usuarios");
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(" "  + rs.getInt("id_usuario"));
                System.out.println(" "  + rs.getString("nombre_usuario"));
                System.out.println(" "  + rs.getString("apellido_usuario"));
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
