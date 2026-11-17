package Lista_5;
//2. Ler o peso e a altura de 4 pessoas em dois arrays. Criar as funções double
//calcularImc(double peso, double altura) e String classificarImc(double
//imc), que devolve Abaixo do peso (menor que 18,5), Peso normal (menor que 25),
//Sobrepeso (menor que 30) ou Obesidade. Criar o procedimento
//exibirRelatorio(double[] pesos, double[] alturas), que imprime uma linha
//por pessoa no formato Pessoa 1: IMC 22,86 - Peso normal.

import java.util.Scanner;

public class atv_2 {
    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "abaixo do peso";
        } else if (imc < 25) {
            return "peso normal";
        } else if (imc < 30) {
            return "sobrepeso";
        } else {
            return "obesidade";
        }
    }

    public static void exibirRelatorio(double[] pesos, double[] alturas) {
        for (int i = 0; i < pesos.length; i++) {
            double imc = calcularImc(pesos[i], alturas[i]);
            long cent = Math.round(imc * 100);
            long dec = cent % 100;
            String txt = cent / 100 + ",";
            if (dec < 10) {
                txt += "0";
            }
            txt += dec;

            System.out.println("pessoa " + (i + 1) + " imc " + txt + " - " + classificarImc(imc));}
    }
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double[] pes = new double[4];
        double[] alt = new double[4];

        for (int i = 0; i < pes.length; i++) {
            System.out.println("digite o peso da pessoa " + (i + 1));
            pes[i] = ent.nextDouble();
            System.out.println("digite a altura da pessoa " + (i + 1));
            alt[i] = ent.nextDouble();
        }
        exibirRelatorio(pes, alt);
    }
}