package Aula16;

public class main_Funcionario {
  public static void main(String[] args) {
    Diretor d1 = new Diretor("Miguel", 1000f);
    Professor f1 = new Professor("Emanuel", 1000f);

    d1.calcularSalario();
    f1.calcularSalario();
  }
}