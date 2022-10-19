import java.util.Scanner;
public class Main9 {
  public static void main(String[] args) {
    Scanner posit = new Scanner(System.in);
    System.out.println("Digite um número positivo:");
    double valor = posit.nextDouble();

    for (int i = 0; valor < 0; i++){
        System.out.println("Favor inserir um número POSITIVO:");
        valor = posit.nextDouble();
    }
      if (valor >= 0){
      System.out.printf("a. %.2f%n", Math.pow(valor,2));
      System.out.printf("b. %.2f%n", Math.pow(valor,3));
      System.out.printf("c. %.2f%n", Math.sqrt(valor));
      System.out.printf("d. %.2f%n", Math.cbrt(valor));
      }
    }
  }

