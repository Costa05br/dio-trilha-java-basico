public class Exemplo {
    public static void main(String[] args) {
        
        /*
         * Este método foi elabora as pressas
         * por isso eu abreviei o nome das variáveis
         * mas olha, ele tem a finalidade de somar ou multiplicar 
         * dois números.
         */
    }

    public int somaMultiplica (int n, int x, String m) {
        int r = 0; // r é igual ao resultado
        
        if (m == "M") {
            // M = Multiplicação
            r = n * x;

        } else {
            // se não soma mesmo
            r = n + x;
        }

        return r;
    }
}