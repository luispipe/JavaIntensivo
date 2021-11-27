/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudad;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author usuario1
 */
public class PanelCiudad extends JPanel{
    private static final long serialVersionUID = 5124107106423985003L;
    protected JTextArea jTextArea = null;
    protected JScrollPane jScrollPane = null;

    public PanelCiudad() {
        initComponents();
    }
    
    private void initComponents() {
        jTextArea = new JTextArea(ParametrosDibujo.ALTO, ParametrosDibujo.ANCHO);
        
        //Crear un ainstancia de la clase fuente
        Font font = new Font("Monospaced", Font.BOLD, 15);

        jTextArea.setFont(font);
        
        //Crear barras de desplazamiento hasta donde sean necesarios
        jScrollPane = new JScrollPane(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.getViewport().add(jTextArea);
        add(jScrollPane);
        
        
    }
    
    public JTextArea getjTextArea() {
        return jTextArea;
    }

    public void setjTextArea(JTextArea jTextArea) {
        this.jTextArea = jTextArea;
    }



}
