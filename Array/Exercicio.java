import java.util.Scanner;

class Exercicio  {
  public static void primeiroCodigo() {
    Scanner sc = new Scanner(System.in);
    int vetor[] = new int[6];
    int questao, controleMedia = 0;
    System.out.println("Insira o valor da questão que deseja ver a resolução:");
    questao = sc.nextInt();
    
    for(int i = 0; i < vetor.length; i++){
      System.out.printf("Insira o valor do %d termo de %d %n", i+1, vetor.length);
      vetor[i] = sc.nextInt();
    }
    sc.close();

    switch(questao){
      case 0:
    System.out.println("Resultado dos vetores:");
    for (int vetorPrint : vetor ){
      System.out.printf("%d, ", vetorPrint);
    }
      break;
      case 1:
    for (int i = 0; i < vetor.length; i++){
     int controle = 0;
      for (int j = 0; j <= vetor[i]; j++){
        controle = controle + j; 
      }
      System.out.printf("O somatório do %d° termo é %d %n", i + 1, controle);
   }
      break;
      case 2:
    for (int i = 0; i < vetor.length; i++){
      controleMedia = controleMedia + vetor[i];
    }
    System.out.println("A média dos valores é " + controleMedia/vetor.length);
        break;
      case 3:
        int par = 0, impar = 0;
        for (int i = 0; i < vetor.length; i++){
          if (vetor[i]%2 == 0){
            par++;
          } else {
            impar++;
          }
        }
        System.out.printf("A quantidade de números pares é %d e a de números impares é %d", par, impar);
        break;

      case 4:
        int i = 0, j = vetor.length - 1;
        while(i < j){
          int troca = vetor[i];
          vetor[i] = vetor[j];
          vetor[j] = troca;
          i++; j--;
        }
        for (int vetorPrint : vetor ){
          System.out.printf("%d, ", vetorPrint);
        }
        break;
    }
  }
}