
import java.util.Scanner;

public class Questao_01 {
    public static void main(String[] args) {
        /* Um motorista precisa abastecer seu carro para uma viagem. O carro tem um consumo médio de combustível de 12 km por litro
            e o motorista planeja percorrer uma distância de 360 km. 
            Crie um programa que solicite o preço do combustível por litro ao usuário e calcule o custo total da viagem. 
            Além disso, informe quantos litros de combustível serão necessários para completar a viagem.
        */
        double precoLitro = 0;
        int distancia = 0;
        double litros = 0;
        double custo = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o preco do combustivel?");
         precoLitro = entrada.nextDouble();
        System.out.println("Quantos km vai percorrer?");
        distancia = entrada.nextInt();
        litros = distancia / 12;
        custo = litros * precoLitro;

        System.out.println("O custo total da viagem eh de R$" + custo);
        System.out.println("Quantidade de litros necessarios: " + litros);

        entrada.close ();
    }
}

