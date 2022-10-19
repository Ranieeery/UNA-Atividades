import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorNota = Integer.MIN_VALUE, menorNota = Integer.MAX_VALUE, notaAluno;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite a primeira nota do %d° aluno%n", i);
            notaAluno = scanner.nextInt();

            if (notaAluno >= maiorNota) {
                maiorNota = notaAluno;
            }
            if (notaAluno <= menorNota) {
                menorNota = notaAluno;
            }
        }
        System.out.printf("A maior nota é %d e a menor nota é %d", maiorNota, menorNota);
        scanner.close();
    }
}
