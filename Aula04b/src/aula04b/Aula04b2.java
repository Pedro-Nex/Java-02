package aula04b;

public class Aula04b2 {
    public static void main(String[] args) {
        int contador = 10;
        
        while (contador <= 10){
            System.out.println("Contador: " + contador);
            contador--;
            if (contador < 1){
                break;
            }
        }
    }
}