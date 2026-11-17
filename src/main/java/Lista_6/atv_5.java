//5. Diagonal principal. Ler uma matriz 3x3 de números inteiros e mostrar os elementos da
//diagonal principal, que são as posições em que a linha é igual à coluna: [0][0], [1][1] e [2][2].
//Dica: basta um for usando m[i][i].
//Entrada: 1 2 3 4 5 6 7 8 9
//Saída: Diagonal principal: 1 5 9
package Lista_6;
import java.util.Scanner;

public class atv_5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[][] m = new int[3][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = ent.nextInt();
            }
        }

        System.out.print("diagonal principal ");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][i] + " ");
        }
    }
}