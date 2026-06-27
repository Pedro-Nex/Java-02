package aula05b;
import javax.swing.JOptionPane;

public class Aula05b2 {
    public static void main(String[] args) {
        String tit = "Tabuada!";
        String nuStr = JOptionPane.showInputDialog(null, "Digite um número Interiro para Tabuada: ", tit, 3);
        int num = Integer.parseInt(nuStr);
        String msg = "";
        for (int i = 1; i <= 10; i++){
            int total = i * num;
            msg += num + " X " + i + " = " + total + "\n";
        }
        JOptionPane.showMessageDialog(null, msg, tit, 1);
    }
}
