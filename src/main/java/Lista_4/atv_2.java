//Criar com new um array de 3 preços. Atribuir por índice os
//valores 12.90, 5.50 e 30.00 e imprimir cada um com um for
//no formato Produto 1: R$ 12,90.

package Lista_4;

public class atv_2 {
    public static void main (String[] args) {
        double[] val = new double[3];
        val[0] = 12.90;
        val[1] = 5.50;
        val[2] = 30.00;
        for (int i = 0; i < val.length; i++) {
            System.out.printf("produto %d R$ %.2f%n", i + 1, val[i]);
        }

    }
}
