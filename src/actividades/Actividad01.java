package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Actividad01 {

	public static void main(String[] args) throws IOException{
		/* Realiza un programa en el que le pidas al usuario las notas de las 6 asignaturas
		del Ciclo de DAW y te calcule la nota media del curso. */

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int repetir=0;

		do{
			float nota=0,total=0,media=0;
			boolean validNum=false;

			System.out.print("\nVamos a calcular la nota media del curso.\n\n");

			// El uso de bucle `for` nos permite no tener que escribir la entrada 6 veces
			for(int i=1;i<=6;i++){
				// Usamos switch para cambiar el texto que mostramos al usuario cada vez.
				switch(i){
					case 1:
						System.out.print("\nIntroduce la nota de PROGRAMACION: ");
					break;
					case 2:
						System.out.print("\nIntroduce la nota de LENGUAJE DE MARCAS: ");
					break;
					case 3:
						System.out.print("\nIntroduce la nota de BASES DE DATOS: ");
					break;
					case 4:
						System.out.print("\nIntroduce la nota de ENTORNOS DE DESARROLLO: ");
					break;
					case 5:
						System.out.print("\nIntroduce la nota de SISTEMAS INFORMATICOS: ");
					break;
					case 6:
						System.out.print("\nIntroduce la nota de FOL: ");
					break;
				}
			
				do{
					// Controles para que muestre el mensaje correcto al usuario si la nota
					// no esta entre 0 y 10.
					nota=0;
					try{
						nota=Float.parseFloat(entrada.readLine());
						validNum=true;
					}catch(NumberFormatException err){
						System.out.print("\n[ERROR]: El valor no es un numero.\nInfo del error:\n"+err+"\nIntroduzcalo otra vez: ");
						validNum=false;
					}
					if(nota<0||nota>10){
						System.out.print("\n[ERROR]: La nota debe ser superior que 0 y menor o igual que 10.\nIntroduzcalo otra vez: ");
					}
				}while(!validNum||nota<0||nota>10);

				// Sumamos a un total ya que queremos calcular la nota media de todas
				// las notas.
				total=total+nota;
			}

			if(total>0){
				media=total/6;
			}else{
				media=total;
			}

			System.out.print("\nLa nota media es: "+media);

			do{
				// pregunta repeticion programa.
				System.out.print("\nQuiere repetir el programa? (0: SI // Otro numero: NO): ");
				try{
					repetir=Integer.parseInt(entrada.readLine());
					validNum=true;
				}catch(NumberFormatException err){
					System.out.print("\n[ERROR]: El valor no es un numero.\nInfo del error:\n"+err+"\n");
					validNum=false;
				}
			}while(!validNum);

		}while(repetir==0);

	}

}
