package Aula08.Composition.Exercicios.Familia;

public class Main {
  public static void main(String[] args) {
    Filho f1 = new Filho();
    f1.setNome("Miguel");
    Filho f2 = new Filho();
    f2.setNome("Emanuel");
    Mae mae = new Mae();
    mae.setNomeMae("Meri");
    mae.setFilho1(f1);
    mae.setFilho2(f2);

    System.out.println("Nome da mãe: " + mae.getNomeMae());
    System.out.println("Nome do filho 1: " + mae.getFilho1().getNome());
    System.out.println("Nome do filho 2: " + mae.getFilho2().getNome());
  }
}
