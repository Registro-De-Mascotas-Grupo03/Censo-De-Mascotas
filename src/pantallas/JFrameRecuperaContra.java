/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import betatester.BetaTester;
import entidades.Usuario;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class JFrameRecuperaContra extends javax.swing.JFrame {

    private JFrameIngresar padre;
    private static String emailFrom = "tokiro.roma@gmail.com";
    private static String passwordFrom = "lnmulmaemgfrruab";
    private String emailTo;
    private String subject;
    private String content;

    private Properties mProperties;
    private Session mSession;
    private MimeMessage mCorreo;
    
    public JFrameRecuperaContra() {
        initComponents();
    }
    
    public JFrameRecuperaContra(JFrameIngresar padre) {
        initComponents();
        this.padre = padre;
        mProperties = new Properties();
    }
    
    private void createEmail() {

        emailTo = txtCorreo.getText().trim();
        subject = " OLVIDO SU CONTRASEÑA? ";
        content = "";

        Usuario usuario = buscarCorreo(emailTo);
        if (emailTo != null) {
            String contraseña = usuario.getContraseña();
            String mensaje = " \nSu contraseña es: " + contraseña;
            content = mensaje;
        }

        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user", emailFrom);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");

        mSession = Session.getDefaultInstance(mProperties);

        try {
            mCorreo = new MimeMessage(mSession);
            mCorreo.setFrom(new InternetAddress(emailFrom));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            mCorreo.setSubject(subject);
            mCorreo.setText(content, "ISO-8859-1", "html");

        } catch (AddressException ex) {
            Logger.getLogger(JFrameRecuperaContra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(JFrameRecuperaContra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sendEmail() {
        try {
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(emailFrom, passwordFrom);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();

            JOptionPane.showMessageDialog(null, "correo enviado");

        } catch (NoSuchProviderException ex) {
            Logger.getLogger(JFrameRecuperaContra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(JFrameRecuperaContra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private Usuario buscarCorreo(String correo) {

        for (Usuario usuario : BetaTester.usuarios) {
            if (correo.equals(usuario.getCorreoPersonal())) {

                return usuario;
            }
        }
        return null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblContraseña = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblLinea = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblTexto2 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 90, 33));

        lblContraseña.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        lblContraseña.setText("Recuperar Contraseña");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCorreo.setText("Correo Electronico");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        lblLinea.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblLinea.setText("__________________________________________");
        jPanel1.add(lblLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        lblTexto.setText("Para recuperar tu contraseña, ingresa el correo");
        jPanel1.add(lblTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 290, 30));

        lblTexto2.setText("Recibirás un código de verificación al correo.");
        jPanel1.add(lblTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        btnEnviar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.setBorder(null);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 100, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/patitas7 recuperaContra.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

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
        salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        createEmail();
        sendEmail();
    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameRecuperaContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameRecuperaContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameRecuperaContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameRecuperaContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameRecuperaContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblLinea;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
