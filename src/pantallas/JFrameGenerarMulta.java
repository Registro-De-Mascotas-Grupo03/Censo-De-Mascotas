/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import betatester.BetaTester;
import entidades.Dueño;
import entidades.Mascota;
import entidades.Multa;
import entidades.Usuario;
import excepcionesPersonalizadas.MiExcepcionDeArchivo;
import excepcionesPersonalizadas.MiExcepcionDeClase;
import excepcionesPersonalizadas.MiExcepcionDeEscritura;
import excepcionesPersonalizadas.MiExcepcionNula;
import funciones.Utilitario;
import javax.swing.JOptionPane;
import java.time.LocalDate;

/**
 *
 * @author tokiro
 */
public class JFrameGenerarMulta extends javax.swing.JFrame {

    private Multa multa;
    private JFrameMultas padre;
    private Dueño dueño;
    private Usuario usuario;

    public JFrameGenerarMulta() {
        initComponents();
    }

    public JFrameGenerarMulta(JFrameMultas padre, Usuario usuario) {
        initComponents();
        this.padre = padre;
        this.usuario = usuario;
        txtFecha.setVisible(false);
        lblFecha.setVisible(false);
        txtFechaV.setVisible(false);
        lblFechaV.setVisible(false);
        txtFechaP.setVisible(false);
        lblFechaP.setVisible(false);
        lblEstado.setVisible(false);
        lblEstado1.setVisible(false);
        lblNombreU.setVisible(false);
        txtNombreU.setVisible(false);

        this.lblCodigoMulta.setText(padre.calcularCodigo());
    }

    public JFrameGenerarMulta(JFrameMultas padre, Multa multa) {
        initComponents();
        this.padre = padre;
        this.multa = multa;
        this.btnGenerar.setVisible(false);
        txtFechaV.setVisible(true);
        lblFechaV.setVisible(true);
        lblFechaV.setVisible(true);
        lblEstado.setVisible(true);
        lblNombreU.setVisible(true);
        if (multa.getEstado() == "Por Pagar") {
            lblFechaP.setVisible(false);
            txtFechaP.setVisible(false);
        } else {
            txtFechaP.setText(multa.getFechaPagado());
        }
        lblTitulo.setText("Visualizar Multa - " + multa.getCodigoMulta());
        this.lblCodigoMulta.setText(multa.getCodigoMulta());
        this.cbTipoDocumento.setSelectedItem(multa.getDueño().getTipoDoc());
        this.txtNroDocumento.setText(multa.getDueño().getNumDoc());
        this.txtFecha.setText(multa.getFechaGenerada());
        this.txtFechaV.setText(multa.getFechaVencimiento());
        this.txtNombreU.setText(multa.getUsuario().getNombre());
        this.txtMonto.setText(String.valueOf(multa.getMonto()));
        this.lblEstado1.setText(multa.getEstado());
        this.txtDescripcion.setText(multa.getDescripcion());
    }

    public JFrameGenerarMulta(JFrameMultas padre, Usuario usuario, Dueño dueño) {
        initComponents();
        this.padre = padre;
        this.usuario = usuario;
        txtFecha.setVisible(false);
        lblFecha.setVisible(false);
        txtFechaV.setVisible(false);
        lblFechaV.setVisible(false);
        txtFechaP.setVisible(false);
        lblFechaP.setVisible(false);
        lblEstado.setVisible(false);
        lblEstado1.setVisible(false);
        lblNombreU.setVisible(false);
        txtNombreU.setVisible(false);

        txtNroDocumento.setText(dueño.getNumDoc());
        txtNroDocumento.setEnabled(false);

        this.lblCodigoMulta.setText(padre.calcularCodigo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCodigoM = new javax.swing.JLabel();
        lblCodigoMulta = new javax.swing.JLabel();
        lblTipoDocumento = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtNroDocumento = new javax.swing.JTextField();
        lblNroDocumento = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtFechaV = new javax.swing.JTextField();
        lblFechaV = new javax.swing.JLabel();
        txtFechaP = new javax.swing.JTextField();
        lblFechaP = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        cbTipoDocumento = new javax.swing.JComboBox<>();
        lblNombreU = new javax.swing.JLabel();
        txtNombreU = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        lblEstado1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblTitulo.setText("Registro de Multas");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        lblCodigoM.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCodigoM.setText("Codigo Multa:");
        jPanel1.add(lblCodigoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblCodigoMulta.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCodigoMulta.setText("M0000");
        jPanel1.add(lblCodigoMulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        lblTipoDocumento.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblTipoDocumento.setText("Tipo Documento:");
        jPanel1.add(lblTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        btnGenerar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.setBorder(null);
        btnGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 100, 33));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 100, 33));

        txtNroDocumento.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtNroDocumento.setBorder(null);
        jPanel1.add(txtNroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 170, 30));

