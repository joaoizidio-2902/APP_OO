package Main_Environment;


public class Tipo_Produto {
    private String Nome_Produto, Marca_Produto, Descricao_Produto;
    private float Preco_Produto;
    
    public Tipo_Produto(String Nome_Produto, String Marca_Produto, String Descricao_Produto, float Preco_Produto) {
        this.Nome_Produto = Nome_Produto;
        this.Marca_Produto = Marca_Produto;
        this.Descricao_Produto = Descricao_Produto;
        this.Preco_Produto = Preco_Produto;
    }
    
    
    public String getNome_Produto() {
        return Nome_Produto;
    }

    public void setNome_Produto(String Nome_Produto) {
        this.Nome_Produto = Nome_Produto;
    }

    public String getMarca_Produto() {
        return Marca_Produto;
    }

    public void setMarca_Produto(String Marca_Produto) {
        this.Marca_Produto = Marca_Produto;
    }

    public String getDescricao_Produto() {
        return Descricao_Produto;
    }

    public void setDescricao_Produto(String Descricao_Produto) {
        this.Descricao_Produto = Descricao_Produto;
    }

    public float getPreco_Produto() {
        return Preco_Produto;
    }

    public void setPreco_Produto(float Preco_Produto) {
        this.Preco_Produto = Preco_Produto;
    }
    
    
    
}
