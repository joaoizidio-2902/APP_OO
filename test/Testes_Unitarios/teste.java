/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Testes_Unitarios;

import Main_Environment.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author caiol
 */
public class teste {
    
    public teste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testTrue_authLogin() throws SQLException {
        Conexao con = new Conexao();
        assertEquals(true, con.authLogin("joao@email.com", "senha123"));
    }
    
    @Test
    public void testFalseEmail_authLogin() throws SQLException {
        Conexao con = new Conexao();
        assertEquals(false, con.authLogin("joao@emil.com", "senha123"));
    }
    
    @Test
    public void testFalseSenha_authLogin() throws SQLException {
        Conexao con = new Conexao();
        assertEquals(false, con.authLogin("joao@email.com", "senha13"));
    }
    
    @Test
    public void testTrue_createUser() throws SQLException {
        Conexao con = new Conexao();
        Date dataAtual = new Date();
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataAtual);
        assertEquals(false, con.createUser("usuario" + hora, "joao"+ hora + "@email.com", "senha13"));
    }
    
    @Test
    public void testFalse_createUser() throws SQLException {
        Conexao con = new Conexao();
        Date dataAtual = new Date();
        assertEquals(true, con.createUser("usuario", "joao@email.com", "senha13"));
    }
    
    @Test
    public void testTrue_insertIntoTableProduct() throws SQLException {
        Conexao con = new Conexao();
        Date dataAtual = new Date();
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataAtual);
        assertEquals(false, con.insertIntoTableProduct("nomeProduto" + hora, "marcaProduto" + hora, 2, "descricaoProduto" + hora, "joao@email.com"));
    }
}
