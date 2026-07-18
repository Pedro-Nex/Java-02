/*
 * Nesse programa vamos fazer uma revisão do tratamento de exceção e depuração
 */
package aula07a;

import javax.swing.JOptionPane;

public class Aula07a {

    public static void main(String[] args) {
        double[] notas = new double[4];
        while (true) {
            try {
                for (int i = 0; i < notas.length; i++) {
                    String nota = JOptionPane.showInputDialog("Entre com a nota: ");
                    nota = nota.replace(",", ".");
                    notas[i] = Double.parseDouble(nota);
                }
                double somaNotas = 0;
                for (int i = 0; i < notas.length; i++) {
                    somaNotas += notas[i];
                }
                double media = somaNotas / notas.length;
                JOptionPane.showMessageDialog(null, "Média do aluno: " + media);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números.");
                JOptionPane.showMessageDialog(null, "Digite as notas novamente.");
            }
        }
    }
}
