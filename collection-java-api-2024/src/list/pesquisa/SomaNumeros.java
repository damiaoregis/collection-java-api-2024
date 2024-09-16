package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros;
    public SomaNumeros() {
        this.numeros = new ArrayList<Integer>();
    }
    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (int numero : numeros) {
                if (numero < menor) {
                    menor = numero;
                }
            }
            return menor;
        }else {
            throw new IllegalStateException("A lista está vazia");
        }
    }
    public int encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (int numero : numeros) {
                if (numero > maior) {
                    maior = numero;
                }
            }
            return maior;
        } else {
            throw new IllegalStateException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(110);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(12);
        somaNumeros.adicionarNumero(20);

        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        somaNumeros.exibirNumeros();
    }
}
