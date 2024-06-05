package Aula13;

public class conta_teste {
  public static void main(String[] args) {
    Conta c1 = new Conta(1000, "Miguel1");
    ContaCorrente c2 = new ContaCorrente(1000, "Miguel2", 10);
    ContaPoupanca c3 = new ContaPoupanca(1000, "Miguel3", 1);
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
  }
}
