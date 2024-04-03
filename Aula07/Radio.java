package Aula07;

public class Radio {
  private float estacao;
  private String nomeEstacao;

  public Radio() {
  }

  public Radio(float estacao) {
    this.estacao = estacao;
  }

  public Radio(String nomeEstacao) {
    this.nomeEstacao = nomeEstacao;
  }

  public Radio(String nomeEstacao, float estacao) {
    this.estacao = estacao;
    this.nomeEstacao = nomeEstacao;
  }

  public float getEstacao() {
    return estacao;
  }

  public void setEstacao(float estacao) {
    this.estacao = estacao;
  }

  public String getNomeEstacao() {
    return nomeEstacao;
  }

  public void setNomeEstacao(String nomeEstacao) {
    this.nomeEstacao = nomeEstacao;
  }

}
