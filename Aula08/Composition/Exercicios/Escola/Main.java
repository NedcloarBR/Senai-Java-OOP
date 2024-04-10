package Aula08.Composition.Exercicios.Escola;

public class Main {
  public static void main(String[] args) {
    Aluno a1 = new Aluno();
    a1.setNome("Miguel");
    a1.setNota(10);
    Aluno a2 = new Aluno();
    a2.setNome("Emanuel");
    a2.setNota(9);
    Turma turma = new Turma();
    turma.setNomeTurma("ADS 2023/2");
    turma.setAluno1(a1);
    turma.setAluno2(a2);

    System.out.println("Nome da turma: " + turma.getNomeTurma());
    System.out.println("Nome aluno 1: " + turma.getAluno1().getNome());
    System.out.println("Nota aluno 1: " + turma.getAluno1().getNota());
    System.out.println("Nome aluno 2: " + turma.getAluno2().getNome());
    System.out.println("Nota aluno 2: " + turma.getAluno2().getNota());
  }
}
