package pessoa;

public abstract class Pessoa {
  protected String nome;
  protected int idade;

  public Pessoa() {
  }

  public Pessoa(String nome) {
    this.nome = nome;
  }

  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
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

  public void conversar(String nome) {
    System.out.println(this.nome + " está conversando com " + nome);
  }

  @Override
  public String toString() {
    return "Pessoa{nome:" + this.nome + ", idade: " + this.idade + "}";
  }
}
