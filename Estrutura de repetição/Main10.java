import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fatorialNumero = 1, controleRepeticao;
        System.out.println("Insira um número:");
        controleRepeticao = scanner.nextDouble();

        for (int i = 1; i <= controleRepeticao; i++) {
            fatorialNumero = fatorialNumero * i;
        }
        System.out.printf("O fatorial do número %.2f é %.2f%n", controleRepeticao, fatorialNumero);
        scanner.close();
    }
}