package aula04b;
import java.util.Random;
import javax.swing.JOptionPane;

public class Aula04b6 {
    public static void main(String[] args) {
        String tit = "Jogo de Adivinhação!";
        Random rd = new Random();
        int numSec = rd.nextInt(10)+1;
        int tenta;
        int tentaRest = 3;
        JOptionPane.showMessageDialog(null, "Você tem 3 tentativas para adivinha um número entre 1 e 10", tit, 1);
        while (tentaRest > 0){
            tenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu palpite: ", tit, 3));
            if (tenta == numSec){
                JOptionPane.showMessageDialog(null, "Você acertou! Número: " + numSec, tit, 1);
                break;
            } else if (tenta < numSec){
                JOptionPane.showMessageDialog(null, "O número secreto é maior.", tit, 1);
            } else {
                JOptionPane.showMessageDialog(null, "O número secreto é menor.", tit, 1);
            }
            tentaRest--;
            if (tentaRest > 0){
                JOptionPane.showMessageDialog(null, "Tente Novamente!", tit, 1);
                continue;
            } 
        }
        if (tentaRest == 0){
                JOptionPane.showMessageDialog(null, "PERDEU!! Você não conseguiu, seu BOLUDO! Número Secreto: " + numSec, tit, 1);         
        }
    }
}