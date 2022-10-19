package EstruturaCondicional;
import java.util.Scanner;

public class exerc11 {
    public static void main(String[] args) {
        Scanner hotel = new Scanner(System.in);

        System.out.printf("Em qual apartamento você está?%n" +
                "1- Apto simples%n" +
                "2- Apto duplo%n");
        int apto = hotel.nextInt();
        System.out.println("Quantos dias você ficou?: ");
        int dias = hotel.nextInt();

        if (apto == 1) {
            int valor;
            if (dias < 10) {
                valor = dias * 100;
                System.out.printf("Deve pagar: R$%d,00", valor);
            } else if (dias < 15) {
                valor = dias * 90;
                System.out.printf("Deve pagar: R$%d,00", valor);
            } else {
                valor = dias * 80;
                System.out.printf("Deve pagar: R$%d,00", valor);
            }
        } else {
            int valor;
            if (dias < 10) {
                valor = dias * 140;
                System.out.printf("Deve pagar: R$%d,00", valor);
            } else if (dias < 15) {
                valor = dias * 120;
                System.out.printf("Deve pagar: R$%d,00", valor);
            } else {
                valor = dias * 100;
                System.out.printf("Deve pagar: R$%d,00", valor);
            }
        }
    }
}
