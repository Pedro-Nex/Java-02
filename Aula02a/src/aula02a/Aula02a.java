/**
 * Nesse programa vamos explorar os tipos primitivos do Java.
 */

package aula02a;

public class Aula02a {
    public static void main(String[] args) {
        // Tipos Primitivo inteiros.
        
        byte idade = 20;
        short ano = 2026;
        int populacaoCidade = 1_500_000; 
        long distanciaEstrela = 9_460_000_000_000L;
        
        // Tipos Primitivos de pontos flutuante (decimais).
        
        float precoGasolina = 6.49F;
        double pi = 3.14159265359;
        double salario;
        salario = 2200.50;
        
        // Tipo Primitivo de dado de caráctere.
        char nota = 'A';
        
        // Tipo Primitivo de dado boleano.
        boolean ehAluno = true;
        boolean ehFumante = false;
        
        // Tipo Primitivo de dado texto.
        String nomeCompleto = "Pedro de Sousa Neves";
        
        // Exibindo as variáveis no console.
        
        System.out.println("=".repeat(50));
        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("População da Cidade: " + populacaoCidade);
        System.out.println("Distancia da Estrela: " + distanciaEstrela);
        System.out.println("Preço da Gasolina: " + precoGasolina);
        System.out.println("PI: " + pi);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Nota: " + nota);
        System.out.println("É Aluno: " + (ehAluno ? "Sim" : "Não"));
        System.out.println("É Fumante: " + (ehFumante ? "Sim" : "Não"));
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("=".repeat(50));
    }
}