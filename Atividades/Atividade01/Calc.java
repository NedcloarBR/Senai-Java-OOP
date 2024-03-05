package Atividades.Atividade01;

import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.err.print("Digite um número: ");
    int A = entrada.nextInt();
    System.err.print("Digite outro número: ");
    int B = entrada.nextInt();
    int C;
    if (A == B) {
      C = A + B;
    } else {
      C = A * B;
    }

    System.out.println("O resultado é: " + C);
  }
}
