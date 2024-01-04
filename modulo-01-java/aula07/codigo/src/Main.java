import enums.TipoEndereco;
import enums.TipoPagamento;
import exceptions.RegraDeNegocioException;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // UTILIZANDO ENUM

//    Endereco endereco = new Endereco(TipoEndereco.RESIDENCIAL, "rua X", "bairro");
//
//    System.out.println(endereco.getTipoEndereco());
//
//    System.out.println(TipoEndereco.RESIDENCIAL.ordinal());
//    System.out.println(TipoEndereco.COMERCIAL.ordinal());
//
//    Endereco enderecoComercial = new Endereco(TipoEndereco.COMERCIAL, "rua B", "bairro");
//
//    System.out.println(enderecoComercial.getTipoEnderecoOrdinal());
//
//    Pagamento pagamento = new Pagamento(TipoPagamento.CREDITO, 1000);
//    System.out.println(pagamento.calcularTaxa());

    // UTILIZANDO NÚMERO PARA INSTANCIAR OBJETO COM ENUM

//    Contato contato = new Contato("123", 10);
//
//    System.out.println(contato.getTipoContato());

//    TipoContato[] teste = TipoContato.values();
//
//    System.out.println(Arrays.toString(teste));

//    System.out.println(1/0);
//    int[] numeros = {1, 2};
//
//    System.out.println(numeros[10]);
//    Endereco endereco = new Endereco();
//
//    endereco = null;
//
//    System.out.println(endereco.rua);

    Conta conta = new Conta("mayra");
    conta.depositar(100);
    System.out.println(conta.getSaldo());

//    try {
//      System.out.println("teste antes");
//      conta.sacar(1000);
//    } catch (IllegalArgumentException e) {
////      e.printStackTrace();
//      System.err.println(e.getMessage());
//    } catch (RegraDeNegocioException e) {
////      e.printStackTrace();
//      System.err.println(e.getMessage());
//    } finally {
//      System.out.println("testando finally");
//    }
  }
}