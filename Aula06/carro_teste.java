package Aula06;

public class carro_teste {
  public static void main(String[] args) {
    Carro c1 = new Carro();
    c1.setNome("Fusca");
    c1.setPotencia(1600);

    System.out.println(c1.getNome());
    System.out.println(c1.getPotencia());

  }
}
