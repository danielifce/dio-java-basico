package Candidatura;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");
        //analisarCandidato(1500.0);
        //analisarCandidato(2000.0);
        //analisarCandidato(2500.0);
        //selecaoCandidatos();
        //imprimirSelecionados();
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
}

static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    do{
        atendeu = atender();
        continuarTentando = !atendeu;
        if(continuarTentando){
            tentativasRealizadas++;
        }else{
            System.out.println("Contato realizado com sucesso!");
        }
    }while(continuarTentando && tentativasRealizadas <3);
    if(atendeu)
        System.out.println(("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativas."));
    else
        System.out.println("Não conseguimos contato com " + candidato + ", número máximo tentativas " + tentativasRealizadas + " tentativas.");
}
/*
Esse método tem uma chance de aproximadamente 33,33% de retornar true e 66,67% 
de retornar false, pois apenas um dos três valores possíveis (1) satisfaz a condição. 
new Random().nextInt(3): Cria um novo objeto Random. O método nextInt(3) gera um 
número inteiro aleatório entre 0 e 2 (ou seja, pode ser 0, 1 ou 2).
(nextInt(3)== 1):Se o número gerado for igual a 1, o método retorna true.
Caso contrário (0 ou 2), retorna false.
*/
static boolean atender(){
    return new Random().nextInt(3) == 1;
}


static void imprimirSelecionados(){
    String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
    System.out.println("Imprimindo a lista de candidatos selecionados informando o índice:" );
    //for(int indice=1; indice <= candidatos.length; indice++){
    //   System.out.printf("O candidato de nº %d é o %s.%n", indice, candidatos[indice-1]);
     //}
     int indice=1;
     for(String candidato : candidatos){
         System.out.println("O candidato de nº " + indice + " é o " + candidato + ".");
            indice++;
     }
}

static double valorPretendido(){
    double valor = ThreadLocalRandom.current().nextDouble(1500, 2500);
    return ThreadLocalRandom.current().nextDouble(1500, 2500);
}

static void selecaoCandidatos(){
    String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jordan"};
    int candidatosSelecionados = 0;
    int cadidadoAtual = 0;
    double salarioBase = 2000.0;
    while(candidatosSelecionados < 5){
        String candidato = candidatos[cadidadoAtual];
        double salarioPretendido = valorPretendido();
        System.out.printf("O candidato %s solicitou este valor de salário pretendido %.2f %n", candidato, salarioPretendido);
        if(salarioPretendido <= salarioBase){
            System.out.printf("O candidato %s foi selecionado(a) para a vaga.%n", candidato);
            candidatosSelecionados++;
        }
        cadidadoAtual++;
    }
}

static void analisarCandidato(double salarioPretendido){
    double salarioBase = 2000.0;
    if(salarioPretendido < salarioBase){
        System.out.println("Ligar para o candidato!");
    } else if(salarioBase == salarioPretendido){
        System.out.println("Ligar para o candidato com contra-proposta");
    } else{
        System.out.println("Aguardando o resultado dos demais candidatos");
    }
}
}
