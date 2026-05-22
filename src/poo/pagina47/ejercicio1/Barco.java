package poo.pagina47.ejercicio1;

public class Barco extends Vehiculo {

    public Barco(String marca) {
        super(marca);
    }

    @Override
    public void moverse() {
        System.out.println("El barco " + getMarca() + " navega en las olas del mar 🚢🌊.");
    }
}
