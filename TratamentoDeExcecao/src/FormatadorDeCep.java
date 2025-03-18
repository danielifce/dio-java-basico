
public class FormatadorDeCep {

    public static void main(String[] args) {
        try {
            // Testando a formatação do CEP
            // A função 'formatarCep' é chamada com um CEP válido "12545865".
            String cepFormatado = formatarCep("15455865");
            // Imprime o CEP formatado no console
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // Caso uma exceção do tipo CepInvalidoException seja lançada,
            // este bloco de código irá ser executado.
            // O método 'printStackTrace' imprime detalhes sobre a exceção no console.
            e.printStackTrace();
        }
    }

    // Método estático para formatar o CEP
    // O método 'formatarCep' recebe um CEP como parâmetro e retorna o CEP formatado ou lança uma exceção
    static String formatarCep(String cep) throws CepInvalidoException {
        // Verifica se o CEP tem exatamente 8 dígitos
        // Caso contrário, uma exceção CepInvalidoException será lançada.
        if (cep.length() != 8) {
            // Lançando a exceção personalizada com uma mensagem de erro
            throw new CepInvalidoException("O CEP deve conter 8 dígitos");
        }
        
        // Se o CEP for válido (tiver 8 dígitos), formata o CEP
        // Adiciona um hífen (-) entre o 5º e o 6º caractere do CEP
        return cep.substring(0, 5) + "-" + cep.substring(5);
    }
}
