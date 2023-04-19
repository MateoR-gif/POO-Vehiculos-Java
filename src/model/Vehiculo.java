package model;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anoFrabricacion;

    public Vehiculo(String marca, String modelo, int anoFrabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFrabricacion = anoFrabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFrabricacion() {
        return anoFrabricacion;
    }
}
