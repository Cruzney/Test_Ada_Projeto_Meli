
import java.util.Scanner;

public class Questao_02 {

    public static void main(String[] args) {
        /* Dada uma turma de alunos com N alunos, sendo que essa quantidade deve ser solicitada e definida pelo usuário, 
        solicite o nome e a nota de cada um dos alunos. Seu programa deve imprimir apenas aqueles alunos que tiraram nota 
        maior que a média da nota de todos os alunos. */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos alunos tem na turma?");
        int alunos = entrada.nextInt();
        double[] notas = new double[alunos];
        String[] nomes = new String[alunos];

        for (int i = 0; i < alunos; i++) {
            System.out.println("Digite o nome do º" + (i + 1 ) + " " + "aluno" + ":");
            nomes[i] = entrada.next();
            System.out.println("Digite a nota do º" + (i + 1 ) + " " + "aluno" + " :");
            notas[i] = entrada.nextDouble();
        }

        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media = media / notas.length;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println();
                System.out.println("Alunos com notas acima da média");
                System.out.println("Aluno: " + nomes[i] + " Nota: " + notas[i]);
                System.out.println("Média: " + media);
            }
        }
        entrada.close();

    }
}

