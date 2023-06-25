/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import betatester.BetaTester;
import entidades.Dueño;
import entidades.Mascota;
import excepcionesPersonalizadas.MiExcepcionDeArchivo;
import excepcionesPersonalizadas.MiExcepcionDeClase;
import excepcionesPersonalizadas.MiExcepcionDeEscritura;
import excepcionesPersonalizadas.MiExcepcionNula;
import funciones.Utilitario;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel 
 */
public class JFrameAgregarMascota extends javax.swing.JFrame {

    private Mascota mascota;
    private JFrameListaMascotas padre;
    private Dueño dueño;

    public JFrameAgregarMascota() {
        initComponents();
    }

    public JFrameAgregarMascota(JFrameListaMascotas padre) {
        initComponents();
        this.padre = padre;
        rbnMacho.setSelected(true);
    }

    public JFrameAgregarMascota(JFrameListaMascotas padre, Dueño dueño) {
        initComponents();
        this.padre = padre;
        txtDniDueño.setText(dueño.getNumDoc());
        txtDniDueño.setEnabled(false);
        rbnMacho.setSelected(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblFecNac = new javax.swing.JLabel();
        lblEspecie = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        rbnMacho = new javax.swing.JRadioButton();
        rbnHembra = new javax.swing.JRadioButton();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtFecNac = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtDniDueño = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblTitulo.setText("Registro de Mascotas");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCodigo.setText("Codigo:");
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        lblNombres.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblNombres.setText("Nombres:");
        jPanel1.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblApellidos.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblApellidos.setText("Apellidos:");
        jPanel1.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        lblFecNac.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblFecNac.setText("Fec. Nac:");
        jPanel1.add(lblFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        lblEspecie.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblEspecie.setText("Especie:");
        jPanel1.add(lblEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        lblRaza.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblRaza.setText("Raza:");
        jPanel1.add(lblRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        lblSexo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblSexo.setText("Sexo:");
        jPanel1.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        lblDni.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblDni.setText("Dni Dueño:");
        jPanel1.add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

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

        buttonGroup1.add(rbnMacho);
        rbnMacho.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        rbnMacho.setText("Macho");
        rbnMacho.setBorder(null);
        rbnMacho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(rbnMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        buttonGroup1.add(rbnHembra);
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

        txtFecNac.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtFecNac.setBorder(null);
        jPanel1.add(txtFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 160, 33));

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

        Registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void salir() {
        padre.setVisible(true);
        this.dispose();
    }

    private boolean ValidaIngresos() {
        if (txtApellido.getText().isEmpty() || txtCodigo.getText().isEmpty()
                || txtDniDueño.getText().isEmpty()
                || txtEspecie.getText().isEmpty()
                || txtFecNac.getText().isEmpty()
                || txtNombre.getText().isEmpty()
                || txtRaza.getText().isEmpty()) {
            return false;

        }
        return true;

    }

    private void Registrar() {

        try {
            if (JOptionPane.showConfirmDialog(this, "Deseas Guardar ?")
                    == JOptionPane.OK_OPTION && ValidaIngresos()) {
                Utilitario.crearArchivo("Mascotas.txt");
                mascota = new Mascota();
                String Sexo = null;
                if (rbnMacho.isSelected()) {
                    Sexo = "MACHO";
                }
                if (rbnHembra.isSelected()) {
                    Sexo = "HEMBRA";
                }
                mascota.setCodigo(txtCodigo.getText());

                for (Dueño dueñoA : BetaTester.dueños) {
                    if (dueñoA.getNumDoc().equals(txtDniDueño.getText())) {
                        this.dueño = dueñoA;
                        break;
                    }
                }

                mascota.setDueño(dueño);
                mascota.setNombre(txtNombre.getText());
                mascota.setApellido(txtApellido.getText());
                mascota.setFecNac(txtFecNac.getText());
                mascota.setSexo(Sexo);
                mascota.setEspecie(txtEspecie.getText());
                mascota.setRaza(txtRaza.getText());

                Utilitario.obtenerLista(dueño).add(mascota);

                this.padre.setMascota(mascota);
                Utilitario.escribirMascotasEnArchivo("Mascotas.txt",
                        BetaTester.mascotas);
                Utilitario.leerMascotasEnArchivo("Mascotas.txt");
                this.padre.setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Por favor asegurate de llenar "
                        + "todos los datos correctamente.");
            }

        } catch (MiExcepcionNula e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        } catch (MiExcepcionDeEscritura e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (MiExcepcionDeArchivo e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (MiExcepcionDeClase e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblFecNac;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbnHembra;
    private javax.swing.JRadioButton rbnMacho;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDniDueño;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtFecNac;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
