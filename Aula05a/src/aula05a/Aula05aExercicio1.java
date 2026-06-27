package aula05a;

import javax.swing.JOptionPane;

public class Aula05aExercicio1 {

    public static void main(String[] args) {
        String tit = "Soma Números Decimais";
        double somaNumeros = 0;
        double numero = 0;

        do {
            String numeroD = JOptionPane.showInputDialog(null, "Digite um número Decimal ou 0 para encerrar: ", tit, 3);
            numeroD = numeroD.replace(",", ".");
            numero = Double.parseDouble(numeroD);
            somaNumeros += numero;
        } while (numero != 0);
        String msg;
        msg = "O total acumulado é: " + String.format("%.2f", somaNumeros);
        JOptionPane.showMessageDialog(null, msg, tit, 1);
    }
}
