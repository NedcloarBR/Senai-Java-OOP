package Aula03;

import java.util.Scanner;

public class atividade02 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("2- Área de um quadrado");
    System.out.println("Digite um número: ");
    int num1 = entrada.nextInt();
    System.out.printf("A área do quadrado com o número provido é: %d\n", area(num1));
  }

  public static int area(int num1) {
    return num1 * num1;
  }
}
