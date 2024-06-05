package Aula13;

public class Professor extends Pessoa {

  public Professor(String nome, float salario) {
    super(nome, salario);
  }

  @Override
  public float getSalario() {
    return super.getSalario() * (1 + .15f);
  }

}
