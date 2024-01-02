import conta.Conta;
import pessoa.Funcionario;

public class Main {
 // src -> source
  public static void main(String[] args) {
    Conta contaUm = new Conta();
    Conta contaDois = new Conta("Mayra");
    Conta contaTres = new Conta("Maria", "12312312312");

    //pessoa.Funcionario pessoaUm = new pessoa.Funcionario();
    //pessoa.Funcionario funcionarioUm = new pessoa.Funcionario("Mayra", 23, "12312312312", "18/05/2000");
    Funcionario funcionarioDois = new Funcionario("123", "11/10/2000");
    funcionarioDois.setSalario(1000);
    System.out.println(funcionarioDois.calcularSalarioLiquido());
    System.out.println(funcionarioDois.calcularSalarioLiquido(1000));
    funcionarioDois.setNome("Pedro");

    funcionarioDois.conversar("João");

    Gerente gerente = new Gerente("Carlos");

    gerente.conversar("João");

  }
}