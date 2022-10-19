import java.util.Scanner;
public class Main3 {
  public static void main(String[] args) {
    Scanner dindin = new Scanner(System.in);
    System.out.println("Insira o valor em dólar:");
    double dolar = dindin.nextDouble();
    System.out.println("Insira o valor do dolar:");
    double cot = dindin.nextDouble();
    System.out.printf("O valor em real hoje é R$%.2f%n", dolar*cot); 
  }
}
