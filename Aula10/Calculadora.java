package Aula10;

public class Calculadora {
  private double ultimoResultado;

  public Calculadora() {
  }

  public int soma(int a, int b) {
    this.ultimoResultado = a + b;
    return (int) this.ultimoResultado;
  }

  public float soma(float a, float b) {
    this.ultimoResultado = a + b;
    return (float) this.ultimoResultado;
  }

  public double soma(double a, double b) {
    this.ultimoResultado = a + b;
    return this.ultimoResultado;
  }

  public int soma(int a, int b, int c) {
    this.ultimoResultado = a + b + c;
    return (int) this.ultimoResultado;
  }

  public float soma(float a, float b, float c) {
    this.ultimoResultado = a + b + c;
    return (float) this.ultimoResultado;
  }

  public double soma(double a, double b, double c) {
    this.ultimoResultado = a + b + c;

    return this.ultimoResultado;
  }

  public double getUltimoResultado() {
    return ultimoResultado;
  }

  public void setUltimoResultado(double ultimoResultado) {
    this.ultimoResultado = ultimoResultado;
  }
}
