package Aula16;

public class Triangulo extends FormaGeometrica {

  public Triangulo(float area) {
    super("Triangulo", area);
  }

  public Triangulo(String nome, float area) {
    super(nome, area);
  }

  @Override
  public float totalArea() {
    return area;
  }

}
