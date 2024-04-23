package G1;

public class Funcionario {
  private String nome;
  private Historico historicoTrabalho;

  public Funcionario(String nome) {
    this.nome = nome;
  }

  public Funcionario(String nome, Historico historicoTrabalho) {
    this.nome = nome;
    this.historicoTrabalho = historicoTrabalho;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Historico getHistoricoTrabalho() {
    return historicoTrabalho;
  }

  public void setHistoricoTrabalho(Historico historicoTrabalho) {
    this.historicoTrabalho = historicoTrabalho;
  }

}