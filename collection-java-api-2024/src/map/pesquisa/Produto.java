package map.pesquisa;

import java.util.Comparator;
import java.util.Objects;

public class Produto {
        private String nome;
        private int quantidade;
        private double preco;
        public Produto(String nome, int quantidade , double preco) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
        @Override
        public String toString() {
            return "Produto{" +
                    ", nome='" + nome + '\'' +
                    ", preco=" + preco +
                    ", quantidade=" + quantidade +
                    '}';
        }

}
