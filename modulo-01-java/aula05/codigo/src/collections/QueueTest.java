package collections;

import java.util.Arrays;
import java.util.LinkedList;

public class QueueTest {
  public static void main(String[] args) {
    LinkedList<String> fila = new LinkedList<>();
    fila.addAll(Arrays.asList("Maria", "Pedro", "Carlos"));

    System.out.println(fila);

    System.out.println(fila.indexOf("Pedro"));

    fila.poll();

    System.out.println(fila);

    System.out.println(fila.indexOf("Pedro"));

    fila.remove("Carlos");

    System.out.println(fila);


  }
}
