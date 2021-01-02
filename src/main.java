import model.Transporte;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {

    public static void main(String[] args) {
    ArrayList<Transporte> inventario = new ArrayList<Transporte>();

        inventario.add(new Transporte("Peugeot","206",4,200000));
        inventario.add(new Transporte("Honda","Titan","125cc",60000));
        inventario.add(new Transporte("Peugeot","208",5,250000));
        inventario.add(new Transporte("Yamaha","YBR","160cc",85000));


        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getPuertas() != null){
                System.out.println("Marca: "+ inventario.get(i).getMarca() +
                        " // Modelo: " +inventario.get(i).getModelo()+
                        " // Puertas: " + inventario.get(i).getPuertas()+
                        " // Precio: $" + inventario.get(i).getPrecio());
            }else {
                System.out.println("Marca: "+ inventario.get(i).getMarca() +
                        " // Modelo: " +inventario.get(i).getModelo()+
                        " // Cilindrada: " + inventario.get(i).getCilindrada()+
                        " // Precio: $" + inventario.get(i).getPrecio());
            }
        }
        System.out.println("==========================================");
        Integer maxPrecio = 0;
        Integer minPrecio = inventario.get(0).getPrecio();
        String autoMasCaro = "";
        String autoMasBarato = "";
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getPrecio() <= maxPrecio){
                continue;
            }else {
                maxPrecio = inventario.get(i).getPrecio();
                autoMasCaro = "" + inventario.get(i).getMarca() + " " + inventario.get(i).getModelo();
            }
        }
        System.out.println("Vehículo más caro: "+ autoMasCaro);

        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getPrecio() > minPrecio){
                continue;
            }else {
                minPrecio = inventario.get(i).getPrecio();
                autoMasBarato = "" + inventario.get(i).getMarca() + " " + inventario.get(i).getModelo();
            }
        }
        System.out.println("Vehículo más barato: " + autoMasBarato);

        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getModelo().contains("Y")){
                System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + inventario.get(i).getMarca() + " "+inventario.get(i).getModelo() + " $" +inventario.get(i).getPrecio() );
            }
        }
        System.out.println("==========================================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");

        Collections.sort(inventario, Comparator.comparing(Transporte::getPrecio));
        Collections.reverse(inventario);

        inventario.forEach(System.out::println);
    }
}
