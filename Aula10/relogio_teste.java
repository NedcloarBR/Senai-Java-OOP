package Aula10;

public class relogio_teste {
  public static void main(String[] args) {
    Relogio r1 = new Relogio();
    r1.configuraHorario(10, 20, 18);
    System.out.println(r1.getHora() + ":" + r1.getMinuto() + ":" + r1.getSegundo());
    r1.configuraHorario(10, 20, 9);
    System.out.println(r1.getHora() + ":" + r1.getMinuto() + ":" + r1.getSegundo());
    r1.configuraHorario(59, 22);
    System.out.println(r1.getHora() + ":" + r1.getMinuto() + ":" + r1.getSegundo());
    r1.configuraHorario(10, 20, 11);
    System.out.println(r1.getHora() + ":" + r1.getMinuto() + ":" + r1.getSegundo());
  }
}
