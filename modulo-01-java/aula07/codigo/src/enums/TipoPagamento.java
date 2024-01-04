package enums;

public enum TipoPagamento {
  CREDITO(0.10),
  DEBITO(0.03),
  PIX(0),
  DINHEIRO(0);

  public final double taxa;
  public String nome;

  TipoPagamento(double taxa) {
    this.taxa = taxa;
  }

  public double getTaxa() {
    return this.taxa;
  }
}
