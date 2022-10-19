import java.util.Scanner;
public class Main1 {
  public static void main(String[] args) {
    Scanner monitor = new Scanner(System.in);
    System.out.println("Digite os três números");
    float primeiroNumero = monitor.nextFloat();
    float segundoNumero = monitor.nextFloat();
    float terceiroNumero = monitor.nextFloat();
    float Media = (primeiroNumero + segundoNumero + terceiroNumero)/3; 
    
    System.out.printf("A média é %.2f %n", Media);
  }
}