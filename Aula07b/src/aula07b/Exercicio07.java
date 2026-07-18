package aula07b;

import javax.swing.JOptionPane;

public class Exercicio07 {
    public double calcularTriangulo(double base, double altura) {
        double resultado = (base * altura)/2;
        return resultado;
    }

    public double calcularRetangulo(double base, double altura) {
        double resultado = base * altura;
        return resultado;
    }

    public double calcularCirculo(double raio) {
        double resultado = 3.14 * (raio * raio);
        return resultado;
    }
    
    public static void main(String[] args) {
        Exercicio07 msg = new Exercicio07();
        Object[] opcoes = {"Calcular Triangulo", "Calcular Retangulo", "Calcular Circulo"};
        
        int resposta = JOptionPane.showOptionDialog(null, "Selecione a operação desejada: ", "Calculadora de Objetos", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, opcoes, opcoes[0]);
        String baseStr = "";
        String alturaStr = "";
        String raioStr = "";
        double base = 0;
        double altura = 0;
        double raio = 0;
        
        double resultado = 0;
        
        switch (resposta) {
            case 0:
                baseStr = JOptionPane.showInputDialog(null, "Digite a Base do Triangulo: ");
                alturaStr = JOptionPane.showInputDialog(null, "Digite a Altura do Triangulo: ");
                base = Double.parseDouble(baseStr);
                altura = Double.parseDouble(alturaStr);
                resultado = msg.calcularTriangulo(base, altura);
                break;
            case 1:
                baseStr = JOptionPane.showInputDialog(null, "Digite a Base do Retangulo: ");
                alturaStr = JOptionPane.showInputDialog(null, "Digite a Altura do Retangulo: ");
                base = Double.parseDouble(baseStr);
                altura = Double.parseDouble(alturaStr);
                resultado = msg.calcularRetangulo(base, altura);
                break;
            case 2:
                raioStr = JOptionPane.showInputDialog(null, "Digite o raio do Circulo: ");
                raio = Double.parseDouble(raioStr);
                resultado = msg.calcularCirculo(raio);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você fechou a janela sem escolher uma opção.");
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}
