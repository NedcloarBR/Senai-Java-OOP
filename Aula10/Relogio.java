package Aula10;

public class Relogio {
  private int segundo;
  private int minuto;
  private int hora;

  public void configuraHorario(int segundo, int minuto, int hora) {
    this.segundo = segundo;
    this.minuto = minuto;
    this.hora = hora;
  }

  public void configuraHorario(int segundo, int minuto) {
    this.segundo = segundo;
    this.minuto = minuto;
  }

  public int getSegundo() {
    return segundo;
  }

  public void setSegundo(int segundo) {
    this.segundo = segundo;
  }

  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    this.minuto = minuto;
  }

  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    this.hora = hora;
  }

}
