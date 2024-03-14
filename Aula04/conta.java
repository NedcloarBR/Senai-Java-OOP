package Aula04;

public class conta {

  float saldo;
  int numero;

  boolean sacar(float valor) {
    saldo = saldo - valor;
    return true;
  }
}
