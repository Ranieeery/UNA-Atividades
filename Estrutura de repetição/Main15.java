import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float primeiraNota, segundaNota, mediaNotas;

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Digite a primeira nota do %d° aluno%n", i);
            primeiraNota = scanner.nextInt();
            System.out.printf("Digite a segunda nota do %d° aluno%n", i);
            segundaNota = scanner.nextInt();

            mediaNotas = (primeiraNota + segundaNota) / 2;
            System.out.printf("A média das notas do %d° aluno é: %.1f%n", i, mediaNotas);
        }
        scanner.close();
    }
}
