package Atividades.Atividade05;

import java.util.Scanner;

public class pessoa_teste {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    Pessoa p2 = new Pessoa();
    Scanner entrada = new Scanner(System.in);

    System.out.println("Pessoa 1");
    System.out.print("\nNome: ");
    p1.setNome(entrada.next());
    System.out.print("\nIdade: ");
    p1.setIdade(entrada.nextInt());
    System.out.print("\nEndereço: ");
    p1.setEndereco(entrada.next());

    System.out.println("Pessoa 2");
    System.out.print("\nNome: ");
    p2.setNome(entrada.next());
    System.out.print("\nIdade: ");
    p2.setIdade(entrada.nextInt());
    System.out.print("\nEndereço: ");
    p2.setEndereco(entrada.next());

    System.out.println("Nome: " + p1.getNome());
    System.out.println("Idade: " + p1.getIdade());
    System.out.println("Endereço: " + p1.getIdade());

    System.out.println("Nome: " + p2.getNome());
    System.out.println("Idade: " + p2.getIdade());
    System.out.println("Endereço: " + p2.getIdade());
  }
}
