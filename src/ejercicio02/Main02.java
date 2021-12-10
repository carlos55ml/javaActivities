package ejercicio02;

import tools.Entrada;

import java.io.IOException;

public class Main02 {
    public static void main(String[] args) throws IOException {
        Entrada entrada = new Entrada();

        System.out.print("\nVamos a crear un nuevo vehiculo y lo guardaremos como un objeto.");

        System.out.print("\nIntroduce el nombre de modelo del vehiculo:");
        String model = entrada.readString();

        Vehiculo coche1 = new Vehiculo(model);

        System.out.print("\nDatos del vehiculo coche1: "+coche1);

        System.out.print("\nIntroduce la potencia para el "+coche1.getModel());
        coche1.setPotencia(entrada.readDouble());

        // ask the user if car has 4WD, use 'set' method to save it.
        System.out.print("\nEs traccion a las cuatro ruedas? (S,N): ");
        String opt1 = entrada.readString();
        coche1.setCRuedas(opt1.equalsIgnoreCase("s"));

        System.out.print("\nDatos del vehiculo coche1: "+coche1);

    }
}
