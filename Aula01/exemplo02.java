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
    int val = entrada.nextInt();
    System.out.println("O número digitado foi: " + val);
  }
}