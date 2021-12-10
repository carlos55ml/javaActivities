package ejercicio06;

import tools.Entrada;

import java.io.IOException;

public class Main06 {
    public static void main(String[] args) throws IOException {
        Entrada entrada = new Entrada();

        System.out.print("\nIntroduce el nombre de la persona a crear:");
        String nombre = entrada.readString();

        System.out.print("\nIntroduce la edad de la persona a crear:");
        int edad = entrada.readRangeInt(0, 200);

        Persona p1 = new Persona(nombre, edad);
        System.out.print(p1);
    }
}
