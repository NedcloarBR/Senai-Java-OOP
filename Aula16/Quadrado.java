package Aula16;

public class Quadrado extends FormaGeometrica {
  float lado;

  public Quadrado(float lado) {
    super("Quadrado");
    this.lado = lado;
  }

  public Quadrado(String nome, float lado) {
    super(nome);
    this.lado = lado;
  }

  @Override
  public float totalArea() {

    return lado * lado;
  }

}
