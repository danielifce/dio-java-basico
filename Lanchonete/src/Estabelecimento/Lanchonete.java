package Estabelecimento;

import Cozinha.Almoxarife;
import Cozinha.Cozinheiro;

public class Lanchonete {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        Almoxarife almoxarife = new Almoxarife();
        cozinheiro.setNome("João");
        cozinheiro.pedirTrocaDeGas(almoxarife);

        
    }

}
