package Aula16;

public abstract class FormaGeometrica {
  protected String nome;
  protected float area;

  public FormaGeometrica(String nome, float area) {
    this.nome = nome;
    this.area = area;
  }

  public FormaGeometrica(String nome) {
    this.nome = nome;
  }

  public abstract float totalArea();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getArea() {
    return area;
  }

  public void setArea(float area) {
    this.area = area;
  }

  @Override
  public String toString() {
    return "FormaGeometrica [nome=" + nome + ", area=" + area + "]";
  }

}