package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad15 {
    public static void main(String[] args) throws IOException {
        /*
         * Determina dada una secuencia de enteros los dos mayores. Controla los números
         * a introducir.
         */

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int repetir = 0;

        do {
            int cant = 0, num = 0, m1 = 0, m2 = 0, seq = 0;
            boolean validNum = false;

            System.out.print("\nDada una secuencia de numeros enteros te dire los dos mayores.");

            // pedimos la cantidad de numeros al usuario
            do {
                System.out.print("\nIntroduce la cantidad de numeros que vas a introducir: ");
                try {
                    cant = Integer.parseInt(entrada.readLine());
                    validNum = true;
                } catch (NumberFormatException e) {
                    System.out.print("\n[ERROR]: El valor introducido no es un numero");
                    validNum = false;
                }
                // la cantidad no puede ser menor que 2.
                if (validNum) {
                    if (cant < 2) {
                        System.out.print("\nEl valor no puede ser menor que 2.");
                        validNum = false;
                    }
                }
            } while (!validNum);

            // bucle comprobacion
            for (int i = 1; i <= cant; i++) {
                do {
                    System.out.print("\nIntroduce un numero: ");
                    try {
                        num = Integer.parseInt(entrada.readLine());
                        validNum = true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero");
                        validNum = false;
                    }
                } while (!validNum);

                // las dos primeras ejecuciones del bucle guardara los valores, sea cuales sean en las variables.
                // eso se hace para no tener que inicializar las variables a un numero absurdo, y para controlar si
                // el usuario solo pone valores menores que cero.
                if (seq == 0) {
                    m1 = num;
                    seq++;
                }
                if (seq == 1) {
                    if (num > m1) {
                        m2 = m1;
                        m1 = num;
                    } else {
                        m2 = num;
                    }
                    seq++;
                }

                // comprobacion de mayor
                if (num > m1) {
                    m2 = m1;
                    m1 = num;
                } else {
                    if (num > m2) {
                        m2 = num;
                    }
                }

            }

            // mostramos los resultados al usuario.
            System.out.print("\nLos dos mayores son " + m1 + " y " + m2);

            // pregunta repeticion programa
            do {
                System.out.print("\nQuiere repetir el programa? (0 -> SI // Otro numero -> NO): ");
                try {
                    repetir = Integer.parseInt(entrada.readLine());
                    validNum = true;
                } catch (NumberFormatException e) {
                    System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                    validNum = false;
                }
            } while (!validNum);

        } while (repetir == 0);

    }
}
