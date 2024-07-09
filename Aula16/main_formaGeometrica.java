package Aula16;

public class main_formaGeometrica {
  public static void main(String[] args) {
    Quadrado f1 = new Quadrado("Q1", 5f);
    Retangulo f2 = new Retangulo("R1", 10f);
    Triangulo f3 = new Triangulo("T1", 15f);

    System.out.println(f1.getNome() + ": area " + f1.totalArea() + "cm2");
    System.out.println(f2.getNome() + ": area " + f2.totalArea() + "cm2");
    System.out.println(f3.getNome() + ": area " + f3.totalArea() + "cm2");
  }
}
