package Atividades.Atividade04;

public class NotaAluno {
  String nomeAluno;
  float nota1;
  float nota2;

  String mostraNomeAluno() {
    return nomeAluno;
  }

  void statusAluno() {
    if (mediaDoAluno() >= 7) {
      System.out.println("Aprovado");
    } else {
      System.out.println("Reprovado");
    }
  }

  float mediaDoAluno() {
    return (nota1 + nota2) / 2;
  }
}
