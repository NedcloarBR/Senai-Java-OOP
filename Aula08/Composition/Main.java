package Aula08.Composition;

public class Main {
  public static void main(String[] args) {
    Endereco e1 = new Endereco("Rua acb", 100, "91000-000");
    Pessoa p1 = new Pessoa("João", e1);

    System.out.println("Nome: " + p1.getNome());
    System.out.println("Endereço: " + p1.getEnd());
    System.out.println("Endereço: " + p1.getEnd().getRua());
    System.out.println("Nro: " + p1.getEnd().getNumero());
    System.out.println("Cep: " + p1.getEnd().getCep());

  }
}
