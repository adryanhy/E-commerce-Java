import model.Produto;
import exception.ProdutoNaoEncontradoException;
import model.Carrinho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ProdutoNaoEncontradoException {
        Produto produto = new Produto();
        Carrinho carrinho = new Carrinho();

        System.out.println("----Sistema de Ecommerce----\n");
        int opcao;
        do {
            System.out.println("\n\nMenu:");
            System.out.println("[1]. Adicionar produto ao carrinho");
            System.out.println("[2]. Remover produto do carrinho");
            System.out.println("[3]. Listar produtos no carrinho");
            System.out.println("[4]. Aplicar desconto");
            System.out.println("[5]. Calcular total da compra");
            System.out.println("[0]. Sair");
            System.out.print("\nEscolha uma opção: ");
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scannera

            List<Produto> produtos = new ArrayList<>();

            switch (opcao) {
                case 1:
                    // Adicionar produto ao carrinho
                    System.out.println("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite a descrição do produto: ");
                    String descricao = scanner.nextLine();
                    System.out.println("Digite o tamanho: ");
                    String tamanhoProduto = scanner.nextLine();
                    System.out.println("Digite a cor do produto: ");
                    String corProduto = scanner.nextLine();
                    System.out.println("Digite a marca do produto: ");
                    String marca = scanner.nextLine();
                    System.out.println("Digite o SKU do produto: ");
                    String skuProduto = scanner.nextLine();
                    System.out.println("Produto adicionado do carrinho!");
                    Produto novoProduto = new Produto(nome, preco, descricao,
                            tamanhoProduto, corProduto, marca, skuProduto);
                    carrinho.adicionarProduto(novoProduto);

                    break;
                case 2:

                    //Remover produto do carrinho
                    System.out.println("Digite o nome do produto a ser removido: ");
                    String nomeProdutoRemover = scanner.nextLine();

                    Produto produtoRemover = carrinho.getListaProdutos().stream()
                            .filter(p -> p.getNome().equalsIgnoreCase(nomeProdutoRemover))
                            .findFirst()
                            .orElse(null);

                    if (produtoRemover != null) {
                        carrinho.getListaProdutos().remove(produtoRemover);
                        System.out.println("Produto removido do carrinho! \n");
                    } else {
                        System.out.println("Produto não encontrado no carrinho \n.");
                    }

                    break;
                case 3:
                    // Listar produtos no carrinho
                    System.out.println("Produtos no carrinho:");
                    carrinho.listarProdutos();
                    break;
                case 4:
                    // Aplicar desconto
                    System.out.println("Digite o percentual do desconto: ");
                    double desconto = scanner.nextDouble();
                    double valorFinal = carrinho.aplicarDesconto(desconto);
                    System.out.println("O valor final da compra é: " + valorFinal);
                    break;
                case 5:
                    // Calcular total da compra
                    double totalCompra = carrinho.calcularTotalCompra();
                    System.out.println("O valor total da compra é: " + totalCompra);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;


            }
        } while (opcao != 0);
    }
}