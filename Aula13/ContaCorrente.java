package Aula13;

public class ContaCorrente extends Conta {
  private float tarifaDeManutencao;

  public ContaCorrente(float saldo, String nome, float tarifaDeManutencao) {
    super(saldo, nome);
    this.tarifaDeManutencao = tarifaDeManutencao;
  }

  public float getTarifaDeManutencao() {
    return tarifaDeManutencao;
  }

  public void setTarifaDeManutencao(float tarifaDeManutencao) {
    this.tarifaDeManutencao = tarifaDeManutencao;
  }

  @Override
  public float getSaldo() {
    return super.getSaldo() - getTarifaDeManutencao();
  }

  @Override
  public String toString() {
    return "ContaCorrente [saldo=" + getSaldo() + ", tarifaDeManutencao=" + tarifaDeManutencao + ", nome=" + nome + "]";
  }

}
