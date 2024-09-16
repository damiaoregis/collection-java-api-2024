package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoque = new HashMap<Long, Produto>();

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
        Produto novo = new Produto(nome, quantidade, preco);
        estoque.put(cod, novo);
    }

    public void exibirProdutos() {
        System.out.println(estoque);
    }

    public double calcularValorEstoque() {
        double total = 0d;
        if (!estoque.isEmpty()) {
            for (Produto produto : estoque.values()) {
                total += produto.getQuantidade() * produto.getPreco();
            }
        }
        return total;
    }
    public Produto obterProdutMaisCaro(){
        Produto maisCaro = null;
        if (!estoque.isEmpty()) {
            double precoMaisCaro = Double.MIN_VALUE;
            for (Produto produto : estoque.values()) {
                if (produto.getPreco() > precoMaisCaro) {
                    precoMaisCaro = produto.getPreco();
                    maisCaro = produto;
                }
            }
        }
        return maisCaro;
    }
    public Produto obterProdutMaisBarato(){
        Produto maisBarato = null;
        if (!estoque.isEmpty()) {
            double precoMaisBarato = Double.MAX_VALUE;
            for (Produto produto : estoque.values()) {
                if (produto.getPreco() < precoMaisBarato) {
                    precoMaisBarato = produto.getPreco();
                    maisBarato = produto;
                }
            }
        }
        return maisBarato;
    }
    public Produto obterProdutoMaiorQuantidadeNoEstoque(){
        Produto produtoMaior = null;
        if (!estoque.isEmpty()) {
            int quantidadeMaior = Integer.MIN_VALUE;
            for (Produto produto : estoque.values()) {
                if (produto.getQuantidade() > quantidadeMaior) {
                    quantidadeMaior = produto.getQuantidade();
                    produtoMaior = produto;
                }
            }
        }
        return produtoMaior;
    }
    public Produto obterProdutoMenorQuantidadeNoEstoque(){
        Produto produtoMenor = null;
        if (!estoque.isEmpty()) {
            int quantidadeMenor = Integer.MAX_VALUE;
            for (Produto produto : estoque.values()) {
                if (produto.getQuantidade() < quantidadeMenor) {
                    quantidadeMenor = produto.getQuantidade();
                    produtoMenor = produto;
                }
            }
        }
        return produtoMenor;
    }
    public void removerProduto(Long cod) {
        estoque.remove(cod);
    }
    public void alterarQuantidade(Long cod, int quantidade) {
        Produto produto = estoque.get(cod);
        if (produto!= null) {
            produto.setQuantidade(quantidade);
        }
    }
    public void alterarPreco(Long cod, double preco) {
        Produto produto = estoque.get(cod);
        if (produto!= null) {
            produto.setPreco(preco);
        }
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(1L, "Notebook", 10, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 20.0);
        estoque.adicionarProduto(3L, "Teclado", 20, 50.0);

        System.out.println("Produtos no estoque:");
        estoque.exibirProdutos();

        System.out.println("\nValor total do estoque: " + estoque.calcularValorEstoque());

        System.out.println("\nProduto mais caro: " + estoque.obterProdutMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutMaisBarato());
    }
}
