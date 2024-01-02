import pessoa.Funcionario;

public class Gerente extends Funcionario {
  String equipe;

  public Gerente() {}

  public Gerente(String nome) {
    super(nome);
  }

  // SOBREPOSIÇÃO / SOBRESCRITA DE MÉTODOS

  @Override
  public void conversar(String nome) {
    System.out.println("O gerente " + this.nome + " está conversando com " + nome);
  }
}
