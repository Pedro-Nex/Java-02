/*
 * 
 */
package aula02exercicio01;

public class Aula02Exercicio01 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, nota5, nota6, nota7, media;
        String nome = "Jorge Blue";
        int idade = 15;
        
        // Notas.
        nota1 = 6.3;
        nota2 = 4.2;
        nota3 = 9.5;
        nota4 = 3.7;
        nota5 = 9.9;
        nota6 = 8.7;
        nota7 = 6.8;
        
        media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7) / 7;
        
        // Exibindo na tela.
        System.out.println("O Aluno, " + nome + ". Tem " + idade + " anos.");
        System.out.println("Sua media no ano foi: " + String.format("%,.1f",media));
    } 
}