package Multi;

import Equipamentos.Copiadora;
import Equipamentos.Digitalizadora;
import Equipamentos.Escaner;

public class Multifuncional implements Copiadora, Digitalizadora, Escaner {

    @Override
    public void copiar() {
        System.out.println("Copiando...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando...");
    }

    @Override
    public void escanear() {
        System.out.println("Escanenado...");
    }


    public static void main(String[] args) {
        Multifuncional m = new Multifuncional();
        m.copiar();
        m.digitalizar();
        m.escanear();
    }
}
