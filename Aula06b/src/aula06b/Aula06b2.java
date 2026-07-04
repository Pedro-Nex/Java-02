package aula06b;

import javax.swing.JOptionPane;

public class Aula06b2 {

    public static void main(String[] args) {
        try{
        int numerador = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numerador da divisão: "));
        int denominador = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o denominador da divisão: "));
        int divisao = numerador / denominador;
        JOptionPane.showMessageDialog(null, "O Resultado é: " + divisao);
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Não é possivel divisão por denominador 0.");
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite apenas números.");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e + ". Fale com Suporte!");
        }
    }
}
