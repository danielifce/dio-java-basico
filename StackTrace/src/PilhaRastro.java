//package br.com.dio.debbuging;

public class PilhaRastro {
    
    // Método principal que inicia a execução do programa.
    public static void main(String[] args) {
        // Exibe uma mensagem no console indicando que o programa iniciou.
        System.out.println("Iniciou do programa no método main.");
        // Chama o método 'a()'. Esse método, por sua vez, chamará outros métodos.
        a();
        // Exibe uma mensagem no console indicando que o programa finalizou o método 'main'.
        System.out.println("Finalizou do programa no método main.");
    }

    // Método 'a', que é chamado dentro do 'main'.
    static void a() {
        // Exibe uma mensagem indicando que entrou no método 'a'.
        System.out.println("Entrou no método a.");
        // Chama o método 'b()'. O fluxo do programa será para o método 'b' após a execução do 'a'.
        b();
        // Exibe uma mensagem indicando que finalizou o método 'a'.
        System.out.println("Finalizou o método a.");
    }

    // Método 'b', que é chamado dentro do método 'a'.
    static void b() {
        // Exibe uma mensagem indicando que entrou no método 'b'.
        System.out.println("Entrou no método b.");
        // Um loop que imprime os números de 0 a 4 no console.
        for(int i = 0; i <= 4; i++) 
            System.out.println(i);  // Exibe o número de 0 a 4
        // Chama o método 'c()'. O fluxo do programa será para o método 'c' após a execução do loop.
        c();
        // Exibe uma mensagem indicando que finalizou o método 'b'.
        System.out.println("Finalizou o método b.");
    }

    // Método 'c', que é chamado dentro do método 'b'.
    static void c(){
        // Exibe uma mensagem indicando que entrou no método 'c'.
        System.out.println("Entrou no método c.");
        // Aqui poderia ser usada a linha 'Thread.dumpStack()', que imprime a pilha de execução (stack trace) até o momento. 
        // Isso seria útil para entender o caminho de execução e as chamadas de métodos realizadas.
        
        /* Esta linha imprime a pilha de execução no momento em que é chamada. O método dumpStack() gera uma 
        exceção (java.lang.Exception) e imprime o rastreamento da pilha da thread atual. Ele basicamente mostra 
        a sequência de chamadas de métodos que ocorreram até o ponto onde dumpStack() foi chamado. */
        // Thread.dumpStack();

        /*Obtendo o stack trace sem lançar uma exceção. Thread.currentThread().getStackTrace() Esse método retorna um array de objetos StackTraceElement, que contém as informações sobre os métodos 
        que estão na pilha de execução naquele momento. Cada objeto StackTraceElement contém informações como o 
        nome do método, a classe onde o método foi definido, o nome do arquivo fonte e o número da linha. */
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        // Exibindo o stack trace
        for (StackTraceElement element : stackTrace) {
            System.out.println(element);
        }

        // Exibe uma mensagem indicando que finalizou o método 'c'.
        System.out.println("Finalizou o método c.");
    }
}
