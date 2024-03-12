package Atividades.Atividade02;

import java.util.Scanner;

public class Positive {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int num = entrada.nextInt();
    if (ehPositivo(num)) {
      System.out.printf("O número %d é positivo", num);
    } else {
      System.out.printf("O número %d é negativo", num);
    }
  }

  public static boolean ehPositivo(int num) {
    return num >= 0;
  }
}
