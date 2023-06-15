/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import javax.swing.JOptionPane;

/**
 *
 * @author tokiro
 */
public class JFrameGestorUsuario extends javax.swing.JFrame {

    private JFrameIngresar padre;
    
    public JFrameGestorUsuario() {
        initComponents();
    }

    public JFrameGestorUsuario(JFrameIngresar padre) {
        initComponents();
        this.padre = padre;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUsuario = new javax.swing.JButton();
        btnDueño = new javax.swing.JButton();
        btnMascota = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnAsignarRol = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnMultas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsuario.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnUsuario.setText("Ver Usuarios");
        btnUsuario.setBorder(null);
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 130, 50));

        btnDueño.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnDueño.setText("Ver Dueños");
        btnDueño.setBorder(null);
        btnDueño.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDueñoActionPerformed(evt);
            }
        });
        jPanel1.add(btnDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 130, 50));

        btnMascota.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnMascota.setText("Ver Mascotas");
        btnMascota.setBorder(null);
        btnMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotaActionPerformed(evt);
            }
        });
        jPanel1.add(btnMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 130, 50));

        btnReporte.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnReporte.setText("Ver Reportes");
        btnReporte.setBorder(null);
        btnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 130, 50));

        btnAsignarRol.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnAsignarRol.setText("Ver Rol");
        btnAsignarRol.setBorder(null);
        btnAsignarRol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarRolActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignarRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 130, 50));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 120, 50));

        btnMultas.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnMultas.setText("Ver Multas");
        btnMultas.setBorder(null);
        btnMultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 130, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perro1_200x150.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/patitas9 usuario.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Deseas Cerrar Sesión?", ""
                + "Confirm", JOptionPane.YES_NO_OPTION) 
                == JOptionPane.OK_OPTION){
            salir();
        }        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotaActionPerformed
        JFrameListaMascotas mascota = new JFrameListaMascotas(this);
        mascota.setLocationRelativeTo(null);
        mascota.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMascotaActionPerformed

    private void btnDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDueñoActionPerformed
        JFrameListaDueños dueño = new JFrameListaDueños(this);
        dueño.setLocationRelativeTo(null);
        dueño.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDueñoActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        JFrameReportes reporte = new JFrameReportes(this);
        reporte.setLocationRelativeTo(null);
        reporte.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnAsignarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarRolActionPerformed
        JFrameAsignarRol asignar = new JFrameAsignarRol(this);
        asignar.setLocationRelativeTo(null);
        asignar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAsignarRolActionPerformed

    private void btnMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultasActionPerformed
        JFrameMultas multa = new JFrameMultas(this);
        multa.setLocationRelativeTo(null);
        multa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMultasActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        JFrameListaUsuarios usu = new JFrameListaUsuarios(this);
        usu.setLocationRelativeTo(null);
        usu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void salir() {
        padre.setVisible(true);
        this.dispose();
    }
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
            java.util.logging.Logger.getLogger(JFrameGestorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGestorUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarRol;
    private javax.swing.JButton btnDueño;
    private javax.swing.JButton btnMascota;
    private javax.swing.JButton btnMultas;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
