package Aula10;

public class pessoa_teste {
  public static void main(String[] args) {
    PessoaJuridica pj = new PessoaJuridica("Miguel", "Rua ABC", 99999999, "9999999", "999999");
    System.out.println("nome:" + pj.getNome());
    System.out.println("endereço:" + pj.getEndereco());
    System.out.println("telefone:" + pj.getTelefone());
    System.out.println("CNPJ:" + pj.getCnpj());
    System.out.println("Inscrição estadual:" + pj.getInscricaoEstadual());

    PessoaFisica pf = new PessoaFisica("Miguel", "Rua ABC", 99999, "99999999", "9999999");
    System.out.println("nome:" + pf.getNome());
    System.out.println("endereço:" + pf.getEndereco());
    System.out.println("telefone:" + pf.getTelefone());
    System.out.println("CPF:" + pf.getCpf());
    System.out.println("RG:" + pf.getRg());
  }
}
