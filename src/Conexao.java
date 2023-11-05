
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

        // ResultSet faz a consulta
        String sql ="insert into usuario(id_usuario, nome_usuario, email_usuario, senha_usuario) values( 4, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, Nome_Usuario);
        pst.setString(2, Email_Usuario);
        pst.setString(3, Senha_Usuario);
        pst.execute();
        
        ResultSet rs_Resultado = con.createStatement().executeQuery("select * from usuario where email_usuario like '" + Email_Usuario + "'");
        rs_Resultado.next();
        System.out.println(rs_Resultado.getString("nome_usuario"));
        con.close();
    }
    
    protected void Create_Car(String Marca, String Placa, float KM) throws SQLException {
        //Ligar conexao
        Enable_Connection();

        // ResultSet faz a consulta
        String sql ="insert into veiculo(veiculo_id, veiculo_marca, veiculo_placa, veiculo_km) values( 4, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, Marca);
        pst.setString(2, Placa);
        pst.setFloat(3, KM);
        pst.execute();
        
        ResultSet rs_Resultado = con.createStatement().executeQuery("select * from veiculo where veiculo_marca like '" + Marca + "';");
        rs_Resultado.next();
        System.out.println(rs_Resultado.getString("veiculo_marca"));
        con.close();
    }

}
