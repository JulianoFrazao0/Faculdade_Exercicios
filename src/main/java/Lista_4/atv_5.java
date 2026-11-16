package Lista_4;
import java.util.Scanner;

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
