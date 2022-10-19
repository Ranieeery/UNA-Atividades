import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idadePessoas, contagemMulher = 0;
        char sexoPessoas;

        for (int i = 0; i < 9; i++) {
            System.out.println("Insira a idade:");
            idadePessoas = scanner.nextInt();
            System.out.printf("Insira o sexo seguindo a instrução abaixo:%n" + "H - Homem%n" + "M - Mulher%n" + "O - Outro%n");
            sexoPessoas = scanner.next().charAt(0);

            if (idadePessoas >= 20 & idadePessoas <= 40 & sexoPessoas == 'M') {
                contagemMulher++;
            }
        }

        System.out.println("O número de mulheres entre os 20 e 40 anos são " + contagemMulher);
        scanner.close();
    }
}
