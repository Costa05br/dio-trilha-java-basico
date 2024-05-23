package Joao_Lucas.Tópicos;
public class Operadores {
    public static void main(String[] args) {
        System.out.println ("Anotações:");

        // Concatenação (Junção dos valores das variáveis):
      
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println("Concatenação:" + nomeCompleto);
        
        String concatenacao = "?";
        concatenacao = 1+"1"+1+1+"1";

        System.out.println (concatenacao);



        // Operadores Unitários:

        //Caso 1 (Tornar número em negativo):
        int numero = 5;
        System.out.println(- numero);

        //Caso 2 (Tornar número em positivo):
        int numero2 = -5;
        System.out.println(- numero2);

        //Caso 3 (Diminuir -1 ao valor):
        int numero3 = 5;
        System.out.println(-- numero3);

        //Caso 4 (Aumentar +1 ao valor):
        int numero4 = 5;
        System.out.println(++ numero4);


        // Incrementação:

        int numero01 = 5;
        //x repetição:
        numero01 ++; //ou //numero = numero + 1;

        System.out.println(numero01);

        // Caso tu queira imprimir o valor original e depois atualizado, basta:

        int numero02 = 8;

        System.out.println(numero02 ++);
        System.out.println(numero02);


        // Podemos negar expressões booleanas:

        boolean variavel = true;

        // O "!" irá negar o valor da variavel:
        System.out.println(!variavel);

        // Para voltar ao valor original, basta:
        System.out.println(variavel);

        // Para definitivamente mudar o valor da variavel, basta reatribuir o valor dela:
        variavel = !variavel;

        System.out.println(variavel);


        // Operador de Condição Ternária:

        int a, b;

        a = 5;
        b = 6;
        String resultado = ""; // igual a vázio, pois não sabemos ainda o resultado;
        
        // Exemplo de condicional utilizando uma estrutura IF/ELSE:
        
        if (a==b) {

            resultado = "verdadeiro";

        } else {

            resultado = "falso";

        }

        System.out.println(resultado);


        // Podemos abreviar com o Operador Ternário:
        
        String resultado01 = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado01);

        // Agora para ser verdadeira:

        int a1, b1;

        a1 = 6;
        b1 = 6;

        String resultado02 = a1==b1 ? "verdadeiro" : "falso";

        System.out.println(resultado02);

        // O Operador Ternário não se limite somente à "String", também podemos fazer com números, por ex:

        int a2, b2;

        a2 = 9;
        b2 = 9;

        // Se as variáveis forem = retornará 1, caso não forem, retornará 0:
        // OBS: a variável "resultado03" é do tipo int, só números;
        int resultado03 = a2==b2 ? 1 : 0;

        System.out.println(resultado03);



        // Operadores Relacionais:

        int number1 = 1;
        int number2 = 2;

        boolean simNao = number1 == number2;

        System.out.println("Number1 é igual a Number2? " + simNao);


        simNao = number1 != number2;

        System.out.println("Number1 é diferente de Number2? " + simNao);


        simNao = number1 > number2;

        System.out.println("Number1 é maior que Number2? " + simNao);

        // Caso queira utlizar o IF:

        if (number1 < number2) {//true

            System.out.println("A nossa condição é verdadeira!");

        }

        // Comparar textos:

        String nome1 = "João Lucas";
        String nome2 = "João Lucas";

        System.out.println(nome1 != nome2);

        // Para comparar objetos, utiliza-se ".equals";

        String num = "JOÃO";
        String num2 = new String ("JOÃO");

        System.out.println(num.equals(num2));


        // Operadores Lógicos:

        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        } else if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        } 
        
        if (condicao1 && ( 8 < 10 )){
            System.out.println("As duas condições são verdadeiras");
        }

        System.out.println("fim");
    }
}
 