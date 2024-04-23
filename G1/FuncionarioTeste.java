package G1;

public class FuncionarioTeste {
  public static void main(String[] args) {
    Historico h1 = new Historico("Germany Informática", 60);
    Funcionario f1 = new Funcionario("Miguel", h1);

    System.out.println("Funcionário: " + f1.getNome());
    System.out.println("Empresa: " + f1.getHistoricoTrabalho().getNomeDaEmpresa());
    System.out.println("Tempo de trabalho: " + f1.getHistoricoTrabalho().tempoDeTrabalhoEmAnos() + " Anos");

  }
}
