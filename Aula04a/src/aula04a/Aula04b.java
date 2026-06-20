/*
 * Nesse programa vamos continuar explorando a estrutura de controle switch... case
 */
package aula04a;
import javax.swing.JOptionPane;

public class Aula04b {
    public static void main(String[] args) {
        String tit = "Escola Pedro Neves";
        String nota = JOptionPane.showInputDialog(null, "Digite a nota do aluno:", tit, 3);
        
        nota = nota.toUpperCase();
                
        switch (nota){
            case "A":
            case "B":
            case "C": JOptionPane.showMessageDialog(null, "O aluno foi aprovado. Nota: " + nota, tit, 1);
            break;
            case "D": JOptionPane.showMessageDialog(null, "O aluno ficou de recuperação. Nota: " + nota, tit, 1);
            break;
            case "E": JOptionPane.showMessageDialog(null, "O aluno foi reprovado. Nota: " + nota, tit, 1);  
            break;
            default: JOptionPane.showMessageDialog(null, "Nota digitada inválida.", tit, 1);          
        }
    }
}