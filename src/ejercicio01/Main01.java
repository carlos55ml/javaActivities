package ejercicio01;

import tools.Entrada;

import java.io.IOException;

public class Main01 {
    public static void main(String[] args) throws IOException {
        Entrada entrada = new Entrada();

        System.out.print("\nVamos a guardar una pelicula como un objeto.");
        System.out.print("\n\nIntroduce el titulo de la pelicula:");
        String title = entrada.readString();

        System.out.print("\nIntroduce el DIRECTOR de la pelicula:");
        String director = entrada.readString();

        System.out.print("\nIntroduce los PROTAGONISTAS PRINCIPALES de la pelicula:");
        String protagonists = entrada.readString();

        System.out.print("\nIntroduce el GENERO de la pelicula (thriller, accion, comedia...):");
        String genre = entrada.readString();

        System.out.print("\nIntroduce la DURACION de la pelicula (en minutos):");
        int movieLength = entrada.readInt();

        System.out.print("\nPor ultimo, proporciona un breve resumen de la pelicula (opcional):");
        String summary = entrada.readString();

        DVDCine peli1 = new DVDCine(title, director, protagonists, summary, genre, movieLength);

        System.out.print(peli1);

        if (peli1.esThriller()) {
            System.out.print("\nLa pelicula "+peli1.getTitle()+" es de genero Thriller");
        } else {
            System.out.print("\nLa pelicula "+peli1.getTitle()+" es de genero "+peli1.getGenre());
        }

        if (peli1.tieneResumen()) {
            System.out.print("\nResumen de "+peli1.getTitle()+": "+peli1.getResumen());
        } else {
            System.out.print("\nLa pelicula "+peli1.getTitle()+" no tiene resumen.");
        }

        System.out.print("\nLa duracion de "+peli1.getTitle()+" es ");
        peli1.muestraDuracion();

        System.out.print("\nMostrando Detalles completos de la pelicula: ");
        peli1.muestraDVDCine();
    }
}
