package Messeger;

public class MessegerService {
    protected void envierMsg() {
        verificarConexao();
        System.out.println("Enviando mensagem");
        salvarMsg();
    }

    protected void receberMsg() {
        verificarConexao();
        System.out.println("Recebendo mensagem");
        salvarMsg();
    }

    private void verificarConexao() {
        System.out.println("Verificando conexão");
    }

    private void salvarMsg() {
        System.out.println("Salvando mensagem \n");
    }

  


}
