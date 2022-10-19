import java.util.Scanner;
public class Main14 {
  public static void main(String[] args) {
    double a, b, c;
    Scanner troca = new Scanner(System.in);
    System.out.println("Insira dois valores :");
    a = troca.nextDouble();
    b = troca.nextDouble();
    
    a = a + b;
    b = a - b;
    a = a - b;
    //ah como tenho saudades de C++...

    System.out.printf("a. %.2f%nb. %.2f%n", a, b);
  }
}