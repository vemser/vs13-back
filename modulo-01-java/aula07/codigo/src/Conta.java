import exceptions.RegraDeNegocioException;

public class Conta {
  private String titular;
  private double saldo;
  private final double chequeEspecial = 200;

  public Conta() {}

  public Conta(String titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return this.saldo+this.chequeEspecial;
  }

  public void depositar(double valorDeposito) {
    if(valorDeposito < 0) {
      throw new IllegalArgumentException("O valor de depósito precisa ser acima de 0 reais.");
    } else {
      this.saldo += valorDeposito;
    }
  }

  public void sacar(double valorSaque) throws RegraDeNegocioException {
    if(valorSaque < 0) {
      throw new IllegalArgumentException("Só é possível sacar acima de 0 reais");
    }
    if(valorSaque <= getSaldo()) {
      this.saldo -= valorSaque;
    } else {
      throw new RegraDeNegocioException("Saldo insuficiente");
    }
  }

}
