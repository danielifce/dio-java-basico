import javax.print.DocFlavor.STRING;

public class MinhaClasse {
    public static void main(String[] args){
        int variavel_sempre_minuscula = 20;
        String nome = "João";
        String sobrenome = "Silva";
        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto); //Retorna o nome completo

    }

    public static String nomeCompleto (String nome, String sobrenome){
        return nome.concat(" ").concat(sobrenome);
    }
}
