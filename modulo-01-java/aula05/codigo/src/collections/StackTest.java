package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackTest {
  public static void main(String[] args) {
    Stack<String> pilhaDePratos = new Stack<>(){};
    pilhaDePratos.addAll(Arrays.asList("Prato 1", "Prato 2", "Prato 3"));

    System.out.println(pilhaDePratos);

    System.out.println(pilhaDePratos.peek());

    pilhaDePratos.pop();

    System.out.println(pilhaDePratos);

    System.out.println(pilhaDePratos.indexOf("Prato 1"));
  }
}
