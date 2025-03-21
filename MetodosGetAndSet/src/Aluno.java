public class Aluno {

    private String nome;
    private int idade;
    private String matricula;

    public String getNome() {
        return nome;
    }
    public void setNome(String newNome) {
        this.nome = newNome;
    }

    /* public void setNome(String nome) {
        this.nome = nome; // Aqui, 'this.nome' refere-se ao atributo da classe.
    } */

    public int getIdade() {
        return idade;
    }
    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }

}
