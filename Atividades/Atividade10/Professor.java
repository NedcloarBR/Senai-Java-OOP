package Atividades.Atividade10;

public class Professor {
  protected String nome;
  protected int idade;
  protected String sexo;

  public Professor(String nome, int idade, String sexo) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  @Override
  public String toString() {
    return "Professor [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
  }

}
