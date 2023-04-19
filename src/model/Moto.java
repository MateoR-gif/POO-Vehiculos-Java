package model;

import interfaces.Conducible;

public class Moto extends Vehiculo implements Conducible {
    public int cilindrada;

    public Moto(String marca, String modelo, int anoFrabricacion, int cilindrada) {
        super(marca, modelo, anoFrabricacion);
        this.cilindrada = cilindrada;
    }

    @Override
    public void conducir() {
        System.out.println("Estoy conduciendo mi moto \n");
        System.out.println("La marca de es: " + marca);
        System.out.println("El modelo de es: " + modelo);
        System.out.println("El año de fabricación es: " + anoFrabricacion);
        System.out.println("La cilindrada es: " + cilindrada + "\n");
    }
}
