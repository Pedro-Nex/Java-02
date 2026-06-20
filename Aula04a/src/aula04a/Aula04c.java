/*
 * Nesse programa vamos estudar a estrutura de controle switch... case encadeada
 */
package aula04a;
import javax.swing.JOptionPane;

public class Aula04c {
    public static void main(String[] args) {
        String tit = "Calendário";
        int feriado = JOptionPane.showConfirmDialog(null, "Hoje é feriado? ", tit, JOptionPane.YES_NO_OPTION, 3);

        switch (feriado){
            case 0:
                JOptionPane.showMessageDialog(null, "Hoje não trabalhamos.", tit, 1);
                break;
            case 1:
                String diaSemana = JOptionPane.showInputDialog(null, "Digite o número do dia da semana: ", tit, 3);
                switch (diaSemana) {
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                        JOptionPane.showMessageDialog(null, "Hoje é " + diaSemana + "ª feira. Dia de trabalho normal.", tit, 1);
                        break;
                    case "7":
                        JOptionPane.showMessageDialog(null, "Hoje é sábado. Dia de trabalho 1/2 período.", tit, 1);
                        break;
                    case "1":
                        JOptionPane.showMessageDialog(null, "Hoje é domingo. Dia de descanço.", tit, 1);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Dia digitado inválido.", tit, 1);
                }
                break;
        }
    }
}
