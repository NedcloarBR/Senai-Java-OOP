package Aula03;

public class atividade01 {

  public static void main(String[] args) {
    System.out.println("6 - Números pares e impares de 1 a 100");
    for (int i = 1; i < 100; i++) {
      if (i % 2 == 0) {
        System.err.printf("%d é par", i);
      } else {
        System.err.printf("%d é impar", i);
      }
    }
  }
}