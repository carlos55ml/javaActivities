package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad06 {

	public static void main(String[] args) throws IOException{
		/* Implementa un programa donde el usuario introduzca la nota de un alumno
		(número entero entre 0 y 10) y se escribirá su calificación según el valor de la
		nota ingresada: */

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int repetir=0;

		do{
			float nota=0;
			boolean validNum=false;

			System.out.print("\nIntroduce la nota del alumno: ");

			do{
				// control de que la nota este entre 0 y 10.
				System.out.print("\nIntroduce un numero entre 0 y 10: ");
				try {
					nota=Float.parseFloat(entrada.readLine());
					validNum=true;
				} catch (NumberFormatException e) {
					System.out.print("\n[ERROR]: El valor introducido no es un numero.\n");
					validNum=false;
				}
			}while(!validNum||nota<0||nota>10);

			// condiciones segun nota para mostrar mensaje adecuado.
			if(nota>=0&&nota<5){
				System.out.println("Suspenso.");
			}
			if(nota>=5&&nota<6){
				System.out.println("Bien.");
			}
			if(nota>=6&&nota<7){
				System.out.println("Notable.");
			}
			if(nota>=7&&nota<=10){
				System.out.println("Sobresaliente.");
			}

			do {
				System.out.print("\nQuiere repetir el programa? (0: SI // Otro numero: NO): ");
				try {
					repetir=Integer.parseInt(entrada.readLine());
					validNum=true;
				} catch (NumberFormatException e) {
					System.out.print("\n[ERROR]: El valor no es un numero.\nInfo del error:\n"+e+"\nIntroduzcalo otra vez: ");
					validNum=false;
				}
			} while (!validNum);

		}while(repetir==0);
	}

}
