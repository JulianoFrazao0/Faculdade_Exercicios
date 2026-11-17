package Lista_5;
//8. Ler uma frase com as palavras separadas por um espaço e quebrá-la em um array
//com split. Criar a função String maiorPalavra(String[] palavras) e o
//procedimento exibirPalavras(String[] palavras), que imprime uma palavra por
//linha, numerada. Imprimir também o total de palavras e a maior palavra.

import java.util.Scanner;

public class atv_8 {
    public static String maiorpalavra(String[] palavras) {
        String maior = "";
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() > maior.length()) {
                maior = palavras[i];
            }
        }
        return maior;
    }

    public static void exibirpalavras(String[] palavras) {
        for (int i = 0; i < palavras.length; i++) {
            System.out.println((i + 1) + ". " + palavras[i]);
        }
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("digite uma frase:");

        String fr = ent.nextLine();

        String[] pal = fr.trim().split(" ");

        exibirPalavras(pal);

        System.out.println("total de palavras " + pal.length);

        System.out.println("maior palavra " + maiorPalavra(pal));
    }
}
