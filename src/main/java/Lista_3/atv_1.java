package Lista_3;

import java.util.Scanner;

// 1. Ler uma matriz 3x3 de números inteiros e mostrar na tela
// em forma de tabela, uma linha embaixo da outra.

public class atv_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("valor para posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(entrada.next());
            }
        }

        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}