package generics;

import java.util.ArrayList;

public class ListaGenerica<T> {
  private ArrayList<T> lista;

  public ListaGenerica() {
    this.lista = new ArrayList<>();
  }

  public void adicionar(T elemento) {
    this.lista.add(elemento);
  }

  public T visualizar(int index) {
    return this.lista.get(index);
  }

  public void listar() {
    for (int i = 0; i < lista.size(); i++) {
      System.out.println("id: " + i
          + "\n" + lista.get(i)
          + "\n-------------");
    }
  }

  public void remover(int index) {
    this.lista.remove(index);
  }

  public void editar(int index, T elementoEditado) {
    this.lista.set(index, elementoEditado);
  }



}