
package poo.pagina47.ejercicio1;

public class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }


    public void moverse() {
        System.out.println("El vehículo se está desplazando.");
    }
}