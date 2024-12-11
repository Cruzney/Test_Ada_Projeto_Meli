import java.util.Scanner;

public class Questao_04 {
    
    public static void main(String[] args) {
        /* Um número para ser considerado primo deve ser divisível apenas por 1 e ele mesmo. 
        Considerando isso, crie um programa que vai solicitar um número para o usuário e dizer se ele é primo.
        */
        int numero = 0;
        Scanner entnum = new Scanner(System.in);
        System.out.println("Informe um numero Inteiro, vamos testar se é Primo :-) :");
        numero = entnum.nextInt();

        int divisores = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            System.out.println("O numero " + numero + " é primo");
        } else {
            System.out.println("O numero " + numero + " não é primo");
        }
        entnum.close ();

    }
    
}
