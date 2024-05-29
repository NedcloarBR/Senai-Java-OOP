package Aula11;

public class PessoaJuridica extends Pessoa {
  private String cnpj;
  private String inscricaoEstadual;

  public PessoaJuridica(String nome, String endereco, long telefone, String cnpj, String inscricaoEstadual) {
    super(nome, endereco, telefone);
    this.cnpj = cnpj;
    this.inscricaoEstadual = inscricaoEstadual;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }

  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

}
