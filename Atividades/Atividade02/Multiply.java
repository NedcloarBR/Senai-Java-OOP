package Atividades.Atividade02;

import java.util.Scanner;

public class Multiply {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int num = entrada.nextInt();
    imprimirTabuada(num);
  }

  public static void imprimirTabuada(int num) {
    System.out.println("Tabuada do " + num);
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%dx%d=%d\n", num, i, (num * i));
    }
  }
}
