import conta.Conta;

public class Main {
 // src -> source
  public static void main(String[] args) {
    Funcionario luis = new Funcionario();

    luis.nome = "Luis da Silva";
    luis.cpf = "12312312312";
    luis.dataDeNascimento = "10/10/1990";

    Funcionario maria = new Funcionario();

    maria.nome = "Maria Souza";
    maria.cpf = "12345678910";
    maria.dataDeNascimento = "12/12/2000";

    luis.baterPonto();
    maria.baterPonto();

    Pessoa mariana = new Pessoa();
    mariana.nome = "Mariana";

    Pessoa pedro = new Pessoa();
    pedro.nome = "Pedro";

    mariana.conversar(pedro);

    Integer inteiroUm = 10;
    Integer inteiroDois = 2;

    inteiroDois = inteiroUm;

    System.out.println(inteiroDois);

    inteiroUm = 15;

    System.out.println(inteiroDois);
    System.out.println(inteiroUm);

    mariana = pedro;

    System.out.println(mariana.nome);

    pedro.nome = "Novo nome";

    System.out.println(mariana.nome);
    System.out.println(pedro.nome);

    Conta contaUm = new Conta();
    Conta contaDois = new Conta();

    contaUm.nome = "Mayra";
    contaUm.cpf = "12312345678";

    contaUm.fazerSaque(10);
    contaUm.fazerSaque(-10);

    contaUm.fazerDeposito(-10);
    contaUm.fazerDeposito(1000);

    // NUNCA USEM TERNÁRIO ANINHADO!!!!!!!!!!!!!!!!!

    String contaTemSaldo = contaUm.retornarSaldo() > 0
        ? "Conta tem saldo"
        : "Conta não tem saldo";

    contaUm.fazerSaque(20);
    contaUm.fazerSaque(10);



    System.out.println(contaTemSaldo);

  }
}