package Apredizado.Daniel.variaveisMetodos;
/**
 * Classe que representa uma Conta Bancária.
 * 
 * @author Daniel
 * @version 1.0
 * @since 2025
 */
public class ContaBancaria {

    private double saldo;

    /**
     * Deposita um valor na conta.
     *
     * @param valor O valor a ser depositado.
     * @throws IllegalArgumentException Se o valor for negativo.
     */
    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        saldo += valor;
    }

    /**
     * Retorna o saldo atual da conta.
     *
     * @return O saldo disponível.
     */
    public double getSaldo() {
        return saldo;
    }
}

//documentação: javadoc -enconding UTF-8 -docencoding ISO-8859-1 -d../docs src/*.java
//& "C:\Program Files\Java\jdk1.8.0_202\bin\javadoc.exe" -encoding UTF-8 -docencoding ISO-8859-1 -d "C:\Users\danie\.vscode\RepositorioGit\dio-java-basico\MeuPrimeiroProjetoJavaDIO\docs" "C:\Users\danie\.vscode\RepositorioGit\dio-java-basico\MeuPrimeiroProjetoJavaDIO\src\Apredizado\Daniel\variaveisMetodos\*.java"
