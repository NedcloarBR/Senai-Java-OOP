package Atividades.Atividade05;

public class FolhaPagamento {
  private String nome1;
  private float salario1;
  private String nome2;
  private float salario2;

  public String getNome1() {
    return nome1;
  }

  public void setNome1(String nome) {
    nome1 = nome;
  }

  public float getSalario1() {
    return salario1;
  }

  public void setSalario1(float valor) {
    if (valor <= 0) {
      System.out.println("O salario não pode ser menor ou igual a 0");
      return;
    }
    salario1 = valor;
  }

  public String getNome2() {
    return nome2;
  }

  public void setNome2(String nome) {
    nome2 = nome;
  }

  public float getSalario2() {
    return salario2;
  }

  public void setSalario2(float valor) {
    if (valor <= 0) {
      System.out.println("O salario não pode ser menor ou igual a 0");
      return;
    }
    salario2 = valor;
  }

  public float totalFolhaPagamento() {
    return salario1 + salario2;
  }
}
