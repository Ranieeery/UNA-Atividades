import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pesoPessoas, contagemMulher = 0, contagemHomem = 0;
        char sexoPessoas;

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o peso:");
            pesoPessoas = scanner.nextInt();
            System.out.printf("Insira o sexo seguindo a instrução abaixo:%n" + "H - Homem%n" + "M - Mulher%n");
            sexoPessoas = scanner.next().charAt(0);

            if (pesoPessoas >= 50 & pesoPessoas <= 70 & sexoPessoas == 'M') {
                contagemMulher++;
            }
            if (pesoPessoas >= 60 & pesoPessoas <= 80 & sexoPessoas == 'H') {
                contagemHomem++;
            }
        }

        System.out.printf("O número de homens entre os 60kg e 80kg são %d e o número de mulheres entre 50kg e 70kg são %d", contagemHomem, contagemMulher);
        scanner.close();
    }
}
