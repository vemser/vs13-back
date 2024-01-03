package pessoa;

public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa() {}
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  @Override
  public String toString() {
    return "Pessoa{nome: " + this.nome + ", idade: " + this.idade + "}";
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}
