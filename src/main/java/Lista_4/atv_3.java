//3. Ler as 4 notas de um aluno. Imprimir a média com duas
//casas e a situação: aprovado com média maior ou igual a 6 e
//reprovado abaixo disso.

package Lista_4;

import java.util.Scanner;



public class atv_3 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;
        double media;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("digite a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
            soma += notas[i];
        }
        media = soma / notas.length;
        System.out.printf("media: %.2f%n", media);
        if (media >= 6) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
    }
}
