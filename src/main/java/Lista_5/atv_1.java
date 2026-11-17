package Lista_5;
//1. Ler a altura de 3 triângulos em um array. Criar a função String gerarLinha(char
//simbolo, int tamanho), que devolve o símbolo repetido tamanho vezes, e o
//procedimento desenharTriangulo(int altura), que usa a função para desenhar
//um triângulo de asteriscos. Para altura 3: *
//**
//,
//,
//***. Desenhar os 3 triângulos
//separados por uma linha em branco.

import java.util.Scanner;

public class atv_1 {
    public static String gerarLinha(char simbolo, int tamanho) {
        String lin = "";

        for (int i = 0; i < tamanho; i++) {
            lin += simbolo;
        }

        return lin;
    }

    public static void desenharTriangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            System.out.println(gerarLinha('*', i));
        }
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] alt = new int[3];

        for (int i = 0; i < alt.length; i++) {
            System.out.println("digite a altura do triangulo " + (i + 1));
            alt[i] = ent.nextInt();
        }

        for (int i = 0; i < alt.length; i++) {
            desenharTriangulo(alt[i]);

            if (i < alt.length - 1) {
                System.out.println();
            }
        }
    }
}