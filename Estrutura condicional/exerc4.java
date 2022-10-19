package EstruturaCondicional;
import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        double imc, peso, altura;
        Scanner massaCorporal = new Scanner(System.in);
        System.out.println("Indique o seu peso em kg");
        peso = massaCorporal.nextDouble();
        System.out.println("Indique a sua altura em metros");
        altura = massaCorporal.nextDouble();
        imc = peso/Math.pow(altura, 2);

        if (imc < 20) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 20 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobre peso");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("Obeso");
        } else if (imc >= 40) {
            System.out.println("Obeso mórbido");
        }
    }
}
