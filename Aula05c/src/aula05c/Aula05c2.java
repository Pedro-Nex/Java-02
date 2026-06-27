package aula05c;
import javax.swing.JOptionPane;

public class Aula05c2 {
    public static void main(String[] args) {
        int numeroNotas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas notas deseja lançar", "Escola Pedro Neves.", 3));
        double[] notas = new double[numeroNotas];
        
        for (int i = 0; i < notas.length; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a " + (i + 1) + "ª Nota:", "Escola Pedro Neves", 3));
        }
        double somaNotas = 0;
        for (double nota : notas){
            System.out.println("Nota: " + nota);
            somaNotas += nota;
        }
        double media = somaNotas / notas.length;
        System.out.println("Media das notas: " + media);
    }
}
