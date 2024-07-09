package G2.Atividade08;

public class Main {
  public static void main(String[] args) {
    Resma resma1 = new Resma("Resma A4", "500 folhas", "A4_500folhas", 15f);
    Resma resma2 = new Resma("Resma A3", "500 folhas", "A3_1000folhas", 25f);

    ComboDeAdicionais combo = new ComboDeAdicionais("Combo Papelaria", "Pacote de items para impressora");

    combo.addItem(resma1);
    combo.addItem(resma2);

    System.out.println("Item: " + resma1.getNome() + ", Preço: " + resma1.calculoPreco());
    System.out.println("Item: " + resma2.getNome() + ", Preço: " + resma2.calculoPreco());
    System.out.println("Combo: " + combo.getNome() + ", Preço Total: " + combo.calculoPreco());
  }
}
