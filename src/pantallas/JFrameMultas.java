/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import betatester.BetaTester;
import entidades.Multa;
import entidades.Usuario;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tokiro
 */
public class JFrameMultas extends javax.swing.JFrame {

    private JFrameGestorUsuario padre;
    private Usuario usuario;
    
    DefaultTableModel modeloTabla = new DefaultTableModel();
    String[] i = new String[7];
    
    public JFrameMultas() {
        initComponents();
    }
    
    public JFrameMultas(JFrameGestorUsuario padre, Usuario usuario) {
        initComponents();
        this.padre = padre;
        this.usuario = usuario;
        tbMultas.setModel(modeloTabla);
        modeloTabla.addColumn("Código de Multa");
        modeloTabla.addColumn("Tipo de Documento");
        modeloTabla.addColumn("Nro de Documento");
        modeloTabla.addColumn("Monto Multa");
        modeloTabla.addColumn("Fecha");
        modeloTabla.addColumn("Fecha Vencimiento");
        modeloTabla.addColumn("Estado");
        this.tbMultas.setModel(modeloTabla);
        llenarNombreMeses(LocalDate.now().getMonthValue());
        eliminaMultasPagadas();
        actualizarTabla();
    }

    void setMulta(Multa multa) {
        BetaTester.multas.add(multa);
        actualizarTabla();
    }
    
    private void actualizarTabla() {
        modeloTabla.setRowCount(0);
        for (Multa multa: BetaTester.multas){
            i[0] = multa.getCodigoMulta();
            i[1] = multa.getDueño().getTipoDoc().toString();
            i[2] = multa.getDueño().getNumDoc().toString();
            i[3] = String.valueOf(multa.getMonto());
            i[4] = multa.getFechaGenerada();
            i[5] = multa.getFechaVencimiento();
            i[6] = multa.getEstado();
            modeloTabla.addRow(i);
        }
    }
    
    private void eliminaMultasPagadas(){
        int e = 0;
        for (Multa multa: BetaTester.multas){ 
            if(multa.getEstado() == "Pagado")
            {
                if (Integer.parseInt( multa.getFechaPagado().substring(6, 10))
                        + 2 <= LocalDate.now().getYear()) {
                    modeloTabla.removeRow(e);
                    BetaTester.multas.remove(e);
                }
            }
            e++;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMultas = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        lblDescripcionFondoMes3 = new javax.swing.JLabel();
        lblTextoFondoMes1 = new javax.swing.JLabel();
        lblTextoFondoMes2 = new javax.swing.JLabel();
        lblDescripcionFondoMes4 = new javax.swing.JLabel();
        lblTextoFondoMes4 = new javax.swing.JLabel();
        lblDescripcionFondoMes2 = new javax.swing.JLabel();
        lblTextoFondoMes3 = new javax.swing.JLabel();
        lblDescripcionFondoMes1 = new javax.swing.JLabel();
        lblTextoFondoMulta = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTitulo.setText("Historial de Multas");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        btnGenerar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnGenerar.setText("Generar Multa");
        btnGenerar.setBorder(null);
        btnGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 130, 35));

