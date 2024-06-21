package Atividades.Atividade09;

public class Computador {
  protected String marca;
  protected int totalMemoria;
  protected CPU cpu;

  public Computador(String marca, int totalMemoria, CPU cpu) {
    this.marca = marca;
    this.totalMemoria = totalMemoria;
    this.cpu = cpu;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getTotalMemoria() {
    return totalMemoria;
  }

  public void setTotalMemoria(int totalMemoria) {
    this.totalMemoria = totalMemoria;
  }

  public CPU getCpu() {
    return cpu;
  }

  public void setCpu(CPU cpu) {
    this.cpu = cpu;
  }

  @Override
  public String toString() {
    return "Computador [marca=" + marca + ", totalMemoria=" + totalMemoria + ", cpu=" + cpu + "]";
  }

}
