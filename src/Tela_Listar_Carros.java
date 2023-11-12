
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    ArrayList<Tipo_Carro> bd_tipo_carro = new ArrayList<Tipo_Carro>();
    public int cont = 0;

    public Tela_Listar_Carros() {
        initComponents();
    }

    public Tela_Listar_Carros(String Email_Usuario_Logado) {
        initComponents();
        this.Email_Usuario_Logado = Email_Usuario_Logado;

        try {
            /*Colocar uma foto no Label
            
            String caminho_foto = "vista-do-carro-3d.jpg";
            ImageIcon imagem = new ImageIcon(caminho_foto);
            this.Campo_Foto.setIcon(imagem);

            Image img = imagem.getImage();
            Image img_temp = img.getScaledInstance(this.Campo_Foto.getWidth(), this.Campo_Foto.getHeight(), java.awt.Image.SCALE_SMOOTH);

            imagem = new ImageIcon(img_temp);
            this.Campo_Foto.setIcon(imagem);*/

            //Fazer conexao com banco de dados
            Conexao con = new Conexao();
            this.bd_tipo_carro = con.Listar_Carros(Email_Usuario_Logado);
            Atualizar_Informacoes();

        } catch (Exception e) {
        }
    }

    public void Atualizar_Informacoes() {
        //Colocar os valores iniciais no campos de placa e modelo
        this.Modelo_Field.setText(bd_tipo_carro.get(cont).getModelo_Carro());
        this.Placa_Field.setText(bd_tipo_carro.get(cont).getPlaca_Carro());
        this.Quilometragem_Field.setText(Float.toString(bd_tipo_carro.get(cont).getQuilometragem_Carro()));
    }

    public String getEmail_Usuario_Logado() {
        return Email_Usuario_Logado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IrAdicionarCarro_Button = new javax.swing.JButton();
        Modelo_Field = new javax.swing.JLabel();
        Placa_Field = new javax.swing.JLabel();
        Quilometragem_Field = new javax.swing.JLabel();
        IrPerfil_Button = new javax.swing.JButton();
        ProxCarro_Button = new javax.swing.JButton();
        AnteCarro_Button = new javax.swing.JButton();
        IrProdutos_Button = new javax.swing.JButton();
        Ir_Editar_Veiculo_Button = new javax.swing.JButton();
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

        IrAdicionarCarro_Button.setBorderPainted(false);
        IrAdicionarCarro_Button.setContentAreaFilled(false);
        IrAdicionarCarro_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IrAdicionarCarro_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrAdicionarCarro_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(IrAdicionarCarro_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 70, 70));

        Modelo_Field.setText("Modelo");
        getContentPane().add(Modelo_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 140, -1));

        Placa_Field.setText("Placa");
        getContentPane().add(Placa_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 150, -1));

        Quilometragem_Field.setText("Quilometragem");
        getContentPane().add(Quilometragem_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 150, -1));

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
        ProxCarro_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProxCarro_Button.setFocusable(false);
        ProxCarro_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProxCarro_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ProxCarro_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 40, 40));

        AnteCarro_Button.setBorderPainted(false);
        AnteCarro_Button.setContentAreaFilled(false);
        AnteCarro_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AnteCarro_Button.setFocusable(false);
        AnteCarro_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteCarro_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AnteCarro_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 40, 40));

        IrProdutos_Button.setBorderPainted(false);
        IrProdutos_Button.setContentAreaFilled(false);
        IrProdutos_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IrProdutos_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrProdutos_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(IrProdutos_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, 40));

        Ir_Editar_Veiculo_Button.setBorderPainted(false);
        Ir_Editar_Veiculo_Button.setContentAreaFilled(false);
        Ir_Editar_Veiculo_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ir_Editar_Veiculo_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ir_Editar_Veiculo_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Ir_Editar_Veiculo_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 250, 340));

        Tela_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Tela_Cadastro_Listar_Carros.jpg"))); // NOI18N
        getContentPane().add(Tela_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IrAdicionarCarro_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrAdicionarCarro_ButtonActionPerformed
        this.setVisible(false);
        Tela_Criar_Automovel t_c_a = new Tela_Criar_Automovel(getEmail_Usuario_Logado());
        t_c_a.setVisible(true);
    }//GEN-LAST:event_IrAdicionarCarro_ButtonActionPerformed

    private void ProxCarro_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProxCarro_ButtonActionPerformed
        cont++;
        if (cont > bd_tipo_carro.size() - 1) {
            cont = 0;
        }
        Atualizar_Informacoes();
    }//GEN-LAST:event_ProxCarro_ButtonActionPerformed

    private void IrPerfil_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrPerfil_ButtonActionPerformed
        this.setVisible(false);
        Tela_Perfil t_f;

        try {
            t_f = new Tela_Perfil(getEmail_Usuario_Logado());
            t_f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Listar_Carros.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_IrPerfil_ButtonActionPerformed

    private void AnteCarro_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteCarro_ButtonActionPerformed
        cont--;
        if (cont < 0) {
            cont = bd_tipo_carro.size() - 1;
        }
        Atualizar_Informacoes();
    }//GEN-LAST:event_AnteCarro_ButtonActionPerformed

    private void IrProdutos_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrProdutos_ButtonActionPerformed
        this.setVisible(false);
        Tela_Listar_Produto t_l_p = new Tela_Listar_Produto(getEmail_Usuario_Logado());
        t_l_p.setVisible(true);
    }//GEN-LAST:event_IrProdutos_ButtonActionPerformed

    private void Ir_Editar_Veiculo_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ir_Editar_Veiculo_ButtonActionPerformed

        try {

            Tela_Editar_Veiculo t_e_v = new Tela_Editar_Veiculo(
                    this.Placa_Field.getText(),
                    this.Modelo_Field.getText(),
                    Float.parseFloat(this.Quilometragem_Field.getText()),
                    this.Email_Usuario_Logado
            );
            this.setVisible(false);
            t_e_v.setVisible(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_Ir_Editar_Veiculo_ButtonActionPerformed

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

    /*public void LerArquivo() throws IOException {
        try {
            String EnderecoArquivo = "BancoDeDadosCarros.txt";

            // Criar instacia Array
            ArrayList<Tipo_Carro> bd = new ArrayList<Tipo_Carro>();

            // Importar Arquivo
            BufferedReader buffRead = new BufferedReader(new FileReader(EnderecoArquivo, StandardCharsets.ISO_8859_1));

            // Ler arquivo
            String linha = buffRead.readLine();
            //linha = buffRead.readLine();

            while (linha != null) {
                //System.out.println(linha);

                // Separar
                // Armazenar no vetor
                String Informacoes_cadastro[] = new String[4];
                System.out.println(linha);
                Informacoes_cadastro = linha.split(";"); //usando o espaço como separador

                /*Mostrar dados separados
            for (int i = 0; i < 23; i++) {
                System.out.println(Informacoes_cadastro[i]);
                
            }
                System.out.println(getEmail_Usuario_Logado().equals(Informacoes_cadastro[3]));
                //if (getEmail_Usuario_Logado().equals(Informacoes_cadastro[3])) {
                // Instanciar o objeto
                Tipo_Carro cadastro = new Tipo_Carro(Informacoes_cadastro[0], Informacoes_cadastro[1], Informacoes_cadastro[2], getEmail_Usuario_Logado());

                // Acrescentar no Array
                bd.add(cadastro);
                //}

                linha = buffRead.readLine();

            }

            buffRead.close();

            bd_tipo_carro = bd;

        } catch (IOException e) {
            e.printStackTrace();
            ArrayList<Tipo_Carro> fbd = new ArrayList<Tipo_Carro>();
            System.out.println("erro listar carro");
        }
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnteCarro_Button;
    private javax.swing.JButton IrAdicionarCarro_Button;
    private javax.swing.JButton IrPerfil_Button;
    private javax.swing.JButton IrProdutos_Button;
    private javax.swing.JButton Ir_Editar_Veiculo_Button;
    private javax.swing.JLabel Modelo_Field;
    private javax.swing.JLabel Placa_Field;
    private javax.swing.JButton ProxCarro_Button;
    private javax.swing.JLabel Quilometragem_Field;
    private javax.swing.JLabel Tela_Background;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
