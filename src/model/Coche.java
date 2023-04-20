package model;

import interfaces.Conducible;

public class Coche extends Vehiculo implements Conducible {
    public int cilindrada;
    private String nombreModificacion;

    public Coche(String marca, String modelo, int anoFrabricacion, int cilindrada) {
        super(marca, modelo, anoFrabricacion);
        this.cilindrada = cilindrada;
    }

    @Override
    public void Rodar() {
        System.out.println("El auto anda en 4 ruedas");
    }
    @Override
    public void conducir() {
        System.out.println("Estoy conduciendo mi auto \n");
        System.out.println("La marca de es: " + marca);
        System.out.println("El modelo de es: " + modelo);
        System.out.println("El año de fabricación es: " + anoFrabricacion);
        System.out.println("La cilindrada es: " + cilindrada + "\n");
    }
    @Override
    public void explotar() {
        System.out.println("HIJUEPUTAAAAAAAA-");
        System.out.println("El carro explotó");
    }

    @Override
    public void añadirModificacion(String nombreModificacion) {
        this.nombreModificacion = nombreModificacion;
        System.out.println("Se añadió la siguiente modificación al auto: " + nombreModificacion);
    }


}
