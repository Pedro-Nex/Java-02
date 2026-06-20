/*
 * Nesse programa vamos estudar a estrutura de controle switch... case
 */
package aula04a;
import javax.swing.JOptionPane;

public class Aula04a {

    public static void main(String[] args) {
        String tit = "Menu do Sistema";
        String opcaoStr = JOptionPane.showInputDialog(null, "Digite uma opção (1, 2 ou 3):", tit, 1);
        
        int opcao = Integer.parseInt(opcaoStr);
        
        switch (opcao){
            case 1: JOptionPane.showMessageDialog(null, "Você escolheu a opção 1.", tit, 2);
            break;
            case 2: JOptionPane.showMessageDialog(null, "Você escolheu a opção 2.", tit, 2);
            break;
            case 3: JOptionPane.showMessageDialog(null, "Você escolheu a opção 3.", tit, 2);
            break;
            default: JOptionPane.showMessageDialog(null, "Você escolheu uma opção inválida.", tit, 2);
        }
    }
}