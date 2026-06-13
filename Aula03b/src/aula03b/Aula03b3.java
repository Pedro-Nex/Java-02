package aula03b;
import javax.swing.JOptionPane;

public class Aula03b3 {
    public static void main(String[] args) {
        String nomeArquivo = JOptionPane.showInputDialog(null, "Digite o nome do arquivo:", "Salvar o arquivo no disco", 3);
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja salvar esse arquivo?", "Salvar o arquivo no disco", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Arquivo salvo", "Salvar o arquivo no disco", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Salvamento Cancelado", "Salvar o arquivo no disco", 1);
        }
    }
}