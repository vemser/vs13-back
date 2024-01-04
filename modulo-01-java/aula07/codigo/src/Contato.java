public class Contato {
  private String numero;
  private TipoContato tipoContato;

  public Contato() {}

  public Contato(String numero, int tipoContato) {
    TipoContato tipo = TipoContato.ofTipo(tipoContato);
    if(tipo == null) {
      throw new IllegalArgumentException("Opção de contato inexistente");
//      IllegalArgumentException iae = new IllegalArgumentException("Opção de contato inexistente");
//      throw iae;
    } else {
      this.numero = numero;
      this.tipoContato = tipo;
    }
  }

  public String getTipoContato() {
    return this.tipoContato.name();
  }
}
