package Aula05;

public class conta_teste {
  public static void main(String[] args) {
    Conta minhaNovaConta = new Conta();
    Conta contaDoJoao = new Conta();
    Conta contaDaMaria = new Conta();

    minhaNovaConta.Depositar(100);
    if (minhaNovaConta.Sacar(60)) {
      System.out.println(minhaNovaConta.gerarExtrato());
    } else {
      System.out.println("Saldo insuficiente");
    }
    if (minhaNovaConta.Sacar(60)) {
      System.out.println(minhaNovaConta.gerarExtrato());
    } else {
      System.out.println("Saldo insuficiente");
    }
  }
}
