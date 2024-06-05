package Aula13;

public class pessoa_teste {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Miguel1", 1000);
    Diretor p2 = new Diretor("Miguel2", 1000);
    Professor p3 = new Professor("Miguel3", 1000);

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
  }
}
