import java.util.Locale;
import java.util.Scanner;

public class TryCatchTratamentoDeExcecao {
    public static void main(String[] args) {
        // Declaração das variáveis antes do try
        String nome = "";
        String sobrenome = "";
        int idade = 0;
        double altura = 0.0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try{
        System.out.println("Digite seu nome Nome: ");
        nome = scanner.next();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = scanner.next();
        System.out.println("Digite sua idade: ");   
        idade = scanner.nextInt();
        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();
        }
        catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        finally{
            scanner.close();
        }

        //Imprime os dados
        System.out.println("Seu nome é: "+nome.toUpperCase()+" "+sobrenome.toUpperCase());
        System.out.println("Sua idade é: "+idade);
        System.out.println("Sua altura é: "+altura); 

    }
}
/*
try {
    // Código que pode lançar uma exceção
    } 

catch (TipoDaExceção Variavel) {
    // Código a ser executado se a exceção ocorrer
    }

finally {
    // Código a ser executado sempre, independente de exceção
    }

    try → Contém o código que pode gerar uma exceção.
    catch → Captura e trata a exceção.
    finally → Sempre é executado (opcional).
    Múltiplos catch → Para capturar diferentes tipos de exceções.


Hierarquia de Exceções 
Em Java, todas as exceções e erros derivam da classe Throwable, que
é a superclasse das exceções e erros. A partir dela, temos duas 
grandes ramificações:
    Exception (Exceções verificadas e não verificadas)
    Error (Erros graves do sistema, geralmente não recuperáveis)

Throwable(superclasse raiz de todas as exceções e erros)
│
├── Exception (Exceções - pode ser tratada pelo programa)
│   ├── IOException (Erro de entrada/saída)
│   │   ├── FileNotFoundException (Arquivo não encontrado)
│   │   ├── EOFException (Fim de arquivo inesperado)
│   │   ├── SocketException (Erro em operações de socket)
│   │   ├── UnknownHostException (Host desconhecido)
│   │   ├── MalformedURLException (URL malformada)
│   │   ├── ConnectException (Falha na conexão de rede)
│   │
│   ├── SQLException (Erro relacionado ao banco de dados)
│   │   ├── BatchUpdateException (Erro durante uma operação batch)
│   │   ├── SQLIntegrityConstraintViolationException (Violação de restrição de integridade)
│   │   ├── SQLSyntaxErrorException (Erro de sintaxe SQL)
│   │   ├── SQLTimeoutException (Tempo limite excedido em uma consulta)
│   │
│   ├── InterruptedException (Thread interrompida)
│   ├── TimeoutException (Operação excedeu o tempo limite)
│   ├── ExecutionException (Erro durante a execução de uma tarefa assíncrona)
│   ├── CloneNotSupportedException (Clone não permitido para um objeto)
│   ├── ClassNotFoundException (Classe não encontrada)
│   ├── InstantiationException (Falha ao instanciar uma classe)
│   ├── IllegalAccessException (Acesso ilegal a uma classe ou método)
│   ├── NoSuchMethodException (Método não encontrado)
│   ├── NoSuchFieldException (Campo não encontrado)
│
├── RuntimeException (Exceções não verificadas)
│   ├── NullPointerException (Acesso a objeto nulo)
│   ├── ArithmeticException (Erro matemático, ex: divisão por zero)
│   ├── ArrayIndexOutOfBoundsException (Acesso inválido em arrays)
│   ├── StringIndexOutOfBoundsException (Acesso inválido em uma string)
│   ├── ClassCastException (Conversão de tipos inválida)
│   ├── IllegalArgumentException (Argumento inválido passado a um método)
│   │   ├── NumberFormatException (Conversão de string para número inválida)
│   ├── IllegalStateException (Estado do objeto não permite uma operação)
│   ├── UnsupportedOperationException (Operação não suportada)
│   ├── ConcurrentModificationException (Modificação indevida em coleção durante iteração)
│   ├── NegativeArraySizeException (Criação de array com tamanho negativo)
│   ├── SecurityException (Violação de segurança)
│   ├── TypeNotPresentException (Uso de um tipo ausente em tempo de execução)
│   ├── EnumConstantNotPresentException (Uso de um valor inexistente em um enum)
│   ├── IllegalMonitorStateException (Uso incorreto de `wait()` ou `notify()`)
│
└── Error (Erros graves - geralmente não tratados pelo programa)
    ├── StackOverflowError (Estouro de pilha, chamadas recursivas sem fim)
    ├── OutOfMemoryError (Falta de memória para alocar objetos)
    ├── VirtualMachineError (Falha grave na JVM)
    └── Outras falhas do sistema

*/