/*
 * Nesse progrma vamos estudar a importação de bibliotecas Java e o uso da biblioteca JOptionPane
 * O -1 - Vaizo
 * O 0 - X 
 * O 1 - !
 * O 2 - ! (triangular)
 * 0 3 - ?
 */
package aula02e;
import javax.swing.JOptionPane;

public class Aula02e {
    public static void main(String[] args) {
        String titulo = "Curso de Java!";
        JOptionPane.showMessageDialog(null, "Olá Mundo!", titulo, 1);
        
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do Aluno: ", titulo, 3);
        JOptionPane.showMessageDialog(null, "Olá, " + nome, titulo, 1);
        
        String strNota1 = JOptionPane.showInputDialog(null, "Digite a 1° Nota do Aluno: ", titulo, 2);
        String strNota2 = JOptionPane.showInputDialog(null, "Digite a 2° Nota do Aluno: ", titulo, 2);
        String strNota3 = JOptionPane.showInputDialog(null, "Digite a 3° Nota do Aluno: ", titulo, 2);
        
        double nota1 = Double.parseDouble(strNota1);
        double nota2 = Double.parseDouble(strNota2);
        double nota3 = Double.parseDouble(strNota3);
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        String msg = String.format("O aluno %s obteve a média %,.1f nas avaliações.", nome, media);
        
        JOptionPane.showMessageDialog(null, msg, titulo, 1);
    }
}