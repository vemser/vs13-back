import enums.TipoEndereco;

public class Endereco {
  private TipoEndereco tipoEndereco;
  String rua;
  String bairro;

  public Endereco() {}

  public Endereco(TipoEndereco tipoEndereco, String rua, String bairro) {
    this.tipoEndereco = tipoEndereco;
    this.rua = rua;
    this.bairro = bairro;
  }

  public String getTipoEndereco() {
    return tipoEndereco.name();
  }

  public int getTipoEnderecoOrdinal() {
    return tipoEndereco.ordinal();
  }

}
