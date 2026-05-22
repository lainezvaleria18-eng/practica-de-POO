package poo.pagina47.ejercicio1;

public class Automovil extends Vehiculo {

    public Automovil(String marca) {
        super(marca);
    }

    @Override
    public void moverse() {
        System.out.println("El automóvil " + getMarca() + " avanza por la carretera haciendo run-run 🚗.");
    }
}