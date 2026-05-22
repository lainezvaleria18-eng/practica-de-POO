package poo.pagina40.ejercicio2;

import java.util.Scanner;

public class JuegoAnimales {

}

class Nivel1 {
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
            System.out.println("¡Incorrecto! La respuesta es: " + animales[0]);
            System.out.println("Has perdido 5 puntos");
            puntaje -= 5;
        }
    }

    private void puntajeGato() {
        if (respuesta.equalsIgnoreCase(animales[1])) {
            System.out.println("¡Correcto! Haz ganado 10 puntos");
            puntaje += 10;
        } else {
            System.out.println("¡Incorrecto! La respuesta es: " + animales[1]);
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

class Nivel2 {
    private int puntajeNivel2 = 0;
    private final Scanner entrada = new Scanner(System.in);

    private final String[] preguntas = {
            "¿Cuál es el único mamífero capaz de volar?",
            "¿Qué animal es conocido como el rey de la selva?",
            "¿Cuántos tentáculos tiene un pulpo?",
            "¿Qué animal terrestre es el más rápido?"
    };

    private final String[] respuestasCorrectas = {
            "murciélago",
            "león",
            "8",
            "guepardo"
    };

    public void jugarNivel2() {
        String resp;
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("\nPregunta " + (i + 1) + ": " + preguntas[i]);
            resp = entrada.nextLine().trim().toLowerCase();

                if (resp.equalsIgnoreCase(respuestasCorrectas[i])){
                System.out.println("¡Correcto! +20 puntos.");
                puntajeNivel2 += 20;
            } else {
                System.out.println("¡Incorrecto! Era: " + respuestasCorrectas[i] + ". -10 puntos.");
                puntajeNivel2 -= 10;
            }
        }
    }

    public int getPuntajeNivel2() {
        return puntajeNivel2;
    }
}