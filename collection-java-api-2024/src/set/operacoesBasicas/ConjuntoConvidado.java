package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado) {
        this.convidadoSet.add(new Convidado(nome, codigoConvidado));
    }
    public void remooverCovidadoPorCodigo(int codigoCovidado){
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite() == codigoCovidado) {
                convidadoParaRemover = convidado;
                break;
            }
            convidadoSet.remove(convidadoParaRemover);
        }
    }

    public int contarCovidado(){
        return this.convidadoSet.size();
    }
    public void exibirCovidados(){
        for (Convidado convidado : convidadoSet) {
            System.out.println("Nome: " + convidado.getNome() + ", Código do convite: " + convidado.getCodigoConvite());
        }
    }
    public static void main(String[] args) {
        ConjuntoConvidado conjunto = new ConjuntoConvidado();
        conjunto.adicionarConvidado("João", 1);
        conjunto.adicionarConvidado("Maria",5);
        conjunto.adicionarConvidado("Luís", 6);
        conjunto.adicionarConvidado("Ana", 5);
        conjunto.adicionarConvidado("José", 8);
        conjunto.adicionarConvidado("José", 4);
        conjunto.adicionarConvidado("José", 1);
        conjunto.adicionarConvidado("Maria", 2);
        conjunto.adicionarConvidado("Pedro", 3);

        conjunto.exibirCovidados();
        System.out.println("Quantidade de convidados: " + conjunto.contarCovidado());
        conjunto.remooverCovidadoPorCodigo(2);
        conjunto.exibirCovidados();
        System.out.println("Quantidade de convidados: " + conjunto.contarCovidado());
    }
}
