package interfaces;

@FunctionalInterface
public interface Filtro<T> {
  boolean avaliar(T objeto);
}
