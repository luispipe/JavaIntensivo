/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static model.Conexion.getConexion;

/**
 *
 * @author usuario1
 */
public class ConsultasProductos {
    
    public boolean crear(Producto pro) throws SQLException{
        PreparedStatement ps= null;
        Connection con= getConexion();
        
        String sql= "Insert Into producto (codigo,nombre,precio,cantidad)"
                + "Values(?,?,?,?)";
        
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setDouble(3, pro.getPrecio());
            ps.setInt(4, pro.getCantidad());
            
            ps.execute();
            return true;

        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }           
        } 
    }
    
    public boolean actualizar(Producto pro) throws SQLException{
        PreparedStatement ps= null;
        Connection con= getConexion();
        
        String sql= "UPDATE producto SET codigo=?,nombre=?,precio=?, cantidad=?"
                + "WHERE codigo=?";
        
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setDouble(3, pro.getPrecio());
            ps.setInt(4, pro.getCantidad());
            ps.setString(5, pro.getCodigo());
            
            ps.execute();
            return true;

        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }           
        } 
    }
    
     public boolean eliminar(Producto pro) throws SQLException{
        PreparedStatement ps= null;
        Connection con= getConexion();
        
        String sql= "DELETE FROM producto WHERE codigo=?";
        
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
                      
            ps.execute();
            return true;

        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }           
        } 
    
    }
     
      public boolean Buscar(Producto pro) throws SQLException{
        PreparedStatement ps= null;
        Connection con= getConexion();
        ResultSet rs= null;
        String sql= "SELECT * FROM producto WHERE codigo=?";
        
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            rs= ps.executeQuery();
            
            if(rs.next()){
                pro.setCodigo(rs.getString("codigo"));
                pro.setNombre(rs.getString("nombre"));
                pro.setPrecio(Double.parseDouble(rs.getString("precio")));
                pro.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                
                return true;
            }
            return false;

        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }           
        } 
    
    }
}

