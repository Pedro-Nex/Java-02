package aula03b;
import javax.swing.JOptionPane;

public class Aula03bExercicio1 {
    public static void main(String[] args) {
        String tit = "Calculando IMC";
        String nomeU = JOptionPane.showInputDialog(null, " Digite o seu nome:", tit, 3);
        String pesoU = JOptionPane.showInputDialog(null, " Digite o seu peso (kg):", tit, 3);
        String alturaU = JOptionPane.showInputDialog(null, " Digite o sua altura (m):", tit, 3);
        
        double peso = Double.parseDouble(pesoU);
        double altura = Double.parseDouble(alturaU);
        double imc = peso / Math.pow(altura, 2);
        
        String msg = "";
        
        if (imc < 18.5){
            msg = nomeU + ". Seu IMC é: " + String.format("%,.2f", imc) + ". ABAIXO DO PESO NORMAL";
        } else if (imc < 25){
            msg = nomeU + ". Seu IMC é: " + String.format("%,.2f", imc) + ". PESO NORMAL";
        } else if (imc < 30){
            msg = nomeU + ". Seu IMC é: " + String.format("%,.2f", imc) + ". EXCESSO DE PESO";
        } else if (imc < 35){
            msg = nomeU + ". Seu IMC é: " + String.format("%,.2f", imc) + ". OBESIDADE NIVEL 1";
        } else if (imc < 40){
            msg = nomeU + ". Seu IMC é: " + String.format("%,.2f", imc) + ". OBESIDADE NIVEL 2";
        } else {
            msg = nomeU + ". Seu IMC é: " + String.format("%,.2f", imc) + ". OBESIDADE NIVEL 3";
        }
        
        JOptionPane.showMessageDialog(null, msg, tit, 1);
    }
}
