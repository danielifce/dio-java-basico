package Apredizado.Daniel.variaveisMetodos;
import javax.print.DocFlavor.STRING;

public class MinhaClasse { // Sempre CamaelCase com inicial maiuscula
    public static void main(String[] args){
        int variavel_sempre_minuscula = 20; // Variável é sempre minúscula e Se toda Upper Case é uma constanate.
        int cep = 12345678; // Se começar com zero tem que ser String. 
        float salario = 1000.50f; // Sempre que for float tem que colocar o f no final
        long populacao = 1000000000L; // Sempre que for long tem que colocar o L no final
        double testea = cep;
        short testeb = (short)testea; // exemplo de casting
        final double valorPi = 3.14159265359; // Constante sempre em Upper Case. Se for final não pode ser alterado.
        System.out.println(valorPi); //Retorna o valor de Pi

        boolean testeVariavel = true; // Sempre que for boolean tem que ser true ou false
        System.out.println(testeVariavel); //Retorna o valor da variável
    
        int a, b;
        a=10; b=20;
        System.err.println((a>b)? "a é maior que b" : "b é maior que a"); // Operador ternário



        String nome = "João"; // Os simbolos permitidos são letras, números, $ e _. Os números só não podem ser o primeiro caractere.
        String sobrenome = "Silva";// variáveis são escritas no singular e no idioma do código. plural é para arrey.
        String nomeCompleto = juntarNome(nome, sobrenome);
        System.out.println(nomeCompleto); //Retorna o nome completo
        resultarBoletim(7); //Retorna a situação do aluno
    }

    public static String juntarNome (String nome, String sobrenome){ // Métodos tem nome no infinitivo e devem comerça com letra minúscula em CamelCase.
        return nome.concat(" ").concat(sobrenome);
    }

    public static void resultarBoletim (int nota){ // Métodos tem nome no infinitivo e devem comerça com letra minúscula em CamelCase.
        if (nota < 6)
            System.out.println("Reprovado");
        else if (nota == 6)
            System.err.println("Prova de Minerva");
            else
                System.out.println("Aprovado");              
    }
}
