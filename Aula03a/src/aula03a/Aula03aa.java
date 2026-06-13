/*
 * Nesse programa vamos estudar os operadores de incremento e decremento
 */
package aula03a;

public class Aula03aa {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Valor: " + numero);
        
        numero++;
        System.out.println("Novo Valor (+1): " + numero);
        
        numero--;
        System.out.println("Novo Valor (-1): " + numero);
        
        int numero2 = numero++;
        System.out.println("Novo Valor (numero): " + numero);
        System.out.println("Novo Valor (numero2): " + numero2);
        
        numero2 = ++numero;
        System.out.println("Novo Valor (numero): " + numero);
        System.out.println("Novo Valor (numero2): " + numero2);
    }
}
