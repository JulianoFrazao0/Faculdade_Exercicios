package Lista_5;
//Ler N de 1 a 30. Valor fora da faixa imprime quantidade inválida e encerra.
//Preencher um array de N posições com a função recursiva int fibonacci(int n),
//em que fibonacci(0) é 0, fibonacci(1) é 1 e os demais são a soma dos dois
//anteriores. Criar a função int somar(int[] v) e o procedimento exibir(int[] v).
//Para N = 10: 0 1 1 2 3 5 8 13 21 34 e soma 88.
import java.util.Scanner;

public class atv_10 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void preencher(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = fibonacci(i);
        }
    }

    public static int somar(int[] v) {
        int soma = 0;

        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma;
    }

    public static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("digite a quantidade de 1 a 30");
        int n = ent.nextInt();
        if (n < 1 || n > 30) {
            System.out.println("quantidade invalida");
            return;
        }
        int[] num = new int[n];
        preencher(num);
        exibir(num);
        System.out.println("soma " + somar(num));
    }
}