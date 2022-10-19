import java.util.Scanner;
public class Main8 {
  public static void main(String[] args) {
    Scanner tabuada = new Scanner(System.in);
    System.out.println("Insira o número que deseja ver a tabuada:");
    int num = tabuada.nextInt();
    System.out.printf("Segue abaixo a tabuada do número %d%n", num);

    for (int i = 1; i <= 11; i++){
      if (i > 10) {
        System.out.println("Tabuada calculada com sucesso");
      } else {
        System.out.printf("%d x %d = %d%n", num, i, num*i);
        //tem uma mais avançada no git
      }
    }
  }
}