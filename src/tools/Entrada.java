package tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrada {

    BufferedReader reading = new BufferedReader(new InputStreamReader(System.in));
    boolean validNum = false;

    // constructores

    public Entrada() {
    }

    // leer para String
    public String readString() throws IOException {
        String a = "";
        System.out.print(" > ");
        a = reading.readLine();

        return a;
    }

    // leer para int
    public int readInt() throws IOException {
        int a = 0;
        validNum = false;

        do {
            System.out.print(" > ");
            try {
                a = Integer.parseInt(reading.readLine());
                validNum = true;
            } catch (NumberFormatException e) {
                System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                validNum = false;
            }
        } while (!validNum);

        return a;

    }

    public int readIntGt0() throws IOException {
        int a = 0;
        validNum = false;

        do {
            System.out.print(" > ");
            try {
                a = Integer.parseInt(reading.readLine());
                validNum = true;
            } catch (NumberFormatException e) {
                System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                validNum = false;
            }
            if (validNum) {
                if (a <= 0) {
                    System.out.print("\nEl numero debe ser mayor que cero.");
                    validNum = false;
                }
            }
        } while (!validNum);

        return a;

    }

    // leer para int con rango limitado
    public int readRangeInt(int r1, int r2) throws IOException {
        int a = 0;
        validNum = false;
        do {
            System.out.print(" > ");
            try {
                a = Integer.parseInt(reading.readLine());
                validNum = true;
            } catch (NumberFormatException e) {
                System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                validNum = false;
            }
            if (validNum) {
                if (a < r1 || a > r2) {
                    System.out.print("\nEl valor introducido debe estar entre " + r1 + " y " + r2);
                    validNum = false;
                }
            }
        } while (!validNum);
        return a;
    }

    // leer para float
    public float readFloat() throws IOException {
        float a = 0;
        validNum = false;

        do {
            System.out.print(" > ");
            try {
                a = Float.parseFloat(reading.readLine());
                validNum = true;
            } catch (NumberFormatException e) {
                System.out.print("\n[ERROR]: El valor introducido no es un numero.\n > ");
                validNum = false;
            }
        } while (!validNum);

        return a;

    }

    public float readFloatGt0() throws IOException {
        float a = 0;
        validNum = false;

        do {
            System.out.print(" > ");
            try {
                a = Float.parseFloat(reading.readLine());
                validNum = true;
            } catch (NumberFormatException e) {
                System.out.print("\n[ERROR]: El valor introducido no es un numero.\n > ");
                validNum = false;
            }
            if (validNum) {
                if (a <= 0) {
                    System.out.print("\nEl numero debe ser mayor que cero.");
                    validNum = false;
                }
            }
        } while (!validNum);

        return a;

    }

    // leer para float
    public double readDouble() throws IOException {
        double a = 0;
        validNum = false;

        do {
            System.out.print(" > ");
            try {
                a = Double.parseDouble(reading.readLine());
                validNum = true;
            } catch (NumberFormatException e) {
                System.out.print("\n[ERROR]: El valor introducido no es un numero.\n > ");
                validNum = false;
            }
        } while (!validNum);

        return a;
    }

    // leer para float con rango limitado
    public float readRangeFloat(int r1, int r2) throws IOException {
        float a = 0;
        validNum = false;
        do {
            System.out.print(" > ");
            try {
                a = Float.parseFloat(reading.readLine());
                validNum = true;
            } catch (NumberFormatException e) {
                System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                validNum = false;
            }
            if (validNum) {
                if (a < r1 || a > r2) {
                    System.out.print("\nEl valor introducido debe estar entre " + r1 + " y " + r2);
                    validNum = false;
                }
            }
        } while (!validNum);
        return a;
    }

}
