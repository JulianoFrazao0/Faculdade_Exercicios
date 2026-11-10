package Lista_3;
//2. Soma de todos. Ler uma matriz 3x3 de números inteiros e mostrar a soma de todos os
//elementos.
//Dica: crie int soma = 0 antes dos for e vá somando cada m[i][j].
//Entrada: 1 2 3 4 5 6 7 8 9
//Saída: Soma: 45

public class atv_2 {
    public static void main (String[] args){
        int [][] matriz  = new int [3][3];
        int soma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz [i].length; j++){
                matriz[i][j] = Integer.parseInt(IO.readln("coloq para posicao [" + i + "][" + j + "]: "));
                        soma +=matriz[i][j];
                System.out.println("A soma dos elementos  é " + soma);
            }
        }

    }
}
