// Exceção personalizada
// Criando uma exceção personalizada chamada CepInvalidoException, que herda da classe Exception.
// Essa exceção será lançada quando o CEP informado não tiver exatamente 8 dígitos.
public class CepInvalidoException extends Exception {
    // Construtor que recebe uma mensagem de erro
    public CepInvalidoException(String message) {
        // Passa a mensagem para a classe pai (Exception)
        super(message);
    }
}