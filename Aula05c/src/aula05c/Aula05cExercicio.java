package aula05c;
import java.util.Random;

public class Aula05cExercicio {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Random rd = new Random();
        
        for (int i = 0; i < nums.length; i++){
            int numeros = rd.nextInt(100)+1;
            boolean repetido = false;
            for(int j = 0; j < i; j++){
                if(nums[j] == numeros){
                    repetido = true;
                    break;
                }
            }
            if (repetido){
                i--;
            } else {
                nums[i] = numeros;
            }
        }
        System.out.println("-----Numeros-----");
        for (int i = 0; i < nums.length; i++){
            System.out.println((i + 1) + " Numero: " + nums[i]);
        }
    }
}
