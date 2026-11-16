package Lista_6;
//3. Maior valor. Ler uma matriz 3x3 de números inteiros e mostrar o maior valor digitado.
//Dica: comece com int maior = m[0][0] e compare com todos os outros.
//Entrada: 4 7 1 9 2 6 3 8 5
//Saída: Maior valor: 9

public class atv_3 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln("coloque valor para posicao [" + i + "][" + j + "]: "));
            }
        }

        int maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("maior: " + maior);
    }
}
