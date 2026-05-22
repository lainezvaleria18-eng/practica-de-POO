package poo.pagina43.ejercicio1;

public class Herencia {
}
class Persona {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public Persona() {}

    public Persona(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void concentrarse() {
        System.out.println(nombre + " " + apellidos + " está concentrándose (Hotel).");
    }

    public void viajar() {
        System.out.println(nombre + " " + apellidos + " está viajando con la delegación.");
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}


class Futbolista extends Persona {
    private int dorsal;
    private String demarcacion;

    public Futbolista() { super(); }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println(getNombre() + " está jugando el partido como " + demarcacion + ".");
    }

    public void entrenar() {
        System.out.println(getNombre() + " está entrenando duro con el dorsal " + dorsal + ".");
    }
}

class Entrenador extends Persona {
    private String idFederacion;

    public Entrenador() { super(); }

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println("El DT " + getNombre() + " está dando indicaciones estratégicas.");
    }

    public void dirigirEntrenamiento() {
        System.out.println("El DT " + getNombre() + " dirige la práctica con código: " + idFederacion + ".");
    }
}

class Masajista extends Persona {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista() { super(); }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println("El masajista " + getNombre() + " (" + titulacion + ") está dando masajes.");
    }
}