package Lista_5;
//7. Lista de chamada. Ler o nome completo de 4 alunos em um array. Criar a função
//String gerarIniciais(String nomeCompleto), que devolve as iniciais em
//maiúscula separadas por ponto, e o procedimento exibirChamada(String[]
//nomes), que imprime no formato 1. maria da silva (M.D.S.).
import java.util.Scanner;

public class atv_7 {
    public static String gerariniciais(String nomecompleto) {
        String[] partes = nomecompleto.trim().split(" ");
        String inic = "";

        for (int i = 0; i < partes.length; i++) {
            if (partes[i].length() > 0) {
                inic += partes[i].toUpperCase().charAt(0) + ".";
            }
        }

        return inic;
    }

    public static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ". "
                    + nomes[i].trim().toLowerCase()
                    + " (" + gerariniciais(nomes[i]) + ")");
        }
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String[] nm = new String[4];

        for (int i = 0; i < nm.length; i++) {
            System.out.println("digite o nome completo do aluno " + (i + 1));
            nm[i] = ent.nextLine();
        }

        exibirChamada(nm);
    }
}