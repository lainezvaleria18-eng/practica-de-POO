package poo.pagina40.ejercicio2;

import java.util.Scanner;

public class Nivel1 {

    public int puntaje;

    private String respuesta;

    private final String[] animales;

    private final Scanner ent;

    public Nivel1() {

        this.puntaje = 0;

        this.ent = new Scanner(System.in);

        this.animales = new String[2];

        this.animales[0] = "perro";

        this.animales[1] = "gato";
    }

    private void puntajePerro() {

        if (respuesta.equalsIgnoreCase(animales[0])) {

            System.out.println("¡Correcto! Haz ganado 10 puntos");

            puntaje += 10;

        } else {

            System.out.println("¡Incorrecto! La respuesta es: "
                    + animales[0]);

            System.out.println("Has perdido 5 puntos");

            puntaje -= 5;
        }
    }

    private void puntajeGato() {

        if (respuesta.equalsIgnoreCase(animales[1])) {

            System.out.println("¡Correcto! Haz ganado 10 puntos");

            puntaje += 10;

        } else {

            System.out.println("¡Incorrecto! La respuesta es: "
                    + animales[1]);

            System.out.println("Has perdido 5 puntos");

            puntaje -= 5;
        }
    }

    public void imprimePreguntas() {

        System.out.println("¿Es un animal que ladra y come croquetas?");

        respuesta = ent.nextLine().trim();

        puntajePerro();

        System.out.println("¿Es un animal que maúlla y toma leche?");

        respuesta = ent.nextLine().trim();

        puntajeGato();
    }

    public int getPuntaje() {

        return puntaje;
    }
}