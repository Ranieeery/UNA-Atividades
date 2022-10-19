package EstruturaCondicional;
import java.util.Scanner;

public class exerc10 {
    public static void main(String[] args) {
        int sexo, idade;
        float preco;

        Scanner acad = new Scanner(System.in);
        System.out.printf("Qual o seu sexo? %n" +
                "1- Homem %n" +
                "2- Mulher %n");
        sexo = acad.nextInt();
        System.out.println("Qual a sua idade?");
        idade = acad.nextInt();

        if (sexo == 1) {
            if (idade < 15) {
                System.out.println("O valor da mensalidade é de R$60");
            } else if (idade < 18 && idade > 16) {
                System.out.println("O valor da mensalidade é de R$75");
            } else if (idade < 30 && idade > 19) {
                System.out.println("O valor da mensalidade é de R$90");
            } else if (idade < 40 && idade > 31) {
                System.out.println("O valor da mensalidade é de R$85");
            } else {
                System.out.println("O valor da mensalidade é de R$80");
            }
        } else {
            if (idade < 18) {
                System.out.println("O valor da mensalidade de R$60,00");
            } else if (idade < 25 && idade > 19) {
                System.out.println("O valor da mensalidade de R$90");
            } else if (idade < 40 && idade > 26) {
                System.out.println("O valor da mensalidade de R$85");
            } else {
                System.out.println("O valor da mensalidade de R$80");
            }
        }
    }
}
