/*
 * 
 */
package aula07b;

public class Aula07b7 {
   private static int proximoID = 1;
   
   public static final String NOME_APLICATIVO = "MyApp";
   public static final String VERSAO_APLICATIVO = "1.0.2 Beta";
   
   public int gerarID(){
       return proximoID++;
   }
   
   public static void main(String[] args) {
       Aula07b7 g1 = new Aula07b7();
       Aula07b7 g2 = new Aula07b7();
       
       System.out.println(g1.gerarID());
       System.out.println(g2.gerarID());
       System.out.println(g1.gerarID());
       
       System.out.println("Nome do aplicativo: " + NOME_APLICATIVO);
       System.out.println("Versao do aplicativo: " + VERSAO_APLICATIVO);
   }
}
