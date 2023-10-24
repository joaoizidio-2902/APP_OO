
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;



public class Tela_Cadastro_Usuario extends javax.swing.JFrame {
     private ArrayList<Usuario> Banco_Dados_Usuario = new ArrayList<Usuario>();
     public ImageIcon image;
    
     
    public Tela_Cadastro_Usuario() {
        initComponents();
    }
    
    private void escrever_arquivo() throws IOException {

        String arquivo = "BancoDeDadosUsuarios.txt";
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(arquivo,/* StandardCharsets.ISO_8859_1,*/ true));
        for (int i = 0; i < this.Banco_Dados_Usuario.size(); i++) {
            String dados = this.Banco_Dados_Usuario.get(i).getNome_usuario() + ";" + this.Banco_Dados_Usuario.get(i).getEmail_usuario() + ";" + this.Banco_Dados_Usuario.get(i).getSenha_usuario();
            buffWrite.append(dados + "\n");
        }

        buffWrite.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Photo_Alter = new javax.swing.JButton();
        Continue_Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Name_Field = new javax.swing.JTextField();
        Email_Field = new javax.swing.JTextField();
        Password_Field = new javax.swing.JPasswordField();
        Confirm_Password_Field = new javax.swing.JPasswordField();
        Tela_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(370, 660));
        setSize(new java.awt.Dimension(375, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Photo_Alter.setBorderPainted(false);
        Photo_Alter.setContentAreaFilled(false);
        Photo_Alter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Photo_Alter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Photo_AlterActionPerformed(evt);
            }
        });
        getContentPane().add(Photo_Alter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 170, 40));

        Continue_Button.setBorderPainted(false);
        Continue_Button.setContentAreaFilled(false);
        Continue_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Continue_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Continue_ButtonMouseClicked(evt);
            }
        });
        Continue_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Continue_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Continue_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 170, 40));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 120, 130));

        Name_Field.setBackground(new java.awt.Color(245, 245, 245));
        Name_Field.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Name_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_FieldActionPerformed(evt);
            }
        });
        getContentPane().add(Name_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 280, 30));

        Email_Field.setBackground(new java.awt.Color(245, 245, 245));
        Email_Field.setMinimumSize(new java.awt.Dimension(500, 22));
        Email_Field.setPreferredSize(new java.awt.Dimension(500, 22));
        Email_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_FieldActionPerformed(evt);
            }
        });
        getContentPane().add(Email_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 280, 30));

        Password_Field.setBackground(new java.awt.Color(245, 245, 245));
        Password_Field.setPreferredSize(new java.awt.Dimension(64, 22));
        Password_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_FieldActionPerformed(evt);
            }
        });
        getContentPane().add(Password_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 280, 30));

        Confirm_Password_Field.setBackground(new java.awt.Color(245, 245, 245));
        Confirm_Password_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_Password_FieldActionPerformed(evt);
            }
        });
        getContentPane().add(Confirm_Password_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 512, 280, 30));

        Tela_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Tela_Cadastro_Usuario.jpg"))); // NOI18N
        Tela_Background.setRequestFocusEnabled(false);
        Tela_Background.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Tela_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Continue_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Continue_ButtonActionPerformed
        
        if (this.Password_Field.getText().equals(this.Confirm_Password_Field.getText())) {
            
            
            //Instanciar Usuario
            Usuario cadastro = new Usuario(this.Name_Field.getText(), this.Email_Field.getText(), this.Password_Field.getText()/*, this.image*/);

            //Adicionar no ArrayList
            this.Banco_Dados_Usuario.add(cadastro);
            try {
                //Escrever
                escrever_arquivo();
            } catch (Exception e) {
                System.out.println(e.getCause());
            }

            // Fechar janela
            this.setVisible(false);
            
            //Email de referencia para saber qual esta logado
            String Email_Usuario_Logado = this.Email_Field.getText();
            
            Tela_Perfil t_p = new Tela_Perfil(Email_Usuario_Logado);
            t_p.setVisible(true);
        }else System.out.println("senhas n batem");

    }//GEN-LAST:event_Continue_ButtonActionPerformed

    private void Password_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_FieldActionPerformed

    private void Email_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_FieldActionPerformed

    private void Name_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name_FieldActionPerformed

    Connection con;
    private void Continue_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Continue_ButtonMouseClicked
        String nome = Name_Field.getText();
        String email = Email_Field.getText();
        char[] senha = Password_Field.getPassword();
        char[] conf_senha = Confirm_Password_Field.getPassword();

        // Calcula o hash SHA-256 da senha
        String senhaHash = "";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] senhaBytes = md.digest(new String(senha).getBytes("UTF-8"));
            senhaHash = new String(Utils.hexRepresentation(senhaBytes));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException ex) {
            Logger.getLogger(Tela_Cadastro_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        String query = "INSERT INTO Usuario (nome_usuario, email_usuario, senha_usuario) VALUES (?, ?, ?)";
        PreparedStatement ps;

        try {
            con = Conexao.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement(query);

            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setString(3, senhaHash);
            ps.execute();

            con.commit();
            ps.close();

            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_Continue_ButtonMouseClicked

    private void Confirm_Password_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_Password_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Confirm_Password_FieldActionPerformed

    private void Photo_AlterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Photo_AlterActionPerformed
        try {
            String caminho_foto = "";
        
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showSaveDialog(chooser);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            caminho_foto = chooser.getSelectedFile().getAbsolutePath();
        }
        ImageIcon imagem = new ImageIcon(caminho_foto);
        this.jLabel2.setIcon(imagem);
        
        Image img = imagem.getImage();
        Image img_temp = img.getScaledInstance(this.jLabel2.getWidth(), this.jLabel2.getHeight(), java.awt.Image.SCALE_SMOOTH);
        
        imagem = new ImageIcon(img_temp);
        this.jLabel2.setIcon(imagem);
        this.image = imagem;
        
        
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Photo_AlterActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cadastro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tela_Cadastro_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Confirm_Password_Field;
    private javax.swing.JButton Continue_Button;
    private javax.swing.JTextField Email_Field;
    private javax.swing.JTextField Name_Field;
    private javax.swing.JPasswordField Password_Field;
    private javax.swing.JButton Photo_Alter;
    private javax.swing.JLabel Tela_Background;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
