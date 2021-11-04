package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad05 {

	public static void main(String[] args) throws IOException{
		/* Leer 10 números por teclado y a continuación realizar la media de los números
		positivos, la media de los negativos y contar el número de ceros. */

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int repetir=0;

		do{
			int num=0, cantPos=0,contPos=0,cantNeg=0,contNeg=0,contCeros=0;
			float mediaPos=0, mediaNeg=0;
			boolean validNum=false;

			System.out.println("\nIntroduce 10 numeros y haremos la media de los positivos, negativos y cantidad de ceros.\n");

			// sabemos cuantos numero queremos pedir, asi que hacemos bucle `for`
			for(int i=1;i<=10;i++){
				do {
					System.out.print("\nIntroduce un numero: ");
					try {
						num=Integer.parseInt(entrada.readLine());
						validNum=true;
					} catch (NumberFormatException e) {
						System.out.print("\n[ERROR]: El valor no es un numero entero. Introduzcalo otra vez: ");
						validNum=false;
					}
				} while (!validNum);

				// clasificamos el numero introducido
				if(num>0){
					contPos=contPos+1;
					cantPos=cantPos+num;
				}
				if (num<0) {
					contNeg=contNeg+1;
					cantNeg=cantNeg+num;
				}
				if(num==0){
					contCeros=contCeros+1;
				}

			}

			// tenemos que controlar que se hayan introducido numeros para no hacer una division
			// entre 0.
			if(contPos>0){
				mediaPos=cantPos/contPos;
				System.out.print("\nLa media de los numeros positivos es "+mediaPos);
			}else{
				System.out.print("\nNo se ha introducido ningun numero positivo.");
			}

			if(contNeg>0){
				mediaNeg=cantNeg/contNeg;
				System.out.print("\nLa media de los numeros negativos es "+mediaNeg);
			}else{
				System.out.print("\nNo se ha introducido ningun numero negativo.");
			}

			if(contCeros>0){
				System.out.print("\nSe han introducido "+contCeros+" ceros.");
			}else{
				System.out.print("\nNo se ha introducido ningun cero.");
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
