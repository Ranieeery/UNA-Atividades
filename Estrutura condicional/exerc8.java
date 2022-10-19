package EstruturaCondicional;
import java.util.*;

public class exerc8 {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        double num1, num2, soma, mult, div, sub = 0;
        System.out.println("insira dois números: ");
        num1 = calc.nextDouble();
        num2 = calc.nextDouble();

        soma = num1+num2;
        mult = num1*num2;
        div = num1/num2;

        if (num1 > num2){
            sub = num1 - num2;
        } else if (num2 > num1) {
            sub = num2 - num1;
        } else if (num1 == num2) {
            sub = 0;
        }

        System.out.printf("Soma: %.2f%n" +
                "Multiplicação: %.2f%n" +
                "Subtração: %.2f%n" +
                "Divisão: %.2f%n", soma, mult, sub, div);
    }
}