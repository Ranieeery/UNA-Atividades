package EstruturaCondicional;
import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner eq = new Scanner(System.in);
        System.out.println("Insira os 3 termos da equação:");
        double a = eq.nextDouble();
        double b = eq.nextDouble();
        double c = eq.nextDouble();

        double delta = (b*b)-4*a*c;
        double x1 = ((-b + Math.sqrt(delta))/2*a);
        double x2 = ((-b - Math.sqrt(delta))/2*a);

        if (delta < 0){
            System.out.println("Não existe raíz real");
        } else if (delta == 0){
            System.out.println("Existe somente uma raíz real");
        } else if (delta > 0){
            System.out.println("Existem duas raízes reais");
        }
    }
}