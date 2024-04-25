public class carro_teste {
  public static void main(String[] args) {
    Carro c1 = new Carro();
    c1.montaCarro("Fusca", "VolksWagen", 1600);
    System.out.println("\n\nNome: " + c1.getNome() + "\nMarca: " + c1.getMarca() + "\nPotencia" + c1.getPotencia());
    c1.montaCarro("Fusca", "VolksWagen");
    System.out.println("\n\nNome: " + c1.getNome() + "\nMarca: " + c1.getMarca());
    c1.montaCarro("Fusca", 1600);
    System.out.println("\n\nNome: " + c1.getNome() + "\nPotencia: " + c1.getPotencia());
  }
}
