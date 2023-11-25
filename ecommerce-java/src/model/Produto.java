package model;
import java.util.ArrayList;
import java.util.List;

// Classe Produto
public class Produto {
    private String nome;
    private double preco;
    private String descricao;
    private String tamanhoProduto;
    private String corProduto;
    private String marca;
    private String skuProduto;
    public List<Produto> produtos = new ArrayList<>();


    // Construtor
    public Produto (String nome, double preco, String descricao, String tamanhoProduto, String corProduto, String marca, String skuProduto) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.tamanhoProduto = tamanhoProduto;
        this.corProduto = corProduto;
        this.marca = marca;
        this.skuProduto = skuProduto;
    }


    public Produto() {

    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTamanhoProduto() {
        return tamanhoProduto;
    }

    public void setTamanhoProduto(String tamanhoProduto) {
        this.tamanhoProduto = tamanhoProduto;
    }

    public String getCorProduto() {
        return corProduto;
    }

    public void setCorProduto(String corProduto) {
        this.corProduto = corProduto;
    }

    public String getSkuProduto() {
        return skuProduto;
    }

    public void setSkuProduto(String skuProduto) {
        this.skuProduto = skuProduto;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca (String marca){
        this.marca = marca;
    }


    // Método toString
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

