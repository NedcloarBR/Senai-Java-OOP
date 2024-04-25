package Aula10;

public class calculadora_teste {
  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    System.out.println(calc.soma(5, 6));
    System.out.println(calc.soma(5f, 6f));
    System.out.println(calc.soma(5d, 6d));
    System.out.println(calc.soma(5, 6, 7));
    System.out.println(calc.soma(5f, 6f, 7f));
    System.out.println(calc.soma(5d, 6d, 7d));
  }
}
