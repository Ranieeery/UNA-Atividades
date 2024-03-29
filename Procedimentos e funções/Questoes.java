import java.util.Scanner;

class Questoes {
    //Número 1
    public static void primeiraQuestao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.a Insira um numero inteiro:");
        int inteiro = scanner.nextInt();
        System.out.println("O dobro desse número é " + QuestoesCalculos.letra_a(inteiro));
    }

    public static void segundaQuestao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.b Insira os valores para comparar:");
        int valorUm = scanner.nextInt();
        int valorDois = scanner.nextInt();
        System.out.println("O maior valor é " + QuestoesCalculos.letra_b(valorUm, valorDois));
    }

    public static void terceiraQuestao() {
        Scanner scanner = new Scanner(System.in);
        float valorUm, valorDois, valorTres;
        System.out.println("1.c Insira três números reais");
        valorUm = scanner.nextFloat();
        valorDois = scanner.nextFloat();
        valorTres = scanner.nextFloat();
        System.out.printf("A média dos números é igual a %.2f%n", QuestoesCalculos.letra_c(valorUm, valorDois, valorTres));
    }

    public static void quartaQuestao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.d Insira um número inteiro:");
        int inteiro = scanner.nextInt();
        System.out.println("O fatorial desse número é igual a " + QuestoesCalculos.letra_d(inteiro));
    }

    public static void quintaQuestao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.e Insira um número inteiro e positivo:");
        int inteiro = scanner.nextInt();
        if (inteiro < 0) {
            System.out.println("Você inseriu um valor negativo, este será convertido para seu módulo");
            inteiro = Math.abs(inteiro);
        }
        System.out.println("O somatório do número é igual a " + QuestoesCalculos.letra_e(inteiro));

    }

    //Número 2
    public static void sextaQuestao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira dois valores:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("Resultados: %n" + "Soma: %d%n" + "Subtração: %d%n" + "Multiplicação: %d%n", +QuestoesCalculos.soma(a, b), QuestoesCalculos.subtracao(a, b), QuestoesCalculos.multiplicacao(a, b));
    }
}

