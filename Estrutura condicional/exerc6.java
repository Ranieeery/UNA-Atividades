package EstruturaCondicional;
import java.util.Scanner;

public class exerc6{
    public static void main(String[] args){
        Scanner retorno = new Scanner(System.in);
            double funcaoX, x;
        System.out.println("Insira um numero:");
        x = retorno.nextDouble();

        if (x < -2){
            funcaoX = (2*x) + 2;
            System.out.println(funcaoX);
        } else if (-2 <= x && x < 3){
            System.out.println("3");
        } else if (3 <= x) {
            System.out.println(-x);
        }
    }
}