import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        tarefas.add(novaTarefa);
    }
    public void removerTarefa(String descricao) {
        tarefas.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }
    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public Collection<String> obterDescricaoTarefas() {
        return tarefas.stream()
                      .map(Tarefa::getDescricao)
                      .toList();
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer compras");

        System.out.println("Total de tarefas: " + lista.obterNumeroTotalTarefas());
        System.out.println("Descrições das tarefas: " + lista.obterDescricaoTarefas());

        lista.removerTarefa("Estudar Java");
        System.out.println("Total de tarefas após remoção: " + lista.obterNumeroTotalTarefas());
    }

}
