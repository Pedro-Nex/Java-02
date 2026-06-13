package aula03c;
import javax.swing.JOptionPane;

public class Aula03cExercicio1 {
    public static void main(String[] args) {
        String tit = "Calculando Triangulo";
        String primeirLadoStr = JOptionPane.showInputDialog(null, "Digite o 1° lado:", tit, 1);
        String segundoLadoStr = JOptionPane.showInputDialog(null, "Digite o 2° lado:", tit, 1);
        String terceiroLadoStr = JOptionPane.showInputDialog(null, "Digite o 3° lado:", tit, 1);
        
        double primeiroL = Double.parseDouble(primeirLadoStr);
        double segundoL = Double.parseDouble(segundoLadoStr);
        double terceiroL = Double.parseDouble(terceiroLadoStr);
        
        if ((primeiroL + segundoL <= terceiroL) && (primeiroL + terceiroL <= segundoL) && (terceiroL + segundoL <= primeiroL)){
            JOptionPane.showMessageDialog(null, "Não é possivel fazer um triagulo com esses lados.");
        } else if (primeiroL == segundoL && segundoL == terceiroL){
            JOptionPane.showMessageDialog(null, "Triângulo Equilátero.");
        } else if (primeiroL == segundoL || primeiroL == terceiroL || segundoL == terceiroL){
            JOptionPane.showMessageDialog(null, "Triângulo Isóseles.");
        } else {
            JOptionPane.showMessageDialog(null, "Triângulo Escaleno.");
        }
    }
}
