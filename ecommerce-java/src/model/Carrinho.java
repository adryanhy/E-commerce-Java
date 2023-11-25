package model;
import exception.ProdutoNaoEncontradoException;
import java.util.ArrayList;
import java.util.List;


public class Carrinho {
    private List<Produto> listaProdutos;

    // Construtor
    public Carrinho() {
        this.listaProdutos = new ArrayList<>();
    }

    // Método para adicionar produto
    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    // Método para remover produto
    public void removerProduto(Produto produto) {
        int indice = listaProdutos.indexOf(produto);
        if (indice != -1) {
            listaProdutos.remove(indice);
        }
    }

    public void  ProdutoNaoEncontradoException(){
        System.out.println("Produto não encontrado no carrinho!");
    }


    // Método para listar produtos
    public void listarProdutos() {
        for (Produto produto : listaProdutos) {
            System.out.println(formatarProduto(produto));
        }
    }

    // Método privado para formatar o produto
    private String formatarProduto(Produto produto) {
        return "Produto {" +
                "Nome: '" + produto.getNome() + '\'' +
                ", Preço: " + produto.getPreco() +
                ", Descrição: '" + produto.getDescricao() + '\'' +
                '}';
    }


    // Método para calcular o total da compra
    public double calcularTotalCompra() {
        double total = 0;
        for (Produto produto : listaProdutos) {
            total += produto.getPreco();
        }
        return total;
    }

    // Método para aplicar desconto ao total da compra
    public double aplicarDesconto(double desconto) {
        double total = calcularTotalCompra();
        double descontoAplicado = total * desconto / 100;
        return total - descontoAplicado;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }



}