package Aula16;

public class Retangulo extends FormaGeometrica {

  public Retangulo(float area) {
    super("Retangulo", area);
  }

  public Retangulo(String nome, float area) {
    super(nome, area);
  }

  @Override
  public float totalArea() {
    return area;
  }

}
