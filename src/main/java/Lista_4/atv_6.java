package Lista_4;
import java.util.Scanner;

public class atv_6 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("digite o valor do emprestimo");

        double val = ent.nextDouble();
        System.out.println("digite a taxa mensal em porcentagem");

        double tx = ent.nextDouble();
        double[] div = new double[12];
        for (int i = 0; i < div.length; i++) {
            int mes = i + 1;
            div[i] = val + val * tx / 100 * mes;

            System.out.printf("mes %d R$ %.2f%n", mes, div[i]);

        }
    }
}
