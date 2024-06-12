package Aula14;

public class ingresso_teste {
  public static void main(String[] args) {
    Ingresso i1 = new Ingresso(20f, "Ingresso comum");
    IngressoBackStage i2 = new IngressoBackStage();
    IngressoVip i3 = new IngressoVip();
    IngressoPista i4 = new IngressoPista();
    Ingresso.mostraIngressos(i1);
    Ingresso.mostraIngressos(i2);
    Ingresso.mostraIngressos(i3);
    Ingresso.mostraIngressos(i4);
  }
}
