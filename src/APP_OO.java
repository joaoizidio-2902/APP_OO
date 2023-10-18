
import java.util.ArrayList;

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
        ArrayList<Usuario> bd = new ArrayList<Usuario>();
        
        Tela_Login t_l = new Tela_Login();
        
        Tela_Cadastro_Usuario t_c_u = new Tela_Cadastro_Usuario();
        //t_c_u.setVisible(true);
        t_l.setVisible(true);

    }

}
