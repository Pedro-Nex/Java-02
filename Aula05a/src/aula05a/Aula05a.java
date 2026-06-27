/*
 * Nesse programa vamos estudar o uso da estrutura de repetição do...while em comparação com a estrutura while
 */
package aula05a;

public class Aula05a {
    public static void main(String[] args) {
        int contador = 20;
        
        while (contador <= 10){
            System.out.println("Numero: " + contador);
            contador++;
        }
        // contador = 1;
        System.out.println("=".repeat(40));
        do{
            System.out.println("Numero: " + contador);
            contador++;
        }while(contador <= 10);
    }
}