package ejercicio07;

import tools.*;

import java.io.IOException;

public class Main07 {
    public static void main(String[] args) throws IOException {
        Entrada lect = new Entrada();
        Salida sda = new Salida();
        System.out.print("\nIntroduce el nombre de la asignatura:");
        String nombre = lect.readString();

        sda.print("\nIntroduce la nota para "+nombre);
        float nota = lect.readRangeFloat(0,10);

        Asignatura a1 = new Asignatura(nombre, nota);

        System.out.print(a1);

        if (a1.isAprobado()) {
            System.out.print("\nLa asignatura "+a1.getNombre()+" esta APROBADA con nota: "+a1.getNota());
        } else {
            System.out.print("\nLa asignatura "+a1.getNombre()+" esta SUSPENSA con nota: "+a1.getNota());
        }

        System.out.print("\nIntroduce el nombre de la asignatura:");
        nombre = lect.readString();

        System.out.print("\nIntroduce la nota para "+nombre);
        nota = lect.readRangeFloat(0,10);

        Asignatura a2 = new Asignatura(nombre, nota);

        System.out.print(a2);
        System.out.print("\nLa asignatura "+a2.getNombre()+" esta "+a2.getAprobado());
    }
}
