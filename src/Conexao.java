
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
            String url = "jdbc:mysql://localhost:3307/olheoleo?useSSL=false";
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

    public boolean Auth_Login(String Email, String Senha) throws SQLException {
        //Ligar conexao
        Enable_Connection();

        // ResultSet faz a consulta
        ResultSet rs = con.createStatement().executeQuery("select * from usuario where email_usuario like '" + Email + "'");

        //rs.next é necessario para ler primeira linha e as proximas
        rs.next();
        System.out.println("nome: " + rs.getString("nome_usuario"));

        if (rs.getString("senha_usuario").equals(Senha)) {
            System.out.println("Senha igual Senha digitada");
            con.close();
            return true;
        } else {
            System.out.println("Senha igual Senha digitada");
            con.close();
            return false;
        }

    }

    protected void Create_User(String Nome_Usuario, String Email_Usuario, String Senha_Usuario) throws SQLException {
        //Ligar conexao
        Enable_Connection();

        // ResultSet faz o insert
        String sql = "insert into usuario(nome_usuario, email_usuario, senha_usuario) values(?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, Nome_Usuario);
        pst.setString(2, Email_Usuario);
        pst.setString(3, Senha_Usuario);
        pst.execute();

        con.close();
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
                Tipo_Carro T_C = new Tipo_Carro(rs_Resultado.getString("veiculo_marca"), rs_Resultado.getString("veiculo_placa"), rs_Resultado.getString("veiculo_email_dono"));

                bd_Carros_Do_Usuario.add(T_C);
            }

        }

        con.close();

        return bd_Carros_Do_Usuario;
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
}
