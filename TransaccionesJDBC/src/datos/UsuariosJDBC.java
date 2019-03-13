/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import domain.Usuarios;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Chelo
 */
public class UsuariosJDBC {
    private java.sql.Connection userConn;
    
    private final String SQL_INSERT = "insert into usuarios(nombre_usuario,apellido_usuario)values(?,?)";
    private final String SQL_SELECT = "select * from usuarios";
    
    public UsuariosJDBC(){}
    public UsuariosJDBC(Connection conn){
        this.userConn = conn;
    }
    
    
    
    public int insert(String nombre, String apellido){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int rows = 0;
        
        try {
            conn = (this.userConn != null) ? this.userConn: Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            int index = 1;
            ps.setString(index++, nombre);
            ps.setString(index++, apellido);
            System.out.println("Ejecutando query" + SQL_INSERT);
            rows = ps.executeUpdate();
            System.out.println("Registros afectados"+ rows);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            Conexion.close(ps);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return rows;
    }
    
    public List<Usuarios> select(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Usuarios usuario = null;
        
        List<Usuarios> usuarios = new ArrayList<Usuarios>();
        
        try {
            conn = (this.userConn != null) ? this.userConn: Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            while(rs.next()){
                int id_usuario = rs.getInt("id_usuario");
                String nombre_usuario = rs.getString("nombre_usuario");
                String apellido_usuario = rs.getString("apellido_usuario");
                usuario = new Usuarios();
                usuario.setId_usuario(id_usuario);
                usuario.setNombre_usuario(nombre_usuario);
                usuario.setApellido_usuario(apellido_usuario);
                usuarios.add(usuario);
                
            }
        } catch (SQLException e) {
            
        }finally{
            Conexion.close(ps);
            Conexion.close(rs);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return usuarios;
    }
    
    
    
    
    
    
}
