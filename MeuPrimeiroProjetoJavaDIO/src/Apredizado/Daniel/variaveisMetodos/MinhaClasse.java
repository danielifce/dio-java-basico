package Apredizado.Daniel.variaveisMetodos;
import javax.print.DocFlavor.STRING;

public class MinhaClasse { // Sempre CamaelCase com inicial maiuscula
    public static void main(String[] args){
        int variavel_sempre_minuscula = 20; // Variável é sempre minúscula e Se toda Upper Case é uma constanate.
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
