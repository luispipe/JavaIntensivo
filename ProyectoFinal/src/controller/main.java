/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ConsultasProductos;
import model.Producto;
import view.frmProducto;
import view.PruebaIcono;

/**
 *
 * @author usuario1
 */
public class main {
    
    public static void main(String[]args){
    
        Producto modPro= new Producto();
        ConsultasProductos modCPro= new ConsultasProductos();
        frmProducto vistaPro= new frmProducto();
        PruebaIcono prueba= new PruebaIcono();

        Controlador control= new Controlador(modPro,modCPro,vistaPro,prueba);
        control.start();
        vistaPro.setVisible(true);
    }
}
