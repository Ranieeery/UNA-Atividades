import java.util.Scanner;
public class Main10 {
  public static void main(String[] args) {
    Scanner trabson = new Scanner(System.in);
    System.out.println("Insira o valor final da sua conta");
    double conta = trabson.nextDouble();

    System.out.printf("É recomendado que o valor da gorjeta seja de R$%.2f%n", conta * 0.1);
  }
}