package poo.pagina43.ejercicio1;

public class Futbolista extends Persona {

    private int dorsal;
    private String demarcacion;

    public Futbolista() {
        super();
    }

    public Futbolista(int id, String nombre,
                      String apellidos, int edad,
                      int dorsal, String demarcacion) {

        super(id, nombre, apellidos, edad);

        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {

        System.out.println(getNombre()
                + " está jugando como "
                + demarcacion + ".");
    }

    public void entrenar() {

        System.out.println(getNombre()
                + " está entrenando.");
    }
}