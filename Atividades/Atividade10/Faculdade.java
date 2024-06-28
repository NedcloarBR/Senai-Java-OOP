package Atividades.Atividade10;

import java.util.ArrayList;

public class Faculdade {
  protected ArrayList<Professor> professores;

  public Faculdade(ArrayList<Professor> professores) {
    this.professores = professores;
  }

  public ArrayList<Professor> getProfessores() {
    return professores;
  }

  public void setProfessores(ArrayList<Professor> professores) {
    this.professores = professores;
  }

  public void adicionarProfessor(Professor p1) {
    this.professores.add(p1);
  }

  public void mostrarProfessores() {
    for (Professor professor : professores) {
      System.out.println(professor);
    }
  }

  public void filtrarPorIdade(int idade) {
    for (Professor professor : professores) {
      if (professor.idade >= idade) {
        System.out.println(professor);
      }
    }
  }

  @Override
  public String toString() {
    return "Faculdade [professores=" + professores + "]";
  }

}
