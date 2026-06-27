package aula05b;
import javax.swing.JOptionPane;

public class Aula05bExercicio {

    public static void main(String[] args) {
        String tit = "Média de Temperaturas!";
        int numeroTemp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de Temperaturas: ", tit, 3));
        double somaTemp, media;
        somaTemp = 0;
        media = 0;
        for (int i = 1; i <= numeroTemp; i++){
            double temp = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a " + i + "ª Temperatura: ", tit, 3));
            somaTemp += temp;
        }
        media = somaTemp / numeroTemp;
        JOptionPane.showMessageDialog(null, "A média foi: " + String.format("%.2f", media), tit, 1);
    }
}
