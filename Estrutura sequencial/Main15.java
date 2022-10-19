import java.util.Scanner;
public class Main15 {
  public static void main(String[] args) {
    Scanner tse = new Scanner(System.in);
    long eleitor, lula, bolsonaro;
    double bolsototal, lulatotal, nulo;
    String vencedor;
    
    System.out.println("Insira o número total de eleitores");
    eleitor = tse.nextInt();
    System.out.println("Quantos votaram no candidato do Partido dos Trabalhadores, Bolsonaro?");
    bolsonaro = tse.nextInt();
    System.out.println("Quantos votaram no candidato do Partido Liberal, Lula?");
    lula = tse.nextInt();
    nulo = (eleitor - lula - bolsonaro)*100/eleitor;
    bolsototal = bolsonaro*100/eleitor;
    lulatotal = lula*100/eleitor;
    
    if (bolsonaro > lula){
    vencedor = "Bolsonaro";
    } else {
    vencedor = "Lula";
    }

    if (lula + bolsonaro > eleitor){
      System.out.println("Eleição ANULADA!!! Fraude detectada");
    } else {
      System.out.printf("Contagem de votos:%n - Bolsonaro 13: %.2f %n - Lula 22: %.2f %n - Nulos: %.2f %nLogo, o vencedor da eleição foi o candidato %s%n", bolsototal, lulatotal, nulo, vencedor);
    }
  }
}