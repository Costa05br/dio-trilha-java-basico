public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);

        } else 

            System.out.println("Saldo insuficiente");

            System.out.println(saldo);

        // Explicação:

        // O condicional "if" só irá funcionar quando as variáveis
        //declaradas se adequarem a condição.
        // Caso o valor solicitado  for maior que o saldo, o programa
        //apenas printa na tela o saldo.

    }
}
