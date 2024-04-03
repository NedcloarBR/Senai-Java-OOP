package Aula07;

public class computador_teste {
  public static void main(String[] args) {
    Computador pc = new Computador("Meu Computador", 2000);

    System.out.println(pc.mostraNomeComputador());
    System.out.println(pc.mostraClock());
  }
}
