package Atividades.Atividade09;

public class CPU {
  protected int clock;
  protected String modelo;

  public CPU(int clock, String modelo) {
    this.clock = clock;
    this.modelo = modelo;
  }

  public int getClock() {
    return clock;
  }

  public void setClock(int clock) {
    this.clock = clock;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  @Override
  public String toString() {
    return "CPU [clock=" + clock + ", modelo=" + modelo + "]";
  }

}
