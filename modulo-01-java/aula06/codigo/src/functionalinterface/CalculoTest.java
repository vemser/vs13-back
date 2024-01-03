package functionalinterface;

public class CalculoTest {
  public static void main(String[] args) {
    Calculo subtrair = new Calculo() {
      @Override
      public int calcular(int n1, int n2) {
        return n1-n2;
      }
    };

    Calculo somar = new Calculo() {
      @Override
      public int calcular(int n1, int n2) {
        return n1+n2;
      }
    };

    Calculo dividir = new Calculo() {
      // TODO: precisaria criar uma validação no futuro para ver se n2 não é zero
      @Override
      public int calcular(int n1, int n2) {
        return n1/n2;
      }
    };

    Calculo multiplicar = new Calculo() {
      @Override
      public int calcular(int n1, int n2) {
        return n1*n2;
      }
    };

    Calculo potenciacao = new Calculo() {
      @Override
      public int calcular(int n1, int n2) {
        int resultado = 1;
        for(int i = 0; i < n2; i++) {
          resultado *= n1;
        }
        return resultado;
      }
    };

    System.out.println(potenciacao.calcular(10, 2));
  }
}
