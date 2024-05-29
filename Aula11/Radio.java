package Aula11;

public class Radio extends Produto {
  private int potenciaRMS;

  public Radio(String nome, String marca, float preco, int potenciaRMS) {
    super(nome, marca, preco);
    this.potenciaRMS = potenciaRMS;
  }

  public int getPotenciaRMS() {
    return potenciaRMS;
  }

  public void setPotenciaRMS(int potenciaRMS) {
    this.potenciaRMS = potenciaRMS;
  }

  @Override
  public String toString() {
    return "Radio [potenciaRMS=" + potenciaRMS +
        ", nome=" + nome + ", marca=" +
        marca + ", preco=" + preco + "]";
  }

}