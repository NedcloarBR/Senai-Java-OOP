package Aula05;

public class computador_teste {
  public static void main(String[] args) {
    Computador pc = new Computador();
    pc.nome = "Meu Computador";
    pc.clock = 2000;

    System.out.println(pc.mostraNomeComputador());
    System.out.println(pc.mostraClock());
  }
}
