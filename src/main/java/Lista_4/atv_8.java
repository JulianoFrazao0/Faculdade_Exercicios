package Lista_4;
// Ler as notas de 10 alunos de uma turma. Contar quantos
//foram aprovados com nota maior ou igual a 6, quantos
//ficaram em recuperação com nota maior ou igual a 4 e
//quantos foram reprovados abaixo disso.
import java.util.Scanner;

public class atv_8 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double[] nts = new double[10];
        int apro = 0;
        int recu = 0;
        int rep = 0;
        for (int i = 0; i < nts.length; i++) {
            System.out.println("digite a nota do aluno: " + (i + 1));
            nts[i] = ent.nextDouble();
            if (nts[i] >= 6) {
                apro++;
            } else if (nts[i] >= 4) {
                recu++;
            } else {
                rep++;
            }
        }
        System.out.println("aprovados " + apro);
        System.out.println("em recuperacao " + recu);
        System.out.println("reprovados " + rep);
    }
}

