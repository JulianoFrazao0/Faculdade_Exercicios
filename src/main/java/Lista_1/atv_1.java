//1. As notas de um aluno são {7.5, 6.0, 8.0, 5.5}. Criar o
//array com lista entre chaves e imprimir a quantidade de
//notas, a primeira nota e a última nota, obtendo o último
//índice por meio de length.
package Lista_1;

public class atv_1 {
    public static void main (String[] args){
        double[] notas = {7.5, 6.0, 8.0, 5.5};
        System.out.println(notas.length);
        System.out.println(notas[0]);
        System.out.println(notas[notas.length - 1]);

    }

}
