import java.util.Scanner;
public class Main5 {
  public static void main(String[] args) {
    Scanner temp = new Scanner(System.in);
    System.out.println("Insira o valor da temperatura em Celsius:");
    double fahren = temp.nextDouble();
    double result = (fahren * 1.8) + 32;
    System.out.printf("O valor da temperatura em fahrenreit é %.2f °F%n", result);
  }
}