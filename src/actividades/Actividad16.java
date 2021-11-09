package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad16 {
    public static void main(String[] args) throws IOException {
        /*
         * Un agricultor desea saber el costo de un cultivo de acuerdo a la semilla
         * seleccionada, conociendo el número de semillas que utilizará y el costo de
         * cada semilla. El valor de cada semilla se encuentra en la siguiente tabla:
         */
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        final int tp = 15, te = 20, rep = 10, pc = 8, pp = 9, ps = 11, cl = 15, cv = 13;

        int repetir = 0;

        do {
            int opt1 = 0, opt2 = 0, cant = 0, result = 0;
            boolean validNum = false;

            System.out.print("\nCalculo de precio de semillas.");

            System.out.print("\nIntroduce la semilla que quieres.");
            System.out.print("\n(1) => Tomate.");
            System.out.print("\n(2) => Repollo.");
            System.out.print("\n(3) => Patata.");
            System.out.print("\n(4) => Cebolla.");

            do {
                System.out.print("\nOpcion: ");
                try {
                    opt1 = Integer.parseInt(entrada.readLine());
                    validNum = true;
                } catch (NumberFormatException e) {
                    System.out.print("\n[ERROR]: El valor introducido no es un numero");
                    validNum = false;
                }
                if (validNum) {
                    if (opt1 < 1 || opt1 > 4) {
                        System.out.print("\nLa opcion introducida no es valida.");
                        validNum = false;
                    }
                }
            } while (!validNum);

            switch (opt1) {
            case 1:
                System.out.print("\nIntroduce el TIPO de semilla que quieres: ");
                System.out.print("\n(1) => Pera.");
                System.out.print("\n(2) => Ensalada.");
                do {
                    System.out.print("\nOpcion: ");
                    try {
                        opt2 = Integer.parseInt(entrada.readLine());
                        validNum = true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero");
                        validNum = false;
                    }
                    if (validNum) {
                        if (opt2 < 1 || opt2 > 2) {
                            System.out.print("\nLa opcion introducida no es valida.");
                            validNum = false;
                        }
                    }
                } while (!validNum);

                do {
                    System.out.print("\nCuantas semillas quieres?: ");
                    try {
                        cant = Integer.parseInt(entrada.readLine());
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero");
                        validNum = false;
                    }
                    if (validNum) {
                        if (cant < 0) {
                            System.out.print("\nLa cantidad no puede ser menor que 0.");
                            validNum = false;
                        }
                    }
                } while (!validNum);

                switch (opt2) {
                case 1:
                    result = cant * tp;
                    System.out.print("\nPara " + cant + " de tomate Pera son " + result + " euros.");
                    break;
                case 2:
                    result = cant * te;
                    System.out.print("\nPara " + cant + " de tomate Ensalada son " + result + " euros.");
                    break;
                }
                break;

            case 2:
                do {
                    System.out.print("\nCuantas semillas quieres?: ");
                    try {
                        cant = Integer.parseInt(entrada.readLine());
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero");
                        validNum = false;
                    }
                    if (validNum) {
                        if (cant < 0) {
                            System.out.print("\nLa cantidad no puede ser menor que 0.");
                            validNum = false;
                        }
                    }
                } while (!validNum);
                result = cant * rep;
                System.out.print("\nPara " + cant + " de Repollo son " + result + " euros.");
                break;

            case 3:
                System.out.print("\nIntroduce el TIPO de semilla que quieres: ");
                System.out.print("\n(1) => Criolla.");
                System.out.print("\n(2) => Pastusa.");
                System.out.print("\n(3) => Salentuna.");
                do {
                    System.out.print("\nOpcion: ");
                    try {
                        opt2 = Integer.parseInt(entrada.readLine());
                        validNum = true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero");
                        validNum = false;
                    }
                    if (validNum) {
                        if (opt2 < 1 || opt2 > 3) {
                            System.out.print("\nLa opcion introducida no es valida.");
                            validNum = false;
                        }
                    }
                } while (!validNum);

                do {
                    System.out.print("\nCuantas semillas quieres?: ");
                    try {
                        cant = Integer.parseInt(entrada.readLine());
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero");
                        validNum = false;
                    }
                    if (validNum) {
                        if (cant < 0) {
                            System.out.print("\nLa cantidad no puede ser menor que 0.");
                            validNum = false;
                        }
                    }
                } while (!validNum);

                switch (opt2) {
                case 1:
                    result = cant * pc;
                    System.out.print("\nPara " + cant + " de Patata Criolla son " + result + " euros.");
                    break;
                case 2:
                    result = cant * pp;
                    System.out.print("\nPara " + cant + " de Patata Pastusa son " + result + " euros.");
                    break;
                case 3:
                    result = cant * ps;
                    System.out.print("\nPara " + cant + " de Patata Pastusa son " + result + " euros.");
                    break;
                }
                break;

            case 4:
                System.out.print("\nIntroduce el TIPO de semilla que quieres: ");
                System.out.print("\n(1) => Larga.");
                System.out.print("\n(2) => Vieja.");
                do {
                    System.out.print("\nOpcion: ");
                    try {
                        opt2 = Integer.parseInt(entrada.readLine());
                        validNum = true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero");
                        validNum = false;
                    }
                    if (validNum) {
                        if (opt2 < 1 || opt2 > 2) {
                            System.out.print("\nLa opcion introducida no es valida.");
                            validNum = false;
                        }
                    }
                } while (!validNum);

                do {
                    System.out.print("\nCuantas semillas quieres?: ");
                    try {
                        cant = Integer.parseInt(entrada.readLine());
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero");
                        validNum = false;
                    }
                    if (validNum) {
                        if (cant < 0) {
                            System.out.print("\nLa cantidad no puede ser menor que 0.");
                            validNum = false;
                        }
                    }
                } while (!validNum);

                switch (opt2) {
                case 1:
                    result = cant * cl;
                    System.out.print("\nPara " + cant + " de Cebolla Larga son " + result + " euros.");
                    break;
                case 2:
                    result = cant * cv;
                    System.out.print("\nPara " + cant + " de Cebolla Vieja son " + result + " euros.");
                    break;
                }
                break;

            }

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
