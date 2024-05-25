public class ForArrays {
    public static void main(String[] args) {
        
        // For em arrays:

        //  Em arrays inícia o indíce em ZERO:
         String alunos [] = {"ROBERTO", "CARLA", "RAMON", "JOÃO LUCAS", "BIBIANA" };

        for (int x = 0; x < alunos.length; x++ ) {
            System.out.println("O aluno no indíce x = " + x + " é " + alunos [x] );

        }

        // Outra forma:

        for (String aluno : alunos) {

            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
