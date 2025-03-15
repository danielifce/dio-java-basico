public class ConsultaSaldo {
    public static void main(String[] args) throws Exception {
        double saldo = 100;
        double valorSolicitado = 500.59;

        if(valorSolicitado <= saldo){ // Controle de fluxo
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
