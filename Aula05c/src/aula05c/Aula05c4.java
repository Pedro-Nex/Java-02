package aula05c;

public class Aula05c4 {

    public static void main(String[] args) {
        String[][] turmasAlunos = {
            {"Java", "Gaspar"},
            {"Excel", "Luiza"},
            {"Power BI", "Jorge"},
            {"C++", "Gaspar"},
            {"HTML", "Bruce"},
            {"JavaScript", "Anabela"},
        };
        String msg = "";
        for (int i = 0; i < turmasAlunos.length; i++) {
            for (int j = 0; j < turmasAlunos[i].length; j++) {
                msg += turmasAlunos[i][j] + "   ";
            }
            System.out.println(msg);
            System.out.println("=".repeat(40));
            msg = "";
        }
    }
}
