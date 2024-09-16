package map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
    private Map<LocalDate, Evento>eventos;
    public AgendaEvento() {
        this.eventos = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventos.put(data, evento);
    }
    public void exibirAgendaEvento(){
        Map<LocalDate, Evento>eventosTreeMap = new TreeMap<>(eventos);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();// peguando a data atual
        LocalDate proximoData=null;
        Evento proximoEvento= null;
        Map<LocalDate, Evento>eventosTreeMap = new TreeMap<>(eventos);// organizando os eventos emm ordem crecente
        for (Map.Entry<LocalDate,Evento>entry:eventosTreeMap.entrySet()) {//obtendo as chaves e seus respectivos valores
            if (entry.getKey().isEqual(dataAtual)||entry.getKey().isAfter(dataAtual)) {
                proximoData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: "+ proximoEvento + "acontecera na data "+ proximoData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEvento agenda = new AgendaEvento();
        agenda.adicionarEvento(LocalDate.of(2024, 12, 15), "Cinema", "Star Wars");
        agenda.adicionarEvento(LocalDate.of(2024, 12, 17), "Teatro", "Era do Sol");
        agenda.adicionarEvento(LocalDate.of(2024, 12, 20), "Exposição", "Arte Contemporânea");
        agenda.exibirAgendaEvento();
        agenda.obterProximoEvento();
    }
}
