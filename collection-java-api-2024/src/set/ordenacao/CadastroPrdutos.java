package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroPrdutos {

    private Set<Produto> produtos = null;

    public CadastroPrdutos() {
        this.produtos = new HashSet<Produto>();
    }


    public void addProduto(int cod,String nome, double preco, int quantidade) {
        produtos.add(new Produto(cod, nome, preco, quantidade));
    }
    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<Produto>(produtos);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<Produto>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }
    public static void main(String[] args){
        CadastroPrdutos cadastro = new CadastroPrdutos();
        cadastro.addProduto(1, "Laranja", 0.3, 100);
        cadastro.addProduto(2, "Feijão", 4.0, 50);
        cadastro.addProduto(3, "Macarrão", 2.0, 200);
        cadastro.addProduto(4, "Batata", 1.5, 200);
        cadastro.addProduto(5, "Cebola", 0.8, 300);
        cadastro.addProduto(6, "Tomate", 0.5, 400);
        cadastro.addProduto(7, "Alface", 0.7, 100);
        cadastro.addProduto(8,"Café",4.5,10);
        cadastro.addProduto(9, "Arroz",3.9,150);
        System.out.println("Produtos por nome:");
        System.out.println(cadastro.exibirProdutoPorNome());
        System.out.println("Produtos por preço:");
        System.out.println(cadastro.exibirPorPreco());
    }
}
