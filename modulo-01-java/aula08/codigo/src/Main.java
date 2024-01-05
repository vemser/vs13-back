import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // TRATANDO ENTRADA DO SCANNER

//    System.out.print("Digite um número: ");
//    Scanner scanner = new Scanner(System.in);
//    String entrada = scanner.nextLine();
//    int escolha;
//
//    try {
//      escolha = Integer.parseInt(entrada);
//    } catch (NumberFormatException e) {
//      System.err.println("Por favor, digite um número.");
//    }

    // STRING

    String nome = "Mayra";
    String nomeDois = "Mayra";

    System.out.println(nome.equals(nomeDois));

    System.out.println(nome == nomeDois);

//    nome = nome.concat(" oi");
    nome += " oi";

    System.out.println(nome);


    String nomeTres = new String("Mayra");
    String nomeQuatro = new String("Mayra");

    System.out.println(nomeTres == nomeQuatro);

    System.out.println("equals: " + nomeTres.equals(nomeQuatro));

    nomeTres = nomeTres.concat(" oi");

    System.out.println(nomeTres);

    // MAYRA OI

    nomeTres = nomeTres.substring(0, 5);

    System.out.println(nomeTres);

  }
}