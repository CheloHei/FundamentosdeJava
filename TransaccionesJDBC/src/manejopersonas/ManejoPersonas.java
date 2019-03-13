/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejopersonas;

import datos.Conexion;
import datos.UsuariosJDBC;
import domain.Usuarios;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Chelo
 */
public class ManejoPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuariosJDBC usuarioJDBC = new UsuariosJDBC();
        //usuarioJDBC.insert("Marce", "Heinichen");

        //creamos un objeto conexion, se va a compartir 
        //para todos los queries que ejecutemos
        Connection conn = null;
        try {
            conn = Conexion.getConnection();
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }

            UsuariosJDBC usuario = new UsuariosJDBC(conn);
            usuario.insert("maicol", "Palez");
            conn.commit();
        } catch (SQLException e) {
            try {
                System.out.println("Entramos al rollback");
                e.printStackTrace(System.out);
                //Hacemos el rollback;
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

    }

}
