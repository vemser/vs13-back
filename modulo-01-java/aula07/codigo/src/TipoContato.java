import enums.TipoEndereco;

import java.util.Arrays;

public enum TipoContato {
  CELULAR,
  FIXO;

  public static TipoContato ofTipo(Integer tipo) {
    for(TipoContato tp : TipoContato.values()) {
      if(tp.ordinal() == tipo) {
        return tp;
      }
    }
    return null;
  }

}
