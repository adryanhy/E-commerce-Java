package model;

// Classe Vestuario
public class Vestuario extends Produto {
    private String tamanho;
    private String cor;
    private String sku;

    private String marca;

    // Construtor
    public Vestuario(String nome, float preco, String descricao, String tamanho, String cor, String sku, String marca) {
        super(nome, preco, descricao, tamanho, cor, marca,sku);
        this.tamanho = tamanho;
        this.cor = cor;
        this.sku = sku;
        this.marca = marca;
    }

    public Vestuario() {

    }

    // Getters e Setters

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getSku(){
        return sku;
    }
    public void setSku(String sku){
        this.sku = sku;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Sobrescrita do Método toString
    @Override
    public String toString() {
        return "Vestuario{" +
                "nome='" + getNome() + '\'' +
                ", preco=" + getPreco() +
                ", descricao='" + getDescricao() + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}