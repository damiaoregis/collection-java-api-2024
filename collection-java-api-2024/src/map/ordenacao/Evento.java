package map.ordenacao;

public class Evento {
    private String nomeDoEvento;
    private String nomeDaAtracao;
    public Evento(String nomeDoEvento, String nomeDaAtracao) {
        this.nomeDoEvento = nomeDoEvento;
        this.nomeDaAtracao = nomeDaAtracao;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public void setNomeDoEvento(String nomeDoEvento) {
        this.nomeDoEvento = nomeDoEvento;
    }

    public String getNomeDaAtracao() {
        return nomeDaAtracao;
    }

    public void setNomeDaAtracao(String nomeDaAtracao) {
        this.nomeDaAtracao = nomeDaAtracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nomeDoEvento='" + nomeDoEvento + '\'' +
                ", nomeDaAtracao='" + nomeDaAtracao + '\'' +
                '}';
    }
}
