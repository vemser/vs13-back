public class Pessoa {
  protected String nome;
  private int idade;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void conversar(Pessoa pessoaComQuemEstaConversando) {
    // mariana.nome
    System.out.println(this.nome + " está conversando com " + pessoaComQuemEstaConversando.nome);
  }
}
