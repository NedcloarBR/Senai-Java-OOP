package Aula07;

public class Computador {
  private String nome;
  private int clock;

  public Computador(String nome, int clock) {
    this.nome = nome;
    this.clock = clock;
  }

  public String mostraNomeComputador() {
    return nome;
  }

  public int mostraClock() {
    return clock;
  }

}
