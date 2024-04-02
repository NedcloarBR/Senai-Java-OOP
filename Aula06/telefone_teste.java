package Aula06;

public class telefone_teste {
  public static void main(String[] args) {
    Telefone t1 = new Telefone();
    Telefone t2 = new Telefone();

    t1.setNumeroTelefone("0");
    t1.setOperadora("Vivo");

    t2.setNumeroTelefone("1");
    t1.setOperadora("Claro");

    System.out.println(t1.getNumeroTelefone());
    System.out.println(t1.getOperadora());

    System.out.println(t2.getNumeroTelefone());
    System.out.println(t2.getOperadora());
  }
}
