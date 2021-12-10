package ejercicio03;

import tools.Entrada;

import java.io.IOException;

public class Main03 {
    public static void main(String[] args) throws IOException {
        Entrada entrada = new Entrada();

        System.out.print("\nVamos a gestionar cuentas bancarias como objetos.");

        Cuenta c1 = new Cuenta();

        System.out.print(c1);

        Cuenta c2 = new Cuenta(1240, 2.5, "57426313Z");

        System.out.print(c2);
    }
}
