import java.util.Scanner;
public class Main6 {
  public static void main(String[] args) {
    Scanner eq = new Scanner(System.in);
    System.out.println("Insira os 3 termos da equação:");
    double a = eq.nextDouble();
    double b = eq.nextDouble();
    double c = eq.nextDouble();

    double x1 = ((-b + Math.sqrt((b*b)-4*a*c))/2*a);
    double x2 = ((-b - Math.sqrt((b*b)-4*a*c))/2*a);

    if (Double.isNaN(x1)||Double.isNaN(x2)){
      System.out.println("As raízes não são reais");      
    } else if (x1 == x2){
      System.out.printf("A única raíz da equação é %.2f", x1);
    } else {
      System.out.printf("As raízes da equação são %.2f e %.2f%n", x1, x2);
    }
  }
}
