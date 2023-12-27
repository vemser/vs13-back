import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int[] numeros = new int[3];

//    numeros = {1, 2, 3};
//    int[] numeros = new int[]{1, 2, 3};

//    numeros[0] = 2;
//    numeros[1] = 2;
//    numeros[2] = 3;
//
//    int soma = numeros[0] + numeros[1] + numeros[2];
//    double media = (double) soma / numeros.length;
//
//    System.out.println("Soma: " + soma + "\nMédia: " + media);
//
//    String[] estadosSul = {"Rio Grande do Sul", "Santa Catarina", "Paraná"};
//
//    System.out.println(Arrays.toString(estadosSul));
//
//    double[] numerosFlutuantes = {1.28, 5.40, 3.10};
//
//    System.out.println(numerosFlutuantes[0]);
//    System.out.println(numerosFlutuantes[1]);
//    System.out.println(numerosFlutuantes[2]);
//
//    System.out.printf("%.1f %f \n", numerosFlutuantes[0], numerosFlutuantes[2]);
//
//    System.out.println(numerosFlutuantes.length);
//    System.out.printf("%s \n", "\uD83D\uDE01");

    // matrizes
//
//    int[][] matriz = {
//        {1, 2, 5},
//        {3, 4, 7}
//    };
//
//    System.out.println(matriz[0][1]);
//    System.out.println(matriz[0][2]);
//    System.out.println(matriz[1][0]);
//
//    int[] array = {10, 20, 25};
//    int somaDoArray = 0;
//
//    for (int i = 0; i < array.length; i++) {
//      somaDoArray += array[i];
//    }
//
//    System.out.println(somaDoArray);
//
//    double mediaDoArray = (double) somaDoArray / array.length;
//
//    System.out.println(mediaDoArray);
//
//    String[] arrayDeAlunos = {"Maria", "João", "Pedro"};
//
//    for(String aluno : arrayDeAlunos) {
//      System.out.println(aluno);
//    }

    // WHILE

//    int opcao = 1;
//    Scanner scanner = new Scanner(System.in);
//
//    while (opcao != -1) {
//
//      System.out.println("""
//            Digite a opção desejada:
//            1 - Reclamação
//            2 - Sugestão
//
//            -1 - Sair do programa
//
//            """);
//      opcao = scanner.nextInt();
//
//      switch(opcao) {
//        case 1:
//          System.out.println("Você fez uma reclamação");
//          break;
//        case 2:
//          System.out.println("Você fez uma sugestão");
//          break;
//        default:
//          System.out.println("Opção inválida");
//      }
//
//    }

    // DO WHILE

//    int opcao;
//    Scanner scanner = new Scanner(System.in);
//
//    do {
//      System.out.println("""
//            Digite a opção desejada:
//            1 - Reclamação
//            2 - Sugestão
//
//            -1 - Sair do programa
//
//            """);
//      opcao = scanner.nextInt();
//
//      switch(opcao) {
//        case 1:
//          System.out.println("Você fez uma reclamação");
//          break;
//        case 2:
//          System.out.println("Você fez uma sugestão");
//          break;
//        default:
//          System.out.println("Opção inválida");
//      }
//    } while(opcao != -1);

    int contador = 10;

    while (contador < 5) {
      System.out.println("Entrei no while 1");
    }

    do {
      System.out.println("Entrei no while 2");
    } while (contador < 5);
  };
}