package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Actividad10 {

	public static void main(String[] args) throws IOException{
		/* Realizar un programa que pida al usuario dos números por teclado.
		Posteriormente el programa mostrará un menú que le permitirá al usuario calcularlos. */

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		Random random = new Random();

		int repetir=0;

		do{
			boolean validNum=false;
			int num=0,tryCount=0,aleatorio;

			// generamos un numero aleatorio cada vez que repetimos el programa
			aleatorio = random.nextInt(100) + 1;

			System.out.println("\nEstoy pensando un numero. Intenta adivinarlo.");

			do{
				// pedimos al usuario un numero
				do {
					System.out.print("\nTu apuesta: ");
					try {
						num=Integer.parseInt(entrada.readLine());
						validNum=true;
					} catch (NumberFormatException e) {
						System.out.print("\n[ERROR]: El valor introducido no es un numero. Introduzcalo otra vez.");
						validNum=false;
					}				
				} while (!validNum);

				// indicamos al usuario si su numero es mayor o menor.
				// -> esta comprobacion la hace si no acierta, para evitar mensajes
				//	raros o incluso sumar mas intentos de los que debe.
				if(num!=aleatorio){
					if(num>aleatorio){
						System.out.println("Tu numero es MAYOR. Intentalo otra vez.");
					}else{
						System.out.println("Tu numero es MENOR. Intentanlo otra vez.");
					}
					tryCount=tryCount+1;
				}
				// todo esto se repetira hasta que no acierte el numero
			}while(num!=aleatorio);

			System.out.println("\nHAS ACERTADO!! Te ha costado "+tryCount+" intentos.");

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
