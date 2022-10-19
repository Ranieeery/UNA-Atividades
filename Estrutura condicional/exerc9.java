package EstruturaCondicional;
import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {
        Scanner hotel = new Scanner(System.in);

        System.out.println("Quantos dias você permaneceu no hotel?");
        int dias = hotel.nextInt();

        if (dias < 15) {
            double valor = (dias * 15) + 500;
            System.out.printf("O valor a ser pago será: R$%.2f", valor);
        } else if (dias == 15) {
            double valor = (dias * 10) + 500;
            System.out.printf("O valor a ser pago será: R$%.2f", valor);
        } else {
            double valor = (dias * 5) + 500;
            System.out.printf("O valor a ser pago será: R$%.2f ", valor);
        }
    }
}
