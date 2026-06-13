package aula03c;
import javax.swing.JOptionPane;

public class Aula03c3 {
    public static void main(String[] args) {
        double valorCompra = 1300;
        String formaPag = "PIX";
        
        if (valorCompra >= 1000 && formaPag.equalsIgnoreCase("PIX")){
            JOptionPane.showMessageDialog(null, "Parabéns! Você ganhou 15% de desconto.");
        } else if (valorCompra >= 1000 && formaPag.equalsIgnoreCase("CARTÃO")){
            JOptionPane.showMessageDialog(null, "Parabéns! Você ganhou 10% de desconto.");
        } else {
            JOptionPane.showMessageDialog(null, "Valor total R$" + String.format("%,2f", valorCompra));
        }
    }
}