package Atividades.Atividade04;

public class Calculadora {
  int valor;
  String operacao;

  int somar(int a, int b) {
    operacao = "somar";
    valor = a + b;
    return valor;
  }

  int subtrair(int a, int b) {
    operacao = "subtrair";
    valor = a - b;
    return valor;
  }

  int ultimoResultado() {
    return valor;
  }

  String ultimaOperacao() {
    return operacao;
  }
}
