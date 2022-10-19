import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorNumero = Integer.MIN_VALUE, menorNumero = Integer.MAX_VALUE, numeroInserido;

        for (int i = 0; i < 9; i++) {
            System.out.println("Insira um número");
            numeroInserido = scanner.nextInt();

            if (numeroInserido >= maiorNumero) {
                maiorNumero = numeroInserido;
            }
            if (numeroInserido <= menorNumero) {
                menorNumero = numeroInserido;
            }
        }
        System.out.printf("O maior número é %d%n" + "e o menor número é %d", maiorNumero, menorNumero);
        scanner.close();
    }
}
