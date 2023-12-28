package conta;

public class Conta {
  public String nome;
  public String cpf;
  double saldoDaContaCorrente = 0;

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

  public double retornarSaldo() {
    return this.saldoDaContaCorrente;
  }
}
