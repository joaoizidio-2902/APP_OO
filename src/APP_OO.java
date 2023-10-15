/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



/**
 *
 * @author joaoi
 */
public class APP_OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tela_Login t_l = new Tela_Login();
        /*
         * Tela_Perfil t_p = new Tela_Perfil();
         * Tela_Cadastro_Usuario t_c_u = new Tela_Cadastro_Usuario();
         * Tela_Listar_Carros t_l_c = new Tela_Listar_Carros();
         * Tela_Criar_Automovel t_c_a = new Tela_Criar_Automovel();
         */
        Tela_Cadastro_Usuario t_c_u = new Tela_Cadastro_Usuario();
        //t_c_u.setVisible(true);
        t_l.setVisible(true);

    }

}
