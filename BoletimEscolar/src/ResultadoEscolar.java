public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        int nota = 7;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if(nota>=5 && nota<7){
            System.out.println("Recuperacao");
        }
        else
        {
            System.out.println("Reprovado");
        }


        String status = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println("Critério 2: "+status);
    }
}
