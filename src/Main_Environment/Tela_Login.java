package Main_Environment;


import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author joaoi
 */
public class Tela_Login extends javax.swing.JFrame {

    public Tela_Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Email_Field = new javax.swing.JTextField();
        Password_Field = new javax.swing.JPasswordField();
        Esqueceu_Conta_Button = new javax.swing.JButton();
        Criar_Conta_Button = new javax.swing.JButton();
        Login_Button = new javax.swing.JButton();
        Esqueceu_Senha_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Email_Field.setBackground(new java.awt.Color(245, 245, 245));
        Email_Field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Email_Field.setDisabledTextColor(new java.awt.Color(245, 245, 245));
        Email_Field.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Email_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_FieldActionPerformed(evt);
            }
        });
        getContentPane().add(Email_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 270, 30));

        Password_Field.setBackground(new java.awt.Color(245, 245, 245));
        Password_Field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Password_Field.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Password_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_FieldActionPerformed(evt);
            }
        });
        getContentPane().add(Password_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 270, 30));

        Esqueceu_Conta_Button.setBorderPainted(false);
        Esqueceu_Conta_Button.setContentAreaFilled(false);
        Esqueceu_Conta_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Esqueceu_Conta_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Esqueceu_Conta_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Esqueceu_Conta_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 130, 20));

        Criar_Conta_Button.setBorderPainted(false);
        Criar_Conta_Button.setContentAreaFilled(false);
        Criar_Conta_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Criar_Conta_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Criar_Conta_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Criar_Conta_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 90, 20));

        Login_Button.setBorderPainted(false);
        Login_Button.setContentAreaFilled(false);
        Login_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Login_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 140, 50));

        Esqueceu_Senha_Button.setBorderPainted(false);
        Esqueceu_Senha_Button.setContentAreaFilled(false);
        Esqueceu_Senha_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Esqueceu_Senha_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Esqueceu_Senha_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Esqueceu_Senha_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 180, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Tela_Login.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(375, 844));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Email_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_FieldActionPerformed

    private void Criar_Conta_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Criar_Conta_ButtonActionPerformed
        this.setVisible(false);
        Tela_Cadastro_Usuario t_c_a = new Tela_Cadastro_Usuario();
        t_c_a.setVisible(true);

    }//GEN-LAST:event_Criar_Conta_ButtonActionPerformed

    private void Password_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_FieldActionPerformed

    private void Esqueceu_Senha_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Esqueceu_Senha_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Esqueceu_Senha_ButtonActionPerformed

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        Conexao con = new Conexao();
        try {
            if (con.authLogin(this.Email_Field.getText(), this.Password_Field.getText()) == true) {
                this.setVisible(false);
                Tela_Listar_Carros t_l_c = new Tela_Listar_Carros(this.Email_Field.getText());
                t_l_c.setVisible(true);
            }else{
                System.out.println("aqui");
                Tela_De_Notificacao t_n = new Tela_De_Notificacao("Email ou Senha estao incorretos");
                t_n.setVisible(true);
            }

        } catch (SQLException ex) {
            System.out.println("mensagem na tela de login: " + ex.getMessage());
        }

        /*try {
            String Nome_Arquivo = "BancoDeDadosUsuarios.txt";
            BufferedReader Linha_Lida = new BufferedReader(new FileReader(Nome_Arquivo));
            String Detalhes_Usuarios[] = new String[3];

            while ((Linha_Lida.readLine()) != null) {
            Detalhes_Usuarios = Linha_Lida.readLine().split(";");
            if (this.Email_Field.getText().equals(Detalhes_Usuarios[1]) && this.Password_Field.getText().equals(Detalhes_Usuarios[2])) {
            this.setVisible(false);
            Tela_Listar_Carros t_l_c = new Tela_Listar_Carros(this.Email_Field.getText());
            t_l_c.setVisible(true); 
            }
            }
            } catch (Exception e) {
            }*/

    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void Esqueceu_Conta_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Esqueceu_Conta_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Esqueceu_Conta_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tela_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Criar_Conta_Button;
    private javax.swing.JTextField Email_Field;
    private javax.swing.JButton Esqueceu_Conta_Button;
    private javax.swing.JButton Esqueceu_Senha_Button;
    private javax.swing.JButton Login_Button;
    private javax.swing.JPasswordField Password_Field;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
