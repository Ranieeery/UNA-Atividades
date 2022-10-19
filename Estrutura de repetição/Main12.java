import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroEntrada, numeroDivisao;
        System.out.println("Insira um número:");
        numeroEntrada = scanner.nextInt();

        for (int i = 1; i <= numeroEntrada; i++) {
            numeroDivisao = i%2;

            if (numeroDivisao == 1){
                System.out.println(i);
            }
        }
        System.out.println();
        scanner.close();
    }
}
