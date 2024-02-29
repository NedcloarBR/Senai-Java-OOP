package Aula02;

import java.util.Scanner;

public class atividade04 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("4 - Média de 3 notas");
    System.out.println("Digite a primeira nota: ");
    int nota1 = entrada.nextInt();
    System.out.println("Digite a segunda nota: ");
    int nota2 = entrada.nextInt();
    System.out.println("Digite a terceira nota: ");
    int nota3 = entrada.nextInt();
    int media = (nota1 + nota2 + nota3) / 3;
    System.out.println("A média é: " + media);
    if (media >= 7) {
      System.out.println("Aprovado");
    } else if (media >= 5) {
      System.out.println("Recuperação");
    } else {
      System.out.println("Reprovado");
    }
  }
}
