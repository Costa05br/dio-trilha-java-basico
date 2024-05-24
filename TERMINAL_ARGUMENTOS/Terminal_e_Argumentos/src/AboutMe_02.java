import java.util.Scanner;

public class AboutMe_02 {
    public static void main(String[] args) {
        
        // Declaração das Variáveis:
        Scanner teclado = new Scanner (System.in);
        String nome;
        String sobrenome;
        int idade;
        double altura;

        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine ();
        
        System.out.println("Digite seu sobrenome: ");
        sobrenome = teclado.nextLine ();

        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt ();

        System.out.println("Digite sua altura: ");
        altura = teclado.nextDouble ();


        // Vai imprimir as informações adquiridas pelo usuário via teclado:

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho" + idade + "anos ");
        System.out.println("Minha altura é " + altura + "cm ");


        teclado.close ();
    }
}
