package Main_Environment;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Conexao {

    Connection con = null;

    public Conexao() {
    }

    private void Enable_Connection() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/olheoleoteste?useSSL=false";
            String user = "admin";
            String password = "123456";

            con = DriverManager.getConnection(url, user, password);

            /*ResultSet rs = con.createStatement().executeQuery("select * from usuario");
            
            while(rs.next()){
                System.out.println("nome: " + rs.getString("nome_usuario"));
            }*/
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver nao encontrado");
        } catch (SQLException ex) {
            System.out.println("Falha na conexao: " + ex.getMessage());
        }
    }

    protected boolean Auth_Login(String Email, String Senha) throws SQLException {
        //Ligar conexao
        Enable_Connection();

        // ResultSet faz a consulta
        ResultSet rs = con.createStatement().executeQuery("select * from usuario where email_usuario like '" + Email + "'");

        //rs.next é necessario para ler primeira linha e as proximas
        rs.next();
        //System.out.println("nome: " + rs.getString("nome_usuario"));

        if (rs.getString("senha_usuario").equals(Senha)) {
            //System.out.println("Senha igual Senha digitada");
            con.close();
            return true;
        } else {
            //System.out.println("Senha igual Senha digitada");
            con.close();
            return false;
        }

    }

    protected String Create_User(String Nome_Usuario, String Email_Usuario, String Senha_Usuario) throws SQLException {
        //Ligar conexao
        Enable_Connection();

        // ResultSet faz o insert
        String sql = "insert into usuario(nome_usuario, email_usuario, senha_usuario) values(?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, Nome_Usuario);
        pst.setString(2, Email_Usuario);
        pst.setString(3, Senha_Usuario);
        pst.execute();
        
        /*
        Ver o conteudo que tem no pst
        
        String[] test = new String[6];
        test = pst.toString().split("\'");
        System.out.println(test[1]);
        System.out.println(test[3]);
        System.out.println(test[5]);
        */
        
        
        
        
        con.close();
        return pst.toString();
    }

    protected void Insert_Into_Table_Veiculo(String Marca, String Placa, float KM, String Email_Usuario) throws SQLException {
        //Ligar conexao
        Enable_Connection();

        // ResultSet faz a consulta
        String sql = "insert into veiculo(veiculo_marca, veiculo_placa, veiculo_km, veiculo_email_dono) values(?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, Marca);
        pst.setString(2, Placa);
        pst.setFloat(3, KM);
        pst.setString(4, Email_Usuario);
        pst.execute();

        con.close();
    }
    
    protected void Insert_Into_Table_Produto(String Nome, String Marca, float Preco, String Descricao, String Email_Usuario) throws SQLException {
        //Ligar conexao
        Enable_Connection();

        // ResultSet faz a consulta
        String sql = "insert into produto(produto_nome, produto_marca, produto_preco, produto_descricao) values(?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, Nome);
        pst.setString(2, Marca);
        pst.setFloat(3, Preco);
        pst.setString(4, Descricao);
        pst.execute();

        con.close();
    }

    protected ArrayList Listar_Carros(String Email_Usuario) throws SQLException {
        //Ligar conexao
        Enable_Connection();

        ResultSet rs_Resultado = con.createStatement().executeQuery("select * from veiculo where veiculo_email_dono like '" + Email_Usuario + "';");

        ArrayList<Tipo_Carro> bd_Carros_Do_Usuario = new ArrayList<Tipo_Carro>();

        while (rs_Resultado.next() != false) {

            if (rs_Resultado.getString("veiculo_email_dono").equals(Email_Usuario)) {
                Tipo_Carro t_c = new Tipo_Carro(rs_Resultado.getString("veiculo_marca"), rs_Resultado.getString("veiculo_placa"), rs_Resultado.getFloat("veiculo_km"), rs_Resultado.getString("veiculo_email_dono"));

                bd_Carros_Do_Usuario.add(t_c);
            }

        }

        con.close();

        return bd_Carros_Do_Usuario;
    }
    
    protected ArrayList Listar_Produtos() throws SQLException {
        //Ligar conexao
        Enable_Connection();

        //Fazer consulta
        ResultSet rs_Resultado = con.createStatement().executeQuery("select * from produto;");

        ArrayList<Tipo_Produto> bd_Produto = new ArrayList<Tipo_Produto>();

        while (rs_Resultado.next() != false) {

            
                Tipo_Produto t_p = new Tipo_Produto(rs_Resultado.getString("produto_nome"), rs_Resultado.getString("produto_marca"), rs_Resultado.getString("produto_descricao"), rs_Resultado.getFloat("produto_preco"));

                bd_Produto.add(t_p);

        }

        con.close();

        return bd_Produto;
    }

    protected String Tela_Perfil_Detalhes(String Email_Usuario) throws SQLException {
        //Ligar conexao
        Enable_Connection();

        //Pegar Dados
        ResultSet rs_Resultado = con.createStatement().executeQuery("select * from usuario where email_usuario like '" + Email_Usuario + "';");
        rs_Resultado.next();

        String Nome_Usuario = rs_Resultado.getString("nome_usuario");
        String Senha_Usuario = rs_Resultado.getString("senha_usuario");


        con.close();
        
        return Nome_Usuario + ";" + Senha_Usuario;
    }
    
    protected String Get_Nome_Usuario(String Email_Usuario) throws SQLException {
        //Ligar conexao
        Enable_Connection();

        //Pegar Dados
        ResultSet rs_Resultado = con.createStatement().executeQuery("select * from usuario where email_usuario like '" + Email_Usuario + "';");
        rs_Resultado.next();

        String Nome_Usuario = rs_Resultado.getString("nome_usuario");


        con.close();
        
        return Nome_Usuario;
    }
    
    protected void Update_Veiculo(String Modelo, String Placa, float KM) throws SQLException {
        //Ligar conexao
        Enable_Connection();

        // ResultSet faz a consulta
        String sql = "update veiculo set veiculo_marca = ?, veiculo_km = ? where veiculo_placa like ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, Modelo);
        pst.setFloat(2, KM);
        pst.setString(3, Placa);
        pst.executeUpdate();
        
        con.close();
    }
    
    protected void Delete_Veiculo(String Placa) throws SQLException {
        //Ligar conexao
        Enable_Connection();
        
        String sql = "delete from veiculo where veiculo_placa like ?;";
        PreparedStatement pst = con.prepareStatement(sql);
        System.out.println(Placa);
        pst.setString(1, Placa);
        System.out.println("aqui");
        pst.execute();
        
        con.close();
    }
}
