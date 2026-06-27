package aula05b;
import javax.swing.JOptionPane;

public class Aula05b4 {
    public static void main(String[] args) {
        String tit = "Escola Pedro Neves";
        String nomeAluno = JOptionPane.showInputDialog(null, "Digite o nome do(a) aluno(a): ", tit, 3);
        int numeroNotas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de Notas: ", tit, 3));
        double somaNotas, media;
        somaNotas = 0;
        media = 0;
        for (int i = 1; i <= numeroNotas; i++){
            double nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a " + i + "ª Nota: ", tit, 3));
            somaNotas += nota;
        }
        media = somaNotas / numeroNotas;
        JOptionPane.showMessageDialog(null, "A média do aluno(a) " + nomeAluno + " foi: " + String.format("%.2f", media), tit, 1);
    }
}