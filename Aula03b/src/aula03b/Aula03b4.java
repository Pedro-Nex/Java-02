/*
 * 
 */
package aula03b;
import javax.swing.JOptionPane;

public class Aula03b4 {
    public static void main(String[] args) {
        String tit = "Escola Pedro Neves";
        String nomeAluno = JOptionPane.showInputDialog(null, " Digite o nome do aluno:", tit, 3);
        String mediaStr = JOptionPane.showInputDialog(null, " Digite a média do aluno:", tit, 3);
        
        double media = Double.parseDouble(mediaStr);
        String msg = "";
        
        if (media >= 9){
            msg = "O aluno " + nomeAluno + " foi aprovado com sucesso."; 
        } else if (media >= 6){
            msg = "O aluno " + nomeAluno + " foi aprovado.";
        } else if (media >= 4){
            msg = "O aluno " + nomeAluno + " ficou de recuperação.";
        } else {
            msg = "O aluno " + nomeAluno + " foi reprovado.";
        }
        
        JOptionPane.showMessageDialog(null, msg, tit, 1);
    }
}