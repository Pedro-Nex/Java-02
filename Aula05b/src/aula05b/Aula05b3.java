package aula05b;

public class Aula05b3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.println("=".repeat(40));
            for (int j = 1; j <= 10; j++){
                int total = i * j;
                System.out.println(i + " X " + j + " = " + total);
            }
        }
    }
}