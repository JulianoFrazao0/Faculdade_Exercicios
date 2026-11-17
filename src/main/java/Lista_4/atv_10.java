package Lista_4;
import java.util.Scanner;
//10. Caixa de loja. Ler a quantidade N de itens da compra. Se
//N for menor que 1, imprimir mensagem de quantidade
//inválida e encerrar. Caso contrário, ler o preço unitário e a
//quantidade de cada item em dois arrays de tamanho N.
//Imprimir o subtotal de cada item, o total da compra, um
//desconto de 5 por cento quando o total passar de 200,00 e o
//valor final a pagar, todos com duas casas.
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
