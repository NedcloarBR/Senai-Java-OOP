public class ContaPoupanca extends ContaBancaria {

  protected int diaRendimento;

  public ContaPoupanca(String cliente, int num_conta, float saldo, int diaRendimento) {
    super(cliente, num_conta, saldo);
    this.diaRendimento = diaRendimento;
  }

  public float calcularNovoSaldo(float taxaRendimento) {
    float saldoAtual = this.getSaldo();

    float saldoCorrigido = saldoAtual + (1 + saldoAtual * (taxaRendimento / 100));

    this.setSaldo(saldoCorrigido);
    return saldoCorrigido;
  }

  @Override
  public float getSaldo() {
    this.calcularNovoSaldo(1);
    return this.saldo;
  }

  @Override
  public String toString() {

    return "ContaPoupanca [cliente=" + cliente + ", diaRendimento=" + diaRendimento + ", num_conta=" + num_conta
        + ", saldo=" + this.getSaldo() + "]";
  }

}
