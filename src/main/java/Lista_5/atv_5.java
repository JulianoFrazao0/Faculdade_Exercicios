package Lista_5;
//Decimal para binário. Ler 5 números inteiros não negativos em um array. Criar a
//função String paraBinario(int n), que monta o binário por divisões sucessivas
//por 2 (o resto vai à esquerda do que já foi montado), e o procedimento
//exibirTabela(int[] v), que imprime uma linha por número no formato 10 = 1010.

import java.util.Scanner;

public class atv_5 {
    public static String parabinario(int n) {
        if (n == 0) {
            return "0";
        }

        String bina = "";

        while (n > 0) {
            bina = (n % 2) + bina;
            n = n / 2;
        }

        return bina;
    }

    public static void exibirtabela(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " = " + parabinario(v[i]));
        }
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println("digite um numero nao negativo");
            num[i] = ent.nextInt();

            while (num[i] < 0) {
                System.out.println("digite novamente um numero nao negativo");
                num[i] = ent.nextInt();
            }
        }
        exibirtabela(num);
    }
}