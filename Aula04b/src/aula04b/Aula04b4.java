package aula04b;
import javax.swing.JOptionPane;

public class Aula04b4 {
    public static void main(String[] args) {
        String tit = "Escola Pedro Neves!";
        String nomeAluno = JOptionPane.showInputDialog(null, "Digite o nome do Aluno: ", tit, 3);
        String disciplina = JOptionPane.showInputDialog(null, "Digite sua disciplina: ", tit, 3);
        int contador = 1;
        double somaNotas = 0;
        while (contador <= 4) {
            String notaStr = JOptionPane.showInputDialog(null, "Digite a nota do " + contador + "° Bimestre: ", tit, 3);
            notaStr = notaStr.replace(",", ".");
            double nota = Double.parseDouble(notaStr);
            if (nota < 0 || nota > 10){
                JOptionPane.showMessageDialog(null, "Digite uma nota de 0 à 10.", tit, 1);
                continue;
            }
            somaNotas += nota;
            contador++;
        }
        double media = somaNotas / 4;
        String conFinal;
        if (media >= 7){
            conFinal = "Aprovado!";
        } else if (media >= 4){
            conFinal = "Recuperação!";
        } else {
            conFinal = "Reprovado!";
        }
        String msg = "O aluno: " + nomeAluno + "\n";
        msg = msg + "Obteve a média: " + String.format("%.1f", media) + "\n";
        msg = msg + "Na disciplina: " + disciplina + "\n";
        msg = msg + "Seu conceito final foi: " + conFinal;
        
        JOptionPane.showMessageDialog(null, msg, tit, 1);
    }
}