package EstruturaCondicional;
import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner aluno = new Scanner(System.in);
        System.out.println("Insira a nota das duas provas");
        double nota1 = aluno.nextDouble();
        double nota2 = aluno.nextDouble();
        double total = (nota1 + nota2) / 2;

        if (total >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
