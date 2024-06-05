package Aula13;

public class ContaPoupanca extends Conta {
  private float rendimentoMes;

  public ContaPoupanca(float saldo, String nome, float rendimentoMes) {
    super(saldo, nome);
    this.rendimentoMes = rendimentoMes;
  }

  public float getRendimentoMes() {
    return rendimentoMes;
  }

  public void setRendimentoMes(float rendimentoMes) {
    this.rendimentoMes = rendimentoMes;
  }

  @Override
  public float getSaldo() {
    float saldo = super.getSaldo() + (super.getSaldo() * getRendimentoMes() / 100);
    setSaldo(saldo);
    return saldo;
  }

  @Override
  public String toString() {
    return "ContaPoupanca [saldo=" + getSaldo() + ", rendimentoMes=" + rendimentoMes + ", nome=" + nome + "]";
  }

}
