/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos.pool;
import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
/**
 *
 * @author Chelo
 */
public class PoolConexionesMySql {
    
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("");
        ds.setUrl("jdbc:mysql://localhost:3306/javas?zeroDateTimeBehavior=convertToNull");
        //definir el tamaño del pull de conexiones
        ds.setInitialSize(5);
        return ds;
    }
    public static Connection getConexion() throws SQLException{
        return getDataSource().getConnection();
    }
}
