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

    private void enableConnection() {
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

    public boolean authLogin(String email, String senha) throws SQLException {
        //Ligar conexao
        enableConnection();

        try {
            // ResultSet faz a consulta
            ResultSet rs = con.createStatement().executeQuery("select * from usuario where email_usuario like '" + email + "'");

            //rs.next é necessario para ler primeira linha e as proximas
            rs.next();
            //System.out.println("nome: " + rs.getString("nome_usuario"));

            if (rs.getString("senha_usuario").equals(senha)) {
                //System.out.println("Senha igual Senha digitada");
                con.close();
                return true;
            } else {
                //System.out.println("Senha diferente Senha digitada");
                con.close();
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    public boolean createUser(String nomeUsuario, String emailUsuario, String senhaUsuario) throws SQLException {
        //Ligar conexao
        enableConnection();

        try {
            String sql = "insert into usuario(nome_usuario, email_usuario, senha_usuario) values(?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nomeUsuario);
            pst.setString(2, emailUsuario);
            pst.setString(3, senhaUsuario);
            boolean flag = pst.execute();
            /*
            Ver o conteudo que tem no pst
    
            String[] test = new String[6];
            test = pst.toString().split("\'");
            System.out.println(test[1]);
            System.out.println(test[3]);
            System.out.println(test[5]);
             */

            con.close();
            return flag;
        } catch (Exception e) {
            con.close();
            return true;
        }

    }

    public boolean insertIntoTableProduct(String nome, String marca, float preco, String descricao, String emailUsuario) throws SQLException {
        // Ligar conexão
        enableConnection();

        // ResultSet faz a consulta
        String sql = "insert into produto(produto_nome, produto_marca, produto_preco, produto_descricao) values(?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, nome);
        pst.setString(2, marca);
        pst.setFloat(3, preco);
        pst.setString(4, descricao);
        boolean flag = pst.execute();

        con.close();

        return flag;
    }

    public boolean insertIntoTableVeiculo(String marca, String placa, float km, String emailUsuario) throws SQLException {
        //Ligar conexao
        enableConnection();

        // ResultSet faz a consulta
        String sql = "insert into veiculo(veiculo_marca, veiculo_placa, veiculo_km, veiculo_email_dono) values(?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, marca);
        pst.setString(2, placa);
        pst.setFloat(3, km);
        pst.setString(4, emailUsuario);
        boolean flag = pst.execute();

        con.close();

        return flag;
    }

    public ArrayList listCars(String emailUsuario) throws SQLException {
        // Ligar conexão
        enableConnection();

        ResultSet rsResultado = con.createStatement().executeQuery("select * from veiculo where veiculo_email_dono like '" + emailUsuario + "';");

        ArrayList<Tipo_Carro> bdCarrosDoUsuario = new ArrayList<>();

        while (rsResultado.next() != false) {

            if (rsResultado.getString("veiculo_email_dono").equals(emailUsuario)) {
                Tipo_Carro tc = new Tipo_Carro(rsResultado.getString("veiculo_marca"), rsResultado.getString("veiculo_placa"), rsResultado.getFloat("veiculo_km"), rsResultado.getString("veiculo_email_dono"));

                bdCarrosDoUsuario.add(tc);
            }

        }

        con.close();

        return bdCarrosDoUsuario;
    }

    public ArrayList listProduct() throws SQLException {
        // Ligar conexão
        enableConnection();

        // Fazer consulta
        ResultSet rsResultado = con.createStatement().executeQuery("select * from produto;");

        ArrayList<Tipo_Produto> bdProduto = new ArrayList<>();

        while (rsResultado.next() != false) {
            Tipo_Produto tp = new Tipo_Produto(rsResultado.getString("produto_nome"), rsResultado.getString("produto_marca"), rsResultado.getString("produto_descricao"), rsResultado.getFloat("produto_preco"));

            bdProduto.add(tp);
        }

        con.close();

        return bdProduto;
    }

    public String screenDetailsPerfil(String emailUsuario) throws SQLException {
        // Ligar conexão
        enableConnection();

        // Pegar Dados
        ResultSet rsResultado = con.createStatement().executeQuery("select * from usuario where email_usuario like '" + emailUsuario + "';");
        rsResultado.next();

        String nomeUsuario = rsResultado.getString("nome_usuario");
        String senhaUsuario = rsResultado.getString("senha_usuario");

        con.close();

        return nomeUsuario + ";" + senhaUsuario;
    }

    public String getUserName(String emailUsuario) throws SQLException {
        // Ligar conexão
        enableConnection();

        // Pegar Dados
        ResultSet rsResultado = con.createStatement().executeQuery("select * from usuario where email_usuario like '" + emailUsuario + "';");
        rsResultado.next();

        String nomeUsuario = rsResultado.getString("nome_usuario");

        con.close();

        return nomeUsuario;
    }

    public int updateVeiculo(String modelo, String placa, float km) throws SQLException {
        // Ligar conexão
        enableConnection();

        // ResultSet faz a consulta
        String sql = "update veiculo set veiculo_marca = ?, veiculo_km = ? where veiculo_placa like ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, modelo);
        pst.setFloat(2, km);
        pst.setString(3, placa);
        int flag = pst.executeUpdate();

        con.close();

        return flag;
    }

    public boolean deleteVeiculo(String placa) throws SQLException {
        // Ligar conexão
        enableConnection();

        String sql = "delete from veiculo where veiculo_placa like ?;";
        PreparedStatement pst = con.prepareStatement(sql);
        System.out.println(placa);
        pst.setString(1, placa);
        System.out.println("aqui");
        boolean flag = pst.execute();

        con.close();

        return flag;
    }
}
