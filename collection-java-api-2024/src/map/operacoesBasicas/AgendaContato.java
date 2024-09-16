package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContato;
    public AgendaContato() {
        this.agendaContato = new HashMap<>();
    }
    public void adicionarContato(String nome, int telefone) {
        this.agendaContato.put(nome, telefone);
    }
    public void removerContatoPorNome(String nome){
        if (!agendaContato.isEmpty()) {
            this.agendaContato.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContato);
    }
    public Integer pesquisarPorNome(String nome){
        Integer resultado = null;
        if (!agendaContato.isEmpty()) {
            resultado = agendaContato.get(nome);
        }
        return resultado;
    }
    public static void main(String[] args) {
        AgendaContato agenda = new AgendaContato();
        agenda.adicionarContato("Damian", 56566969);
        agenda.adicionarContato("Alice", 987654321);
        agenda.adicionarContato("Eve", 999999999);
        agenda.adicionarContato("Eve", 999998959);
        agenda.adicionarContato("Eve", 999995555);
        agenda.adicionarContato("Damian", 56565656);
        agenda.adicionarContato("Damian", 56561111);
        agenda.adicionarContato("Damian", 56562222);

        agenda.adicionarContato("Eduard", 363636363);
        agenda.adicionarContato("Bob", 123456789);
        agenda.adicionarContato("Damian", 56560000);
        agenda.exibirContatos();
        System.out.println("Telefone de Eve: " + agenda.pesquisarPorNome("Eve"));
        agenda.removerContatoPorNome("Damian");
        agenda.exibirContatos();
    }
}