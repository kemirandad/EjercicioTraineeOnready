package model;

public abstract class  Vehiculos {
    private String marca;
    private String modelo;
    private Integer precio;

    public Vehiculos(String marca, String modelo, Integer precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}
