package EstruturasExcepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try {
        
        // Criando o objeto Scanner:
        Scanner teclado = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine ();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = teclado.nextLine ();

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt ();

        System.out.println("Digite sua altura: ");
        double altura = teclado.nextDouble ();


        // Imprimindo os dados obtidos pelo usuário:

        System.out.println("Olá, me chamo " + nome.toUpperCase () + " " + sobrenome.toUpperCase ());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

        teclado.close ();

        }

        // Dentro do () iremos dizer qual exceção queremos capturar:
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
            
        }
    }
}
