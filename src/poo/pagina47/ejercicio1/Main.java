package poo.pagina47.ejercicio1;

public class Main {

    public static void main(String[] args) {

        Vehiculo[] misVehiculos = new Vehiculo[3];

        misVehiculos[0] = new Automovil("Toyota");
        misVehiculos[1] = new Barco("Yamaha");
        misVehiculos[2] = new Avion("Boeing");

        System.out.println("=== Demostración de Polimorfismo ===");


        for (Vehiculo v : misVehiculos) {
            v.moverse();
        }
    }
}