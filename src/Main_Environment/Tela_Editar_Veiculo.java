package Main_Environment;


public class Tela_Editar_Veiculo extends javax.swing.JFrame {

    private String Veiculo_Placa, Veiculo_Modelo, Email_Usuario_Logado;
    private float Veiculo_Quilometragem;
            
    public Tela_Editar_Veiculo(String Veiculo_Placa, String Veiculo_Modelo, float Veiculo_Quilometragem, String Email_Usuario_Logado) {
        initComponents();
        setVeiculo_Placa(Veiculo_Placa);
        setVeiculo_Modelo(Veiculo_Modelo);
        setVeiculo_Quilometragem(Veiculo_Quilometragem);
        setEmail_Usuario_Logado(Email_Usuario_Logado);
        DetailsUpdate();
    }
    
    public Tela_Editar_Veiculo() {
        initComponents();
    }
    
    public void DetailsUpdate() {
        //Colocar os valores iniciais no campos de placa e modelo
        this.Placa_Field.setText(this.Veiculo_Placa);
        this.Placa_Field.setEditable(false);
        this.Modelo_Field.setText(this.Veiculo_Modelo);
        this.Quilometragem_Field.setText(String.valueOf(this.Veiculo_Quilometragem));
    }

    public String getEmail_Usuario_Logado() {
        return Email_Usuario_Logado;
    }

    public void setEmail_Usuario_Logado(String Email_Usuario_Logado) {
        this.Email_Usuario_Logado = Email_Usuario_Logado;
    }
    
    public String getVeiculo_Placa() {
        return Veiculo_Placa;
    }

    public void setVeiculo_Placa(String Veiculo_Placa) {
        this.Veiculo_Placa = Veiculo_Placa;
    }

    public String getVeiculo_Modelo() {
        return Veiculo_Modelo;
    }

    public void setVeiculo_Modelo(String Veiculo_Modelo) {
        this.Veiculo_Modelo = Veiculo_Modelo;
    }

    public float getVeiculo_Quilometragem() {
        return Veiculo_Quilometragem;
    }

    public void setVeiculo_Quilometragem(float Veiculo_Quilometragem) {
        this.Veiculo_Quilometragem = Veiculo_Quilometragem;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Update_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        Voltar_Listar_Automoveis_Button = new javax.swing.JButton();
        Placa_Field = new javax.swing.JTextField();
        Modelo_Field = new javax.swing.JTextField();
        Quilometragem_Field = new javax.swing.JTextField();
        Placa_Label = new javax.swing.JLabel();
        Modelo_Label = new javax.swing.JLabel();
        Quilometragem_Label = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Update_Button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Update_Button.setText("Salvar");
        Update_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Update_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 90, 30));

        Delete_Button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Delete_Button.setText("Deletar");
        Delete_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Delete_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 550, 90, 30));

        Voltar_Listar_Automoveis_Button.setBorderPainted(false);
        Voltar_Listar_Automoveis_Button.setContentAreaFilled(false);
        Voltar_Listar_Automoveis_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltar_Listar_Automoveis_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar_Listar_Automoveis_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar_Listar_Automoveis_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, 60));
        getContentPane().add(Placa_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 160, -1));
        getContentPane().add(Modelo_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 160, -1));
        getContentPane().add(Quilometragem_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 160, -1));

        Placa_Label.setText("Placa");
        getContentPane().add(Placa_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 20));

        Modelo_Label.setText("Modelo");
        getContentPane().add(Modelo_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, 20));

        Quilometragem_Label.setText("Km");
        getContentPane().add(Quilometragem_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, 20));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Tela_Editar_Carro.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Voltar_Listar_Automoveis_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar_Listar_Automoveis_ButtonActionPerformed
        this.setVisible(false);
        Tela_Listar_Carros t_l_c = new Tela_Listar_Carros(Email_Usuario_Logado);
        t_l_c.setVisible(true);
    }//GEN-LAST:event_Voltar_Listar_Automoveis_ButtonActionPerformed

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonActionPerformed
        Conexao con = new Conexao();
        
        try {
            con.updateVeiculo(this.Modelo_Field.getText(), this.Placa_Field.getText(), getVeiculo_Quilometragem());
            
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
        
        this.setVisible(false);
        Tela_Listar_Carros t_l_c = new Tela_Listar_Carros(Email_Usuario_Logado);
        t_l_c.setVisible(true);
    }//GEN-LAST:event_Update_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        Conexao con = new Conexao();
        
        try {
            con.deleteVeiculo(this.Placa_Field.getText());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        this.setVisible(false);
        Tela_Listar_Carros t_l_c = new Tela_Listar_Carros(Email_Usuario_Logado);
        t_l_c.setVisible(true);
    }//GEN-LAST:event_Delete_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Editar_Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Editar_Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Editar_Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Editar_Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Editar_Veiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JTextField Modelo_Field;
    private javax.swing.JLabel Modelo_Label;
    private javax.swing.JTextField Placa_Field;
    private javax.swing.JLabel Placa_Label;
    private javax.swing.JTextField Quilometragem_Field;
    private javax.swing.JLabel Quilometragem_Label;
    private javax.swing.JButton Update_Button;
    private javax.swing.JButton Voltar_Listar_Automoveis_Button;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
