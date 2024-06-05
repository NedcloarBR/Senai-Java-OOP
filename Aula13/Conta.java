package Aula13;

public class Conta {
  protected float saldo;
  protected String nome;

  public Conta(float saldo, String nome) {
    this.saldo = saldo;
    this.nome = nome;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Conta [saldo=" + saldo + ", nome=" + nome + "]";
  }
}
