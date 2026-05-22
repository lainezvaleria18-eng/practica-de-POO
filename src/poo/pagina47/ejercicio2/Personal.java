package poo.pagina47.ejercicio2;

public abstract class Personal {
    private String nombre;
    private String puesto;


    public Personal(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }


    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }


    public abstract void Registrar();
    public abstract void calcularSueldo();
}
