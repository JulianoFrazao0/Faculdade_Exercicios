package Lista_5;
//Ler um expoente e 5 bases em um array. Criar a função recursiva long
//potencia(int base, int expoente), sem Math.pow e sem laço. Caso base:
//expoente 0 devolve 1. Criar o procedimento exibirPotencias(int[] bases, int
//expoente), que imprime no formato 2^3 = 8.

import java.util.Scanner;

public class atv_9 {
    public static long potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }

    public static void exibirPotencias(int[] bases, int expoente) {
        for (int i = 0; i < bases.length; i++) {
            System.out.println(bases[i] + "^" + expoente
                    + " = " + potencia(bases[i], expoente));
        }
    }
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("digite um expoente nao negativo");
        int exp = ent.nextInt();

        if (exp < 0) {
            System.out.println("expoente invalido");
            return;
        }

        int[] bs = new int[5];

        for (int i = 0; i < bs.length; i++) {
            System.out.println("digite a base " + (i + 1));
            bs[i] = ent.nextInt();
        }
        exibirPotencias(bs, exp);
    }
}