/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author cg3023087
 */
public class Tela_Perfil extends javax.swing.JFrame {
    public String Email_Usuario_Logado;
    public String Nome_Usuario_Logado;
    
    public Tela_Perfil() {
        initComponents();
    }
    
    public Tela_Perfil(String Email_Usuario_Logado/*, String Nome_Usuario_Logado*/) {
        initComponents();
        this.Email_Usuario_Logado = Email_Usuario_Logado;
        this.Nome_Usuario_Logado = Nome_Usuario_Logado;
        
        this.Email_Label.setText(this.Email_Usuario_Logado);
        this.Nome_Label.setText(this.Nome_Usuario_Logado);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EditarP_Button = new javax.swing.JButton();
        AlterarS_Button = new javax.swing.JButton();
        Email_Label = new javax.swing.JLabel();
        Nome_Label = new javax.swing.JLabel();
        EcerrarSessão_Button = new javax.swing.JButton();
        Voltar_Button = new javax.swing.JButton();
        Tela_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EditarP_Button.setBorderPainted(false);
        EditarP_Button.setContentAreaFilled(false);
        EditarP_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditarP_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarP_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EditarP_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 130, 30));

        AlterarS_Button.setBorderPainted(false);
        AlterarS_Button.setContentAreaFilled(false);
        AlterarS_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(AlterarS_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 130, 40));

        Email_Label.setText("email");
        getContentPane().add(Email_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 120, 30));

        Nome_Label.setText("nome");
        getContentPane().add(Nome_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 120, 30));

        EcerrarSessão_Button.setBorderPainted(false);
        EcerrarSessão_Button.setContentAreaFilled(false);
        EcerrarSessão_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EcerrarSessão_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EcerrarSessão_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EcerrarSessão_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 160, 40));

        Voltar_Button.setBackground(new java.awt.Color(245, 245, 245));
        Voltar_Button.setBorderPainted(false);
        Voltar_Button.setContentAreaFilled(false);
        Voltar_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltar_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 40, 40));

        Tela_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Tela_Cadastro_Perfil.jpg"))); // NOI18N
        getContentPane().add(Tela_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Voltar_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar_ButtonActionPerformed
        this.setVisible(false);
        Tela_Listar_Carros t_l_c = new Tela_Listar_Carros(Email_Usuario_Logado);
        t_l_c.setVisible(true);
    }//GEN-LAST:event_Voltar_ButtonActionPerformed

    private void EditarP_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarP_ButtonActionPerformed
        this.setVisible(false);
        Tela_Cadastro_Usuario t_c_u = new Tela_Cadastro_Usuario();
        t_c_u.setVisible(true);
    }//GEN-LAST:event_EditarP_ButtonActionPerformed

    private void EcerrarSessão_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EcerrarSessão_ButtonActionPerformed
        this.setVisible(false);
        Tela_Login t_l = new Tela_Login();
        t_l.setVisible(true);
    }//GEN-LAST:event_EcerrarSessão_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarS_Button;
    private javax.swing.JButton EcerrarSessão_Button;
    private javax.swing.JButton EditarP_Button;
    private javax.swing.JLabel Email_Label;
    private javax.swing.JLabel Nome_Label;
    private javax.swing.JLabel Tela_Background;
    private javax.swing.JButton Voltar_Button;
    // End of variables declaration//GEN-END:variables
}
