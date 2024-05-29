package Aula11;

public class produto_teste {

  public static void main(String[] args) {
    Tv t1 = new Tv("Tv da sala", "LG", 1000f, 32, "LCD");
    Radio r1 = new Radio("Radinho de pilha", "Sharp", 50f, 5);
    Videogame v1 = new Videogame("Sega Saturn", "Sega", 1000f, 2);
    System.out.println(t1);
    System.out.println(r1);
    System.out.println(v1);

    // System.out.println("Nome: " + t1.getNome() +
    // ", Marca: " + t1.getMarca() +
    // ", Pre�o: R$" + t1.getPreco() +
    // ", Tamanho: " + t1.getTamanho() +
    // "pol. , Tipo: " + t1.getTipo());
    //
    // System.out.println("Nome: " + r1.getNome() +
    // ", Marca: " + r1.getMarca() +
    // ", Pre�o: R$" + r1.getPreco() +
    // ", Potencia: " + r1.getPotenciaRMS() + " Watts");
    //
    // System.out.println("Nome: " + v1.getNome() +
    // ", Marca: " + v1.getMarca() +
    // ", Pre�o: R$" + v1.getPreco() +
    // ", Nro de controles: " + v1.getControles());

  }

}