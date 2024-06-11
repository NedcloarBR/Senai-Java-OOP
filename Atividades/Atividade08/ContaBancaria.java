public class ContaBancaria {
  protected String cliente;
  protected int num_conta;
  protected float saldo;

  public ContaBancaria(String cliente, int num_conta, float saldo) {
    this.cliente = cliente;
    this.num_conta = num_conta;
    this.saldo = saldo;
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public int getNum_conta() {
    return num_conta;
  }

  public void setNum_conta(int num_conta) {
    this.num_conta = num_conta;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public boolean sacar(float valor) {
    float saldoAtual = this.getSaldo();
    if (saldoAtual < valor) {
      return false;
    }

    this.setSaldo(saldoAtual - valor);
    return true;
  }

  public void depositar(float valor) {
    float saldoAtual = this.getSaldo();
    this.setSaldo(saldoAtual + valor);
  }

  @Override
  public String toString() {
    return "ContaBancaria [cliente=" + cliente + ", num_conta=" + num_conta + ", saldo=" + saldo + "]";
  }

}
