package Aula16;

public class Diretor extends Funcionario {

  public Diretor(String nome, float salario) {
    super(nome, salario, 20f);
  }

  @Override
  public void calcularSalario() {
    float salario = this.getSalario() + this.getSalario() * (this.getBonus() / 100);
    System.out.println(salario);
  }

}
