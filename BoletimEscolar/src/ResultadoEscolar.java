public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        int nota = 5;

        if (nota >= 7) { //Controle de fluxo encadeado
            System.out.println("Aprovado");
        } else if(nota>=5 && nota<7){
            System.out.println("Recuperacao");
        }
        else
        {
            System.out.println("Reprovado");
        }


        String status = nota >= 7 ? "Aprovado" : nota>=5 && nota <7 ? "Recuperação" : "Reprovado";// Condicao ternaria.
        System.out.println("Critério 2: "+status);


        switch (nota) {
            case 10:
                System.out.println("Parabéns");
                break;
        
            default:
                System.out.println("Continue estudando");
                break;
        }
    }
}
