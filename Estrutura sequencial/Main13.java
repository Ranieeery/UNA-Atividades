import java.util.Scanner;
public class Main13 {
  public static void main(String[] args) {
    Scanner imc = new Scanner(System.in);
    
    System.out.println("Digite a altura (em metros):");
    double altura = imc.nextDouble();

    System.out.printf("O peso ideal é %.2fkg%n", (62.1*altura)-44,7);
  }
}