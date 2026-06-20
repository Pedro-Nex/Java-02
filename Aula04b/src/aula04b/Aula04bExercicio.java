package aula04b;
import javax.swing.JOptionPane;

public class Aula04bExercicio {
    public static void main(String[] args) {
        String tit = "Notas!";
        int contador = 1;
        double somaNotas = 0;
        double media = 0;
        String msg;
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do Aluno: ", tit, 1);

        while (true) {
            String notaStr = JOptionPane.showInputDialog(null, "Digite a " + contador + "° Nota (0 à 100): ", tit, 1);
            double nota = Double.parseDouble(notaStr); 
            somaNotas += nota;     
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja digitar outra nota? ", tit, JOptionPane.YES_NO_OPTION, 3);
            if (resposta == 1){
                media = somaNotas / contador;
                if (media >= 50){
                    msg = "O aluno, " + nome + ". Foi Aprovado. Média: " + String.format("%,.1f", media);
                    JOptionPane.showMessageDialog(null, msg, tit, 1);
                } else if (media < 50){
                    msg = "O aluno, " + nome + ". Foi Reprovado. Média: " + String.format("%,.1f", media);
                    JOptionPane.showMessageDialog(null, msg, tit, 1);
                }
                break;
            } else {
                contador++;
            }
        }
    }
}