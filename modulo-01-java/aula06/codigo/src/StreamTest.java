import pessoa.Pessoa;
import pessoa.PessoaCadastro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
  public static void main(String[] args) {
    PessoaCadastro lista = new PessoaCadastro();
    lista.adicionar(new Pessoa("Mayra", 20));
    lista.adicionar(new Pessoa("Carlos", 14));
    lista.adicionar(new Pessoa("João", 50));
    lista.adicionar(new Pessoa("Marcos", 40));

    ArrayList<Pessoa> listaDePessoas = lista.listarTudo();

    listaDePessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));

//    ArrayList<Pessoa> listaMaioresDeIdade = listaDePessoas
//        .stream()
//        .filter(pessoa -> pessoa.getIdade() > 18)
//        .collect(Collectors.toCollection(() -> new ArrayList<>()));

    ArrayList<Pessoa> listaDeMaioresDeIdade = listaDePessoas
        .stream()
        .filter(pessoa -> pessoa.getIdade() > 18)
        .collect(Collectors.toCollection(ArrayList::new));

    List<Integer> inteiros = new ArrayList<>(List.of(1, 2, 4, 20));

//    inteiros = inteiros.stream().filter(numero -> numero > 10).collect(Collectors.toList());
    inteiros = inteiros.stream().filter(numero -> numero > 10).toList();

    System.out.println(listaDeMaioresDeIdade);

    ArrayList<Pessoa> listaOrdenada = listaDePessoas
        .stream()
        .sorted(Comparator.comparing(Pessoa::getNome))
        .collect(Collectors.toCollection(ArrayList::new));

  // TAMBÉM DÁ PRA FAZER ASSIM:

//    ArrayList<Pessoa> listaOrdenada = listaDePessoas
//        .stream()
//        .sorted(Comparator.comparing(pessoa -> pessoa.getNome()))
//        .collect(Collectors.toCollection(ArrayList::new));

    System.out.println(listaOrdenada);

  }
}
