/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ConsultasProductos;
import model.Producto;
import view.frmProducto;
import view.PruebaIcono;

/**
 *
 * @author usuario1
 */
public class Controlador implements ActionListener{
    private Producto modelPro;
    private ConsultasProductos modelCPro;
    private frmProducto vistaPro;
    private PruebaIcono prueba;
    DefaultTableModel modeloTabla= new DefaultTableModel();

    
    public Controlador(Producto modelPro,ConsultasProductos modelCPro,frmProducto vistaPro, PruebaIcono prueba){
        this.modelPro= modelPro;
        this.modelCPro= modelCPro;
        this.vistaPro= vistaPro;
        this.prueba= prueba;
        this.vistaPro.jButtonGuardar.addActionListener(this);
        this.vistaPro.jButtonBuscar.addActionListener(this);
        this.vistaPro.jButtonActualizar.addActionListener(this);
        this.vistaPro.jButtonEliminar.addActionListener(this);
        this.vistaPro.jButtonListar.addActionListener(this);
        this.vistaPro.jButtonListar.addActionListener(this);
        this.vistaPro.jButton2.addActionListener(this);
        this.vistaPro.jButtonEliminarItemTabla.addActionListener(this);
    //    this.vistaPro.jTableDetalle.addComponentListener();
    
    }
    
    public void start(){
        vistaPro.setTitle("Productos");
        vistaPro.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()== vistaPro.jButtonGuardar){
            modelPro.setCodigo(vistaPro.jTextFieldCodigo.getText());
            modelPro.setNombre(vistaPro.jTextFieldNombre.getText());
            modelPro.setPrecio(Double.parseDouble(vistaPro.jTextFieldPrecio.getText()));
            modelPro.setCantidad(Integer.parseInt(vistaPro.jTextFieldCantidad.getText()));
            
            try {
                if(modelCPro.crear(modelPro)){
                    JOptionPane.showMessageDialog(null,"Producto Guardado");
                    limpiar();
                }else{
                    JOptionPane.showMessageDialog(null,"Error al guardar");
                    limpiar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Solución
        if(e.getSource()== vistaPro.jButtonActualizar){
            modelPro.setCodigo(vistaPro.jTextFieldCodigo.getText());
            modelPro.setNombre(vistaPro.jTextFieldNombre.getText());
            modelPro.setPrecio(Double.parseDouble(vistaPro.jTextFieldPrecio.getText()));
            modelPro.setCantidad(Integer.parseInt(vistaPro.jTextFieldCantidad.getText()));
            
            try {
                if(modelCPro.actualizar(modelPro)){
                    JOptionPane.showMessageDialog(null,"Producto Actualizado");
                    limpiar();
                }else{
                    JOptionPane.showMessageDialog(null,"Error al actualizar");
                    limpiar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         if(e.getSource()== vistaPro.jButtonEliminar){
            modelPro.setCodigo(vistaPro.jTextFieldCodigo.getText());
              
            try {
                if(modelCPro.eliminar(modelPro)){
                    JOptionPane.showMessageDialog(null,"Producto Eliminado");
                    limpiar();
                }else{
                    JOptionPane.showMessageDialog(null,"Error al eliminar");
                    limpiar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         if(e.getSource()== vistaPro.jButtonBuscar){
            modelPro.setCodigo(vistaPro.jTextFieldCodigo.getText());
              
            try {
                if(modelCPro.Buscar(modelPro)){
                    vistaPro.jTextFieldNombre.setText(modelPro.getNombre());
                    vistaPro.jTextFieldPrecio.setText(String.valueOf(modelPro.getPrecio()));
                    vistaPro.jTextFieldCantidad.setText(String.valueOf(modelPro.getCantidad()));
             
                }else{
                    JOptionPane.showMessageDialog(null,"no se encontro el registro");
                    limpiar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         if(e.getSource()== vistaPro.jButtonListar){
             limpiar();
         }
         
           //Falto Agregar la condición que recibe el llamdado del boton listar
         if(e.getSource()==vistaPro.jButtonListar){
            try {
                listar(vistaPro.jTableDetalle);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
         
         if(e.getSource()==vistaPro.jButtonEliminarItemTabla){
             int fila= vistaPro.jTableDetalle.getSelectedRow();
             if(fila!=-1){
                 String codigo= vistaPro.jTableDetalle.getValueAt(fila, 0).toString();
                 modelPro.setCodigo(codigo);
                 try {
                     modelCPro.eliminar(modelPro);
                     limpiar();
                     listar(vistaPro.jTableDetalle);
                 } catch (SQLException ex) {
                     Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
         
         }
         
         if(e.getSource()==vistaPro.jButton2){
             String codigo= vistaPro.jTextFieldCodigo.getText();
             vistaPro.setVisible(false);
             prueba.setVisible(true);
             prueba.jLabelPrueba.setText(codigo);
         }
         
             
    }
    //Solución
    public void listar (JTable tabla) throws SQLException{
        
        modeloTabla= (DefaultTableModel)tabla.getModel();
        List<Producto> lista= modelCPro.listar();
        Object[] objeto= new Object[modeloTabla.getColumnCount()];
        for(int i=0; i<lista.size();i++){
            objeto[0]=lista.get(i).getCodigo();
            objeto[1]=lista.get(i).getNombre();
            objeto[2]=lista.get(i).getPrecio();
            objeto[3]=lista.get(i).getCantidad();
            
            modeloTabla.addRow(objeto);
        }
        vistaPro.jTableDetalle.setModel(modeloTabla);
        vistaPro.jButtonListar.setVisible(false);
    }
    
     public void limpiar(){
        vistaPro.jTextFieldCodigo.setText(null);
        vistaPro.jTextFieldNombre.setText(null);
        vistaPro.jTextFieldPrecio.setText(null);
        vistaPro.jTextFieldCantidad.setText(null);
        
        DefaultTableModel tb = (DefaultTableModel) vistaPro.jTableDetalle.getModel();
        int a = vistaPro.jTableDetalle.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
         tb.removeRow(tb.getRowCount()-1);
        }
        vistaPro.jButtonListar.setVisible(true);
    }  
    
}

