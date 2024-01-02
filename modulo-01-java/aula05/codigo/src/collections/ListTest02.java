package collections;

import pessoa.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
  public static void main(String[] args) {
    ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>(List.of(new Funcionario("Mayra", 23), new Funcionario("Pedro")));
    listaDeFuncionarios.add(new Funcionario("João"));

    System.out.println(listaDeFuncionarios);

    Funcionario funcionario = new Funcionario();

    String teste = funcionario.toString();

    System.out.println(teste);
  }
}
