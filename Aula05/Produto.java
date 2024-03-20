package Aula05;

public class Produto {
  String nome;
  float preco;
  String descricao;

  String mostraNomeProduto() {
    return nome;
  }

  float mostraPreco() {
    return preco;
  }

  void mostradescricaoProduto() {
    System.out.println(descricao);
  }
}
