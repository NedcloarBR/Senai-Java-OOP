package Aula15;

import java.util.ArrayList;

public class ArrayList_test {
  public static void main(String[] args) {
    ArrayList<Integer> intList = new ArrayList<Integer>();
    intList.add(10);
    intList.add(15);
    intList.add(20);
    intList.add(16);

    System.out.println(intList);

    for (int i = 0; i < intList.size(); i++) {
      if (i == intList.size() - 1) {
        System.out.println(intList.get(i) + "[" + i + "]");
      } else {
        System.out.print(intList.get(i) + "[" + i + "]" + " - ");
      }
    }

    System.out.println();

    for (Integer i : intList) {
      System.out.println(i);
    }

    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("Teste 1");
    stringList.add("Teste 2");
    stringList.add("Teste 3");
    stringList.add("Teste 4");
  }
}