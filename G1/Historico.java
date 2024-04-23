package G1;

public class Historico {
  private String nomeDaEmpresa;
  public float tempoDeTrabalhoEmMeses;

  public Historico(String nomeDaEmpresa, float tempoDeTrabalhoEmMeses) {
    this.nomeDaEmpresa = nomeDaEmpresa;
    this.tempoDeTrabalhoEmMeses = tempoDeTrabalhoEmMeses;
  }

  public float tempoDeTrabalhoEmAnos() {
    return this.tempoDeTrabalhoEmMeses / 12;
  }

  public String getNomeDaEmpresa() {
    return nomeDaEmpresa;
  }

  public void setNomeDaEmpresa(String nomeDaEmpresa) {
    this.nomeDaEmpresa = nomeDaEmpresa;
  }

  public float getTempoDeTrabalhoEmMeses() {
    return tempoDeTrabalhoEmMeses;
  }

  public void setTempoDeTrabalhoEmMeses(float tempoDeTrabalhoEmMeses) {
    this.tempoDeTrabalhoEmMeses = tempoDeTrabalhoEmMeses;
  }

}
