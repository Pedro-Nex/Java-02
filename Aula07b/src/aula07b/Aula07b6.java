/*
 * Nesse programa vamos estudar o escopo de uma variavel
 */
package aula07b;

public class Aula07b6 {
    public static int valor = 10;
    public static void main(String[] args) {
        calcularTabuada();
    }
    
    public static void calcularTabuada(){
        for (int i = 1; i <= 10; i++){
            int total = i * valor;
            System.out.println(valor + " X " + i + " = " + total);
        }
    }
}
