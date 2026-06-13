/*
 * Nesse programa vamos estudar a estrutura de decisão if...else para verificar valores do tipo string
 */
package aula03c;
import javax.swing.JOptionPane;

public class Aula03c {

    public static void main(String[] args) {
        String tit = "Senai";
        String unidade = JOptionPane.showInputDialog("Digite a unidade Senai desajada \n na região de Guarulhos \n (Centro, Dutra, Mairiporã ou Arujá):");
        
        String msg = "";
        if (unidade.equalsIgnoreCase("Centro")){
            msg = "Dirija-se ao Centro de Guarulhos";
        } else if (unidade.equalsIgnoreCase("Dutra")){
            msg = "Dirija-se à unidade de Guarulhos";
        } else if (unidade.equalsIgnoreCase("Mairiporã")){
            msg = "Dirija-se à unidade de Mairiporã";
        } else if (unidade.equalsIgnoreCase("Arujá")){
            msg = "Dirija-se à unidade de Aruja";
        } else {
            msg = "Você não digitou uma unidade válida";
        }
        
        JOptionPane.showMessageDialog(null, msg);
    }
}