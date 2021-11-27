/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudad;

import javax.swing.*;
import ciudad.ParametrosDibujo;
import java.awt.*;
/**
 *
 * @author usuario1
 */
public class PanelControles extends JPanel{
    private static final long serialVersionUID = 3116611926032812478L;
    private JTextArea jTextArea;
    private JLabel jLabelCarga;
    private JLabel jLabelDormir;
    private JTextField jTextFieldCarga;
    private JButton jButtonIniciar;
    private JSpinner jSpinnerDormir;
    private JCheckBox jCheckBoxVehiculosCarga;
    private ButtonGroup buttonGroupDireccion;
    private JRadioButton jRadioButtonAdelante;

    public PanelControles(PanelCiudad panelCiudad) {
        this.jTextArea = panelCiudad.getjTextArea();
        initComponents();
    }
    
    private void initComponents() {
        //Gestor de organizacion en forma de retícula 10*1
        setLayout(new GridLayout(16,1));
        jButtonIniciar = new JButton("Animación");
        add(jButtonIniciar);

        jLabelCarga = new JLabel("Carga del Furgon: ");
        add(jLabelCarga);

        jTextFieldCarga = new JTextField(ParametrosDibujo.CONTENIDO_CARGA);
        add(jTextFieldCarga);
    
        jLabelDormir = new JLabel("Lapso de dormir: ");
        add(jLabelDormir);
        
        jSpinnerDormir = new JSpinner();
        jSpinnerDormir.setValue(ParametrosDibujo.PAUSA_MILISEGUNDOS);
        add(jSpinnerDormir);

        jCheckBoxVehiculosCarga = new JCheckBox("Carga");
        jCheckBoxVehiculosCarga.setSelected(true);
        add(jCheckBoxVehiculosCarga);

        jRadioButtonAdelante = new JRadioButton("Adelante");
        jRadioButtonAdelante.setSelected(true);
        add(jRadioButtonAdelante);

        buttonGroupDireccion = new ButtonGroup();
        buttonGroupDireccion.add(jRadioButtonAdelante);
        
        //Auditores de eventos generados por "boton"
        EventoClic eventoClic = new EventoClic(this);
        jButtonIniciar.addActionListener(eventoClic);
        
        //Auditor del evento de la lista de números de control de tiempo
        EventoCambioLista eventoCambioLista = new EventoCambioLista(jSpinnerDormir);
        
        //girar la rueda del mouse
        jSpinnerDormir.addMouseWheelListener(eventoCambioLista);
        
        //modifica
        jSpinnerDormir.addChangeListener(eventoCambioLista);
    
    }
        public JTextArea getjTextArea() {
        return jTextArea;
    }

    public JTextField getjTextFieldCarga() {
        return jTextFieldCarga;
    }

    public JButton getjButtonIniciar() {
        return jButtonIniciar;
    }

    public JSpinner getjSpinnerDormir() {
        return jSpinnerDormir;
    }

    public JCheckBox getjCheckBoxVehiculosCarga() {
        return jCheckBoxVehiculosCarga;
    }

    public JRadioButton getjRadioButtonAdelante() {
        return jRadioButtonAdelante;
    }

    
    }




