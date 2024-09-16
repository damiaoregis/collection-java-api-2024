package list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrnacaoPessoas {
    private List<Pessoa>pessoas ;

    public OrnacaoPessoas() {
        this.pessoas = pessoas = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> resultado = new ArrayList<Pessoa>(pessoas);
        Collections.sort(resultado);
        return resultado;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> resultado = new ArrayList<Pessoa>(pessoas);
        Collections.sort(resultado, new ComparatorPorAutura());
        return resultado;
    }

    public static void main(String[] args) {
        OrnacaoPessoas ornacao = new OrnacaoPessoas();
        ornacao.adicionarPessoa("Alice", 25, 1.65);
        ornacao.adicionarPessoa("Bob", 30, 1.75);
        ornacao.adicionarPessoa("David", 28, 1.70);
        ornacao.adicionarPessoa("Eve", 22, 1.68);
        ornacao.adicionarPessoa("Frank", 27, 1.72);
        ornacao.adicionarPessoa("Grace", 23, 1.67);
        ornacao.adicionarPessoa("Henry", 21, 1.73);
        ornacao.adicionarPessoa("Isabella", 24, 1.69);
        ornacao.adicionarPessoa("Jack", 12, 1.56);
        ornacao.adicionarPessoa("Karen", 18, 1.64);
        ornacao.adicionarPessoa("Lisa", 5, 0.75);
        ornacao.adicionarPessoa("Charlie", 20, 1.80);

        List<Pessoa> pessoasOrdenadasPorIdade = ornacao.ordenarPorIdade();
        System.out.println("Ordenado por idade:");
        System.out.println(pessoasOrdenadasPorIdade);


        List<Pessoa> pessoasOrdenadasPorAltura = ornacao.ordenarPorAltura();
        System.out.println("\nOrdenado por altura:");
        System.out.println(pessoasOrdenadasPorAltura);
    }
}

