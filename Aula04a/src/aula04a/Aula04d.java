/*
 * Nesse programa vamos rever o método substring da classe String para extrair partes de um string
 */
package aula04a;

public class Aula04d {
    public static void main(String[] args) {
        String texto = "Pedro Neves";
        
        System.out.println("Segundo nome do texto: " + texto.substring(6));
        System.out.println("Primeiro nome do texto: " + texto.substring(0,5));
        
    }
}