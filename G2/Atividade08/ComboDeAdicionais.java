package G2.Atividade08;

import java.util.ArrayList;

public class ComboDeAdicionais extends Item {
  private ArrayList<Item> adicionais = new ArrayList<Item>();

  public ComboDeAdicionais(String nome, String descricao) {
    super(nome, descricao);
  }

  public void addItem(Item item) {
    adicionais.add(item);
  }

  @Override
  public float calculoPreco() {
    float precoTotal = 0f;

    for (Item item : adicionais) {
      precoTotal += item.calculoPreco();
    }

    return precoTotal;
  }
}
