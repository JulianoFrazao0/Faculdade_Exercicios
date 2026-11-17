package Lista_4;
//Ler o salário de 6 funcionários. Imprimir o maior salário, o
//menor salário, a média com duas casas e quantos
//funcionários ganham acima da média.
import java.util.Scanner;

public class atv_7 {
    public static void main (String[] args){
        Scanner ent = new Scanner(System.in);

        double[] sal = new double[6];
        double soma = 0;
        double maior = 0;
        double menor = 0;
        for (int i = 0; i < sal.length; i++) {
            System.out.println("digite o salario do funcionario " + (i + 1));
            sal[i] = ent.nextDouble();
            soma += sal[i];
            if (i == 0) {
                maior = sal[i];
                menor = sal[i];
            } else {
                if (sal[i] > maior) {
                    maior = sal[i];
                }
                if (sal[i] < menor) {
                    menor = sal[i];
                }
            }
        }

        double med = soma / sal.length;
        int cont = 0;
        for (int i = 0; i < sal.length; i++) {
            if (sal[i] > med) {
                cont++;
            }
        }
        System.out.println("maior salario " + maior);
        System.out.println("menor salario " + menor);
        System.out.println("media R$" + med);
        System.out.println("funcionarios acima da media " + cont);
    }

}
