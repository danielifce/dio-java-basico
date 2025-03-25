package Cozinha;

public class Cozinheiro {

    private String nome;

    public Cozinheiro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void prepararPrato() {
        System.out.println("Preparando prato...");
    }

    public void pedirTrocaDeGas(Almoxarife almoxarife) {
        almoxarife.trocarGas();
    }

}
