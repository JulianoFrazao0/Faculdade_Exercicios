//Ler o preço de 5 produtos. Imprimir todos os preços lidos
//e, ao final, o total da compra com duas casas.
package Lista_4;
import java.util.Scanner;

public class atv_4 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        double[] prec = new double[5];
        double tot = 0;
        for (int i = 0; i < prec.length; i++) {
            System.out.println("digite o preco do produto " + (i + 1));
            prec[i] = ent.nextDouble();
            tot += prec[i];
        }
        for (int i = 0; i < prec.length; i++) {
            System.out.println("produto " + (i + 1) + " R$ " + prec[i]);
        }
        System.out.printf("total da compra R$ %.2f%n", tot);
    }
}