        btnPagar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnPagar.setText("Pagar Multa");
        btnPagar.setBorder(null);
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 130, 35));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, 130, 35));

        tbMultas.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código de Multa", "Tipo de Documento", "Nro de Documento", "Monto Multa", "Fecha", "Vencimiento", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbMultas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 800, 250));

        txtBuscar.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 350, 33));

        lblDescripcionFondoMes3.setText("lblDescripcionFondoMes3");
        jPanel1.add(lblDescripcionFondoMes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, 30));

        lblTextoFondoMes1.setText("lblTextoFondoMes1:");
        jPanel1.add(lblTextoFondoMes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, 30));

        lblTextoFondoMes2.setText("lblTextoFondoMes2:");
        jPanel1.add(lblTextoFondoMes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, 30));

        lblDescripcionFondoMes4.setText("lblDescripcionFondoMes4");
        jPanel1.add(lblDescripcionFondoMes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, 30));

        lblTextoFondoMes4.setText("lblTextoFondoMes4:");
        jPanel1.add(lblTextoFondoMes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, 30));

        lblDescripcionFondoMes2.setText("lblDescripcionFondoMes2");
        jPanel1.add(lblDescripcionFondoMes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, 30));

        lblTextoFondoMes3.setText("lblTextoFondoMes3:");
        jPanel1.add(lblTextoFondoMes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, 30));

        lblDescripcionFondoMes1.setText("lblDescripcionFondoMes1");
        jPanel1.add(lblDescripcionFondoMes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, 30));

        lblTextoFondoMulta.setText("Los fondos recaudados por la multa, se utilizaran en:");
        jPanel1.add(lblTextoFondoMulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, 30));

        btnVer.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnVer.setText("Ver Multa");
        btnVer.setBorder(null);
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        jPanel1.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 130, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/patitas9.JPG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        JFrameGenerarMulta multa = new JFrameGenerarMulta(this,usuario);
        multa.setLocationRelativeTo(null);
        multa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        buscar();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        int e = tbMultas.getSelectedRow();
        if (e >= 0) {
            Multa m = BetaTester.multas.get(e);
            m.setEstado("Pagado");
            m.setFechaPagado(String.format("%02d",LocalDate.now().
                    getDayOfMonth()) + "/" + String.format("%02d",
                    LocalDate.now().getMonthValue()) + "/" + 
                    LocalDate.now().getYear());
            BetaTester.multas.set(e, m);
            actualizarTabla();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una "
                    + "Multa para pagarla");
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        int e = tbMultas.getSelectedRow();
        if (e >= 0) {
            JFrameGenerarMulta multa = new JFrameGenerarMulta(this, 
                    BetaTester.multas.get(e));
            multa.setLocationRelativeTo(null);
            multa.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una "
                + "Multa para mostrarla");
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void salir() {
        padre.setVisible(true);
        this.dispose();
    }
    
    public String calcularCodigo() {
        String codigo = "";
        if (modeloTabla.getRowCount() < 1) {
            return "M0001";
        } else {
            for (Multa p : BetaTester.multas) {
                codigo = p.getCodigoMulta();
            }
            return "M" + String.format("%04d", 
                    Integer.parseInt(codigo.substring(1, 5)) + 1);
        }
    }
    
    public void llenarNombreMeses(int mesAct){
        switch (mesAct){
            case 1: 
                this.lblTextoFondoMes1.setText("Enero:");
                this.lblDescripcionFondoMes1.setText(llenarDescripcionMes(1));
                this.lblTextoFondoMes2.setText("Febrero:");
                this.lblDescripcionFondoMes2.setText(llenarDescripcionMes(2));
                this.lblTextoFondoMes3.setText("Marzo:");
                this.lblDescripcionFondoMes3.setText(llenarDescripcionMes(3));
                this.lblTextoFondoMes4.setText("Abril:");
                this.lblDescripcionFondoMes4.setText(llenarDescripcionMes(4));
                break;
            case 2:
                this.lblTextoFondoMes1.setText("Febrero:");
                this.lblDescripcionFondoMes1.setText(llenarDescripcionMes(2));
                this.lblTextoFondoMes2.setText("Marzo:");
                this.lblDescripcionFondoMes2.setText(llenarDescripcionMes(3));
                this.lblTextoFondoMes3.setText("Abril:");
                this.lblDescripcionFondoMes3.setText(llenarDescripcionMes(4));
                this.lblTextoFondoMes4.setText("Mayo:");
                this.lblDescripcionFondoMes4.setText(llenarDescripcionMes(5));
                break;
            case 3:
                this.lblTextoFondoMes1.setText("Marzo:");
                this.lblDescripcionFondoMes1.setText(llenarDescripcionMes(3));
                this.lblTextoFondoMes2.setText("Abril:");
                this.lblDescripcionFondoMes2.setText(llenarDescripcionMes(4));
                this.lblTextoFondoMes3.setText("Mayo:");
                this.lblDescripcionFondoMes3.setText(llenarDescripcionMes(5));
                this.lblTextoFondoMes4.setText("Junio:");
                this.lblDescripcionFondoMes4.setText(llenarDescripcionMes(6));
                break;
            case 4:
                this.lblTextoFondoMes1.setText("Abril:");
                this.lblDescripcionFondoMes1.setText(llenarDescripcionMes(4));
                this.lblTextoFondoMes2.setText("Mayo:");
                this.lblDescripcionFondoMes2.setText(llenarDescripcionMes(5));
                this.lblTextoFondoMes3.setText("Junio:");
                this.lblDescripcionFondoMes3.setText(llenarDescripcionMes(6));
                this.lblTextoFondoMes4.setText("Julio:");
                this.lblDescripcionFondoMes4.setText(llenarDescripcionMes(7));
                break;
            case 5:
                this.lblTextoFondoMes1.setText("Mayo:");
                this.lblDescripcionFondoMes1.setText(llenarDescripcionMes(5));
                this.lblTextoFondoMes2.setText("Junio:");
                this.lblDescripcionFondoMes2.setText(llenarDescripcionMes(6));
                this.lblTextoFondoMes3.setText("Julio:");
                this.lblDescripcionFondoMes3.setText(llenarDescripcionMes(7));
                this.lblTextoFondoMes4.setText("Agosto:");
                this.lblDescripcionFondoMes4.setText(llenarDescripcionMes(8));
                break;
            case 6:
                this.lblTextoFondoMes1.setText("Junio:");
                this.lblDescripcionFondoMes1.setText(llenarDescripcionMes(6));
                this.lblTextoFondoMes2.setText("Julio:");
                this.lblDescripcionFondoMes2.setText(llenarDescripcionMes(7));
                this.lblTextoFondoMes3.setText("Agosto:");
                this.lblDescripcionFondoMes3.setText(llenarDescripcionMes(8));
                this.lblTextoFondoMes4.setText("Setiembre:");
                this.lblDescripcionFondoMes4.setText(llenarDescripcionMes(9));
                break;
            case 7:
                this.lblTextoFondoMes1.setText("Julio:");
                this.lblDescripcionFondoMes1.setText(llenarDescripcionMes(7));
                this.lblTextoFondoMes2.setText("Agosto:");
                this.lblDescripcionFondoMes2.setText(llenarDescripcionMes(8));
                this.lblTextoFondoMes3.setText("Setiembre:");
                this.lblDescripcionFondoMes3.setText(llenarDescripcionMes(9));
                this.lblTextoFondoMes4.setText("Octubre:");
                this.lblDescripcionFondoMes4.setText(llenarDescripcionMes(10));
                break;
            case 8:
                this.lblTextoFondoMes1.setText("Agosto:");
                this.lblDescripcionFondoMes1.setText(llenarDescripcionMes(8));
                this.lblTextoFondoMes2.setText("Setiembre:");
                this.lblDescripcionFondoMes2.setText(llenarDescripcionMes(9));
                this.lblTextoFondoMes3.setText("Octubre:");
                this.lblDescripcionFondoMes3.setText(llenarDescripcionMes(10));
                this.lblTextoFondoMes4.setText("Noviembre:");
                this.lblDescripcionFondoMes4.setText(llenarDescripcionMes(11));
                break;
            case 9:
                this.lblTextoFondoMes1.setText("Setiembre:");
                this.lblDescripcionFondoMes1.setText(llenarDescripcionMes(9));
                this.lblTextoFondoMes2.setText("Octubre:");
                this.lblDescripcionFondoMes2.setText(llenarDescripcionMes(10));
                this.lblTextoFondoMes3.setText("Noviembre:");
                this.lblDescripcionFondoMes3.setText(llenarDescripcionMes(11));
                this.lblTextoFondoMes4.setText("Diciembre:");
                this.lblDescripcionFondoMes4.setText(llenarDescripcionMes(12));
                break;
            case 10:
                this.lblTextoFondoMes1.setText("Octubre:");
                this.lblDescripcionFondoMes1.setText(llenarDescripcionMes(10));
                this.lblTextoFondoMes2.setText("Noviembre:");
                this.lblDescripcionFondoMes2.setText(llenarDescripcionMes(11));
                this.lblTextoFondoMes3.setText("Diciembre:");
                this.lblDescripcionFondoMes3.setText(llenarDescripcionMes(12));
                this.lblTextoFondoMes4.setText("Enero:");
                this.lblDescripcionFondoMes4.setText(llenarDescripcionMes(1));
                break;
            case 11:
                this.lblTextoFondoMes1.setText("Noviembre:");
                this.lblDescripcionFondoMes1.setText(llenarDescripcionMes(11));
                this.lblTextoFondoMes2.setText("Diciembre:");
                this.lblDescripcionFondoMes2.setText(llenarDescripcionMes(12));
                this.lblTextoFondoMes3.setText("Enero:");
                this.lblDescripcionFondoMes3.setText(llenarDescripcionMes(1));
                this.lblTextoFondoMes4.setText("Febrero:");
                this.lblDescripcionFondoMes4.setText(llenarDescripcionMes(2));
                break;
            default:
                this.lblTextoFondoMes1.setText("Diciembre:");
                this.lblDescripcionFondoMes1.setText(llenarDescripcionMes(12));
                this.lblTextoFondoMes2.setText("Enero:");
                this.lblDescripcionFondoMes2.setText(llenarDescripcionMes(1));
                this.lblTextoFondoMes3.setText("Febrero:");
                this.lblDescripcionFondoMes3.setText(llenarDescripcionMes(2));
                this.lblTextoFondoMes4.setText("Marzo:");
                this.lblDescripcionFondoMes4.setText(llenarDescripcionMes(3));
                break;
        }
    }
     
    public String llenarDescripcionMes(int mes){
        switch(mes){
            case 1: return "Compra de casitas";
            case 2: return "Campaña de desparacitación";
            case 3: return "Campaña de adopción";
            case 4: return "Compra de mantas para el frio";
            case 5: return "Campaña de vacunación";
            case 6: return "Refugio de mascotas abandonadas";
            case 7: return "Campaña de desparacitación";
            case 8: return "Campaña concientisación de la responsablilidad de tener una mascota";
            case 9: return "Campaña de estirilización";
            case 10: return "Compra de alimento";
            case 11: return "Compra de medicamentos";
            default: return "Implementación de vevederos en los parques principales";
        }
    }
    
    public void buscar(){
        modeloTabla.setRowCount(0);
        i = new String[7];
        for (Multa multa : BetaTester.multas) {
            if (multa.getDatosCadena().toLowerCase()
                    .contains(txtBuscar.getText().toLowerCase())) {
                Object[] rowData = {multa.getCodigoMulta(),
                    multa.getDueño().getTipoDoc(),
                    multa.getDueño().getNumDoc(),
                    multa.getMonto(), multa.getFechaGenerada(),
                    multa.getFechaVencimiento(), multa.getEstado()};
                modeloTabla.addRow(rowData);
            }
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
            java.util.logging.Logger.getLogger(JFrameMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcionFondoMes1;
    private javax.swing.JLabel lblDescripcionFondoMes2;
    private javax.swing.JLabel lblDescripcionFondoMes3;
    private javax.swing.JLabel lblDescripcionFondoMes4;
    private javax.swing.JLabel lblTextoFondoMes1;
    private javax.swing.JLabel lblTextoFondoMes2;
    private javax.swing.JLabel lblTextoFondoMes3;
    private javax.swing.JLabel lblTextoFondoMes4;
    private javax.swing.JLabel lblTextoFondoMulta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbMultas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
