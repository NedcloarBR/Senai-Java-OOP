package Aula07;

public class produto_teste {
  public static void main(String[] args) {
    Produto arroz = new Produto("Arroz", 15.99f,
        "O arroz é uma planta da família das gramíneas que alimenta mais da metade da população humana do mundo. É a terceira maior cultura cerealífera do mundo");

    Produto feijao = new Produto("Feijão", 20.99f,
        "Feijão é um nome comum para uma grande variedade de sementes de plantas de alguns gêneros da família Fabaceae. Proporciona nutrientes essenciais como proteínas, ferro, cálcio, vitaminas");

    System.out.println(arroz.getNome());
    System.out.println(arroz.getPreco());
    System.out.println(arroz.getDescricao());

    System.out.println(feijao.getNome());
    System.out.println(feijao.getPreco());
    System.out.println(feijao.getDescricao());
  }
}
