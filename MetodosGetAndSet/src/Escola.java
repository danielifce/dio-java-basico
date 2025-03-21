public class Escola {
    public static void main(String[] args) throws Exception {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(20);    

        //imprime os valores dos atributos do objeto felipe
        System.out.println("Aluno: " + felipe.getNome());
        System.out.println("idade: " + felipe.getIdade());  
    }
}
