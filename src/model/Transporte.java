package model;

public class Transporte extends Vehiculos{
    private Integer puertas;
    private String cilindrada;

    public Transporte(String marca, String modelo,Integer puertas, Integer precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public Transporte(String marca, String modelo,String cilindrada, Integer precio){
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public Integer getPuertas() {
        return puertas;
    }


    public String getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
