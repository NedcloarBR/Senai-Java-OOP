package Aula05;

public class produto_teste {
  public static void main(String[] args) {
    Produto arroz = new Produto();
    arroz.nome = "Arroz";
    arroz.preco = 15.99f; // ou (float) 15.99
    arroz.descricao = "O arroz é uma planta da família das gramíneas que alimenta mais da metade da população humana do mundo. É a terceira maior cultura cerealífera do mundo";

    Produto feijao = new Produto();
    feijao.nome = "Feijão";
    feijao.preco = 20.99f; // ou (float) 20.99
    feijao.descricao = "Feijão é um nome comum para uma grande variedade de sementes de plantas de alguns gêneros da família Fabaceae. Proporciona nutrientes essenciais como proteínas, ferro, cálcio, vitaminas";

    System.out.println(arroz.mostraNomeProduto());
    System.out.println(arroz.mostraPreco());
    arroz.mostradescricaoProduto();

    System.out.println(feijao.mostraNomeProduto());
    System.out.println(feijao.mostraPreco());
    feijao.mostradescricaoProduto();
  }
}
