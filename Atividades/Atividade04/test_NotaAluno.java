package Atividades.Atividade04;

public class test_NotaAluno {
  public static void main(String[] args) {
    NotaAluno aluno1 = new NotaAluno();
    NotaAluno aluno2 = new NotaAluno();
    NotaAluno aluno3 = new NotaAluno();

    aluno1.nomeAluno = "Fulano";
    aluno1.nota1 = 7;
    aluno1.nota2 = 5;

    aluno2.nomeAluno = "Ciclano";
    aluno2.nota1 = 5;
    aluno2.nota2 = 5;

    aluno3.nomeAluno = "Deutrano";
    aluno3.nota1 = 6;
    aluno3.nota2 = 9;

    aluno1.mostraNomeAluno();
    aluno1.statusAluno();
    aluno2.mostraNomeAluno();
    aluno2.statusAluno();
    aluno3.mostraNomeAluno();
    aluno3.statusAluno();
  }
}
