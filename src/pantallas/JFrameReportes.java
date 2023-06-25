/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import betatester.BetaTester;
import entidades.Dueño;
import entidades.ExportarArchivo;
import entidades.Mascota;
import entidades.Multa;
import entidades.Usuario;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alvaro
 */
public class JFrameReportes extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;
    private JFrameGestorUsuario padre;

    public JFrameReportes() {
        initComponents();
    }

    public JFrameReportes(JFrameGestorUsuario padre) {
        initComponents();
        this.padre = padre;
        modeloTabla = new DefaultTableModel();

        modeloTabla.addColumn("Dni");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Direccion");

        this.tbReportes.setModel(modeloTabla);
        llenarTablaConUsuarios("");
        cbFiltroCategoria.setSelectedIndex(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReportes = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnDescargar = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        lblDe = new javax.swing.JLabel();
        cbFiltroCategoria = new javax.swing.JComboBox<>();
        lblReportes = new javax.swing.JLabel();
        lblFiltro = new javax.swing.JLabel();
        lblFiltrarPor = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbReportes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbReportes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 610, 330));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 90, 33));

        btnDescargar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnDescargar.setText("Descargar Reporte");
        btnDescargar.setBorder(null);
        btnDescargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDescargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 160, 33));

        btnFiltrar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.setBorder(null);
        btnFiltrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 90, 33));

        lblDe.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblDe.setText("De:");
        jPanel1.add(lblDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        cbFiltroCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuarios", "Dueños", "Mascotas", "Multas" }));
        cbFiltroCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbFiltroCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFiltroCategoriaItemStateChanged(evt);
            }
        });
        jPanel1.add(cbFiltroCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 160, 30));

        lblReportes.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblReportes.setText("Reportes");
        jPanel1.add(lblReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        lblFiltro.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblFiltro.setText("Filtro:");
        jPanel1.add(lblFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        lblFiltrarPor.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblFiltrarPor.setText("Filtrar por:");
        jPanel1.add(lblFiltrarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        cbFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 93, 160, 30));

        txtFiltro.setBorder(null);
        txtFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 160, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/patitas9 listaMascotas.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 600));

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

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed
        ExportarArchivo obj;
        try {
            obj = new ExportarArchivo();
            obj.exportarExcel(tbReportes);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnDescargarActionPerformed

    private void cbFiltroCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFiltroCategoriaItemStateChanged
        String Seleccionado;
        Seleccionado = (String) cbFiltroCategoria.getSelectedItem();
        if (Seleccionado == "Usuarios") {
            modeloTabla = new DefaultTableModel();

            modeloTabla.addColumn("Dni");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellido");
            modeloTabla.addColumn("Correo");
            modeloTabla.addColumn("Direccion");

            this.tbReportes.setModel(modeloTabla);
            cbFiltro.removeAllItems();
            cbFiltro.addItem("Rol");
            llenarTablaConUsuarios("");

        }
        if (Seleccionado == "Dueños") {
            modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("DNI");
            modeloTabla.addColumn("Nombres");
            modeloTabla.addColumn("Apellidos");
            modeloTabla.addColumn("Sexo");
            modeloTabla.addColumn("Correo");
            modeloTabla.addColumn("Estado");

            this.tbReportes.setModel(modeloTabla);
            cbFiltro.removeAllItems();
            cbFiltro.addItem("Estado");
            llenarTablaConDueños("");

        }
        if (Seleccionado == "Mascotas") {
            modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("Codigo");
            modeloTabla.addColumn("DNI Dueño");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellido");
            modeloTabla.addColumn("Sexo");
            modeloTabla.addColumn("Especie");
            modeloTabla.addColumn("Raza");

            this.tbReportes.setModel(modeloTabla);
            cbFiltro.removeAllItems();
            cbFiltro.addItem("Cantidad De Mascotas");
            cbFiltro.addItem("Raza");
            cbFiltro.addItem("Especie");
            llenarTablaConMascotas();

        }
        if (Seleccionado == "Multas") {
            modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("Código de Multa");
            modeloTabla.addColumn("Tipo de Documento");
            modeloTabla.addColumn("Nro de Documento");
            modeloTabla.addColumn("Monto Multa");
            modeloTabla.addColumn("Fecha");
            modeloTabla.addColumn("Fecha Vencimiento");
            modeloTabla.addColumn("Estado");
            this.tbReportes.setModel(modeloTabla);
            cbFiltro.removeAllItems();
            cbFiltro.addItem("Estado");

            llenarTablaConMultas();
        }

    }//GEN-LAST:event_cbFiltroCategoriaItemStateChanged

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        if(String.valueOf(cbFiltroCategoria.getSelectedItem())
                .equals("Usuarios")){
            filtrarUsuario(txtFiltro.getText());
        }
        if(String.valueOf(cbFiltroCategoria.getSelectedItem())
                .equals("Dueños")){
            filtrarDueños(txtFiltro.getText());
        }
        if(String.valueOf(cbFiltroCategoria.getSelectedItem())
                .equals("Mascotas")){
            filtrarMascotas(txtFiltro.getText(),
        String.valueOf(cbFiltro.getSelectedItem()));
        }
        if(String.valueOf(cbFiltroCategoria.getSelectedItem())
                .equals("Multas")){
            filtrarMultas(txtFiltro.getText());
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void salir() {
        padre.setVisible(true);
        this.dispose();
    }

    private void limpiarTabla() {
        int fila = tbReportes.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }

    private void filtrarUsuario(String criterio) {
        limpiarTabla();

        for (Usuario buscaUsuario : BetaTester.usuarios) {
            String[] info = new String[5];
            if (buscaUsuario.getEstado().contains(criterio)) {
                info[0] = buscaUsuario.getNumDoc();
                info[1] = buscaUsuario.getNombre();
                info[2] = buscaUsuario.getApellido();
                info[3] = buscaUsuario.getCorreoPersonal();
                info[4] = buscaUsuario.getDireccion();
                modeloTabla.addRow(info);
            }
        }
        this.tbReportes.setModel(modeloTabla);

    }

    private void filtrarDueños(String criterio) {
        limpiarTabla();

        for (Dueño dueño : BetaTester.dueños) {
            String[] fila = new String[6];
            if (dueño.getEstado().contains(criterio)) {
                fila[0] = dueño.getNumDoc();
                fila[1] = dueño.getNombre();
                fila[2] = dueño.getApellido();
                fila[3] = dueño.getSexo();
                fila[4] = dueño.getCorreoPersonal();
                fila[5] = dueño.getEstado();
                modeloTabla.addRow(fila);
            }
        }
        this.tbReportes.setModel(modeloTabla);

    }

    private void filtrarMultas(String criterio) {
        limpiarTabla();
        for (Multa multa : BetaTester.multas) {
            String[] fila = new String[6];
            if (multa.getEstado().contains(criterio)) {
                fila[0] = multa.getCodigoMulta();
                fila[1] = multa.getDueño().getTipoDoc().toString();
                fila[2] = multa.getDueño().getNumDoc().toString();
                fila[3] = String.valueOf(multa.getMonto());
                fila[4] = multa.getFechaGenerada();
                fila[5] = multa.getFechaVencimiento();
                fila[6] = multa.getEstado();
                modeloTabla.addRow(fila);
            }

        }
        this.tbReportes.setModel(modeloTabla);

    }

    private void filtrarMascotas(String criterio, String filtro) {
        limpiarTabla();

        if (filtro.equals("Cantidad de Mascotas")) {
            for (Mascota buscaMascTabla : BetaTester.mascotas) {
                String[] info = new String[5];
                if (buscaMascTabla.getDueño().getMascotas().size()
                        == Integer.parseInt(criterio)) {
                    info[0] = buscaMascTabla.getCodigo();
                    info[1] = buscaMascTabla.getDueño().getNumDoc();
                    info[2] = buscaMascTabla.getNombre();
                    info[3] = buscaMascTabla.getApellido();
                    info[4] = buscaMascTabla.getSexo();
                    info[5] = buscaMascTabla.getEspecie();
                    info[6] = buscaMascTabla.getRaza();
                    modeloTabla.addRow(info);

                }

            }
        }
        if (filtro.equals("Raza")) {
            for (Mascota buscaMascTabla : BetaTester.mascotas) {
                String[] info = new String[5];
                if (buscaMascTabla.getRaza().contains(criterio)) {
                    info[0] = buscaMascTabla.getCodigo();
                    info[1] = buscaMascTabla.getDueño().getNumDoc();
                    info[2] = buscaMascTabla.getNombre();
                    info[3] = buscaMascTabla.getApellido();
                    info[4] = buscaMascTabla.getSexo();
                    info[5] = buscaMascTabla.getEspecie();
                    info[6] = buscaMascTabla.getRaza();
                    modeloTabla.addRow(info);

                }

            }
        } else {
            for (Mascota buscaMascTabla : BetaTester.mascotas) {
                String[] info = new String[5];
                if (buscaMascTabla.getEspecie().contains(criterio)) {
                    info[0] = buscaMascTabla.getCodigo();
                    info[1] = buscaMascTabla.getDueño().getNumDoc();
                    info[2] = buscaMascTabla.getNombre();
                    info[3] = buscaMascTabla.getApellido();
                    info[4] = buscaMascTabla.getSexo();
                    info[5] = buscaMascTabla.getEspecie();
                    info[6] = buscaMascTabla.getRaza();
                    modeloTabla.addRow(info);

                }

            }
        }
        this.tbReportes.setModel(modeloTabla);

    }

    private void llenarTablaConDueños(String criterio) {
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
                modeloTabla.addRow(fila);
            }
        }

    }

    private void llenarTablaConMultas() {
        limpiarTabla();
        for (Multa multa : BetaTester.multas) {
            String[] fila = new String[7];
            fila[0] = multa.getCodigoMulta();
            fila[1] = multa.getDueño().getTipoDoc().toString();
            fila[2] = multa.getDueño().getNumDoc().toString();
            fila[3] = String.valueOf(multa.getMonto());
            fila[4] = multa.getFechaGenerada();
            fila[5] = multa.getFechaVencimiento();
            fila[6] = multa.getEstado();
            modeloTabla.addRow(fila);
        }
    }

    private void llenarTablaConUsuarios(String criterio) {
        limpiarTabla();

        for (Usuario buscaUsuario : BetaTester.usuarios) {
            String[] info = new String[5];
            if (buscaUsuario.getNombre() != null && buscaUsuario.getNombre().contains(criterio)) {
                info[0] = buscaUsuario.getNumDoc();
                info[1] = buscaUsuario.getNombre();
                info[2] = buscaUsuario.getApellido();
                info[3] = buscaUsuario.getCorreoPersonal();
                info[4] = buscaUsuario.getDireccion();
                modeloTabla.addRow(info);
            }
        }
    }

    private void llenarTablaConMascotas() {
        limpiarTabla();

        for (Mascota buscaMascTabla : BetaTester.mascotas) {
            String[] info = new String[7];
            info[0] = buscaMascTabla.getCodigo();
            info[1] = buscaMascTabla.getDueño().getNumDoc();
            info[2] = buscaMascTabla.getNombre();
            info[3] = buscaMascTabla.getApellido();
            info[4] = buscaMascTabla.getSexo();
            info[5] = buscaMascTabla.getEspecie();
            info[6] = buscaMascTabla.getRaza();
            modeloTabla.addRow(info);

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
            java.util.logging.Logger.getLogger(JFrameReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescargar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JComboBox<String> cbFiltroCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblFiltrarPor;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JTable tbReportes;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
