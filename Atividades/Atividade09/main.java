package Atividades.Atividade09;

import java.util.ArrayList;

public class main {
  public static void main(String[] args) {
    ArrayList<Computador> list = new ArrayList<Computador>();

    CPU cpu1 = new CPU(1000, "Snapdragon");
    CPU cpu2 = new CPU(2000, "Intel Core i5");
    CPU cpu3 = new CPU(3000, "AMD Ryzen 5");

    Computador c1 = new Computador("Samsung", 2, cpu1);
    Computador c2 = new Computador("Positivo", 1, cpu2);
    Computador c3 = new Computador("Alienware", 8, cpu3);

    list.add(c1);
    list.add(c2);
    list.add(c3);

    for (Computador computador : list) {
      System.out.println(computador);
    }
  }
}
