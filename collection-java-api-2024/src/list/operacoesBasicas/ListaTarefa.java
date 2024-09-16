package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
   private List<Tarefa> tarefaList;

   public ListaTarefa() {
      this.tarefaList = new ArrayList<>();
   }

   public void adicionarTarefa(String descricao) {

      this.tarefaList.add(new Tarefa(descricao));
   }

   public void removerTarefa(String descricao) {
      List <Tarefa> tarefaParaRemover = new ArrayList<>();
      for (Tarefa tarefa : tarefaList) {
         if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
            tarefaParaRemover.add(tarefa);
         }
      }
      tarefaList.removeAll(tarefaParaRemover);
   }

   public int obterNumeroTarefa() {
      return this.tarefaList.size();
   }

   public void obterDescricoesTarefas() {
      System.out.println(tarefaList);
   }

   public static void main(String[] args) {
      ListaTarefa lista = new ListaTarefa();
      lista.adicionarTarefa("Estudar Java");
      lista.adicionarTarefa("Comprar pão");
      lista.adicionarTarefa("Fazer exercícios");
      lista.obterDescricoesTarefas();
      lista.removerTarefa("Comprar pão");
      lista.obterDescricoesTarefas();
      System.out.println("Quantidade de tarefas: " + lista.obterNumeroTarefa());
   }
}
