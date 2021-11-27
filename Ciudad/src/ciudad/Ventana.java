/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudad;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author usuario1
 */
public class Ventana extends JFrame{
    private static final long serialVersionUID = 2156260375695009897L;
    
    //Constructor
    public Ventana() {
        initComponents();
    }
    
    private void initComponents() {
    //al cerrar la ventana de finaliza la ejecución del programa
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
    setTitle("Animación ciudad Misión TIC 2022");
    
    // definir la forma de distibución que se utiliza
    try{
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    PanelCiudad panelCiudad = new PanelCiudad();
    setContentPane(panelCiudad);
    add(new PanelControles(panelCiudad));
    pack();

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation((screenSize.width - frameSize.width) / 2, 
                (screenSize.height - frameSize.height) / 2);
    
    setVisible(true);    
    
    }

    
    
}
