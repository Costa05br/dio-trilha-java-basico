public class CondicaoTernaria {
    public static void main(String[] args) {

        // retornar true or false - simples:
        int nota = 7;
        
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        // retortar true or false - encadeada:
        int nota2 = 7;

        String resultado2 = nota2 >= 7 ? "Aprovado" : nota2 >= 5 && nota2 < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);

    }   

}
