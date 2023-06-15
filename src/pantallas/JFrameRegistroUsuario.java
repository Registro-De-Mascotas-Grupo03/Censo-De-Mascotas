/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Usuario;
import java.awt.Color;

/**
 *
 * @author tokiro
 */
public class JFrameRegistroUsuario extends javax.swing.JFrame {
    
    private JFrameListaUsuarios padre;
    
    public JFrameRegistroUsuario() {
        initComponents();
    }
    
    public JFrameRegistroUsuario(JFrameListaUsuarios padre) {
        initComponents();
        this.padre = padre;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtFecNac = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContra2 = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnValidar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDni.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDni.setForeground(new java.awt.Color(204, 204, 204));
        txtDni.setText("  Dni");
        txtDni.setBorder(null);
        txtDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDniMousePressed(evt);
            }
        });
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 290, 40));

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("  Nombres");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 290, 40));

        txtApellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido.setText("  Apellidos");
        txtApellido.setBorder(null);
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 290, 40));

        txtDireccion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(204, 204, 204));
        txtDireccion.setText("  Dirección");
        txtDireccion.setBorder(null);
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionMousePressed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 290, 40));

        txtFecNac.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFecNac.setForeground(new java.awt.Color(204, 204, 204));
        txtFecNac.setText("  Fecha de Nacimiento");
        txtFecNac.setBorder(null);
        txtFecNac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFecNacMousePressed(evt);
            }
        });
        jPanel1.add(txtFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 290, 40));

        txtCorreo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("  Correo");
        txtCorreo.setBorder(null);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 290, 40));

        txtContra2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtContra2.setForeground(new java.awt.Color(204, 204, 204));
        txtContra2.setText("  Confirmar Contraseña");
        txtContra2.setBorder(null);
        txtContra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContra2MousePressed(evt);
            }
        });
        jPanel1.add(txtContra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 290, 40));

        txtContra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtContra.setForeground(new java.awt.Color(204, 204, 204));
        txtContra.setText("  Contraseña");
        txtContra.setBorder(null);
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraMousePressed(evt);
            }
        });
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 290, 40));

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(153, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 290, 40));

        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 120, 40));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 100, 40));

        btnValidar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnValidar.setText("Validar");
        btnValidar.setBorder(null);
        btnValidar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 100, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel3.setText("Registro de Usuarios");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/patitas7 resgistroUsuario.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 650));

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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDniMousePressed
        if (txtDni.getText().equals("  Dni")){
            txtDni.setText("");
            txtDni.setForeground(Color.black);
        }
        if (txtNombre.getText().isEmpty()){
            txtNombre.setText("  Nombres");
            txtNombre.setForeground(new Color(204,204,204));
        }
        if (txtApellido.getText().isEmpty()){
            txtApellido.setText("  Apellidos");
            txtApellido.setForeground(new Color(204,204,204));
        }
        if (txtDireccion.getText().isEmpty()){
            txtDireccion.setText("  Dirección");
            txtDireccion.setForeground(new Color(204,204,204));
        }
        if (txtFecNac.getText().isEmpty()){
            txtFecNac.setText("  Fecha de Nacimiento");
            txtFecNac.setForeground(new Color(204,204,204));
        }
        if (txtCorreo.getText().isEmpty()){
            txtCorreo.setText("  Correo");
            txtCorreo.setForeground(new Color(204,204,204));
        }
        if (txtContra.getText().isEmpty()){
            txtContra.setText("  Contraseña");
            txtContra.setForeground(new Color(204,204,204));
        }
        if (txtContra2.getText().isEmpty()){
            txtContra2.setText("  Confirmar Contraseña");
            txtContra2.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtDniMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if (txtNombre.getText().equals("  Nombres")){
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
        if (txtDni.getText().isEmpty()){
            txtDni.setText("  Dni");
            txtDni.setForeground(new Color(204,204,204));
        }
        if (txtApellido.getText().isEmpty()){
            txtApellido.setText("  Apellidos");
            txtApellido.setForeground(new Color(204,204,204));
        }
        if (txtDireccion.getText().isEmpty()){
            txtDireccion.setText("  Dirección");
            txtDireccion.setForeground(new Color(204,204,204));
        }
        if (txtFecNac.getText().isEmpty()){
            txtFecNac.setText("  Fecha de Nacimiento");
            txtFecNac.setForeground(new Color(204,204,204));
        }
        if (txtCorreo.getText().isEmpty()){
            txtCorreo.setText("  Correo");
            txtCorreo.setForeground(new Color(204,204,204));
        }
        if (txtContra.getText().isEmpty()){
            txtContra.setText("  Contraseña");
            txtContra.setForeground(new Color(204,204,204));
        }
        if (txtContra2.getText().isEmpty()){
            txtContra2.setText("  Confirmar Contraseña");
            txtContra2.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed
        if (txtApellido.getText().equals("  Apellidos")){
            txtApellido.setText("");
            txtApellido.setForeground(Color.black);
        }
        if (txtDni.getText().isEmpty()){
            txtDni.setText("  Dni");
            txtDni.setForeground(new Color(204,204,204));
        }
        if (txtNombre.getText().isEmpty()){
            txtNombre.setText("  Nombres");
            txtNombre.setForeground(new Color(204,204,204));
        }
        if (txtDireccion.getText().isEmpty()){
            txtDireccion.setText("  Dirección");
            txtDireccion.setForeground(new Color(204,204,204));
        }
        if (txtFecNac.getText().isEmpty()){
            txtFecNac.setText("  Fecha de Nacimiento");
            txtFecNac.setForeground(new Color(204,204,204));
        }
        if (txtCorreo.getText().isEmpty()){
            txtCorreo.setText("  Correo");
            txtCorreo.setForeground(new Color(204,204,204));
        }
        if (txtContra.getText().isEmpty()){
            txtContra.setText("  Contraseña");
            txtContra.setForeground(new Color(204,204,204));
        }
        if (txtContra2.getText().isEmpty()){
            txtContra2.setText("  Confirmar Contraseña");
            txtContra2.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtApellidoMousePressed

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
        if (txtDireccion.getText().equals("  Dirección")){
            txtDireccion.setText("");
            txtDireccion.setForeground(Color.black);
        }
        if (txtDni.getText().isEmpty()){
            txtDni.setText("  Dni");
            txtDni.setForeground(new Color(204,204,204));
        }
        if (txtNombre.getText().isEmpty()){
            txtNombre.setText("  Nombres");
            txtNombre.setForeground(new Color(204,204,204));
        }
        if (txtApellido.getText().isEmpty()){
            txtApellido.setText("  Apellidos");
            txtApellido.setForeground(new Color(204,204,204));
        }
        if (txtFecNac.getText().isEmpty()){
            txtFecNac.setText("  Fecha de Nacimiento");
            txtFecNac.setForeground(new Color(204,204,204));
        }
        if (txtCorreo.getText().isEmpty()){
            txtCorreo.setText("  Correo");
            txtCorreo.setForeground(new Color(204,204,204));
        }
        if (txtContra.getText().isEmpty()){
            txtContra.setText("  Contraseña");
            txtContra.setForeground(new Color(204,204,204));
        }
        if (txtContra2.getText().isEmpty()){
            txtContra2.setText("  Confirmar Contraseña");
            txtContra2.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtDireccionMousePressed

    private void txtFecNacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFecNacMousePressed
        if (txtFecNac.getText().equals("  Fecha de Nacimiento")){
            txtFecNac.setText("");
            txtFecNac.setForeground(Color.black);
        }
        if (txtDni.getText().isEmpty()){
            txtDni.setText("  Dni");
            txtDni.setForeground(new Color(204,204,204));
        }
        if (txtNombre.getText().isEmpty()){
            txtNombre.setText("  Nombres");
            txtNombre.setForeground(new Color(204,204,204));
        }
        if (txtApellido.getText().isEmpty()){
            txtApellido.setText("  Apellidos");
            txtApellido.setForeground(new Color(204,204,204));
        }
        if (txtDireccion.getText().isEmpty()){
            txtDireccion.setText("  Dirección");
            txtDireccion.setForeground(new Color(204,204,204));
        }
        if (txtCorreo.getText().isEmpty()){
            txtCorreo.setText("  Correo");
            txtCorreo.setForeground(new Color(204,204,204));
        }
        if (txtContra.getText().isEmpty()){
            txtContra.setText("  Contraseña");
            txtContra.setForeground(new Color(204,204,204));
        }
        if (txtContra2.getText().isEmpty()){
            txtContra2.setText("  Confirmar Contraseña");
            txtContra2.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtFecNacMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        if (txtCorreo.getText().equals("  Correo")){
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.black);
        }
        if (txtDni.getText().isEmpty()){
            txtDni.setText("  Dni");
            txtDni.setForeground(new Color(204,204,204));
        }
        if (txtNombre.getText().isEmpty()){
            txtNombre.setText("  Nombres");
            txtNombre.setForeground(new Color(204,204,204));
        }
        if (txtApellido.getText().isEmpty()){
            txtApellido.setText("  Apellidos");
            txtApellido.setForeground(new Color(204,204,204));
        }
        if (txtDireccion.getText().isEmpty()){
            txtDireccion.setText("  Dirección");
            txtDireccion.setForeground(new Color(204,204,204));
        }
        if (txtFecNac.getText().isEmpty()){
            txtFecNac.setText("  Fecha de Nacimiento");
            txtFecNac.setForeground(new Color(204,204,204));
        }
        if (txtContra.getText().isEmpty()){
            txtContra.setText("  Contraseña");
            txtContra.setForeground(new Color(204,204,204));
        }
        if (txtContra2.getText().isEmpty()){
            txtContra2.setText("  Confirmar Contraseña");
            txtContra2.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMousePressed
        if (txtContra.getText().equals("  Contraseña")){
            txtContra.setText("");
            txtContra.setForeground(Color.black);
        }        
        if (txtDni.getText().isEmpty()){
            txtDni.setText("  Dni");
            txtDni.setForeground(new Color(204,204,204));
        }
        if (txtNombre.getText().isEmpty()){
            txtNombre.setText("  Nombres");
            txtNombre.setForeground(new Color(204,204,204));
        }
        if (txtApellido.getText().isEmpty()){
            txtApellido.setText("  Apellidos");
            txtApellido.setForeground(new Color(204,204,204));
        }
        if (txtDireccion.getText().isEmpty()){
            txtDireccion.setText("  Dirección");
            txtDireccion.setForeground(new Color(204,204,204));
        }
        if (txtFecNac.getText().isEmpty()){
            txtFecNac.setText("  Fecha de Nacimiento");
            txtFecNac.setForeground(new Color(204,204,204));
        }
        if (txtCorreo.getText().isEmpty()){
            txtCorreo.setText("  Correo");
            txtCorreo.setForeground(new Color(204,204,204));
        }
        if (txtContra2.getText().isEmpty()){
            txtContra2.setText("  Confirmar Contraseña");
            txtContra2.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtContraMousePressed

    private void txtContra2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContra2MousePressed
        if (txtContra2.getText().equals("  Confirmar Contraseña")){
            txtContra2.setText("");
            txtContra2.setForeground(Color.black);
        }        
        if (txtDni.getText().isEmpty()){
            txtDni.setText("  Dni");
            txtDni.setForeground(new Color(204,204,204));
        }
        if (txtNombre.getText().isEmpty()){
            txtNombre.setText("  Nombres");
            txtNombre.setForeground(new Color(204,204,204));
        }
        if (txtApellido.getText().isEmpty()){
            txtApellido.setText("  Apellidos");
            txtApellido.setForeground(new Color(204,204,204));
        }
        if (txtDireccion.getText().isEmpty()){
            txtDireccion.setText("  Dirección");
            txtDireccion.setForeground(new Color(204,204,204));
        }
        if (txtFecNac.getText().isEmpty()){
            txtFecNac.setText("  Fecha de Nacimiento");
            txtFecNac.setForeground(new Color(204,204,204));
        }
        if (txtCorreo.getText().isEmpty()){
            txtCorreo.setText("  Correo");
            txtCorreo.setForeground(new Color(204,204,204));
        }
        if (txtContra.getText().isEmpty()){
            txtContra.setText("  Contraseña");
            txtContra.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtContra2MousePressed

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
            java.util.logging.Logger.getLogger(JFrameRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameRegistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnValidar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtContra2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFecNac;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
