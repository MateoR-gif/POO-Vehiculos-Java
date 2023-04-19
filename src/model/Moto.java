package model;

import interfaces.Conducible;

public class Moto extends Vehiculo implements Conducible {
    public int cilindrada;
    private String nombreModificacion;

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
    @Override
    public void explotar() {
        System.out.println("HIJUEPUTAAAAAAAA-");
        System.out.println("La moto explotó");
    }

    @Override
    public void añadirModificacion(String nombreModificacion) {
        this.nombreModificacion = nombreModificacion;
        System.out.println("Se añadió la siguiente modificación al auto: " + nombreModificacion);
    }
}
