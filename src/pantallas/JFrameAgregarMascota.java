/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Mascota;
import javax.swing.JOptionPane;

/**
 *
 * @author tokiro
 */
public class JFrameAgregarMascota extends javax.swing.JFrame {
    private Mascota mascota;
    private JFrameListaMascotas padre;
    
    public JFrameAgregarMascota() {
        initComponents();
    }

    public JFrameAgregarMascota(JFrameListaMascotas padre) {
        initComponents();
        this.padre = padre;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        rbnMacho = new javax.swing.JRadioButton();
        rbnHembra = new javax.swing.JRadioButton();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtDniDueño = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel2.setText("Registro de Mascotas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel3.setText("Codigo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel4.setText("Nombres:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel5.setText("Apellidos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel6.setText("Fec. Nac:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel7.setText("Especie:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel8.setText("Raza:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel9.setText("Sexo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel10.setText("Dni Dueño:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 100, 35));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 90, 35));

        rbnMacho.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        rbnMacho.setText("Macho");
        rbnMacho.setBorder(null);
        rbnMacho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(rbnMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        rbnHembra.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        rbnHembra.setText("Hembra");
        rbnHembra.setBorder(null);
        rbnHembra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(rbnHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtCodigo.setBorder(null);
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 160, 33));

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 160, 33));

        txtApellido.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtApellido.setBorder(null);
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 160, 33));

        txtFechaNac.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtFechaNac.setBorder(null);
        jPanel1.add(txtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 160, 33));

        txtEspecie.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtEspecie.setBorder(null);
        jPanel1.add(txtEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 160, 33));

        txtRaza.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtRaza.setBorder(null);
        jPanel1.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 160, 33));

        txtDniDueño.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtDniDueño.setBorder(null);
        jPanel1.add(txtDniDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 160, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/patitas9 agregaMascota.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        Registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void salir() {
        padre.setVisible(true);
        this.dispose();
    }
    public void Registrar() {
        ///falta implementar

        if (JOptionPane.showConfirmDialog(this, "Deseas Guardar ?","" 
                + "Confirm", JOptionPane.YES_NO_OPTION)
                == JOptionPane.OK_OPTION) {
            mascota = new Mascota();
            String Sexo = null;
            if (rbnMacho.isSelected()) {
                Sexo = "MACHO";
            }
            if (rbnHembra.isSelected()) {
                Sexo = "HEMBRA";
            }
            mascota.setCodigo(txtCodigo.getText());
            mascota.setDniDueño(txtDniDueño.getText());
            mascota.setNombre(txtNombre.getText());
            mascota.setApellido(txtApellido.getText());
            mascota.setFecNac(txtFechaNac.getText());
            mascota.setSexo(Sexo);
            mascota.setEspecie(txtEspecie.getText());
            mascota.setRaza(txtRaza.getText());

            this.padre.setMascota(mascota);
            this.padre.setVisible(true);
            this.dispose();

            
        }

        /*modeloLista.addElement(Datos);
        mascotas.add(mascota);*/
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
            java.util.logging.Logger.getLogger(JFrameAgregarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAgregarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAgregarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAgregarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAgregarMascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbnHembra;
    private javax.swing.JRadioButton rbnMacho;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDniDueño;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