        lblNroDocumento.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblNroDocumento.setText("Nro Documento:");
        jPanel1.add(lblNroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtFecha.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtFecha.setBorder(null);
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 170, 30));

        lblFecha.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblFecha.setText("Fecha:");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        txtFechaV.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtFechaV.setBorder(null);
        jPanel1.add(txtFechaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 170, 30));

        lblFechaV.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblFechaV.setText("Vencimiento:");
        jPanel1.add(lblFechaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 30));

        txtFechaP.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtFechaP.setBorder(null);
        jPanel1.add(txtFechaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 170, 30));

        lblFechaP.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblFechaP.setText("Fecha de Pago:");
        jPanel1.add(lblFechaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        txtMonto.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtMonto.setBorder(null);
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 170, 30));

        lblMonto.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblMonto.setText("Monto:");
        jPanel1.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtDescripcion.setBorder(null);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 170, 130));

        lblDescripcion.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblDescripcion.setText("Descripción:");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        cbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "CEDULA", "CARNET DE EXTRANJERIA" }));
        jPanel1.add(cbTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 170, 30));

        lblNombreU.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblNombreU.setText("Nombre Usario:");
        jPanel1.add(lblNombreU, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        txtNombreU.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtNombreU.setBorder(null);
        jPanel1.add(txtNombreU, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 170, 30));

        lblEstado.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblEstado.setText("Estado:");
        jPanel1.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        lblEstado1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblEstado1.setText("lblEstado1");
        jPanel1.add(lblEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/patitas9 generaMulta.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

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

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        generar();
    }//GEN-LAST:event_btnGenerarActionPerformed

    public void generar() {

        try {
            if (JOptionPane.showConfirmDialog(this, "¿Esta seguro de que desea "
                    + "generar la multa?", "" + "Confirm", JOptionPane.YES_NO_OPTION)
                    == JOptionPane.OK_OPTION) {
                Utilitario.crearArchivo("Multas.txt");
                for (Dueño dueñoA : BetaTester.dueños) {
                    if (dueñoA.getNumDoc().equals(txtNroDocumento.getText())) {
                        this.dueño = dueñoA;
                        break;
                    }
                }
                Utilitario.obtenerLista(dueño);
                multa = new Multa(this.dueño, this.usuario);
                
                multa.setCodigoMulta(padre.calcularCodigo());
                multa.setFechaGenerada(String.format("%02d", LocalDate.now().
                        getDayOfMonth()) + "/" + String.format("%02d",
                                LocalDate.now().getMonthValue()) + "/"
                        + LocalDate.now().getYear());
                multa.setMonto(Float.parseFloat(txtMonto.getText()));
                multa.setDescripcion(txtDescripcion.getText());

                this.padre.setMulta(multa);
                Utilitario.escribirMultasEnArchivo("Multas.txt",
                        BetaTester.multas);
                Utilitario.leerMultasEnArchivo("Multas.txt");
                salir();
            }

        } catch (MiExcepcionDeEscritura e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (MiExcepcionDeArchivo e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (MiExcepcionDeClase e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch (MiExcepcionNula e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
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
            java.util.logging.Logger.getLogger(JFrameGenerarMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGenerarMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGenerarMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGenerarMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGenerarMulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigoM;
    private javax.swing.JLabel lblCodigoMulta;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstado1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaP;
    private javax.swing.JLabel lblFechaV;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNombreU;
    private javax.swing.JLabel lblNroDocumento;
    private javax.swing.JLabel lblTipoDocumento;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaP;
    private javax.swing.JTextField txtFechaV;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombreU;
    private javax.swing.JTextField txtNroDocumento;
    // End of variables declaration//GEN-END:variables
}
