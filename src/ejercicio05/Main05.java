package ejercicio05;

import tools.Entrada;

import java.io.IOException;

public class Main05 {
    public static void main(String[] args) throws IOException {
        Entrada entrada = new Entrada();

        Empleado empleado1 = new Empleado("55599982Z", 950, 4, 30, 9, 2, true );

        System.out.print(empleado1);


    }
}
