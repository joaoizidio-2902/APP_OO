
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaoi
 */

public class Conexao {
    public static Connection getConnection() throws SQLException {

        try {

            Class.forName("com.mysql.jbdc.Driver");

            String url = "jdbc:mysql://localhost:3306/aplicacao?useSSL=false";
            String user = "root";
            String password = "";

            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            throw new SQLException(ex.getMessage());
        }

    }

}