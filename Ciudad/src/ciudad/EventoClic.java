/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudad;

import java.awt.event.*;

/**
 *
 * @author usuario1
 */
public class EventoClic implements ActionListener{
    private PanelControles panelControles;
    private Hilo hilo;

    public EventoClic(PanelControles panelControles) {
        this.panelControles = panelControles;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == panelControles.getjButtonIniciar()) {
            // Crea una nuevo hilo
            hilo = new Hilo(this.panelControles);
            // Desactiva el boton de ejecución
            panelControles.getjButtonIniciar().setEnabled(false);
            // Inicializa la ejecuciónn del hilo
            hilo.start();
        }
    
    
}
}
