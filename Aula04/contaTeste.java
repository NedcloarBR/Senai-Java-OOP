package Aula04;

public class contaTeste {
  public static void main(String[] args) {
    conta c1 = new conta();
    c1.numero = 123;
    c1.saldo = 10;
    System.out.println("O saldo é: " + c1.saldo);
    c1.sacar(6);
    System.out.println("O saldo é: " + c1.saldo);
  }
}
