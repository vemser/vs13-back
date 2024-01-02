package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapTest {
  public static void main(String[] args) {
    Map<String, String> dicionario = new HashMap<>();
    dicionario.put("maçã", "apple");
    dicionario.put("celular", "cellphone");
    dicionario.put("roupas", "clothes");

    System.out.println(dicionario.get("celular"));

    System.out.println(dicionario.remove("roupas"));

    System.out.println(dicionario);

  }
}
