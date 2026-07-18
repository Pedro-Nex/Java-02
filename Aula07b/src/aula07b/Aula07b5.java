/*
 * Nesse progrma vamos estudar métodos (funções) com parâmetros/argumentos e com retorno, Nesse exmplo vamos usar array como parâmetro
 */
package aula07b;

public class Aula07b5 {
    public int maiorValor(int[] valores){
        int maior = valores[0];
        
        for (int i = 0; i < valores.length; i++){
            if (valores[i] > maior){
                maior = valores[i];
            }
        }
        return maior;
    }
    
    public static void main(String[] args) {
        Aula07b5 msg = new Aula07b5();
        int[] numeros = {4, 9, 2, 15, 7};
        
        int maior = msg.maiorValor(numeros);
        System.out.println("O maior numero eh: " + maior);
    }
}
