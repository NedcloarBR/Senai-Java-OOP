package Atividades.Atividade06;

public class notaAluno_test {
  public static void main(String[] args) {
    NotaAluno aluno1 = new NotaAluno();
    NotaAluno aluno2 = new NotaAluno("Emanuel", 7, 6);

    aluno1.setNomeAluno("Miguel");
    aluno1.setNota1(8);
    aluno1.setNota2(9);

    System.out.println(aluno1.getNomeAluno());
    aluno1.statusAluno();
    System.out.println(aluno2.getNomeAluno());
    aluno2.statusAluno();
  }
}