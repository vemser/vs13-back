package conta;

public class Conta {
  public String nome;
  public String cpf;
  private double saldoDaContaCorrente = 0;
  private static double chequeEspecial = 200;

  public Conta() {
    this.nome = "Padrão";
  }

  // construtor parametrizado
  public Conta(String nome){
    this.nome = nome;
  }

  public Conta(String nome, String cpf){
    this.nome = nome;
  }

  public void fazerDeposito(double valorDoDeposito) {
    if(valorDoDeposito > 0) {
      this.saldoDaContaCorrente += valorDoDeposito;
      System.out.println("Depósito efetuado com sucesso!");
    } else {
      System.out.println("Valor de depósito inválido");
    }
  }

  public void fazerSaque(double valorDoSaque) {
    if(valorDoSaque <= saldoDaContaCorrente && valorDoSaque > 0) {
      this.saldoDaContaCorrente -= valorDoSaque;
      System.out.println("Saque efetuado com sucesso!");
    } else if (valorDoSaque < 0) {
      System.out.println("Valor de saque inválido");
    } else {
      System.out.println("Saldo insuficiente");
    }
  }

  public double getSaldoDaContaCorrente() {
    return this.saldoDaContaCorrente;
  }

}
