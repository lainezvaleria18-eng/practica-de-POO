package poo.pagina47.ejercicio1;

public class Avion extends Vehiculo {

    public Avion(String marca) {
        super(marca);
    }

    @Override
    public void moverse() {
        System.out.println("El avión " + getMarca() + " vuela a través de las nubes ✈️☁️.");
    }
}
