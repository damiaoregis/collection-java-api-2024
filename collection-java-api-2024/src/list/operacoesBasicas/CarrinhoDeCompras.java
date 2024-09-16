package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public void adicionarItem(String name, double price, int quantity) {
        itens.add(new Item(name, price, quantity));
    }
    public double calcularValorTotal(){
        double total = 0;
        for (Item item : itens) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
    public void removeItem(String name) {
        List<Item> itemsParaRemover = new ArrayList<Item>();
        for (Item item : itens) {
            if (item.getName().equalsIgnoreCase(name)) {
                itemsParaRemover.add(item);
            }
        }
    }
    public void exibirItens(){
        for (Item item : itens) {
            System.out.println("Nome: " + item.getName() + ", Preço: " + item.getPrice() + ", Quantidade: " + item.getQuantity());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.itens = new ArrayList<Item>();
        carrinho.adicionarItem("Pão", 2.5, 3);
        carrinho.adicionarItem("Café", 1.5, 2);
        carrinho.adicionarItem("Batata", 2.0, 5);
        carrinho.adicionarItem("Leite", 1.5, 3);
        carrinho.adicionarItem("Carne", 5.0, 2);
        carrinho.adicionarItem("Tomate", 0.8, 10);
        carrinho.adicionarItem("Alface", 0.5, 8);
        carrinho.adicionarItem("Bolacha", 1.0, 6);
        carrinho.adicionarItem("Arroz", 3.0, 1);
        carrinho.adicionarItem("Feijão", 2.0, 4);



        System.out.println("Valor total do carrinho: " + carrinho.calcularValorTotal());

        carrinho.exibirItens();

        carrinho.removeItem("Pão");

        System.out.println("\nItens após remoção do pão:");
        carrinho.exibirItens();
    }
}
