package aula04a;
import javax.swing.JOptionPane;

public class Aula04aExecicio1 {
    public static void main(String[] args) {
        String tit = "Data de Nascimento!";
        String dataAni = JOptionPane.showInputDialog(null, "Digite sua data de nascimento (Ex: 13/09/2005):", tit, 1);
        
        String mesAni = dataAni.substring(3, 5);
        String diaAni = dataAni.substring(0, 2);
        String anoAni = dataAni.substring(6, 10);
        
        switch (mesAni){
            case "01": JOptionPane.showMessageDialog(null, diaAni + " de Janeiro de " + anoAni, tit, 2);
            break;
            case "02": JOptionPane.showMessageDialog(null, diaAni + " de Fevereiro de " + anoAni, tit, 2);
            break;
            case "03": JOptionPane.showMessageDialog(null, diaAni + " de Março de " + anoAni, tit, 2);
            break;
            case "04": JOptionPane.showMessageDialog(null, diaAni + " de Abril de " + anoAni, tit, 2);
            break;
            case "05": JOptionPane.showMessageDialog(null, diaAni + " de Maio de " + anoAni, tit, 2);
            break;
            case "06": JOptionPane.showMessageDialog(null, diaAni + " de Junho de " + anoAni, tit, 2);
            break;
            case "07": JOptionPane.showMessageDialog(null, diaAni + " de Julho de " + anoAni, tit, 2);
            break;
            case "08": JOptionPane.showMessageDialog(null, diaAni + " de Agosto de " + anoAni, tit, 2);
            break;
            case "09": JOptionPane.showMessageDialog(null, diaAni + " de Setembro de " + anoAni, tit, 2);
            break;
            case "10": JOptionPane.showMessageDialog(null, diaAni + " de Outubro de " + anoAni, tit, 2);
            break;
            case "11": JOptionPane.showMessageDialog(null, diaAni + " de Novembro de " + anoAni, tit, 2);
            break;
            case "12": JOptionPane.showMessageDialog(null, diaAni + " de Dezembro de " + anoAni, tit, 2);
            break;
            default: JOptionPane.showMessageDialog(null,"Data digitada errada. Use 00/00/0000 para digitar.", tit, 2);
        }
    }
}
