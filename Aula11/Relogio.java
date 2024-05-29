package Aula11;

public class Relogio {
  private int segundo;
  private int minuto;
  private int hora;

  public Relogio() {
  }

  public void configuraHorario(int segundo, int minuto, int hora) {

    setSegundo(segundo);
    setMinuto(minuto);
    setHora(hora);
  }

  public void configuraHorario(int segundo, int minuto) {
    setSegundo(segundo);
    setMinuto(minuto);
  }

  public int getSegundo() {
    return segundo;
  }

  public int getMinuto() {
    return minuto;
  }

  public int getHora() {
    return hora;
  }

  public void setSegundo(int segundo) {
    if (segundo >= 0 && segundo < 60) {
      this.segundo = segundo;
    }
  }

  public void setMinuto(int minuto) {
    if (minuto >= 0 && minuto < 60) {
      this.minuto = minuto;
    }
  }

  public void setHora(int hora) {
    if (hora >= 0 && hora < 24) {
      this.hora = hora;
    }
  }
}