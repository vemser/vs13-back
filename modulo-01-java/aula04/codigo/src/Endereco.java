import interfaces.IEndereco;

public class Endereco implements IEndereco {
  private String rua;
  private String bairro;

  @Override
  public String getRua() {
    return this.rua;
  }

  @Override
  public void setRua(String rua) {
    this.rua = rua;
  }

  @Override
  public String getBairro() {
    return this.bairro;
  }

  @Override
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }
}
