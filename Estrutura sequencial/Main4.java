import java.util.Scanner;
public class Main4 {
  public static void main(String[] args) {
    Scanner losang = new Scanner(System.in);
    System.out.println("Insira o valor das duas diagonais em cm²");
    double diag1 = losang.nextDouble();
    double diag2 = losang.nextDouble();

    double area = (diag1 * diag2)/2;
    System.out.printf("A área do losango é %.2f cm²%n", area);
  }
}
    