import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pesoPessoas, idadePessoas, controleIdade = 0, mediaNotas, contagemPeso = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.printf("Digite o peso da %d° pessoa%n", i);
            pesoPessoas = scanner.nextInt();
            System.out.printf("Digite a idade da %d° pessoa%n", i);
            idadePessoas = scanner.nextInt();

            if (pesoPessoas >= 90){
                contagemPeso++;
            }
            controleIdade = controleIdade + idadePessoas;
        }
        System.out.printf("O número de pessoas com peso maior de 90kg são %d e a média das idades é %d", contagemPeso, controleIdade/7);
        scanner.close();
    }
}
