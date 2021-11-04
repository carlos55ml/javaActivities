package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad03 {

	public static void main(String[] args) throws IOException{
		/* Realizar un programa que nos pida un número n (máximo 100), y nos diga
		cuantos números hay entre 1 y n que son primos. */

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int repetir=0;

		do {

			int num=0,cantPrimos=0,cantDivisores=0,result=0;
			boolean validNum=false;
			
			System.out.print("\nProporciona un numero entre 1 y 100 para calcular cuantos numeros primos hay: ");

			do {
				// controles para que el numero este entre 1 y 100. mostramos el mensaje
				// apropiado al usuario en caso de que no.
				num=0;
				try {
					num=Integer.parseInt(entrada.readLine());
					validNum=true;
				} catch (NumberFormatException e) {
					System.out.print("\n[ERROR]: El valor no es un numero.\nInfo del error:\n"+e+"\nIntroduzcalo otra vez: ");
					validNum=false;
				}

				if (num<1||num>100) {
					System.out.print("\n[ERROR]: El numero debe estar entre 1 y 100.\nIntroduzcalo otra vez: ");
				}
			} while (!validNum||num<1||num>100);

			for(int i=3;i<=num;i++){
				// Este bucle es el primer contador hasta el numero.
				cantDivisores=0;
				for(int j=2;j<=i-2;j++){
					// Este bucle calcula cuantos divisores tiene el numero del primer contador.
					result=i%j;
					if(result==0){
						cantDivisores=cantDivisores+1;
					}
				}
				if(cantDivisores==0){
					// si no tiene divisores sifnifica que es primo. añadimos al contador.
					cantPrimos=cantPrimos+1;
					//System.out.print("\n"+i);
				}
			}

			System.out.print("\nHay "+cantPrimos+" numeros primos entre "+num+" y 1");

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

		} while (repetir==0);

	}

}
