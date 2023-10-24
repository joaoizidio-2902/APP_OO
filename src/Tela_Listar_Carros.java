
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author cg3023087
 */
public class Tela_Listar_Carros extends javax.swing.JFrame {
    private String Email_Usuario_Logado;
    
    public Tela_Listar_Carros() {
        initComponents();
        try {
            String caminho_foto = "vista-do-carro-3d.jpg";
            ImageIcon imagem = new ImageIcon(caminho_foto);
            this.Campo_Foto.setIcon(imagem);

            Image img = imagem.getImage();
            Image img_temp = img.getScaledInstance(this.Campo_Foto.getWidth(), this.Campo_Foto.getHeight(), java.awt.Image.SCALE_SMOOTH);

            imagem = new ImageIcon(img_temp);
            this.Campo_Foto.setIcon(imagem);
            //this. = imagem;

        } catch (Exception e) {
        }
    }

    public Tela_Listar_Carros(String Email_Usuario_Logado) {
        initComponents();
        this.Email_Usuario_Logado = Email_Usuario_Logado;

        try {
            String caminho_foto = "vista-do-carro-3d.jpg";
            ImageIcon imagem = new ImageIcon(caminho_foto);
            this.Campo_Foto.setIcon(imagem);

            Image img = imagem.getImage();
            Image img_temp = img.getScaledInstance(this.Campo_Foto.getWidth(), this.Campo_Foto.getHeight(), java.awt.Image.SCALE_SMOOTH);

            imagem = new ImageIcon(img_temp);
            this.Campo_Foto.setIcon(imagem);
            //this. = imagem;

        } catch (Exception e) {
        }
    }
    
    public String getEmail_Usuario_Logado() {
        return Email_Usuario_Logado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        IrPerfil_Button = new javax.swing.JButton();
        ProxCarro_Button = new javax.swing.JButton();
        Campo_Foto = new javax.swing.JLabel();
        AnteCarro_Button = new javax.swing.JButton();
        Tela_Background = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 70, 70));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        IrPerfil_Button.setBorderPainted(false);
        IrPerfil_Button.setContentAreaFilled(false);
        IrPerfil_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IrPerfil_Button.setFocusPainted(false);
        IrPerfil_Button.setFocusable(false);
        IrPerfil_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrPerfil_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(IrPerfil_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 50, 50));

        ProxCarro_Button.setBorderPainted(false);
        ProxCarro_Button.setContentAreaFilled(false);
        ProxCarro_Button.setFocusable(false);
        ProxCarro_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProxCarro_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ProxCarro_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 40, 30));
        getContentPane().add(Campo_Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 100, 90));

        AnteCarro_Button.setBorderPainted(false);
        AnteCarro_Button.setContentAreaFilled(false);
        AnteCarro_Button.setFocusable(false);
        getContentPane().add(AnteCarro_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 40, 30));

        Tela_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Tela_Cadastro_Listar_Carros.jpg"))); // NOI18N
        getContentPane().add(Tela_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 380, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Tela_Criar_Automovel t_c_a = new Tela_Criar_Automovel(getEmail_Usuario_Logado());
        t_c_a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ProxCarro_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProxCarro_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProxCarro_ButtonActionPerformed

    private void IrPerfil_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrPerfil_ButtonActionPerformed
        this.setVisible(false);
        Tela_Perfil t_f = new Tela_Perfil(getEmail_Usuario_Logado());
        t_f.setVisible(true);

    }//GEN-LAST:event_IrPerfil_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Listar_Carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Listar_Carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Listar_Carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Listar_Carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Listar_Carros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnteCarro_Button;
    private javax.swing.JLabel Campo_Foto;
    private javax.swing.JButton IrPerfil_Button;
    private javax.swing.JButton ProxCarro_Button;
    private javax.swing.JLabel Tela_Background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
