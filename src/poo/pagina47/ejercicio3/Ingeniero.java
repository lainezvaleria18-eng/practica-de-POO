package poo.pagina47.ejercicio3;

public class Ingeniero implements Profesion {
    private String nombre;
    private double sueldoBase;
    private double bonoProyecto;

    public Ingeniero(String nombre, double sueldoBase, double bonoProyecto) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.bonoProyecto = bonoProyecto;
    }

    @Override
    public void calcularSueldo() {
        double sueldoTotal = sueldoBase + bonoProyecto;
        System.out.println("💻 El Ingeniero(a) " + nombre + " tiene un sueldo total de: $" + sueldoTotal);
    }
}