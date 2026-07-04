package aula06a;

import java.util.ArrayList;

public class Aula06a {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<String>();

        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Laranja");

        System.out.println("Frutas que eu gosto " + frutas);

        System.out.println("A fruta que mais gosto eh: " + frutas.get(1));

        frutas.add(1, "Melao");

        System.out.println("Frutas que gosto: " + frutas);

        for (int i = 0; i < frutas.size(); i++) {
            if (i < frutas.size() - 1) {
                System.out.println(frutas.get(i) + ", ");
            } else {
                System.out.print(frutas.get(i) + ".");
            }
        }
        System.out.println();
        
        frutas.add("Melancia");
        frutas.set(0, "Abacaxi");
        
        System.out.println("Frutas alteradas: " + frutas);
        
        int posicao = frutas.indexOf("Banana");
        
        System.out.println("A Banana estana posicaoo: " + posicao);
        
        frutas.set(posicao, "Ameixa");
        
        System.out.println("Frutas sem a Banana: " + frutas);
        
        frutas.remove(4);
        
        System.out.println("Frutas sem a laranja: " + frutas);
        
        frutas.remove("Ameixa");
        
        System.out.println("Frutas sem a Ameixa: " + frutas);
        
        if (frutas.contains("Melancia")){
            System.out.println("A lista nao possue Melancia.");
        } else {
            System.out.println("A lista possui Melancia");
        }
        
        frutas.clear();
        
        System.out.println("Frutas: " + frutas);
    }
}
