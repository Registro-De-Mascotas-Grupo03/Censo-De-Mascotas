/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import betatester.BetaTester;
import entidades.Dueño;
import excepcionesPersonalizadas.MiExcepcionDeArchivo;
import excepcionesPersonalizadas.MiExcepcionDeClase;
import excepcionesPersonalizadas.MiExcepcionDeEscritura;
import excepcionesPersonalizadas.MiExcepcionDeFecha;
import funciones.Utilitario;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabricio
 */
public class JFrameAgregarDueño extends javax.swing.JFrame {

    private JFrameListaDueños padre;
    Dueño dueño;

    public JFrameAgregarDueño() {
        initComponents();
    }

    public JFrameAgregarDueño(JFrameListaDueños padre) {
        initComponents();
        this.padre = padre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        cbTipoDoc = new javax.swing.JComboBox<>();
        lblTipoDoc = new javax.swing.JLabel();
        lblNumDoc = new javax.swing.JLabel();
        txtNumDoc = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblFecNac = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtFecNac = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblTitulo.setText("Registro de Dueños");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblNombre.setText("Nombres:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 160, 33));

        lblApellidos.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblApellidos.setText("Apellidos:");
        jPanel1.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        txtApellido.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtApellido.setBorder(null);
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 160, 33));

        lblSexo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblSexo.setText("Sexo:");
        jPanel1.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 160, 33));

        lblCorreo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCorreo.setText("Correo:");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        cbTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "CEDULA", "CARNET DE EXTRANJERIA", " " }));
        cbTipoDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 160, 30));

        lblTipoDoc.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblTipoDoc.setText("Tipo Doc:");
        jPanel1.add(lblTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        lblNumDoc.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblNumDoc.setText("Num.Doc: ");
        jPanel1.add(lblNumDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        txtNumDoc.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtNumDoc.setBorder(null);
        jPanel1.add(txtNumDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, 33));

        txtCorreo.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtCorreo.setBorder(null);
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 160, 33));

        lblTelefono.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblTelefono.setText("Telefono:");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        lblFecNac.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblFecNac.setText("Fec. Nac:");
        jPanel1.add(lblFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblDireccion.setText("Dirección:");
        jPanel1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtDireccion.setBorder(null);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 160, 33));

        txtFecNac.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtFecNac.setBorder(null);
        jPanel1.add(txtFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 160, 33));

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

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        cbSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/patitas7 agregaDueño.jpg"))); // NOI18N
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
        if (validaIngresos()) {
            nuevoDueño();

        } else {
            JOptionPane.showMessageDialog(null, "Por favor asegurate de llenar "
                    + "todos los datos correctamente.");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private boolean validaIngresos() {
        if (txtNumDoc.getText().isEmpty() || txtNombre.getText().isEmpty()
                || txtApellido.getText().isEmpty()
                || txtTelefono.getText().isEmpty()
                || txtCorreo.getText().isEmpty()
                || txtDireccion.getText().isEmpty()
                || txtFecNac.getText().isEmpty()) {
            return false;

        }
        for (Dueño dueño : BetaTester.dueños) {
            if (txtNumDoc.getText().equals(dueño.getNumDoc())) {
                JOptionPane.showMessageDialog(null, "Ya existe un dueño con ese"
                        + " Número de Documento");
                return false;

                
            }
        }
        return true;

    }

    private void nuevoDueño() {

        try {
            Utilitario.crearArchivo("Dueños.txt");

            LocalDate fecNac;

            dueño = new Dueño();
            dueño.setTipoDoc(this.cbTipoDoc.getItemAt(cbTipoDoc.getSelectedIndex()));
            dueño.setNumDoc(txtNumDoc.getText());
            dueño.setNombre(txtNombre.getText());
            dueño.setApellido(txtApellido.getText());
            dueño.setDireccion(txtDireccion.getText());
            dueño.setCorreoPersonal(txtCorreo.getText());
            dueño.setTelefono(txtTelefono.getText());
            fecNac = Utilitario.convertirAFecha(txtFecNac.getText());
            dueño.setFecNac(fecNac);
            dueño.setEdad(obtenerEdad(fecNac));
            dueño.setSexo(this.cbSexo.getItemAt(cbSexo.getSelectedIndex()));
            dueño.setEstado("Habilitado");
            this.padre.agregarNuevoDueño(dueño);

            Utilitario.escribirDueñosEnArchivo("Dueños.txt", BetaTester.dueños);
            Utilitario.leerDueñosEnArchivo("Dueños.txt");
            salir();

        } catch (MiExcepcionDeFecha e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (MiExcepcionDeEscritura e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (MiExcepcionDeArchivo e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (MiExcepcionDeClase e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    private void salir() {
        padre.setVisible(true);
        this.dispose();
    }

    private int obtenerEdad(LocalDate fecNac) {
        int edad;
        LocalDate fechaActual = LocalDate.now();

        if (fecNac.getDayOfYear() <= fechaActual.getDayOfYear()) {
            edad = fechaActual.getYear() - fecNac.getYear();
        } else {
            edad = fechaActual.getYear() - fecNac.getYear() - 1;
        }

        return edad;
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
            java.util.logging.Logger.getLogger(JFrameAgregarDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAgregarDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAgregarDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAgregarDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAgregarDueño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipoDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFecNac;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumDoc;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoDoc;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecNac;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumDoc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
