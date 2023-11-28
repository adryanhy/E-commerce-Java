# Sistema de E-commerce  💻🛒 

Trabalho final da disciplina de POO (Programação Orientada a Objetos) orientada pelo professor Maromo. Este projeto trata-se de uma implementação básica de um sistema de e-commerce em Java, onde o usuário pode manejar produtos no carrinho de compras.

O sistema será desenvolvido utilizando os seguintes conceitos de POO:

- Classes: As classes serão utilizadas para representar os produtos e o carrinho de compras.
- Atributos: Os atributos serão utilizados para armazenar as informações sobre os produtos e o carrinho de compras.
- Métodos: Os métodos serão utilizados para realizar as operações sobre os produtos e o carrinho de compras.

## Índice

- [Integrantes do grupo](#integrantes-do-grupo)
- [Intruções](#instruções)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Vídeo demonstrativo](#vídeo-demonstrativo)


## Integrantes do grupo:
- Adryan André
- Bruno Ricardo
- Camila Emy
- Lucas Araujo
- Luana Ribeiro
- Tifanny Gomes

## Tecnologias
<p display="inline-block">
  <img width="48" src="https://user-images.githubusercontent.com/25181517/117201156-9a724800-adec-11eb-9a9d-3cd0f67da4bc.png" alt=""/>
  <img width="48" src="https://user-images.githubusercontent.com/25181517/192108890-200809d1-439c-4e23-90d3-b090cf9a4eea.png" alt=""/>
</p>


## Instruções

1. **Classe Produto**:
    - Atributos: nome, preço, descrição, tamanho, cor, marca, sku.
    - Métodos: getters, setters e **`toString()`**.

2. **Classe Vestuário**:
    - Herda de Produto.
    - Atributos: tamanho e cor.
    - Métodos: getters e setters para os novos atributos e sobrescreva o método **`toString()`**.
      
3. **Classe Carrinho**:
    - Atributos: lista de produtos selecionados para compra.
    - Métodos: adicionar produto, remover produto, listar produtos, aplicar desconto, calcular o total da compra.



## Estrutura do Projeto

Organização dos pacotes:

![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/e35acae4-0417-4e78-89c4-8394fd859a28)

model: 
Contém as classes Produto, Carrinho e Vestuário

![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/607a65ed-ef27-4faf-b777-5b5761038aa0)

### Classe Produto

Importanto bibliotecas:
```bash
package model;
import java.util.ArrayList;
import java.util.List;
```

Atributos da classe Produto:

![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/94c56c84-b76a-4b6f-b561-87d469de5f73)

Método construtor da classe Produto:

![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/2af6b0bc-5ae2-465a-881b-50fe3ad167f5)

Getters e Setter da classe Produto:
```bash
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
```

Método ToString:

![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/a67b4842-3425-4254-9a19-109b4be29e55)


### Classe Carrinho
Importando bibliotecas:
```bash
import exception.ProdutoNaoEncontradoException;
import java.util.ArrayList;
import java.util.List;
```

Atributo list da classe Carrinho:

![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/480cc15c-99bb-4023-b6d8-655da9afa9f9)

Método construtor: 

![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/9d282eb9-d67d-4670-8fe4-886648299610)

Método para adicionar produto ao carrinho:

![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/e9c4586d-8a9a-4d37-bbd7-f7bf2e5309e5)


### Resumo: Adiciona um produto ao carrinho de compras.

### Argumentos:

- produto: O produto a ser adicionado.
  
### Retorno:

Nenhum.

### Explicação:

O método `(adicionarProduto()` adiciona um produto à lista de produtos do carrinho de compras. O produto é passado como argumento para o método. Usa o método `add()` da classe `List` para adicionar o produto à lista.

![](https://i.imgur.com/waxVImv.png)

Método para remover produto do carrinho:

![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/a4614c82-1a89-4a8e-8a15-0094a5248141)


### Resumo: Remove um produto do carrinho de compras.

### Argumentos:

- produto: O produto a ser removido.
  
### Retorno:

Nenhum.

### Explicação:

O método `removerProduto()` remove um produto da lista de produtos do carrinho de compras. O produto é passado como argumento para o método. O método primeiro usa o método `indexOf()` da classe `List` para encontrar o índice do produto na lista. Se o índice for diferente de -1, o método usa o método `remove()` da classe `List` para remover o produto da lista.

![](https://i.imgur.com/waxVImv.png)

Método para listar produtos no carrinho

![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/71edb821-f9d5-41e0-b8bd-afe96e9ea25b)


### Resumo: Lista os produtos do carrinho de compras.

### Argumentos:

Nenhum.

### Retorno:

Nenhum.

### Explicação:

O método `listarProdutos()` lista os produtos do carrinho de compras. O método usa um `loop for` para iterar sobre a lista de produtos. Para cada produto na lista, o método usa o método `formatarProduto()` para formatar o produto para impressão.

![](https://i.imgur.com/waxVImv.png)

### Método para calcular o total da compra

![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/2a517204-aa2d-4de0-9311-ff6531142eea)

### Argumentos:

Nenhum.

### Retorno:

O valor total da compra.

### Explicação:

O método `calcularTotalCompra()` calcula o total da compra. O método usa um `loop for` para iterar sobre a lista de produtos. Para cada produto na lista, o método adiciona o preço do produto ao total.

![](https://i.imgur.com/waxVImv.png)

### Método para aplicar desconto

![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/1ed673af-288c-4c97-8e51-65d63ce023b0)

### Resumo: Aplica um desconto ao total da compra.

### Argumentos:

- desconto: O percentual do desconto a ser aplicado.
  
### Retorno:

O valor total da compra após o desconto ser aplicado.

### Explicação:

O método `aplicarDesconto()` aplica um desconto ao total da compra. O percentual do desconto é passado como argumento para o método. O método primeiro usa o método `calcularTotalCompra()` para calcular o total da compra. Em seguida, o método calcula o valor do desconto usando a seguinte fórmula:

```bash
descontoAplicado = total * desconto / 100
```


![](https://i.imgur.com/waxVImv.png)

## Classe Main


### Resumo:

Esta classe implementa um sistema de e-commerce básico. O sistema permite ao usuário adicionar, remover e listar produtos no carrinho de compras.

### Explicação:

A classe Main contém um menu que permite ao usuário escolher uma opção. As opções disponíveis são:

- Adicionar produto ao carrinho
- Remover produto do carrinho
- Listar produtos no carrinho
- Aplicar desconto
- Calcular total da compra
- Sair
  
Cada opção do menu chama um método correspondente para executar a ação desejada.

![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/64c0a9e6-89c0-480d-beb4-fdab892cb08f)

### Exemplo de uso:

- Para adicionar um produto ao carrinho, o usuário deve inserir o nome do produto, o preço, a descrição, o tamanho, a cor, a marca e o SKU do produto.

  ![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/4f830db6-e4c4-4c5c-8337-1fdc8f14ff7a)

- Para remover um produto do carrinho, o usuário deve inserir o nome do produto a ser removido.

  ![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/7c031b15-cda9-4e20-b9d4-b953dca0d9aa)

- Para listar os produtos no carrinho, o usuário deve selecionar a opção "Listar produtos no carrinho" no menu.

  ![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/f28ceae4-1bf6-43b7-8337-1cbd2e6642d8)

- Para aplicar um desconto, o usuário deve inserir o percentual do desconto a ser aplicado.

  ![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/fd874490-e377-4e69-8f01-3f672d0d0cdf)

- Para calcular o total da compra, o usuário deve selecionar a opção "Calcular total da compra" no menu.

  ![image](https://github.com/adryanhy/ProjetoPOO/assets/100885847/024f035e-abcf-46d4-a5a9-07552e566d46)

  Exemplo sem ter adicionado o desconto ao final da compra!



## Vídeo demonstrativo
(adicionar link do vídeo aqui)

## Instalação
```bash
git clone https://github.com/adryanhy/E-commerce-Java
```


## Contribuições
Contribuições são bem-vindas. Para contribuir, envie uma solicitação de pull request para o repositório do GitHub.
