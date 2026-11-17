package Lista_5;
//Ler 3 frases em um array de String. Criar a função int contarVogais(String
//texto), sem diferenciar maiúscula de minúscula, e o procedimento
//exibirContagem(String[] frases), que imprime cada frase com sua quantidade
//de vogais e, ao final, a frase com mais vogais.
import java.util.Scanner;

public class atv_6 {
    public static int contarVogais(String texto) {
        String txt = texto.toLowerCase();
        String vog = "aeiouAEIOU";
        int qtd = 0;

        for (int i = 0; i < txt.length(); i++) {
            for (int j = 0; j < vog.length(); j++) {
                if (txt.charAt(i) == vog.charAt(j)) {
                    qtd++;
                    break;
                }
            }
        }

        return qtd;
    }

    public static void exibircontagem(String[] frases) {
        int maior = -1;
        int pos = 0;

        for (int i = 0; i < frases.length; i++) {
            int qtd = contarVogais(frases[i]);
            System.out.println(frases[i] + " - quantidade de vogais " + qtd);

            if (qtd > maior) {
                maior = qtd;
                pos = i;
            }
        }
        System.out.println("frase com mais vogais " + frases[pos]);
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String[] fr = new String[3];

        for (int i = 0; i < fr.length; i++) {
            System.out.println("digite a frase " + (i + 1));
            fr[i] = ent.nextLine();
        }
        exibircontagem(fr);    }
}