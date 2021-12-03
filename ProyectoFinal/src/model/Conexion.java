/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author usuario1
 */
public class Conexion {
     public static Connection getConexion() throws SQLException {
        // conectar
        Connection conn = DriverManager.getConnection(Properties.dbURL, Properties.username, Properties.password);
        try {
            conn = DriverManager.getConnection(
                    Properties.dbURL, Properties.username, Properties.password);
            if (conn != null) {
                System.out.println("*** Conected to database ***");
                return conn;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
}
