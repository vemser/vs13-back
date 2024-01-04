import enums.TipoPagamento;

public class Pagamento {
  private TipoPagamento tipoPagamento;
  double valor;

  public Pagamento() {}

  public Pagamento(TipoPagamento tipoPagamento, double valor) {
    this.tipoPagamento = tipoPagamento;
    this.valor = valor;
  }

  public double calcularTaxa() {
    return tipoPagamento.getTaxa() * this.valor;
  }

  public String getTipoPagamento() {
    return this.tipoPagamento.name();
  }
}
