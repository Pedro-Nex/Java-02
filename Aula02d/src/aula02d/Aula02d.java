/*
 * Nesse progrmaa vamos estudar o uso do método String.format() para formatação de números em uma String.
 */
package aula02d;

public class Aula02d {
    public static void main(String[] args) {
        // % (indicador de formato).
        // %s - exibi uma String
        // %d - exibi números inteiros
        // %f - exibi números com casas decimais
        
        String produto = "Tv";
        double preco = 2499.5566;
        int estoque = 15;
        double imposto = 0.18;
        
        System.out.println("=".repeat(50));
        String texto1 = String.format("O produto %s tem %d unidades em estoque.", produto, estoque);
        System.out.println(texto1);
        
        texto1 = String.format("Preco bruto: R$ %,.2f", preco);
        System.out.println(texto1);
        System.out.println("=".repeat(50));
    } 
}