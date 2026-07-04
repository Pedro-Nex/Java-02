package aula06a;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aula06aExercicio1 {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<String>();
        String tit = "Sistema Tarefas!";
        String tarefa = "";
        do {
            tarefa = JOptionPane.showInputDialog(null, "Inclua uma Tarefa ou Digite 0 para encerrar: ", tit, 3);
             if (tarefa.equals("0")){
                break;
            };
            tarefas.add(tarefa);
        } while (true);
        System.out.println(tarefas);
        String tarefaConcluir = "";
        do {
            tarefaConcluir = JOptionPane.showInputDialog(null, tarefas + "\nDigite a tarefa que foi concluida: ", tit, 3);
            tarefas.remove(tarefaConcluir);
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja Confirmar a Conclusão da mais alguma tarefa?", tit, JOptionPane.YES_NO_OPTION, 3);
            if (resposta == 1){
                break;
            }
        } while (true);
        
        for (String tarefasFazer : tarefas){
            System.out.println("Tarefa: " + tarefasFazer);
        }
    }
}
