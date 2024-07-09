package G2.Atividade08;

public class Resma extends Item {
  private String tipoResma;
  private float preco;

  public Resma(String nome, String descricao, String tipoResma, float preco) {
    super(nome, descricao);
    this.tipoResma = tipoResma;
    this.preco = preco;
  }

  @Override
  public float calculoPreco() {
    return this.getPreco();
  }

  public String getTipoResma() {
    return tipoResma;
  }

  public void setTipoResma(String tipoResma) {
    this.tipoResma = tipoResma;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }
}
