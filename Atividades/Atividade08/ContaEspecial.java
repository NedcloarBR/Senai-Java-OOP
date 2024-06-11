public class ContaEspecial extends ContaBancaria {
  protected float limite;

  public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
    super(cliente, num_conta, saldo);
    this.limite = limite;
  }

  public float getLimite() {
    return limite;
  }

  public void setLimite(float limite) {
    this.limite = limite;
  }

  @Override
  public boolean sacar(float valor) {
    float saldoAtual = this.getSaldo();
    float limiteSaque = saldoAtual + this.getLimite();
    if (valor > limiteSaque) {
      return false;
    }
    this.setSaldo(valor);
    return true;
  }

  @Override
  public String toString() {
    return "ContaEspecial [cliente=" + cliente + ", limite=" + limite + ", num_conta=" + num_conta + ", saldo=" + saldo
        + "]";
  }

}
