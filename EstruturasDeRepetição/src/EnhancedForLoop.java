public class EnhancedForLoop {


    public static void main(String[] args) {

        String alunos[] = {"Ana", "Maria", "José", "Pedro", "João"};
        
        for(String nome : alunos){
            System.out.println("O aluno é "+nome);
        }



        int[] numeros = {1, 2, 3, 4, 5};

        for (int num : numeros) {
            System.out.println(num);
        }
    }
}

/* 
for (Tipo elemento : coleção) { }
Tipo → Tipo dos elementos na coleção (exemplo: int, String, double).
elemento → Nome da variável que recebe o valor de cada item durante a iteração.
coleção → O array ou a coleção que será percorrida.
*/