package aula04b;
import javax.swing.JOptionPane;

public class Aula04b5 {
    public static void main(String[] args) {
        String tit = "Nomes Diverso!";

        String msg = "";

        while (true) {
            String nome = JOptionPane.showInputDialog(null, "Digite um nome: ", tit, 1);
            msg = msg + nome;
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja digitar outro nome? ", tit, JOptionPane.YES_NO_OPTION, 3);
            if (resposta == 1){
                msg = msg + ".";
                break;
            } else {
                msg = msg + ", ";
            }
        }
        JOptionPane.showMessageDialog(null, msg, "Nomes digitados!", 1);
    }
}
