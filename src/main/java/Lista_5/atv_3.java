package Lista_5;
//Ler 8 números inteiros em um array. Criar a função boolean ehPrimo(int
//numero), a função int contarPrimos(int[] v) e o procedimento
//exibirPrimos(int[] v), que imprime só os primos do array. Ao final, imprimir
//quantos primos foram encontrados.
import java.util.Scanner;

public class atv_3 {
    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int contarprimos(int[] v) {
        int qtd = 0;
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                qtd++;
            }
        }
        return qtd;
    }

    public static void exibirPrimos(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                System.out.println(v[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] num = new int[8];
        for (int i = 0; i < num.length; i++) {
            System.out.println("digite o numero " + (i + 1));
            num[i] = ent.nextInt();
        }
        exibirPrimos(num);
        System.out.println("quantidade de primos " + contarprimos(num));
    }
}