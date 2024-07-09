package Aula16;

public abstract class Funcionario {
  protected String nome;
  protected float salario;
  protected float bonus;

  public Funcionario(String nome, float salario, float bonus) {
    this.nome = nome;
    this.salario = salario;
    this.bonus = bonus;
  }

  public abstract void calcularSalario();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getSalario() {
    return salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  public float getBonus() {
    return bonus;
  }

  public void setBonus(float bonus) {
    this.bonus = bonus;
  }

  @Override
  public String toString() {
    return "Funcionario [nome=" + nome + ", salario=" + salario + ", bonus=" + bonus + "]";
  }

}
