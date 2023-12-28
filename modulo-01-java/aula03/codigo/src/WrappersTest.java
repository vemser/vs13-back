public class WrappersTest {
  public static void main(String[] args) {

    int idade = 10;
    Integer idadeConvertida = (Integer) idade;

    int teste;
    Integer testeWrapper;


    Integer somaDeIdades = idade+idadeConvertida;
    System.out.println(idade+idadeConvertida);

    System.out.println(idadeConvertida);
    float variavel = 1.2345f;
    Float variavelConvertida = (Float) variavel;

    System.out.println(variavelConvertida);

    Integer idadeWrapper = 10;
    /*
      boolean estaCadastrado = null;
      NÃO PODE!
     */
    Boolean estaCadastradoWrapper = null;

    Float meuFloat = 1.23f;
    Double meuDouble = 10.00;
    meuDouble = null;

    System.out.println(meuFloat.intValue());

    meuFloat = null;

    System.out.println(meuFloat);

    estaCadastradoWrapper = null;

    System.out.println(estaCadastradoWrapper);

  }
}
