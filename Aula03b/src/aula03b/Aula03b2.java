/*
 * Nesse programa vamos estudar a estrutura de repetição if...else
 */
package aula03b;
import javax.swing.JOptionPane;

public class Aula03b2 {
    public static void main(String[] args) {
        String tit = "Sistema de RH";
        String salarioStr = JOptionPane.showInputDialog(null, "Digite o salário do funcionário:", tit, 3);
        
        double salario = Double.parseDouble(salarioStr);
        
        if(salario < 5000){
            salario = salario + (salario * 0.15);
        }else{
            salario = salario + (salario * 0.09);
        }
        JOptionPane.showMessageDialog(null, "Seu novo Salário é R$" + String.format("%,.2f", salario), tit, 1);
    }
}
