package Aula05;

public class Conta {
  String tipo;
  float saldo;
  int numero;
  int agencia;
  String cliente;

  boolean Sacar(float valor) {
    if ((saldo - valor) >= 0) {
      saldo -= valor;
      return true;
    }
    return false;
  }

  void Depositar(float valor) {
    saldo += valor;
  }

  String gerarExtrato() {
    String saldoAtual = "Seu saldo é R$" + saldo;
    return saldoAtual;
  }
}