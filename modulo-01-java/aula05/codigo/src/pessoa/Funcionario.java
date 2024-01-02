package pessoa;

import pessoa.Pessoa;

public class Funcionario extends Pessoa {
  private String cpf;
  private String dataDeNascimento;
  protected static final String pais = "Brasil";
  private double salario;

  public Funcionario() {}

  public Funcionario(String nome) {
    super(nome);
  }

  public Funcionario(String nome, int idade) {
    super(nome, idade);
  }

  public Funcionario(String cpf, String dataDeNascimento) {
    this.cpf = cpf;
    this.dataDeNascimento = dataDeNascimento;
  }

  public Funcionario(String nome, int idade, String cpf, String dataDeNascimento, double salario) {
    super(nome, idade);
    this.cpf = cpf;
    this.dataDeNascimento = dataDeNascimento;
  }

  // SOBRECARGA DE MÉTODOS

  public double calcularSalarioLiquido() {
    return this.salario*0.85;
  }

  public double calcularSalarioLiquido(double aumento) {
    return calcularSalarioLiquido()+aumento;
  }

  // SOBREPOSIÇÃO / SOBRESCRITA DE MÉTODOS

  @Override
  public void conversar(String nome) {
    System.out.println("O funcionário " + this.nome + " está conversando com " + nome);
  }

  public double getSalario() {
    return this.salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setDataDeNascimento(String dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
  }

  public String getCpf() {
    return this.cpf;
  }

  public String getDataDeNascimento() {
    return this.dataDeNascimento;
  }

  public static String getPais() {
    return pais;
  }

  public void baterPonto() {
    System.out.println(nome + " bateu o ponto!");
  }
}
