package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad13 {  
    public static void main(String[] args) throws IOException {
        /* Realizar un programa que calcule el tiempo en horas y minutos que tarda un tren
        en llegar a su destino. Para ello se le pedirán al usuario el día, hora y minuto 
        de salida y el día, hora y minuto de llegada. */

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int repetir=0;

        do {
            
            int ds=0,hs=0,ms=0,dl=0,hl=0,ml=0,td=0,th=0,tm=0;
            int opt1=0;
            boolean validNum=false;
            
            System.out.print("\nVamos a calcular el tiempo de viaje de un tren.");

            /* SALIDA */

            do{
                do {
                    ds=0;
                    System.out.print("\nIntroduce el dia de salida: ");
                    try {
                        ds=Integer.parseInt(entrada.readLine());
                        validNum=true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                        validNum=false;
                    }
                    if(validNum&&ds<=0||ds>31){
                        System.out.print("\n[ERROR]: El numero debe estar entre 1 y 31");
                        validNum=false;
                    }
                } while (!validNum);

                do {
                    hs=0;
                    System.out.print("\nIntroduce la hora de salida: ");
                    try {
                        hs=Integer.parseInt(entrada.readLine());
                        validNum=true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                        validNum=false;
                    }
                    if(validNum&&hs<0||hs>23){
                        System.out.print("\n[ERROR]: El numero debe estar entre 0 y 23");
                        validNum=false;
                    }
                } while (!validNum);

                do {
                    ms=0;
                    System.out.print("\nIntroduce los minutos de salida: ");
                    try {
                        ms=Integer.parseInt(entrada.readLine());
                        validNum=true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                        validNum=false;
                    }
                    if(validNum&&ms<0||ms>59){
                        System.out.print("\n[ERROR]: El numero debe estar entre 0 y 59");
                        validNum=false;
                    }
                } while (!validNum);

                // VALIDACION SALIDA
                System.out.print("\nFecha de salida: dia "+ds+" a las "+hs+":"+ms);

                do {
                    System.out.print("\nEs esto correcto? (0 -> SI // Otro numero -> NO): ");
                    try {
                        opt1=Integer.parseInt(entrada.readLine());
                        validNum=true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                        validNum=false;
                    }
                } while (!validNum);

            } while(opt1!=0);

            /* LLEGADA */

            do{
                do {
                    dl=0;
                    System.out.print("\nIntroduce el dia de llegada: ");
                    try {
                        dl=Integer.parseInt(entrada.readLine());
                        validNum=true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                        validNum=false;
                    }
                    if(validNum){
                        if(dl>=1&&dl<=31){
                            if(dl<ds){
                                System.out.print("\n[ERROR]: El dia de llegada no puede ser anterior al de salida.");
                                validNum=false;
                            }
                        } else {
                            System.out.print("\n[ERROR]: El numero debe estar entre 1 y 31");
                            validNum=false;
                        }
                    }
                } while (!validNum);

                do {
                    hl=0;
                    System.out.print("\nIntroduce la hora de llegada: ");
                    try {
                        hl=Integer.parseInt(entrada.readLine());
                        validNum=true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                        validNum=false;
                    }
                    if(validNum){
                        if(hl>=0&&hl<=59){
                            if(dl==ds&&hl<hs){
                                System.out.print("\n[ERROR]: La hora de llegada no puede ser anterior a la hora de salida en el mismo dia");
                                validNum=false;
                            }
                        }else {
                            System.out.print("\n[ERROR]: El numero debe estar entre 0 y 23");
                            validNum=false;
                        }
                    }
                } while (!validNum);

                do {
                    ml=0;
                    System.out.print("\nIntroduce los minutos de llegada: ");
                    try {
                        ml=Integer.parseInt(entrada.readLine());
                        validNum=true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                        validNum=false;
                    }
                    if(validNum){
                        if(ml>=0&&ml<=59){
                            if(dl==ds&&hl==hs&&ml<ms){
                                System.out.print("\n[ERROR]: Lo minutos de llegada no pueden ser anteriores a los de salida para el mismo dia a la misma hora.");
                                validNum=false;
                            }
                        }else {
                            System.out.print("\n[ERROR]: El numero debe estar entre 0 y 59");
                            validNum=false;
                        }
                    }
                } while (!validNum);

                // VALIDACION LLEGADA
                System.out.print("\nFecha de llegada: dia "+dl+" a las "+hl+":"+ml);

                do {
                    System.out.print("\nEs esto correcto? (0 -> SI // Otro numero -> NO): ");
                    try {
                        opt1=Integer.parseInt(entrada.readLine());
                        validNum=true;
                    } catch (NumberFormatException e) {
                        System.out.print("\n[ERROR]: El numero debe estar entre 0 y 59");
                        validNum=false;
                    }
                } while (!validNum);

            } while(opt1!=0);

            System.out.print("\nFecha de salida: dia "+ds+" a las "+hs+":"+ms);
            System.out.print("\nFecha de llegada: dia "+dl+" a las "+hl+":"+ml);

            /* CALCULOS */

            if(dl!=ds){
                td=dl-ds;
            } else {
                td=0;
            }

            if(hl!=hs){
                th=hl-hs;
                if(th<0){
                    td--;
                    th=Math.abs(th+24);
                }
            } else {
                th=0;
            }

            if(ml!=ms){
                tm=ml-ms;
                if(tm<0){
                    th--;
                    tm=Math.abs(tm+60);
                }
            } else {
                tm=0;
            }

            System.out.print("\n\nEl tiempo de viaje es: "+td+" dias, "+th+" horas y "+tm+" minutos.");

            do {
				System.out.print("\nQuiere repetir el programa? (0 -> SI // Otro numero -> NO): ");
				try {
					repetir=Integer.parseInt(entrada.readLine());
					validNum=true;
				} catch (NumberFormatException e) {
					System.out.print("\n[ERROR]: El valor introducido no es un numero.");
					validNum=false;
				}
			} while (!validNum);

        } while (repetir==0);

    }
    
}
