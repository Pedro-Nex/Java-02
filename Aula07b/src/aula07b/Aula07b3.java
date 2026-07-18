/*
 * Nesse programa vamos estudar os métodos (funções) sem parâmetros/argumentos e com retorno
 */
package aula07b;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Aula07b3 {

    public int gerarNum() {
        Random rd = new Random();
        int num = rd.nextInt(100) + 1;
        return num;
    }
    
    public static void main(String[] args) {
        Aula07b3 gerador = new Aula07b3();
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros deseja gerar: ");
        int numQuant = sc.nextInt();
        for (int i = 1; i <= numQuant; i++){
            System.out.print(gerador.gerarNum() + " ");
        }
        System.out.println();
        System.out.println("Hora atual: " + gerador.gerarHoraAtual());
    }
    
    public String gerarHoraAtual(){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormt = agora.format(formato);
        return horaFormt;
    }
}
