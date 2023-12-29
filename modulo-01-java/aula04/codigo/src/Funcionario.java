public class Funcionario {
  private String nome;
  private String cpf;
  private String dataDeNascimento;
  private static String pais = "Brasil";

  public Funcionario() {}

//  public String baterPonto() {
//    return "O funcionário bateu o ponto!";
//  }

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

  public static void setPais(String pais) {
    Funcionario.pais = pais;
  }

  public void baterPonto() {
    System.out.println(nome + " bateu o ponto!");
  }
}
