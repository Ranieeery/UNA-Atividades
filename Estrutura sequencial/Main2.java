import java.util.Scanner;
public class Main2 {
  public static void main(String[] args) {
    Scanner idade = new Scanner(System.in);
    System.out.println("Digite o ano que você nasceu: ");
    int ano = idade.nextInt();

    int idadehj = (2022 - ano);
    int idade2050 = (2050 - ano);
    System.out.printf("Atualmente você tem %d anos e em 2050 terá %d anos%n", idadehj, idade2050);
  }
}