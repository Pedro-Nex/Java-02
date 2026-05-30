/*
 * Nesse programa vamos explorar o JOpitionPane solicitando o nome, a idade o peso e a altura do usuário e calcular o seu indice de massa corporal.
 */
package aula02f;
import javax.swing.JOptionPane;

public class Aula02f {

    public static void main(String[] args) {
        String tit = "Índice de Massa Corporal (IMC) !!";
        String nome = JOptionPane.showInputDialog(null, "Digite o seu Nome: ", tit, 1);
        String stridade = JOptionPane.showInputDialog(null, "Digite a sua Idade: ", tit, 1);
        String strPeso = JOptionPane.showInputDialog(null, "Digite o seu Peso: ", tit, 1);
        String strAlt = JOptionPane.showInputDialog(null, "Digite a sua Altura: ", tit, 1);
        
        int idade = Integer.parseInt(stridade);
        double peso = Double.parseDouble(strPeso);
        double altura = Double.parseDouble(strAlt);
        
        double imc = peso / Math.pow(altura, 2);
        
        String msg = "Nome: " + nome.toUpperCase() + "\n";
        msg = msg + "Idade: " + idade + "\n";
        msg = msg + "Peso: " + peso + " quilos\n";
        msg = msg + "Altura: " + altura + " metros\n";
        msg = msg + "IMC: " + String.format("%.1f", imc);
        
        JOptionPane.showMessageDialog(null, msg, tit, 1);
    }
    
}
