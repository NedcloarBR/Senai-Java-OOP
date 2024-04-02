package Atividades.Atividade04;

import java.util.Scanner;

public class teste_Calculadora {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();
    int operacao;
    int valor1;
    int valor2;

    System.out.print("Digite 1 para somar ou 2 para subtrair: ");
    operacao = entrada.nextInt();

    System.out.print("Digite o valor 1: ");
    valor1 = entrada.nextInt();

    System.out.print("Digite o valor 2: ");
    valor2 = entrada.nextInt();

    if (operacao == 1) {
      System.out.printf("%d+%d=%d", valor1, valor2, calculadora.somar(valor1, valor2));
    } else if (operacao == 2) {
      System.out.printf("%d-%d=%d", valor1, valor2, calculadora.subtrair(valor1, valor2));
    }
    System.out.println("Ultima operação: " + calculadora.operacao);
    System.out.println("Ultimo resultado: " + calculadora.valor);

  }
}
