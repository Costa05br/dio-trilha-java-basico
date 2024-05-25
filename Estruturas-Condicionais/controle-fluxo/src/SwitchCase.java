public class SwitchCase {
    public static void main(String[] args) {
        
        // Sistema de Medida:
        
        String sigla = "M";

        switch (sigla) {

            case "P": {

                System.out.println("PEQUENO");
                break;

            }

            case "M": {

                System.out.println("MÉDIO");
                break;

            }

            case "G": {

                System.out.println("GRANDE");
                break;

            }

            default:

                System.out.println("INDEFINIDO");

        }

        // Outro exemplo de Switch Case:

        // Plano Operadora:

            String plano = "M"; //M, T ou B

            switch (plano) {

                case "T": {
                    System.out.println("5Gb Youtube");
                }

                case "M": {
                    System.out.println("Whats e Instagram grátis");
                }

                case "B": {
                    System.out.println("100 minutos de ligação");
                }
            } 

            // Não foi colocado "break", pois caso digitar "T" vai printar tudo 
            //que está incluso no plano T, que seria o M e B. E assim por diante.
    }
}
