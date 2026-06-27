package aula05c;
import java.util.Random;

public class Aula05c3 {
    public static void main(String[] args) {
        String[] frutas = {"Banana", "Pera", "Uva", "Maca"};
        for (String fruta : frutas){
            System.out.println("Eu gosto de " + fruta);
        }
        
        Random rd = new Random();
        int numero = rd.nextInt(10)+1;
        System.out.println("Numero sorteado: " + numero);
    }
}