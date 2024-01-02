package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
  public static void main(String[] args) {
    // List.of("Pedro", "João")
    ArrayList<String> lista = new ArrayList<>();
    lista.addAll(Arrays.asList("Mayra", "Pedro", "João"));

    System.out.println(lista);

    ArrayList<Integer> listaNumeros = new ArrayList<>();
    listaNumeros.addAll(Arrays.asList(1, 2, 3));

    for(String nome : lista) {
      System.out.println(nome);
    }

    for(Object numero : listaNumeros) {
      System.out.println(numero);
    }

    lista.remove(1);

    System.out.println(lista);

  }
}
