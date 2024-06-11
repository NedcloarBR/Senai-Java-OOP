public class conta_teste {
  public static void main(String[] args) {
    ContaBancaria c1 = new ContaBancaria("Miguel", 0001, 1000f);
    ContaPoupanca c2 = new ContaPoupanca("Miguel2", 0002, 1000f, 10);
    ContaEspecial c3 = new ContaEspecial("Miguel3", 0003, 1000f, 1000f);

    c1.sacar(500);
    c2.sacar(500);
    c3.sacar(1500);

    c1.depositar(100);
    c2.depositar(100);
    c3.depositar(100);

    System.out.printf("Saldo: %f", c1.getSaldo());
    System.out.printf("Saldo: %f", c2.getSaldo());
    System.out.printf("Saldo: %f", c3.getSaldo());

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
  }
}
