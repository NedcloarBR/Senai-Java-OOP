package Atividades.Atividade06;

public class NotaAluno {
  private String nomeAluno;
  private float nota1;
  private float nota2;

  public NotaAluno() {
  }

  public NotaAluno(String nomeAluno, float nota1, float nota2) {
    this.nomeAluno = nomeAluno;
    this.nota1 = nota1;
    this.nota2 = nota2;
  }

  public String mostraNomeAluno() {
    return this.nomeAluno;
  }

  public void statusAluno() {
    if (mediaAluno() >= 7) {
      System.out.println("aprovado");
    } else if (mediaAluno() < 7) {
      System.out.println("reprovado");
    }
  }

  public float mediaAluno() {
    return (nota1 + nota2) / 2;
  }

  public String getNomeAluno() {
    return nomeAluno;
  }

  public void setNomeAluno(String nomeAluno) {
    this.nomeAluno = nomeAluno;
  }

  public float getNota1() {
    return nota1;
  }

  public void setNota1(float nota1) {
    this.nota1 = nota1;
  }

  public float getNota2() {
    return nota2;
  }

  public void setNota2(float nota2) {
    this.nota2 = nota2;
  }

}