/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Tablas;

import Finanzas_Clases.Referencias_Laborales;

/**
 *
 * @author jorgi
 */
public class Referencias_Laborales_V extends javax.swing.JFrame {

    /**
     * Creates new form Referencias_Laborales_V
     */
    int x;
    int y;
    public Referencias_Laborales_V() {
        initComponents();
        txt_id_ReferenciaL.setVisible(false);
        txt_NombreRL.setVisible(false);
        txt_TelefonoRL.setVisible(false);
        
        Referencias_Laborales referencias_laborales = new Referencias_Laborales(txt_id_ReferenciaL, txt_NombreRL, txt_TelefonoRL, txt_BuscarRL, tbl_RL);
        referencias_laborales.Actualizar_Tabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExpLD = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        Movimiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_id_ReferenciaL = new javax.swing.JTextField();
        txt_NombreRL = new javax.swing.JTextField();
        txt_TelefonoRL = new javax.swing.JTextField();
        jLabel_BuscarRL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_BuscarRL = new javax.swing.JTextField();
        jScrollPane28 = new javax.swing.JScrollPane();
        tbl_RL = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ExpLD.setBackground(new java.awt.Color(28, 27, 33));
        ExpLD.setEnabled(false);
        ExpLD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Referencias Laborales.");
        ExpLD.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 280, 40));

        Movimiento.setBackground(new java.awt.Color(28, 27, 33));
        Movimiento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MovimientoMouseDragged(evt);
            }
        });
        Movimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovimientoMousePressed(evt);
            }
        });
        Movimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Movimiento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 20, 30));

        ExpLD.add(Movimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        txt_id_ReferenciaL.setBackground(new java.awt.Color(40, 41, 46));
        txt_id_ReferenciaL.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_ReferenciaL.setBorder(null);
        txt_id_ReferenciaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_ReferenciaLActionPerformed(evt);
            }
        });
        ExpLD.add(txt_id_ReferenciaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 140, 20));

        txt_NombreRL.setBackground(new java.awt.Color(40, 41, 46));
        txt_NombreRL.setForeground(new java.awt.Color(153, 153, 153));
        txt_NombreRL.setBorder(null);
        txt_NombreRL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreRLActionPerformed(evt);
            }
        });
        ExpLD.add(txt_NombreRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 210, 20));

        txt_TelefonoRL.setBackground(new java.awt.Color(40, 41, 46));
        txt_TelefonoRL.setForeground(new java.awt.Color(153, 153, 153));
        txt_TelefonoRL.setBorder(null);
        txt_TelefonoRL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefonoRLActionPerformed(evt);
            }
        });
        ExpLD.add(txt_TelefonoRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 210, 20));

        jLabel_BuscarRL.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_BuscarRL.setText("Buscar");
        jLabel_BuscarRL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BuscarRLMouseClicked(evt);
            }
        });
        ExpLD.add(jLabel_BuscarRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 50, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_D.png"))); // NOI18N
        ExpLD.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        txt_BuscarRL.setBackground(new java.awt.Color(40, 41, 46));
        txt_BuscarRL.setForeground(new java.awt.Color(153, 153, 153));
        txt_BuscarRL.setBorder(null);
        txt_BuscarRL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarRLActionPerformed(evt);
            }
        });
        txt_BuscarRL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarRLKeyReleased(evt);
            }
        });
        ExpLD.add(txt_BuscarRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 240, 20));

        tbl_RL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_RL.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_RL.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_RL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RLMouseClicked(evt);
            }
        });
        jScrollPane28.setViewportView(tbl_RL);

        ExpLD.add(jScrollPane28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 600, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ExpLD, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ExpLD, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void MovimientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_MovimientoMouseDragged

    private void MovimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_MovimientoMousePressed

    private void txt_id_ReferenciaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_ReferenciaLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_ReferenciaLActionPerformed

    private void txt_NombreRLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreRLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreRLActionPerformed

    private void txt_TelefonoRLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoRLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoRLActionPerformed

    private void jLabel_BuscarRLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BuscarRLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_BuscarRLMouseClicked

    private void txt_BuscarRLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarRLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarRLActionPerformed

    private void txt_BuscarRLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarRLKeyReleased
        // TODO add your handling code here:
        Referencias_Laborales referencias_lab = new Referencias_Laborales(txt_id_ReferenciaL, txt_NombreRL, txt_TelefonoRL, txt_BuscarRL, tbl_RL);
        referencias_lab.Buscar_ReferenciasLF(txt_BuscarRL.getText());
    }//GEN-LAST:event_txt_BuscarRLKeyReleased

    private void tbl_RLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RLMouseClicked
        // TODO add your handling code here:

        int Seleccion = tbl_RL.rowAtPoint(evt.getPoint());

        txt_id_ReferenciaL.setText(String.valueOf(tbl_RL.getValueAt(Seleccion, 0)));
        txt_NombreRL.setText(String.valueOf(tbl_RL.getValueAt(Seleccion, 1)));
        txt_TelefonoRL.setText(String.valueOf(tbl_RL.getValueAt(Seleccion, 2)));
    }//GEN-LAST:event_tbl_RLMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Referencias_Laborales_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Referencias_Laborales_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Referencias_Laborales_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Referencias_Laborales_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Referencias_Laborales_V().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExpLD;
    private javax.swing.JPanel Movimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_BuscarRL;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JTable tbl_RL;
    private javax.swing.JTextField txt_BuscarRL;
    private javax.swing.JTextField txt_NombreRL;
    private javax.swing.JTextField txt_TelefonoRL;
    private javax.swing.JTextField txt_id_ReferenciaL;
    // End of variables declaration//GEN-END:variables
}
