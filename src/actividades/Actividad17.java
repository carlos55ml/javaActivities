package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad17 {
    public static void main(String[] args) throws IOException {
        /*
         * Realizar un programa que lea por teclado dos números: el primero de ellos
         * será un valor “baliza” y el segundo indicará la cantidad de números que
         * introducirá el usuario para comparar con dicho valor baliza. Como salida el
         * programa nos dirá cuántos valores son mayores que la baliza, cuántos menores
         * y la suma de los mayores.
         */
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int repetir = 0;

        do {
            
            int bal = 0, cant = 0, num = 0, my = 0, mn = 0, sum = 0;

            boolean validNum = false;

            System.out.print("\nCalculo con baliza.");

            do {
                System.out.print("\nIntroduce el numero baliza: ");
                try {
                    bal = Integer.parseInt(entrada.readLine());
                    validNum = true;
                } catch (NumberFormatException e) {
                    System.out.print("\n[ERROR]: El valor introducido no es un numero");
                    validNum = false;
                }
            } while (!validNum);

            do {
                System.out.print("\nIntroduce cuantos valores vas a comparar con la baliza: ");
                try {
                    cant = Integer.parseInt(entrada.readLine());
                    validNum = true;
                } catch (NumberFormatException e) {
                    System.out.print("\n[ERROR]: El valor introducido no es un numero");
                    validNum = false;
                }
                if (validNum) {
                    if (cant < 1)  {
                        System.out.print("\nLa cantidad no puede ser menor que 1.");
                        validNum = false;
                    }
                }
            } while (!validNum);

            System.out.print("\nVamos a comparar...");
            for (int i = 1; i<=cant; i++) {
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

                if (num > bal) {
                    my++;
                    sum = sum + num;
                }
                if (num < bal) {
                    mn++;
                }
            }

            System.out.print("\nHay " + mn + " numeros menores que baliza (" + bal +"), " + my + " mayores que baliza y la suma de estos es " + sum);

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

        } while (repetir==0);
    }
}
