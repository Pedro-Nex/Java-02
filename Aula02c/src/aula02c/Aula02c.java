/*
 * Nesse programa vamos estudar as ocnversões possiveis de tipos de dados e operações aritmétricas.
 */
package aula02c;

public class Aula02c {
    public static void main(String[] args) {
        byte byteNumero = 18;
        short shortNumero = 1000;
        int intNumero = 100000;
        long longNumero = 200000000000L;
        
        // Conversão Implicita.
        short numero1 = byteNumero;
        int numero2 = shortNumero;
        long numero3 = intNumero;
        
        // Conversão de números de ponto flutuante (Decimais).
        float floatNumero = 123.456789F;
        double doubleNumero = 123.45678912345;
        
        double numero4 = floatNumero;
        
        // Conversão Explicita.
        float numero5 = (float) doubleNumero;
        int numero6 = (int) doubleNumero;
        
        // Exibindo os números
        System.out.println("Double original: " + doubleNumero);
        System.out.println("Double convertido para Float: " + numero5);
        System.out.println("Double convertido para int: " + numero6);
        
        System.out.println("=".repeat(50));
        
        int valor1 = 10;
        int valor2 = 3;
        double valor3 = 15.5;
        double valor4 = 3.3;
        
        // Adição +
        int soma1 = valor1 + valor2;
        double soma2 = valor3 + valor4;
        double soma3 = valor1 + valor3;
        
        System.out.println("Soma de " + valor1 + " + " + valor2 + " = " + soma1);
        System.out.println("Soma de " + valor3 + " + " + valor4 + " = " + soma2);
        System.out.println("Soma de " + valor1 + " + " + valor3 + " = " + soma3);
        
        // Subtração -
        // Multiplicação *
        // Divisão /
        System.out.println("=".repeat(50));
        int div1 = valor1 / valor2;
        double div2 = valor1 / valor2;
        double div3 = valor3 / valor4;
        
        System.out.println("Divisao de " + valor1 + " / " + valor2 + " = " + div1);
        System.out.println("Divisao de " + valor1 + " / " + valor2 + " = " + div2);
        System.out.println("Divisao de " + valor3 + " / " + valor4 + " = " + div3);
        
        // Modulo % (Resto da Divisão).
        System.out.println("=".repeat(50));
        int resto1 = valor1 % valor2;
        double resto2 = valor3 % valor4;
        double resto3 = valor1 % valor4;
        
        System.out.println("Resto de " + valor1 + " % " + valor2 + " = " + resto1);
        System.out.println("Resto de " + valor3 + " % " + valor4 + " = " + resto2);
        System.out.println("Resto de " + valor1 + " % " + valor4 + " = " + resto3);
        
        // Concatenação de Strings
        System.out.println("=".repeat(50));
        System.out.println(1 + 3 + " eh o valor total.");
        System.out.println("O valor total: " + (1 + 3));
        
        double salario = 1612.50;
        String mensagem = "O salario do fulano eh: R$ " + String.format("%,.2f",salario);
        System.out.println(mensagem);
    }   
}