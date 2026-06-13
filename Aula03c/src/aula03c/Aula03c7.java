package aula03c;

import javax.swing.JOptionPane;

public class Aula03c7 {

    public static void main(String[] args) {
        int quantEstoque = 1;
        boolean emPromo = true;

        if (!(quantEstoque > 0)) {
            JOptionPane.showMessageDialog(null, "Produto esgotado no momento.");
        } else if (emPromo) {
            JOptionPane.showMessageDialog(null, "Produto disponivel com 10% de desconto.");
        } else {
            JOptionPane.showMessageDialog(null, "Produto disponivel para compra sem desconto.");
        }
    }
}
