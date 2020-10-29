/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Tablas;

import Clases_RRHH.Medio;
import Clases_RRHH.Solicitud_Empresarial;

/**
 *
 * @author jorgi
 */
public class Medio_V extends javax.swing.JFrame {
    int x , y;

     public static String S_Puesto = "Puesto";
    public static String Item_P = "";

    public static String S_Departamento = "Departamento";
    public static String Item_D = "";

    public static String S_NA = "Nivel Academico";
    public static String Item_NA = "";

    public static String S_EL = "Experiencia Laboral";
    public static String Item_EL = "";
    
    /**
     * Creates new form Medio_V
     */
    public Medio_V() {
        initComponents();
        
        jComboBox_TablasB_M_SE.addItem(S_Puesto);
        jComboBox_TablasB_M_SE.addItem(S_Departamento);
        jComboBox_TablasB_M_SE.addItem(S_NA);
        jComboBox_TablasB_M_SE.addItem(S_EL);
        
        
        
        
        
        
        txt_id_SolicitudE.setVisible(false);
        txt_RangoEdadM.setVisible(false);
        txt_RangoEdadMa.setVisible(false);
        txt_Genero.setVisible(false);
        jComboBox_PuestoSE.setVisible(false);
        jComboBox_DepartamentoSE.setVisible(false);
        jComboBox_NivelASE.setVisible(false);
        jComboBox_ExperienciaL_SE.setVisible(false);
        jTextArea_DescripcionSE.setVisible(false);
        jTextArea_DescripcionSE.setVisible(false);
        
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.Actualizar_Tabla();
        
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
        jLabel_Buscar = new javax.swing.JLabel();
        icono_Buscar = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        tbl_SE = new javax.swing.JTable();
        txt_Buscar_SE = new javax.swing.JTextField();
        txt_id_SolicitudE = new javax.swing.JTextField();
        txt_RangoEdadM = new javax.swing.JTextField();
        txt_RangoEdadMa = new javax.swing.JTextField();
        txt_Genero = new javax.swing.JTextField();
        jLabel_Puesto_SE = new javax.swing.JLabel();
        jLabel_Departamento_SE = new javax.swing.JLabel();
        jLabel_NivelA_SE = new javax.swing.JLabel();
        jLabel_ExperienciaL_SE = new javax.swing.JLabel();
        jComboBox_PuestoSE = new javax.swing.JComboBox<>();
        jComboBox_DepartamentoSE = new javax.swing.JComboBox<>();
        jComboBox_NivelASE = new javax.swing.JComboBox<>();
        jComboBox_ExperienciaL_SE = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_DescripcionSE = new javax.swing.JTextArea();
        jLabel_Buscar_Tablas_SE = new javax.swing.JLabel();
        jComboBox_TablasB_M_SE = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ExpLD.setBackground(new java.awt.Color(28, 27, 33));
        ExpLD.setEnabled(false);
        ExpLD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Solicitud Empresarial.");
        ExpLD.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 280, 40));

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
        Movimiento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 20, 30));

        ExpLD.add(Movimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1020, 40));

        jLabel_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Buscar.setText("Buscar");
        ExpLD.add(jLabel_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 50, 20));

        icono_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_D.png"))); // NOI18N
        ExpLD.add(icono_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 20, 20));

        tbl_SE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_SE.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_SE.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_SE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SEMouseClicked(evt);
            }
        });
        jScrollPane26.setViewportView(tbl_SE);

        ExpLD.add(jScrollPane26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 750, 160));

        txt_Buscar_SE.setBackground(new java.awt.Color(40, 41, 46));
        txt_Buscar_SE.setForeground(new java.awt.Color(153, 153, 153));
        txt_Buscar_SE.setBorder(null);
        txt_Buscar_SE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_Buscar_SEMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_Buscar_SEMouseReleased(evt);
            }
        });
        txt_Buscar_SE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_SEActionPerformed(evt);
            }
        });
        txt_Buscar_SE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Buscar_SEKeyReleased(evt);
            }
        });
        ExpLD.add(txt_Buscar_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 290, 20));

        txt_id_SolicitudE.setBackground(new java.awt.Color(40, 41, 46));
        txt_id_SolicitudE.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_SolicitudE.setBorder(null);
        txt_id_SolicitudE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_SolicitudEActionPerformed(evt);
            }
        });
        ExpLD.add(txt_id_SolicitudE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 140, 20));

        txt_RangoEdadM.setBackground(new java.awt.Color(40, 41, 46));
        txt_RangoEdadM.setForeground(new java.awt.Color(153, 153, 153));
        txt_RangoEdadM.setBorder(null);
        txt_RangoEdadM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RangoEdadMActionPerformed(evt);
            }
        });
        ExpLD.add(txt_RangoEdadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 140, 20));

        txt_RangoEdadMa.setBackground(new java.awt.Color(40, 41, 46));
        txt_RangoEdadMa.setForeground(new java.awt.Color(153, 153, 153));
        txt_RangoEdadMa.setBorder(null);
        txt_RangoEdadMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RangoEdadMaActionPerformed(evt);
            }
        });
        ExpLD.add(txt_RangoEdadMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 140, 20));

        txt_Genero.setBackground(new java.awt.Color(40, 41, 46));
        txt_Genero.setForeground(new java.awt.Color(153, 153, 153));
        txt_Genero.setBorder(null);
        txt_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GeneroActionPerformed(evt);
            }
        });
        ExpLD.add(txt_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 140, 20));

        jLabel_Puesto_SE.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Puesto_SE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Puesto_SEMouseClicked(evt);
            }
        });
        ExpLD.add(jLabel_Puesto_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 340, 30, 20));

        jLabel_Departamento_SE.setForeground(new java.awt.Color(255, 255, 255));
        ExpLD.add(jLabel_Departamento_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 30, 20));

        jLabel_NivelA_SE.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NivelA_SE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_NivelA_SEMouseClicked(evt);
            }
        });
        ExpLD.add(jLabel_NivelA_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 30, 20));

        jLabel_ExperienciaL_SE.setForeground(new java.awt.Color(255, 255, 255));
        ExpLD.add(jLabel_ExperienciaL_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 30, 20));

        jComboBox_PuestoSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_PuestoSEActionPerformed(evt);
            }
        });
        ExpLD.add(jComboBox_PuestoSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 140, -1));

        jComboBox_DepartamentoSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_DepartamentoSEActionPerformed(evt);
            }
        });
        ExpLD.add(jComboBox_DepartamentoSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 140, -1));

        jComboBox_NivelASE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_NivelASEActionPerformed(evt);
            }
        });
        ExpLD.add(jComboBox_NivelASE, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 140, -1));

        jComboBox_ExperienciaL_SE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ExperienciaL_SEActionPerformed(evt);
            }
        });
        ExpLD.add(jComboBox_ExperienciaL_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 140, -1));

        jTextArea_DescripcionSE.setBackground(new java.awt.Color(40, 41, 46));
        jTextArea_DescripcionSE.setColumns(20);
        jTextArea_DescripcionSE.setRows(5);
        jTextArea_DescripcionSE.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jScrollPane1.setViewportView(jTextArea_DescripcionSE);

        ExpLD.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, -1, -1));

        jLabel_Buscar_Tablas_SE.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Buscar_Tablas_SE.setText("Buscar");
        jLabel_Buscar_Tablas_SE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Buscar_Tablas_SEMouseClicked(evt);
            }
        });
        ExpLD.add(jLabel_Buscar_Tablas_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 220, -1, -1));

        jComboBox_TablasB_M_SE.setBackground(new java.awt.Color(40, 41, 46));
        jComboBox_TablasB_M_SE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_TablasB_M_SEActionPerformed(evt);
            }
        });
        ExpLD.add(jComboBox_TablasB_M_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExpLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ExpLD, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tbl_SEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SEMouseClicked
        int Seleccion = tbl_SE.rowAtPoint(evt.getPoint());
        txt_id_SolicitudE.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 0)));
        txt_RangoEdadM.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 1)));
        txt_RangoEdadMa.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 2)));
        txt_Genero.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 3)));
        jTextArea_DescripcionSE.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 8)));
        jLabel_Puesto_SE.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 4)));
        jLabel_Departamento_SE.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 5)));
        jLabel_NivelA_SE.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 6)));
        jLabel_ExperienciaL_SE.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 7)));
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.BuscarFila_SE("nombre_puesto", "puesto", "id_puesto", jComboBox_PuestoSE, jLabel_Puesto_SE);
        SE.BuscarFila_SE("nombre_departamento", "departamento", "id_departamento", jComboBox_DepartamentoSE, jLabel_Departamento_SE);
        SE.BuscarFila_SE("nombre_nivel", "nivel_academico", "id_nivel_academico", jComboBox_NivelASE, jLabel_NivelA_SE);
        SE.BuscarFila_SE("id_tipoexp", "experiencia_laboral", "id_experiencia", jComboBox_ExperienciaL_SE, jLabel_ExperienciaL_SE);
    }//GEN-LAST:event_tbl_SEMouseClicked

    private void txt_Buscar_SEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_Buscar_SEMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_SEMousePressed

    private void txt_Buscar_SEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_Buscar_SEMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_SEMouseReleased

    private void txt_Buscar_SEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_SEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_SEActionPerformed

    private void txt_Buscar_SEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_SEKeyReleased
        // TODO add your handling code here:
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.Buscar_SolicitudE(txt_Buscar_SE.getText());
    }//GEN-LAST:event_txt_Buscar_SEKeyReleased

    private void txt_id_SolicitudEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_SolicitudEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_SolicitudEActionPerformed

    private void txt_RangoEdadMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RangoEdadMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RangoEdadMActionPerformed

    private void txt_RangoEdadMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RangoEdadMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RangoEdadMaActionPerformed

    private void txt_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GeneroActionPerformed

    private void jLabel_Puesto_SEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Puesto_SEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Puesto_SEMouseClicked

    private void jLabel_NivelA_SEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NivelA_SEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_NivelA_SEMouseClicked

    private void jComboBox_PuestoSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_PuestoSEActionPerformed
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.EncontrarID_SE("id_puesto", "puesto", "nombre_puesto", jComboBox_PuestoSE, jLabel_Puesto_SE);
    }//GEN-LAST:event_jComboBox_PuestoSEActionPerformed

    private void jComboBox_DepartamentoSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_DepartamentoSEActionPerformed
        // TODO add your handling code here:
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.EncontrarID_SE("id_departamento", "departamento", "nombre_departamento", jComboBox_DepartamentoSE, jLabel_Departamento_SE);
    }//GEN-LAST:event_jComboBox_DepartamentoSEActionPerformed

    private void jComboBox_NivelASEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_NivelASEActionPerformed
        // TODO add your handling code here:
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.EncontrarID_SE("id_nivel_academico", "nivel_academico", "nombre_nivel", jComboBox_NivelASE, jLabel_NivelA_SE);
    }//GEN-LAST:event_jComboBox_NivelASEActionPerformed

    private void jComboBox_ExperienciaL_SEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ExperienciaL_SEActionPerformed
        // TODO add your handling code here:
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.EncontrarID_SE("id_experiencia", "experiencia_laboral", "id_tipoexp", jComboBox_ExperienciaL_SE, jLabel_ExperienciaL_SE);
    }//GEN-LAST:event_jComboBox_ExperienciaL_SEActionPerformed

    private void jLabel_Buscar_Tablas_SEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Buscar_Tablas_SEMouseClicked
        // TODO add your handling code here:
        Item_P = jComboBox_TablasB_M_SE.getSelectedItem().toString();

        if (Item_P == S_Puesto) {
            Puesto_V puesto = new Puesto_V();
            puesto.setVisible(true);
        }

        Item_D = jComboBox_TablasB_M_SE.getSelectedItem().toString();

        if (Item_D == S_Departamento) {
            Departamento_V Depto = new Departamento_V();
            Depto.setVisible(true);
        }

        Item_NA = jComboBox_TablasB_M_SE.getSelectedItem().toString();

        if (Item_NA == S_NA) {
            Nivel_Academico_Ve NA = new Nivel_Academico_Ve();
            NA.setVisible(true);
        }

        Item_EL = jComboBox_TablasB_M_SE.getSelectedItem().toString();

        if (Item_EL == S_EL) {
            Experiencia_Laboral_Ve EL = new Experiencia_Laboral_Ve();
            EL.setVisible(true);
        }
    }//GEN-LAST:event_jLabel_Buscar_Tablas_SEMouseClicked

    private void jComboBox_TablasB_M_SEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_TablasB_M_SEActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox_TablasB_M_SEActionPerformed

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
            java.util.logging.Logger.getLogger(Medio_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medio_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medio_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medio_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medio_V().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExpLD;
    private javax.swing.JPanel Movimiento;
    private javax.swing.JLabel icono_Buscar;
    private javax.swing.JComboBox<String> jComboBox_DepartamentoSE;
    private javax.swing.JComboBox<String> jComboBox_ExperienciaL_SE;
    private javax.swing.JComboBox<String> jComboBox_NivelASE;
    private javax.swing.JComboBox<String> jComboBox_PuestoSE;
    private javax.swing.JComboBox<String> jComboBox_TablasB_M_SE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Buscar;
    private javax.swing.JLabel jLabel_Buscar_Tablas_SE;
    private javax.swing.JLabel jLabel_Departamento_SE;
    private javax.swing.JLabel jLabel_ExperienciaL_SE;
    private javax.swing.JLabel jLabel_NivelA_SE;
    private javax.swing.JLabel jLabel_Puesto_SE;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JTextArea jTextArea_DescripcionSE;
    private javax.swing.JTable tbl_SE;
    private javax.swing.JTextField txt_Buscar_SE;
    private javax.swing.JTextField txt_Genero;
    private javax.swing.JTextField txt_RangoEdadM;
    private javax.swing.JTextField txt_RangoEdadMa;
    private javax.swing.JTextField txt_id_SolicitudE;
    // End of variables declaration//GEN-END:variables
}
