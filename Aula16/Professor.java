package Aula16;

public class Professor extends Funcionario {

  public Professor(String nome, float salario) {
    super(nome, salario, 15f);
  }

  @Override
  public void calcularSalario() {
    float salario = this.getSalario() + this.getSalario() * (this.getBonus() / 100);
    System.out.println(salario);
  }

}
