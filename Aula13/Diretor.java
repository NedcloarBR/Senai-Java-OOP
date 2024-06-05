package Aula13;

public class Diretor extends Pessoa {

  public Diretor(String nome, float salario) {
    super(nome, salario);
  }

  @Override
  public float getSalario() {
    return super.getSalario() * (1 + .2f);
  }

}
