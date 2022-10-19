import java.util.Scanner;
public class Main7 {
  public static void main(String[] args) {
    Scanner dindin = new Scanner(System.in);
    System.out.println("Insira o valor do salário mínimo:");
    double salm = dindin.nextDouble();
    System.out.println("Insira o valor do seu salário");
    double ursal = dindin.nextDouble(); // ur salary
    double conta = ursal/salm;

    if (conta > 1){
      System.out.printf("O seu salário corresponde a um total de %.2f salários mínimos%n", conta);
    } else {
      System.out.printf("O seu salário corresponde a um total de %.2f salário mínimo%n", conta);
    }
  }
}