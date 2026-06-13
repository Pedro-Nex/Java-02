/**
 * Nesse programa vamos estudar o uso de operadores aritméticas
 */
package aula03a;

public class Aula03a {

    public static void main(String[] args) {
        int numero = 10;
        System.out.println("Valor: " + numero);
        
        numero = numero + 5;
        System.out.println("Novo Valor: " + numero);
        
        numero += 20;
        System.out.println("Novo Valor (+=20): " + numero);
        
        numero -= 7;
        System.out.println("Novo Valor (-=7): " + numero);
        
        numero *= 3;
        System.out.println("Novo Valor (*=3): " + numero);
        
        numero /= 2;
        System.out.println("Novo Valor (/=2): " + numero);
        
        numero %= 5;
        System.out.println("Novo Valor (%=5): " + numero);
    }    
}