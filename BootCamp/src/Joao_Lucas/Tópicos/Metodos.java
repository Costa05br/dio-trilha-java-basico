package Joao_Lucas.Tópicos;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite um valor:");
        int num1 = teclado.nextInt ();

        System.out.println("Digite outro valor:");
        int num2 = teclado.nextInt ();

        double soma = somar(num1, num2);
        System.out.println("Resposta:" + soma);

        teclado.close ();
        
    }

    public static double somar (int num1, int num2) {
        double soma = num1 + num2;
        return soma;

    }
}
