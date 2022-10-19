package EstruturaCondicional;
import java.util.Scanner;

public class exerc7 {
    public static void main(String[] args) {
        Scanner triang = new Scanner(System.in);
        double ladoA, ladoB, ladoC, somaA, somaB, somaC;
        System.out.println("Insira os três pontos de um possível triangulo: ");
        ladoA = triang.nextDouble();
        ladoB = triang.nextDouble();
        ladoC = triang.nextDouble();

        somaA = ladoB + ladoC;
        somaB = ladoA + ladoC;
        somaC = ladoA + ladoB;

        if (ladoA < somaA && ladoB < somaB && ladoC < somaC) {
            System.out.println("É um triângulo existente");
        } else {
            System.out.println("Não é um triângulo existe");
        }
    }
}
