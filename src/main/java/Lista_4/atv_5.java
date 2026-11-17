package Lista_4;
import java.util.Scanner;
//Ler o preço de 5 produtos. Criar um segundo array com o
//preço de cada produto com 10 por cento de desconto.
//Imprimir, uma linha por produto, o preço original e o preço
//com desconto.
public class atv_5 {
    public static void main (String[] args) {
        Scanner ent = new Scanner(System.in);
        double[] prec = new double[5];
        double[] desc = new double[5];
        for (int i = 0; i < prec.length; i++) {
            System.out.println("digite o preco do produto " + (i + 1));
            prec[i] = ent.nextDouble();
            desc[i] = prec[i] * 0.90;
        }
        for (int i = 0; i < prec.length; i++) {
            System.out.println("produto " + (i + 1) + " R$ " + prec[i]);
        }
    }
    }
