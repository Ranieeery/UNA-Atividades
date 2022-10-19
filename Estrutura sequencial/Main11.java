import java.util.Scanner;
public class Main11 {
  public static void main(String[] args) {
    Scanner posit = new Scanner(System.in);
    System.out.println("Digite um número inteiro:");
    int num = posit.nextInt();
    float metade = num;

      System.out.printf("a. Antecessor: %d%n", num-1);
      System.out.printf("b. Sucessor: %d%n", num+1);
      System.out.printf("c. Dobro: %d%n", num*2);
      System.out.printf("d. Metade: %.2f%n", metade/2);
    }
  }