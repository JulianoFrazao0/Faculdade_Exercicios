package Lista_6;
//4. Contar pares. Ler uma matriz 2x3 (2 linhas e 3 colunas) de números inteiros e mostrar
//quantos números pares foram digitados.
//Dica: número par é aquele em que m[i][j] % 2 == 0.
//Entrada: 4 7 10 3 8 5
//Saída: Quantidade de pares: 3

public class atv_4 {
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        int pares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln("digte vaor para posicao [" + i + "][" + j + "]: "));

                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }
        System.out.println(" pares: " + pares);
    }
}
