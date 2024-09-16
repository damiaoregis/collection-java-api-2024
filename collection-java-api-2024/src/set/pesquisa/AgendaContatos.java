package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void addcontato(String nome,int numero){
        this.contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
       for (Contato contato : contatoSet){
           System.out.println(contato.getNome() + " - " + contato.getNumero());
       }
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato contato : contatoSet){
            if (contato.getNome().startsWith(nome)){
                contatoPorNome.add(contato);
            }
        }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizar = null;
        for (Contato contato : contatoSet){
            if (contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizar = contato;
                break;
            }
        }
        return contatoAtualizar;
    }
    public static void main(String[] args){
        AgendaContatos agenda = new AgendaContatos();
        agenda.addcontato("Alice", 987654321);
        agenda.addcontato("Bob", 1234567890);
        agenda.addcontato("Charlie", 999999999);
        agenda.addcontato("David", 888888888);
        agenda.addcontato("Eve", 777777777);
        agenda.addcontato("Bob", 10101010);
        agenda.addcontato("David Lopes", 222222222);
        agenda.addcontato("Bob Parry",55555555);
        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Bob"));


        System.out.println("Atualizando número do contato 'Alice' para 555555555:");
        agenda.atualizarNumeroContato("Alice", 555555555);

        agenda.exibirContatos();
    }
}
