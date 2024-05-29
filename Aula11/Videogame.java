package Aula11;

public class Videogame extends Produto {
  private int controles;

  public Videogame(String nome, String marca, float preco, int controles) {
    super(nome, marca, preco);
    this.controles = controles;
  }

  public int getControles() {
    return controles;
  }

  public void setControles(int controles) {
    this.controles = controles;
  }

  @Override
  public String toString() {
    return "Videogame [controles=" + controles +
        ", nome=" + nome + ", marca=" + marca +
        ", preco=" + preco + "]";
  }

}