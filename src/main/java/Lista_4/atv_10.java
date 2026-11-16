package Lista_4;
import java.util.Scanner;

public class atv_10 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("digite a quantidade de itens");
        int n = ent.nextInt();

        if (n < 1) {
            System.out.println("quantidade invalida");
            ent.close();
            return;
        }
        double[] prec = new double[n];
        int[] qtd = new int[n];

        for (int i = 0; i < prec.length; i++) {
            System.out.println("digite o preco dele sozinho do item " + (i + 1));
            prec[i] = ent.nextDouble();

            System.out.println("digite a quantidade do item " + (i + 1));
            qtd[i] = ent.nextInt();
        }
        double total = 0;
        for (int i = 0; i < prec.length; i++) {
            double sub = prec[i] * qtd[i];
            total += sub;
            System.out.printf("subtotal do item %d R$ %.2f%n", i + 1, sub);
        }
        double desc = 0;

        if (total > 200) {
                    desc = total * 0.05;
        }

        double val = total - desc;
        System.out.printf("total da compra R$ %.2f%n", total);
        System.out.printf("desconto R$ %.2f%n", desc);
        System.out.printf("valor final R$ %.2f%n", val);
    }
}
