package Aula07;

public class celular_teste {
  public static void main(String[] args) {
    Celular celular = new Celular("Redmi Note 9 Pro");
    System.out.println(celular.getNome());

    Celular celularNokia = new Celular("Nokia 6120");
    System.out.println(celularNokia.getNome());

  }
}
