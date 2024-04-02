package Atividades.Atividade05;

public class folhapagamento_teste {
  public static void main(String[] args) {
    FolhaPagamento folhaPagamento = new FolhaPagamento();

    folhaPagamento.setNome1("Miguel");
    folhaPagamento.setNome2("Emanuel");
    folhaPagamento.setSalario1(0);
    folhaPagamento.setSalario2(-500);
    folhaPagamento.setSalario1(1000);
    folhaPagamento.setSalario2(900);

    System.out.printf("Nome1: %s", folhaPagamento.getNome1());
    System.out.printf("Nome2: %s", folhaPagamento.getNome2());
    System.out.printf("Salario1: %s", folhaPagamento.getSalario1());
    System.out.printf("Salario2: %s", folhaPagamento.getSalario2());
    System.out.printf("Total folha de pagamento: %.2f", folhaPagamento.totalFolhaPagamento());
  }
}