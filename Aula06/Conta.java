package Aula06;

public class Conta {
  private String tipo;
  private float saldo;
  private int numero;
  private int agencia;
  private String cliente;

  public String getTipo() {
    return this.tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public float getSaldo() {
    return this.saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public String getCliente() {
    return this.cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public boolean Sacar(float valor) {
    if ((saldo - valor) >= 0) {
      saldo -= valor;
      return true;
    }
    return false;
  }

  public void Depositar(float valor) {
    saldo += valor;
  }

  public String gerarExtrato() {
    String saldoAtual = "Seu saldo é R$" + saldo;
    return saldoAtual;
  }
}
