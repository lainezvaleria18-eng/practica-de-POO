package poo.pagina40.ejercicio1;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.setNombre("León");
        animal1.setOrden("Carnívoro");
        animal1.setExtremidades(4);


        Animal animal2 = new Animal("Águila Real", "Accipitriformes", 2);


        System.out.println("DATOS DEL ANIMAL 1 ");
        System.out.println("Nombre: " + animal1.getNombre());
        System.out.println("Orden: " + animal1.getOrden());
        System.out.println("Número de extremidades: " + animal1.getExtremidades());

        System.out.println("\n DATOS DEL ANIMAL 2 ");
        System.out.println("Nombre: " + animal2.getNombre());
        System.out.println("Orden: " + animal2.getOrden());
        System.out.println("Número de extremidades: " + animal2.getExtremidades());
    }
}
