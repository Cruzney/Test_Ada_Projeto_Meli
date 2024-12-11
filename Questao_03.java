
import java.util.Scanner;

public class Questao_03 {
    
    public static void main(String[] args) {
        /* Uma família está dividindo uma pizza entre seus membros. 
        Crie um programa que solicite o número de membros da família e o número de fatias da pizza. 
        O programa deve calcular quantas fatias cada membro vai receber, e informar se haverá sobras e quantas fatias sobrarão. 
        Se a pizza não puder ser igualmente dividida, o programa deve sugerir quantas fatias adicionais são necessárias para que todos recebam a mesma quantidade. 
        */
        
        int membros = 0, fatias = 0, sobras = 0;
        double fatiasPorMembro = 0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos membros da familia?");
        membros = entrada.nextInt();
        System.out.println("Quantas fatias da pizza?");
        fatias = entrada.nextInt();
        fatiasPorMembro = fatias / membros;
        sobras = fatias % membros;
        if (sobras == 0) {
            System.out.println("Cada membro recebeu " + fatiasPorMembro + " fatias.");
        } else {
            System.out.println("Cada membro recebeu " + fatiasPorMembro + " fatias.");
            System.out.println("Sobraram " + sobras + " fatias.");
            System.out.println("Sugerimos adicionar " + (membros - sobras) + " fatias.");
        }
        entrada.close();
    }
    
}
