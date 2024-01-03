import interfaces.Filtro;
import pessoa.Pessoa;
import pessoa.PessoaCadastro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
  public static void main(String[] args) {
    PessoaCadastro lista = new PessoaCadastro();
    lista.adicionar(new Pessoa("Mayra", 20));
    lista.adicionar(new Pessoa("Carlos", 14));
    lista.adicionar(new Pessoa("João", 50));
    lista.adicionar(new Pessoa("Marcos", 40));

//    lista.visualizar();

//    lista.editar(1, new Pessoa("Carlos", 8));

//    lista.visualizar();

    // CLASSE ANÔNIMA

//    Predicate<Pessoa> ehMaiorDeIdade = new Predicate<Pessoa>() {
//      @Override
//      public boolean test(Pessoa pessoa) {
//        return pessoa.getIdade() > 18;
//      }
//    };

//    Function<Pessoa, Boolean> ehMaiorDeIdade = new Function<Pessoa, Boolean>() {
//      @Override
//      public Boolean apply(Pessoa pessoa) {
//        return pessoa.getIdade() > 18;
//      }
//    };

//    System.out.println(lista.consultar(ehMaiorDeIdade));

    // LAMBDA EXPRESSIONS
//
//    System.out.println(lista.consultar(pessoa -> pessoa.getIdade() > 18));
//    System.out.println(lista.consultar(pessoa -> pessoa.getNome().equals("Mayra")));
//    System.out.println(lista.consultar(pessoa -> pessoa.getNome().contains("M")));

    List<Pessoa> listaDePessoas = lista.listarTudo();

//    ArrayList<Pessoa> listaDois = new ArrayList<>(listaDePessoas);

//    listaDePessoas.sort((pessoa1, pessoa2) -> pessoa1.getIdade() - pessoa2.getIdade());
//    listaDePessoas.sort(Comparator.comparingInt(Pessoa::getIdade));
    listaDePessoas.sort((pessoa1, pessoa2) -> Integer.compare(pessoa1.getIdade(), pessoa2.getIdade()));

//    System.out.println(listaDePessoas);

//    Comparator<Pessoa> ordernarPorIdade = new Comparator<>() {
//      @Override
//      public int compare(Pessoa pessoa1, Pessoa pessoa2) {
//        return Integer.compare(pessoa1.getIdade(), pessoa2.getIdade());
//      }
//    };

//    listaDePessoas.sort(ordernarPorIdade);

//    System.out.println(listaDePessoas);

    //listaDePessoas.sort((pessoa1, pessoa2) -> CharSequence.compare(pessoa1.getNome(), pessoa2.getNome()));

//    System.out.println(listaDePessoas);

//    Comparator<Pessoa> ordernarPorNome = new Comparator<>() {
//      @Override
//      public int compare(Pessoa pessoa1, Pessoa pessoa2) {
//        return CharSequence.compare(pessoa1.getNome(), pessoa2.getNome());
//      }
//    };
//
//    listaDePessoas.sort(ordernarPorNome);
//
//    System.out.println(listaDePessoas);

  }
}