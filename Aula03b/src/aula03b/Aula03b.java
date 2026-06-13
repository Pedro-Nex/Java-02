/**
 * Nesse programa vamos estudar a estrutura de decisão if
 */
package aula03b;
import javax.swing.JOptionPane;

public class Aula03b {

    public static void main(String[] args) {
        String tit = "Aula 3";
        String idadeStr = JOptionPane.showInputDialog(null, "Digite a sua Idade: ", tit, 3);
        
        int idade = Integer.parseInt(idadeStr);
        
        if (idade >= 18){
            JOptionPane.showMessageDialog(null, "Você é maior de idade.", tit, 1);
        } else {
            JOptionPane.showMessageDialog(null, "Você é menor de idade.", tit, 1);
        }
        System.out.println("Fim do Progrma.");
    } 
}