/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trikiintensivo;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario1
 */
public class vista extends javax.swing.JFrame {

    String turno= "X";
    JLabel lbs[]= new JLabel[9];
    int valoreWin[][]={
        {0,1,2},
        {3,4,5},
        {6,7,8},
        {0,3,6},
        {1,4,7},
        {2,5,8},
        {0,4,8},
        {2,4,6}
    };
    /**
     * Creates new form vista
     */
    public vista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Triki");
        lbs[0]= jLabel1_1;
        lbs[1]= jLabel1_2;
        lbs[2]= jLabel1_3;
        lbs[3]= jLabel2_1;
        lbs[4]= jLabel2_2;
        lbs[5]= jLabel2_3;
        lbs[6]= jLabel3_1;
        lbs[7]= jLabel3_2;
        lbs[8]= jLabel3_3;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1_1 = new javax.swing.JLabel();
        jLabel1_2 = new javax.swing.JLabel();
        jLabel1_3 = new javax.swing.JLabel();
        jLabel2_3 = new javax.swing.JLabel();
        jLabel2_2 = new javax.swing.JLabel();
        jLabel2_1 = new javax.swing.JLabel();
        jLabel3_3 = new javax.swing.JLabel();
        jLabel3_2 = new javax.swing.JLabel();
        jLabel3_1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1_1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1_1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_1.setOpaque(true);
        jLabel1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1_1MousePressed(evt);
            }
        });

        jLabel1_2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1_2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_2.setOpaque(true);
        jLabel1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1_2MousePressed(evt);
            }
        });

        jLabel1_3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1_3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_3.setOpaque(true);
        jLabel1_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1_3MousePressed(evt);
            }
        });

        jLabel2_3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2_3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_3.setOpaque(true);
        jLabel2_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2_3MousePressed(evt);
            }
        });

        jLabel2_2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2_2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_2.setOpaque(true);
        jLabel2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2_2MousePressed(evt);
            }
        });

        jLabel2_1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2_1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_1.setOpaque(true);
        jLabel2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2_1MousePressed(evt);
            }
        });

        jLabel3_3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3_3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_3.setOpaque(true);
        jLabel3_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3_3MousePressed(evt);
            }
        });

        jLabel3_2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3_2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_2.setOpaque(true);
        jLabel3_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3_2MousePressed(evt);
            }
        });

        jLabel3_1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3_1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_1.setOpaque(true);
        jLabel3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3_1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Reiniciar Partida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_1MousePressed
        presionar(0);
    }//GEN-LAST:event_jLabel1_1MousePressed

    private void jLabel1_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_3MousePressed
        presionar(2);
    }//GEN-LAST:event_jLabel1_3MousePressed

    private void jLabel1_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_2MousePressed
        presionar(1);
    }//GEN-LAST:event_jLabel1_2MousePressed

    private void jLabel2_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_3MousePressed
        presionar(5);
    }//GEN-LAST:event_jLabel2_3MousePressed

    private void jLabel2_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_2MousePressed
        presionar(4);
    }//GEN-LAST:event_jLabel2_2MousePressed

    private void jLabel2_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_1MousePressed
        presionar(3);
    }//GEN-LAST:event_jLabel2_1MousePressed

    private void jLabel3_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_3MousePressed
        presionar(8);
    }//GEN-LAST:event_jLabel3_3MousePressed

    private void jLabel3_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_2MousePressed
        presionar(7);
    }//GEN-LAST:event_jLabel3_2MousePressed

    private void jLabel3_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_1MousePressed
        presionar(6);
    }//GEN-LAST:event_jLabel3_1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i<lbs.length;i++){
            lbs[i].setText("");
            lbs[i].setBackground(Color.white);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void presionar(int casilla){
       
        if(lbs[casilla].getText().equals("")){
            lbs[casilla].setText(turno);
            comprobarGanador();
            cambiarTurno();
        }
            
        else{
            JOptionPane.showMessageDialog(null,"Este campo esta ocupado", "Alert", WIDTH);
        }
        
    }
    
    public void cambiarTurno(){
        if(turno.equals("X")){
            turno="O";
        }else{
            turno="X";
        }    
    }
    
    public void comprobarGanador(){
        
        boolean flat=false;
   
        for(int i=0; i<valoreWin.length;i++){
            if(lbs[valoreWin[i][0]].getText().equals(turno) &&
                lbs[valoreWin[i][1]].getText().equals(turno) &&
                lbs[valoreWin[i][2]].getText().equals(turno)){               
                    lbs[valoreWin[i][0]].setBackground(Color.green);
                    lbs[valoreWin[i][1]].setBackground(Color.green);
                    lbs[valoreWin[i][2]].setBackground(Color.green);   
                    jLabel1.setText("Gano "+turno);   
            }
        }    
    }    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_1;
    private javax.swing.JLabel jLabel1_2;
    private javax.swing.JLabel jLabel1_3;
    private javax.swing.JLabel jLabel2_1;
    private javax.swing.JLabel jLabel2_2;
    private javax.swing.JLabel jLabel2_3;
    private javax.swing.JLabel jLabel3_1;
    private javax.swing.JLabel jLabel3_2;
    private javax.swing.JLabel jLabel3_3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
