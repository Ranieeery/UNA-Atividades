import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Qual exercício gostaria de ver a resolução?%n" + "1 - Questão 1 %n" + "2 - Questão 2 %n");
        int questaoNumero = scanner.nextInt();
        exercicios(questaoNumero);
    }

    public static void exercicios(int questaoNumero) {
        switch (questaoNumero) {
            case 1 -> exercicio1();
            case 2 -> exercicio2();
            default -> {
                System.out.println("Número inválido");
                menu();
            }
        }
    }

    public static void exercicio1() {
        Questoes.primeiraQuestao();
        Questoes.segundaQuestao();
        Questoes.terceiraQuestao();
        Questoes.quartaQuestao();
        Questoes.quintaQuestao();
    }

    public static void exercicio2() {
        Questoes.sextaQuestao();
    }
}