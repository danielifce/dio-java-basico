import javax.print.DocFlavor.STRING;

public class MinhaClasse { // Sempre CamaelCase com inicial maiuscula
    public static void main(String[] args){
        int variavel_sempre_minuscula = 20; // Variável é sempre minúscula e Se toda Upper Case é uma constanate.
        String nome = "João"; // Os simbolos permitidos são letras, números, $ e _. Os números só não podem ser o primeiro caractere.
        String sobrenome = "Silva";
        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto); //Retorna o nome completo

    }

    public static String nomeCompleto (String nome, String sobrenome){
        return nome.concat(" ").concat(sobrenome);
    }
}
