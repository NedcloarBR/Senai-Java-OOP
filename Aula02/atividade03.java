package Aula02;

import java.util.Scanner;

public class atividade03 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("3 - Maior número");
    System.out.println("Digite um número: ");
    int num1 = entrada.nextInt();
    System.out.println("Digite outro número: ");
    int num2 = entrada.nextInt();
    if (num1 > num2) {
      System.out.printf("O número %d é maior\n", num1);
    } else {
      System.out.printf("O número %d é maior\n", num2);
    }
  }
}
