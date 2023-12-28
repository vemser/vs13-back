public class Pessoa {
  String nome;

  public void conversar(Pessoa pessoaComQuemEstaConversando) {
    // mariana.nome
    System.out.println(this.nome + " está conversando com " + pessoaComQuemEstaConversando.nome);
  }
}
