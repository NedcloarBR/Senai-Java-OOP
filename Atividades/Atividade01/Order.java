package Atividades.Atividade01;

import java.util.Scanner;

public class Order {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.err.print("Digite um número: ");
    int A = entrada.nextInt();
    System.err.print("Digite outro número: ");
    int B = entrada.nextInt();
    System.err.print("Digite outro número: ");
    int C = entrada.nextInt();

    if (A > B && A > C) {
      if (B > C) {
        System.out.printf("Em ordem decrescente: %d, %d, %d\n", A, B, C);
      } else {
        System.out.printf("Em ordem decrescente: %d, %d, %d\n", A, C, B);
      }
    } else if (B > A && B > C) {
      if (A > C) {
        System.out.printf("Em ordem decrescente: %d, %d, %d\n", B, A, C);
      } else {
        System.out.printf("Em ordem decrescente: %d, %d, %d\n", B, C, A);
      }
    } else {
      if (A > B) {
        System.out.printf("Em ordem decrescente: %d, %d, %d\n", C, A, B);
      } else {
        System.out.printf("Em ordem decrescente: %d, %d, %d\n", C, B, A);
      }
    }
  }
}
