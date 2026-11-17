package Lista_5;

//Ordenação pelo método da bolha. Ler 6 números inteiros em um array. Criar o
//procedimento ordenar(int[] v), que coloca o array em ordem crescente
//comparando vizinhos e trocando quando estiverem fora de ordem, a função
//boolean estaOrdenado(int[] v) e o procedimento exibir(int[] v). Imprimir o
//array e o resultado de estaOrdenado antes e depois de ordenar.

import java.util.Scanner;

public class atv_4 {
    public static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public static boolean estarrdenado(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] > v[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] num = new int[6];

        for (int i = 0; i < num.length; i++) {
            System.out.println("digite o numero " + (i + 1));
            num[i] = ent.nextInt();
        }

        System.out.println("antes de ordenar");
        exibir(num);
        System.out.println("esta ordenado " + estarrdenado(num));

        ordenar(num);

        System.out.println("depois de ordenar");
        exibir(num);
        System.out.println("esta ordenado " + estarrdenado(num));
    }
}