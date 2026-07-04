package aula06a;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aula06a2 {
    public static void main(String[] args) {
        ArrayList<Integer> idades = new ArrayList<Integer>();
        String idadeStr = "";
        do {
            idadeStr = JOptionPane.showInputDialog(null, "Digite a idade do aluno ou 0 para encerrar: ", "Sistema Escola!", 3);
            idades.add(Integer.parseInt(idadeStr));
        } while (!idadeStr.equals("0"));
        idades.remove(idades.indexOf(0));
        System.out.println(idades);
        
        int somaIdades = 0;
        
        for (int idade : idades){
            somaIdades += idade;
        }
        int mediaIdades = somaIdades / idades.size();
        JOptionPane.showMessageDialog(null, "A média das idades é: " + mediaIdades, "Sistema Escola!", 1);
    }
}
