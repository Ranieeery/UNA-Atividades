import java.util.Scanner;
public class Main12 {
  public static void main(String[] args) {
    Scanner imc = new Scanner(System.in);
    
    System.out.println("Digite a altura (em metros):");
    double altura = imc.nextDouble();

    System.out.printf("O peso ideal é %.2fkg%n", (72.7*altura)-58);
  }
}
