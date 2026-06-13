package aula03c;
import javax.swing.JOptionPane;

public class Aula03c4 {
    public static void main(String[] args) {
        int idade = 15;
        String acompResp = "Sim";
        
        if (idade >= 18 || acompResp.equalsIgnoreCase("Sim")){
            JOptionPane.showMessageDialog(null, "Entrada Liberada.");
        } else {
            JOptionPane.showMessageDialog(null, "Entrada Bloqueada.");
        }
    }
}
