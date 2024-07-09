s056_g2_q1
O código abaixo NÃO é compilado. Selecione uma opção, que informe por qual motivo ele não compila.
 
public class carro{
             private String nome;
             public void montaCarro(String nome){}
             public void montaCarro(String nomeCarro){}
 }
[x] Existem dois métodos “montaCarro” com tipos de parametros iguais.
Não foi inserido os métodos get/set
Nome da classe deve iniciar com letra maiúscula.
Não foi criado o construtor.
2.
peso: 10%
s056_g2_q2
Nó código abaixo, existe um relacionamento entre Pessoa e Endereco . Selecione a opção que define esse tipo de relacionamento.

Sobrecarga
Herança
Polimorfismo
[x] Composição
3.
peso: 10%
s056_g2_q3
Em relação a Herança, marque as sentenças VERDADEIRAS abaixo, sendo que as que não forem marcadas serão consideradas FALSAS.
 
Marque as afirmativas verdadeiras:
Pode haver mais de uma resposta correta
[x] As novas classes derivadas da classe existente são chamadas de super classe/mãe/pai
[x] Na superclasse colocamos todas as características  semelhantes, das subclasses. E em cada subclasse, “especializamos” as características daquela subclasse.
[x] Mecanismo da orientação objeto, que nos permite criar novas classes, através de uma já desenvolvida
Quando percebemos que classes possuem muitas características parecidas, é possível usar herança.
4.
peso: 10%
S056_g2_q4
No código abaixo, qual é o motivo de estar sendo empregado INCORRETAMENTE o conceito de herança.

class casa {
            private String nome;
 }
 
class Pessoa extends casa { }
 
class Funcionario extends casa { }
 
A classe casa não possui métodos get/set
A classe Pessoa é uma casa e a classe Funcionario não é casa.
[x] As classes Pessoa e Funcionario são contextos diferentes em relação a classe casa
A variável “nome” é privada e deveria ser protected ou pública 
5.
peso: 10%
s056_g2_q5
Defina com suas palavras o que é Polimorfismo através da execução de todos itens abaixo:
 
1. explique o seu entendimento a respeito
2. De no minimo um exemplo com codigo.
O Polimorfismo nos da a capacidade de tratar diferentes objetos de classes distintas através de metodos em comum.
public class Animal {
  public void barulho() {
    System.out.println("Som"); 
  }
}

public class Gato extends Animal {
  @Override
  public void barulho() {
    System.out.println("Miau"); 
  }
}

public class Cachorro extends Animal {
  @Override
  public void barulho() {
    System.out.println("AuAu"); 
  }
}

public class Main {
  public static void main(String[] args) {
    Gato g1 = new Gato();
    Cachorro c1 = new Cachorro();

    g1.barulho();
    c1.barulho();
  }
}
6.
peso: 10%
s056_g2_q6
No código abaixo, qual é o resultado?
 
class conta{
            public int getSaldo() {
                        return (10+1);
            }
} 
 
class contaCorrente extends conta{
           public int getSaldo(){
                        return 15;
            }
} 
 
class contaPoupanca extends conta{
           public int getSaldo(int temp){
                        return (10+temp);
            }
}

class Main{ 
            public static void main(String[] args) { 
                        ContaPoupanca cc = new ContaPoupanca();
                        System.out.println(“Saldo é: “ + cc.getSaldo());
            }
}
[x] Saldo é 11
Saldo é 15
Saldo é 10
Saldo é 0
7.
peso: 10%
s056_g2_q7
Em relação a Listas e Mapas, assinale as alternativas FALSAS, assumindo as alternativas não marcadas como VERDADEIRAS.
 
Marque as afirmativas FALSAS:
Pode haver mais de uma resposta correta
[x] Mapas não possuem chaves para inserir/buscar objetos.
São estruturas de dados para armazenamento de objetos
Facilitam a persistência em memória de objetos.
[x]As Listas não são indexadas
8.
peso: 30%
s056_g2_q8.1
Desenvolvimento prático (Questão que vale 3 pontos sobre 10). 
A entrega deve ser somente de códigos em texto abaixo. 
 
Vamos fazer um sistema para uma loja de suprimentos de papel onde são vendidos:
 
1) resmas de folhas de papel A4.
2) itens adicionais como clips, caneta, borracha e outros onde o cliente tem escolha de algumas opções.
 
Crie uma classe base/superclasse abstrata chamada "Item" que tenha no mínimo:
- Atributos: nome, descrição
- Metodos: calculoPreco (método abstrato)
 
A seguir crie as subclasses de Item:
 
a.   Resma: essa classe deve conter uma string que define o tipo da resma de papel (Ex: A4_500folhas, A4_100folhas, etc) e implementar o metodo calculoPreco informando o seu valor. 
 
b.   ComboDeAdicionais: essa classe deve conter como atributo um ArrayList para armazenar os opcionais possiveis.
 
    Dessa forma, se um cliente comprar uma impressora com adicionais, esses itens devem ser adicionados ao Arraylist da classe ComboDeAdicionais.
 
    Com isso, o metodo calculoPreço precisa saber o preço do produto no caso da classe Resma e no caso da classe ComboDeAdicionais precisa realizar a soma dos preços dos adicionais para informar o preço do combo.
 
    Por fim, na classe TesteLoja crie no minimo 1 objeto da classe Resma e 2 objetos da classe ComboDeAdicionais com dois adicionais cada (no minimo) diferentes entre eles, mostrando/imprimindo na tela o nome, descricao e preços.