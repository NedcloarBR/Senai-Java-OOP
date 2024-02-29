package Aula02;

import java.util.Scanner;

public class atividade01 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("1 - Informações pessoais");
    System.out.println("Qual o seu nome? ");
    String nome = entrada.next();
    System.out.println("Qual o seu endereço? ");
    String endereco = entrada.next();
    System.out.println("Qual a sua idade? ");
    int idade = entrada.nextInt();

    System.out.printf("Olá %s você mora em %s e tem %d anos!\n", nome, endereco, idade);
  }

}
