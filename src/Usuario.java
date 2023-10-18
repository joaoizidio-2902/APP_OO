
import javax.swing.ImageIcon;


public class Usuario {

    private int id_usuario;
    private String nome_usuario;
    private int tipo_usuario;
    private String sobrenome_usuario;
    private String email_usuario;
    private String telefone_usuario;
    private String cpf_usuario;
    private String senha_usuario;
    //ImageIcon Foto_Pessoa;

    public Usuario(String nome_usuario, String email_usuario, String senha_usuario/*, ImageIcon Foto_Pessoa*/) {
        this.nome_usuario = nome_usuario;
        this.email_usuario = email_usuario;
        this.senha_usuario = senha_usuario;
        /*this.Foto_Pessoa = Foto_Pessoa;*/
    }

    /**
     * @return int return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return String return the nome_usuario
     */
    public String getNome_usuario() {
        return nome_usuario;
    }

    /**
     * @param nome_usuario the nome_usuario to set
     */
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    /**
     * @return int return the tipo_usuario
     */
    public int getTipo_usuario() {
        return tipo_usuario;
    }

    /**
     * @param tipo_usuario the tipo_usuario to set
     */
    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    /**
     * @return String return the sobrenome_usuario
     */
    public String getSobrenome_usuario() {
        return sobrenome_usuario;
    }

    /**
     * @param sobrenome_usuario the sobrenome_usuario to set
     */
    public void setSobrenome_usuario(String sobrenome_usuario) {
        this.sobrenome_usuario = sobrenome_usuario;
    }

    /**
     * @return String return the email_usuario
     */
    public String getEmail_usuario() {
        return email_usuario;
    }

    /**
     * @param email_usuario the email_usuario to set
     */
    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    /**
     * @return String return the telefone_usuario
     */
    public String getTelefone_usuario() {
        return telefone_usuario;
    }

    /**
     * @param telefone_usuario the telefone_usuario to set
     */
    public void setTelefone_usuario(String telefone_usuario) {
        this.telefone_usuario = telefone_usuario;
    }

    /**
     * @return String return the cpf_usuario
     */
    public String getCpf_usuario() {
        return cpf_usuario;
    }

    /**
     * @param cpf_usuario the cpf_usuario to set
     */
    public void setCpf_usuario(String cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

    /**
     * @return String return the senha_usuario
     */
    public String getSenha_usuario() {
        return senha_usuario;
    }

    /**
     * @param senha_usuario the senha_usuario to set
     */
    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

}