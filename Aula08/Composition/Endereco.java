package Aula08.Composition;

public class Endereco {
  private String rua;
  private int numero;
  private String cep;
  private String complemente;
  private String bairro;
  private String cidade;
  private String pais;

  public Endereco(String rua, int numero, String cep) {
    this.rua = rua;
    this.numero = numero;
    this.cep = cep;
  }

  public Endereco(String rua, int numero, String cep, String complemente, String bairro, String cidade, String pais) {
    this.rua = rua;
    this.numero = numero;
    this.cep = cep;
    this.complemente = complemente;
    this.bairro = bairro;
    this.cidade = cidade;
    this.pais = pais;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getComplemente() {
    return complemente;
  }

  public void setComplemente(String complemente) {
    this.complemente = complemente;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

}