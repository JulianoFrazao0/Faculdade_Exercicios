//Criar com new um array de 3 preços. Atribuir por índice os
//valores 12.90, 5.50 e 30.00 e imprimir cada um com um for
//no formato Produto 1: R$ 12,90.

package Lista_1;

public class atv_2 {
    public static void main (String[] args) {
        double[] valores = {12.90, 5.50, 39.00};
        System.out.println(valores.length);

        for (double n :valores){
            System.out.println("R$" + n);
        }

    }
}
