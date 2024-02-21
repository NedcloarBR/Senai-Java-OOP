package Aula01;

public class exemplo01 {
  public static void main(String[] args) {
    String var1 = "o printf com java";
    System.out.print("Testando 1...");
    System.out.println("Testando 2...");
    System.out.println("Testando 3..." + var1);
    System.out.printf("Testando ... %s\n", var1);
  }
}
