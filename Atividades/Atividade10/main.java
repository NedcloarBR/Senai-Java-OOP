package Atividades.Atividade10;

import java.util.ArrayList;

public class main {
  public static void main(String[] args) {
    Professor p1 = new Professor("Miguel", 19, "Masculino");
    Professor p2 = new Professor("Emanuel", 14, "Masculino");
    Professor p3 = new Professor("Meri", 43, "Feminino");
    Professor p4 = new Professor("Zelmar", 59, "Masculino");
    Professor p5 = new Professor("Nilza", 78, "Feminino");
    Faculdade f1 = new Faculdade(new ArrayList<Professor>());
    f1.adicionarProfessor(p1);
    f1.adicionarProfessor(p2);
    f1.adicionarProfessor(p3);
    f1.adicionarProfessor(p4);
    f1.adicionarProfessor(p5);

    f1.filtrarPorIdade(35);

    f1.mostrarProfessores();
  }
}
