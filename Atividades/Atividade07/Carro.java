public class Carro {
  private String nome;
  private String marca;
  private int potencia;

  public void montaCarro(String nome, String marca, int potencia) {
    this.setNome(nome);
    this.setMarca(marca);
    this.setPotencia(potencia);
  }

  public void montaCarro(String nome, String marca) {
    this.setNome(nome);
    this.setMarca(marca);
  }

  public void montaCarro(String nome, int potencia) {
    this.setNome(nome);
    this.setPotencia(potencia);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getPotencia() {
    return potencia;
  }

  public void setPotencia(int potencia) {
    this.potencia = potencia;
  }
}
