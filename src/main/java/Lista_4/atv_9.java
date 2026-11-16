package Lista_4;
import java.util.Scanner;

public class atv_9 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("digite a quantdade de itens");
        int n = ent.nextInt();
        if (n < 1) {
            System.out.println("quantidade invalida");
            ent.close();
            return;
        }
        double[] prec = new double[n];
        int[] qtd = new int[n];

        for (int i = 0; i < prec.length; i++) {
            System.out.println("digite preco do item sozinho " + (i + 1));
            prec[i] = ent.nextDouble();

            System.out.println("digite a qauntos que voce quer  do item " + (i + 1));
            qtd[i] = ent.nextInt();
        }
        double tot = 0;
        for (int i = 0; i < prec.length; i++) {
            double sub = prec[i] * qtd[i];
            tot += sub;
            System.out.printf("subtotal do item %d R$ %.2f%n", i + 1, sub);
        }
        double desc = 0;
        if (tot > 200) {
            desc = tot * 0.05;
        }
        double val = tot - desc;
        System.out.printf("total da compra R$ %.2f%n", tot);
        System.out.printf("desconto R$ %.2f%n", desc);
        System.out.printf("valor final R$ %.2f%n", val);
    }
}
