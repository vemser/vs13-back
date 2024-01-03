package pessoa;

import interfaces.Filtro;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class PessoaCadastro {
  private ArrayList<Pessoa> lista;

  public PessoaCadastro() {
    this.lista = new ArrayList<>();
  }
  //adiciona()
  //adicionar()

  //CREATE
  public void adicionar(Pessoa pessoa) {
    lista.add(pessoa);
  }

  // READ
  public ArrayList<Pessoa> listarTudo() {
    return lista;
  }

  public void visualizar() {
    for (int i = 0; i < lista.size(); i++) {
      System.out.println("Id: " + i);
      System.out.println(lista.get(i));
      System.out.println("--------");
    }
  }

  public ArrayList<Pessoa> consultar(Filtro<Pessoa> filtro) {
    ArrayList<Pessoa> listaFiltrada = new ArrayList<>();

    for(Pessoa pessoa : lista) {
      if(filtro.avaliar(pessoa)) {
        listaFiltrada.add(pessoa);
      }
    }
    return listaFiltrada;
  }

//  public ArrayList<Pessoa> consultar(Predicate<Pessoa> filtro) {
//    ArrayList<Pessoa> listaFiltrada = new ArrayList<>();
//
//    for(Pessoa pessoa : lista) {
//      if(filtro.test(pessoa)) {
//        listaFiltrada.add(pessoa);
//      }
//    }
//    return listaFiltrada;
//  }

  // UPDATE
  public void editar(int index, Pessoa pessoaEditada) {
    Pessoa pessoa = lista.get(index);
    pessoa.setNome(pessoaEditada.getNome());
    pessoa.setIdade(pessoaEditada.getIdade());
    System.out.println("Edição realizada");
  }

  // DELETE
  public void remover(int index) {
    lista.remove(index);
  }

}


