/*
 * Nesse programa vamos estudar o uso da estrutura de repetição do...while
 */
package aula05a;
import javax.swing.JOptionPane;

public class Aula05a2 {
    public static void main(String[] args) {
        String tit = "Escola Pedro Neves";
        String nomeAluno = JOptionPane.showInputDialog(null, "Digite o nome do Aluno: ", tit, 3);
        double somaNotas = 0;
        double media = 0;
        int numeroNotas = 0;
        int resposta = 0;
        String conceito;
        do {
            String notaStr = JOptionPane.showInputDialog(null, "Digite a nota do Aluno: ", tit, 3);
            notaStr = notaStr.replace(",", ".");
            double nota = Double.parseDouble(notaStr);
            somaNotas += nota;
            numeroNotas++;
            resposta = JOptionPane.showConfirmDialog(null, "Deseja digitar outra nota? ", tit, JOptionPane.YES_NO_OPTION, 3);
        } while (resposta == JOptionPane.YES_OPTION);
        media = somaNotas / numeroNotas;
        if (media >= 50){
            conceito = "Aprovado!";
        } else {
            conceito = "Reprovado!";
        }
        String msg = "O aluno, " + nomeAluno + " foi " + conceito + " Média: " + String.format("%.1f", media);
        JOptionPane.showMessageDialog(null, msg, tit, 1);
    }
}
