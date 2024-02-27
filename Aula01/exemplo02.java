package Aula01;

import java.util.Scanner;

public class exemplo02 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = entrada.next();

    System.out.println("O nome digitado foi: " + nome);
    System.out.printf("O nome digitado foi: %s\n", nome);

    System.out.print("Digite um número: ");
    int val1 = entrada.nextInt();
    System.out.println("O número digitado foi: " + val1);
    System.out.print("Digite outro numero: ");
    int val2 = entrada.nextInt();
    int result = val1 + val2;
    System.out.println("O resultado foi " + result);
    System.out.println("O resultado foi " + (val1 + val2));

  }
}