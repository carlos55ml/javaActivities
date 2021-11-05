package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad13 {
    public static void main(String[] args) throws IOException {
        /*
         * Realizar un programa que calcule el tiempo en horas y minutos que tarda un
         * tren en llegar a su destino. Para ello se le pedirán al usuario el día, hora
         * y minuto de salida y el día, hora y minuto de llegada.
         */

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int repetir = 0;

        do {

            /*
             * d -> dia h -> hora m -> minuto // s -> salida l -> llegada // t -> tiempo
             * 
             * (th == tiempo+hora: significa tiempo en horas)
             */
            int ds = 0, hs = 0, ms = 0, dl = 0, hl = 0, ml = 0, td = 0, th = 0, tm = 0;

            // para las opciones de validacion
            int opt1 = 0;

            // para las comprobacines de que el valor sea numero valido.
            boolean validNum = false;

            System.out.print("\nVamos a calcular el tiempo de viaje de un tren.");

            /* SALIDA */

            do {
                do {
                    // pide el dia de salida
                    ds = 0;
                    System.out.print("\nIntroduce el dia de salida: ");
                    try {
                        ds = Integer.parseInt(entrada.readLine());
                        validNum = true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                        validNum = false;
                    }
                    // comprueba de que sea un dia valido
                    if (validNum && ds <= 0 || ds > 31) {
                        System.out.print("\n[ERROR]: El numero debe estar entre 1 y 31");
                        validNum = false;
                    }
                } while (!validNum);

                do {
                    // pide la hora de salida
                    hs = 0;
                    System.out.print("\nIntroduce la hora de salida: ");
                    try {
                        hs = Integer.parseInt(entrada.readLine());
                        validNum = true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                        validNum = false;
                    }
                    // comprueba que sea una hora valida
                    if (validNum && hs < 0 || hs > 23) {
                        System.out.print("\n[ERROR]: El numero debe estar entre 0 y 23");
                        validNum = false;
                    }
                } while (!validNum);

                do {
                    // pide los minutos de salida
                    ms = 0;
                    System.out.print("\nIntroduce los minutos de salida: ");
                    try {
                        ms = Integer.parseInt(entrada.readLine());
                        validNum = true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                        validNum = false;
                    }
                    // comprueba que sea unos minutos validos
                    if (validNum && ms < 0 || ms > 59) {
                        System.out.print("\n[ERROR]: El numero debe estar entre 0 y 59");
                        validNum = false;
                    }
                } while (!validNum);

                // VALIDACION SALIDA. preguntamos al usuario si los datos son correctos
                System.out.print("\nFecha de salida: dia " + ds + " a las " + hs + ":" + ms);
                do {
                    System.out.print("\nEs esto correcto? (0 -> SI // Otro numero -> NO): ");
                    try {
                        opt1 = Integer.parseInt(entrada.readLine());
                        validNum = true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                        validNum = false;
                    }
                } while (!validNum);

            } while (opt1 != 0);

            /* LLEGADA */

            do {
                do {
                    // pedimos el dia de llegada
                    dl = 0;
                    System.out.print("\nIntroduce el dia de llegada: ");
                    try {
                        dl = Integer.parseInt(entrada.readLine());
                        validNum = true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                        validNum = false;
                    }
                    // no puede ser menor que dia salida
                    if (validNum) {
                        if (dl >= 1 && dl <= 31) {
                            if (dl < ds) {
                                System.out.print("\n[ERROR]: El dia de llegada no puede ser anterior al de salida.");
                                validNum = false;
                            }
                        } else {
                            System.out.print("\n[ERROR]: El numero debe estar entre 1 y 31");
                            validNum = false;
                        }
                    }
                } while (!validNum);

                do {
                    // pedimos la hora de llegada
                    hl = 0;
                    System.out.print("\nIntroduce la hora de llegada: ");
                    try {
                        hl = Integer.parseInt(entrada.readLine());
                        validNum = true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                        validNum = false;
                    }
                    // en caso de que el dia sea el mismo, la hora no puede ser menor.
                    if (validNum) {
                        if (hl >= 0 && hl <= 59) {
                            if (dl == ds && hl < hs) {
                                System.out.print(
                                        "\n[ERROR]: La hora de llegada no puede ser anterior a la hora de salida en el mismo dia");
                                validNum = false;
                            }
                        } else {
                            System.out.print("\n[ERROR]: El numero debe estar entre 0 y 23");
                            validNum = false;
                        }
                    }
                } while (!validNum);

                do {
                    // pedimos los minutos de llegada
                    ml = 0;
                    System.out.print("\nIntroduce los minutos de llegada: ");
                    try {
                        ml = Integer.parseInt(entrada.readLine());
                        validNum = true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                        validNum = false;
                    }
                    // en caso de que el dia y la hora sean las mismas, estos no pueden ser menor.
                    if (validNum) {
                        if (ml >= 0 && ml <= 59) {
                            if (dl == ds && hl == hs && ml < ms) {
                                System.out.print(
                                        "\n[ERROR]: Lo minutos de llegada no pueden ser anteriores a los de salida para el mismo dia a la misma hora.");
                                validNum = false;
                            }
                        } else {
                            System.out.print("\n[ERROR]: El numero debe estar entre 0 y 59");
                            validNum = false;
                        }
                    }
                } while (!validNum);

                // VALIDACION LLEGADA. preguntamos al usuario si los datos son correctos.
                System.out.print("\nFecha de llegada: dia " + dl + " a las " + hl + ":" + ml);
                do {
                    System.out.print("\nEs esto correcto? (0 -> SI // Otro numero -> NO): ");
                    try {
                        opt1 = Integer.parseInt(entrada.readLine());
                        validNum = true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El numero debe estar entre 0 y 59");
                        validNum = false;
                    }
                } while (!validNum);

            } while (opt1 != 0);

            System.out.print("\nFecha de salida: dia " + ds + " a las " + hs + ":" + ms);
            System.out.print("\nFecha de llegada: dia " + dl + " a las " + hl + ":" + ml);

            /* CALCULOS */

            // calculo de los dias
            if (dl != ds) {
                td = dl - ds;
            } else {
                td = 0;
            }

            // calculo de las horas. si sale negativa controlamos el total.
            if (hl != hs) {
                th = hl - hs;
                if (th < 0) {
                    // si es negativa restamos un dia. no dara valores
                    // negativos ya que lo tenemos controlado antes
                    td--;
                    th = th + 24;
                }
            } else {
                th = 0;
            }

            // calculo de los minutos.
            if (ml != ms) {
                tm = ml - ms;
                if (tm < 0) {
                    // si sale negativo restamos una hora
                    th--;
                    tm = tm + 60;
                }
            } else {
                tm = 0;
            }

            // es posible que el viaje no tarde ni un minuto. presentamos posibilidad
            if (td == 0 && th == 0 && tm == 0) {
                System.out.print("VIAJE SUPERSONICO. TU TREN TARDA MENOS DE 1 MINUTO!!");
            } else {
                // mostramos al usuario los resultados
                System.out.print("\n\nEl tiempo de viaje es: " + td + " dias, " + th + " horas y " + tm + " minutos.");
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
