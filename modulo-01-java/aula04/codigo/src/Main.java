import conta.Conta;

public class Main {
 // src -> source
  public static void main(String[] args) {
    Funcionario luis = new Funcionario();

    luis.setNome("Luis da Silva");
    luis.setCpf("12312312312");
    luis.setDataDeNascimento("10/10/1990");

    Funcionario maria = new Funcionario();

    maria.setNome("Maria Souza");
    maria.setCpf("12345678910");
    maria.setDataDeNascimento("12/12/2000");

//    System.out.println(Funcionario.pais);

// NÃO FAZER ISSO
//    System.out.println(maria.getPais());
//    System.out.println(luis.getPais());
//    maria.setPais("Paises Baixos");
//    System.out.println(luis.getPais());

    luis.baterPonto();
    maria.baterPonto();

    Pessoa mariana = new Pessoa();
    mariana.setNome("Mariana");

    Pessoa pedro = new Pessoa();
    pedro.setNome("Pedro");

    mariana.conversar(pedro);

    Integer inteiroUm = 10;
    Integer inteiroDois = 2;

    inteiroDois = inteiroUm;

    System.out.println(inteiroDois);

    inteiroUm = 15;

    System.out.println(inteiroDois);
    System.out.println(inteiroUm);

    mariana = pedro;

    System.out.println(mariana.getNome());

    pedro.setNome("Novo nome");

    System.out.println(mariana.getNome());
    System.out.println(pedro.getNome());

    Conta contaUm = new Conta("mayra");
    Conta contaDois = new Conta();

    contaUm.nome = "Mayra";
    contaUm.cpf = "12312345678";

    contaUm.fazerSaque(10);
    contaUm.fazerSaque(-10);

    contaUm.fazerDeposito(-10);
    contaUm.fazerDeposito(1000);

    // NUNCA USEM TERNÁRIO ANINHADO!!!!!!!!!!!!!!!!!

    String contaTemSaldo = contaUm.getSaldoDaContaCorrente() > 0
        ? "Conta tem saldo"
        : "Conta não tem saldo";

    contaUm.fazerSaque(20);
    contaUm.fazerSaque(10);

    System.out.println(contaTemSaldo);

    Gerente carlos = new Gerente();

    Endereco enderecoUm = new Endereco();
    enderecoUm.setRua("Rua teste");
    enderecoUm.setBairro("Bairro teste");

    System.out.println("Rua: " + enderecoUm.getRua() + "\nBairro: " + enderecoUm.getBairro());

  }
}