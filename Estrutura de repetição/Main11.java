import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroBase, numeroExpoente, controleCalculo = 1;
        System.out.println("Insira dois números:");
        numeroBase = scanner.nextInt();
        numeroExpoente = scanner.nextInt();

        for (int i = 1; i <= numeroExpoente; i++) {
            controleCalculo = controleCalculo * numeroBase;
        }
        System.out.println("O resultado da potência é " + controleCalculo);
        scanner.close();
    }
}
