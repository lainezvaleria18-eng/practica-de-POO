package poo.pagina43.ejercicio1;

public class Entrenador extends Persona {

    private String idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int id, String nombre,
                      String apellidos, int edad,
                      String idFederacion) {

        super(id, nombre, apellidos, edad);

        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {

        System.out.println("El entrenador "
                + getNombre()
                + " dirige el partido.");
    }

    public void dirigirEntrenamiento() {

        System.out.println("El entrenador "
                + getNombre()
                + " dirige el entrenamiento.");
    }
}