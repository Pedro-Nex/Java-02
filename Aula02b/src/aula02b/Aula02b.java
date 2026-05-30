/*
 * Nesse programa vamos explorar os metodos da classe String
 */
package aula02b;

public class Aula02b {
    public static void main(String[] args) {
        String nome, frase,traco, curso, vazia, sobrenomeNe, nomeMeio, nomeCorreto, premio, xPremio, vPremio, zPremio;
        nome = "Pedro de Souza Neves";
        frase = "     O Java e PODEROSO ! ! !     ";
        traco = "=";
        curso = "JAVA";
        vazia = " ";
        
        // Conversão de caixa (maisculas e minúsculas).
        System.out.println(traco.repeat(50));
        System.out.println("NOME: " + nome.toUpperCase());
        System.out.println("nome: " + nome.toLowerCase());
        
        // Removendo espaços em branco.
        System.out.println(traco.repeat(50));
        System.out.println("Frase sem espacos (trim()): " + frase.trim());
        System.out.println("Frase sem espacos (strip()): " + frase.strip());
        
        // Verificando e comparando.
        System.out.println(traco.repeat(50));
        System.out.println("O curso eh Java? " + curso.equals("Java"));
        System.out.println("O curso eh Java? " + curso.equalsIgnoreCase("Java"));
        System.out.println("O curso contem 'JA'? " + curso.contains("JA"));
        System.out.println("O variavel esta vazia (isEmpty())? " + vazia.trim().isEmpty());
        System.out.println("O variavel esta vazia (isBlank())? " + vazia.isBlank());
        
        // Busca, Substituição e Divisão.
        System.out.println(traco.repeat(50));
        System.out.println("Numero de caracteres de 'nome': " + nome.length());
        System.out.println("Numero de caracteres de 'frase': " + frase.length());
        System.out.println("Numero de caracteres de 'frase' sem espacos: " + frase.trim().length());
        System.out.println("Letra na posicao 6 do nome: " + nome.charAt(6));
        System.out.println("Posicao do 'Ne' no nome: " + nome.indexOf("Ne"));
        
        System.out.println(traco.repeat(50));
        int posicaoNe = nome.indexOf("Neves");
        sobrenomeNe = nome.substring(posicaoNe);
        System.out.println("Sobrenome: " + sobrenomeNe);
        nomeMeio = nome.substring(9, 14);
        System.out.println("Sobrenome: " + nomeMeio);
        nomeCorreto = nome.replace("Souza", "Sousa");
        System.out.println("Nome Correto: " + nomeCorreto);
        
        System.out.println(traco.repeat(50));
        premio = "123,456,789.99";
        xPremio = premio.replace(",", "X");
        System.out.println("xPremio: " + xPremio);
        vPremio = xPremio.replace(".", ",");
        System.out.println("vPremio: " + vPremio);
        zPremio = vPremio.replace("X", ".");
        System.out.println("zPremio: " + zPremio);
        
        System.out.println(traco.repeat(50));
    } 
}
