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

import funciones.Utilitario;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fabricio
 */
public class JFrameListaDueños extends javax.swing.JFrame {

    private JFrameGestorUsuario padre;
    DefaultTableModel modeloTableDueños;

    public JFrameListaDueños() {
        initComponents();
    }

    public JFrameListaDueños(JFrameGestorUsuario padre) {
        initComponents();
        this.padre = padre;

        modeloTableDueños = new DefaultTableModel();
        modeloTableDueños.addColumn("DNI");
        modeloTableDueños.addColumn("Nombres");
        modeloTableDueños.addColumn("Apellidos");
        modeloTableDueños.addColumn("Sexo");
        modeloTableDueños.addColumn("Correo");
        modeloTableDueños.addColumn("Estado");

        this.tbDueños.setModel(modeloTableDueños);
        llenarTabla("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDueño = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnAgregarMascota = new javax.swing.JButton();
        btnDeshabilitarYHabilitar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDueños = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAgregarMulta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDueño.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblDueño.setText("Dueños");
        jPanel1.add(lblDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 370, 35));

        btnAgregarMascota.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnAgregarMascota.setText("AgregarMascota");
        btnAgregarMascota.setBorder(null);
        btnAgregarMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMascotaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 170, 35));

        btnDeshabilitarYHabilitar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnDeshabilitarYHabilitar.setText("Deshabilitar/ Habilitar ");
        btnDeshabilitarYHabilitar.setBorder(null);
        btnDeshabilitarYHabilitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeshabilitarYHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshabilitarYHabilitarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeshabilitarYHabilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 180, 30));

        tbDueños.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Sexo", "Especie", "Raza", "Fec. Nac."
            }
        ));
        jScrollPane1.setViewportView(tbDueños);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 610, 330));

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnAgregar.setText("Agregar Dueño");
        btnAgregar.setBorder(null);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 150, 35));

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 100, 35));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 100, 35));

        btnAgregarMulta.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnAgregarMulta.setText("AgregarMulta");
        btnAgregarMulta.setBorder(null);
        btnAgregarMulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMultaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarMulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 140, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/patitas7 listaDueños.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 620));

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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        JFrameAgregarDueño agrega = new JFrameAgregarDueño(this);
        agrega.setLocationRelativeTo(null);
        agrega.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMascotaActionPerformed
        String numDoc;
        JFrameIngresar abuelo = new JFrameIngresar();
        JFrameGestorUsuario padre = new JFrameGestorUsuario(abuelo, this.padre.usuario);
        JFrameListaMascotas nuevo = new JFrameListaMascotas(padre);
        int fila = tbDueños.getSelectedRow();
        if (fila >= 0) {
            numDoc = String.valueOf(modeloTableDueños.getValueAt(fila, 0));
            for (Dueño dueño : BetaTester.dueños) {
                if (numDoc == dueño.getNumDoc()) {
                    JFrameAgregarMascota agrega
                            = new JFrameAgregarMascota(nuevo, dueño);
                    agrega.setLocationRelativeTo(null);
                    agrega.setVisible(true);
                    this.setVisible(false);

                    break;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
    }//GEN-LAST:event_btnAgregarMascotaActionPerformed

    private void btnDeshabilitarYHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshabilitarYHabilitarActionPerformed
        String numDoc;
        String estado;
        int fila = tbDueños.getSelectedRow();

        try {
            if (fila >= 0) {
                numDoc = String.valueOf(modeloTableDueños.getValueAt(fila, 0));
                estado = String.valueOf(modeloTableDueños.getValueAt(fila, 5));
                if (estado.equals("Habilitado")) {
                    for (Dueño dueño : BetaTester.dueños) {
                        if (numDoc == dueño.getNumDoc()) {
                            dueño.setEstado("Deshabilitado");

                            break;
                        }
                    }

                } else {
                    for (Dueño dueño : BetaTester.dueños) {
                        if (numDoc == dueño.getNumDoc()) {
                            dueño.setEstado("Habilitado");

                            break;
                        }
                    }

                }
                Utilitario.escribirDueñosEnArchivo("Dueños.txt", BetaTester.dueños);
                Utilitario.leerDueñosEnArchivo("Dueños.txt");

            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
            }
            llenarTabla("");

        } catch (MiExcepcionDeEscritura e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (MiExcepcionDeArchivo e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (MiExcepcionDeClase e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }//GEN-LAST:event_btnDeshabilitarYHabilitarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String numDoc;

        try {
            int fila = tbDueños.getSelectedRow();
            if (fila >= 0) {
                numDoc = String.valueOf(modeloTableDueños.getValueAt(fila, 0));

                for (Dueño dueño : BetaTester.dueños) {
                    if (numDoc.equals(dueño.getNumDoc())) {
                        eliminaMascotasDeDueño(dueño);
                        BetaTester.dueños.remove(dueño);
                        modeloTableDueños.removeRow(fila);

                        break;
                    }
                }
                Utilitario.escribirDueñosEnArchivo("Dueños.txt", BetaTester.dueños);
                Utilitario.leerDueñosEnArchivo("Dueños.txt");
                Utilitario.escribirMascotasEnArchivo("Mascotas.txt",
                        BetaTester.mascotas);
                Utilitario.leerMascotasEnArchivo("Mascotas.txt");

            } else {
                JOptionPane.showMessageDialog(null, "Seleccionar Fila");
            }
            llenarTabla("");

        } catch (MiExcepcionDeEscritura e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (MiExcepcionDeArchivo e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (MiExcepcionDeClase e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void eliminaMascotasDeDueño(Dueño dueño) {
        int i = dueño.getMascotas().size();
        while (i >= 1) {
            for (Mascota mascota : BetaTester.mascotas) {
                if (dueño.getNumDoc().equals(mascota.getDueño().getNumDoc())) {
                    BetaTester.mascotas.remove(mascota);
                    dueño.getMascotas().remove(mascota);
                    i--;
                    break;

                }

            }
        }

    }
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        busquedaSensitiva();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnAgregarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMultaActionPerformed

        String numDoc;
        JFrameIngresar abuelo = new JFrameIngresar();
        JFrameGestorUsuario padre = new JFrameGestorUsuario(abuelo, this.padre.usuario);
        JFrameMultas nuevo = new JFrameMultas(padre, this.padre.usuario);
        int fila = tbDueños.getSelectedRow();
        if (fila >= 0) {
            numDoc = String.valueOf(modeloTableDueños.getValueAt(fila, 0));
            for (Dueño dueño : BetaTester.dueños) {
                if (numDoc == dueño.getNumDoc()) {
                    JFrameGenerarMulta agrega
                            = new JFrameGenerarMulta(nuevo, this.padre.usuario, dueño);
                    agrega.setLocationRelativeTo(null);
                    agrega.setVisible(true);
                    this.setVisible(false);

                    break;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
    }//GEN-LAST:event_btnAgregarMultaActionPerformed

    private void busquedaSensitiva() {
        limpiarTabla();
        for (Dueño dueño : BetaTester.dueños) {
            String[] fila = new String[6];
            if (dueño.getNombre().toLowerCase()
                    .contains(txtBuscar.getText().toLowerCase())
                    || dueño.getNumDoc().toLowerCase()
                            .contains(txtBuscar.getText().toLowerCase())) {
                fila[0] = dueño.getNumDoc();
                fila[1] = dueño.getNombre();
                fila[2] = dueño.getApellido();
                fila[3] = dueño.getSexo();
                fila[4] = dueño.getCorreoPersonal();
                fila[5] = dueño.getEstado();
                modeloTableDueños.addRow(fila);
            }
        }
    }

    public void agregarNuevoDueño(Dueño dueño) {
        BetaTester.dueños.add(dueño);
        llenarTabla("");
    }

    private void llenarTabla(String criterio) {
        limpiarTabla();

        for (Dueño dueño : BetaTester.dueños) {
            String[] fila = new String[6];
            if (dueño.getNombre() != null && dueño.getNombre().contains(criterio)) {
                fila[0] = dueño.getNumDoc();
                fila[1] = dueño.getNombre();
                fila[2] = dueño.getApellido();
                fila[3] = dueño.getSexo();
                fila[4] = dueño.getCorreoPersonal();
                fila[5] = dueño.getEstado();
                modeloTableDueños.addRow(fila);
            }
        }

    }

    private void limpiarTabla() {
        int fila = tbDueños.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modeloTableDueños.removeRow(i);
        }
    }

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
            java.util.logging.Logger.getLogger(JFrameListaDueños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameListaDueños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameListaDueños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameListaDueños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameListaDueños().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarMascota;
    private javax.swing.JButton btnAgregarMulta;
    private javax.swing.JButton btnDeshabilitarYHabilitar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDueño;
    private javax.swing.JTable tbDueños;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
