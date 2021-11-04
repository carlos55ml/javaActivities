package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad02 {

	public static void main(String[] args) throws IOException{
		/* Realiza un programa en el que le pidas al usuario un número de 4 cifras y
		muestre por pantalla cada una de las cifras que lo forman. */

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int repetir=0;

		do{

			int num=0,n1=0,n2=0,n3=0,n4=0;

			boolean validNum=false;

			System.out.print("\nProporciona un numero de cuatro cifras: ");

			do{ 
				// comprobaciones por si el numero no tiene 4 cifras etc etc.
				num=0;
				try{
					num=Integer.parseInt(entrada.readLine());
					validNum=true;
				}catch(NumberFormatException err){
					System.out.print("\n[ERROR]: El valor no es un numero.\nInfo del error:\n"+err+"\nIntroduzcalo otra vez: ");
					validNum=false;
				}
				if(num<1000||num>9999){
					System.out.print("\nEl numero debe ser de 4 cifras.\nIntroducelo otra vez: ");
				}
			}while(!validNum||num<1000||num>9999);

			n4=num%10; // resto de 1234/10 = 4 y lo guarda en n4
			num=num/10; // 1234/10 = 123.4

			n3=num%10; 
			num=num/10;
			
			n2=num%10;
			num=num/10;

			n1=num%10;
			num=num/10;

			System.out.print("\nLa primera cifra es: "+n1);
			System.out.print("\nLa segunda cifra es: "+n2);
			System.out.print("\nLa tercera cifra es: "+n3);
			System.out.print("\nLa cuarta cifra es: "+n4);

		/* // Este bucle no muestra las cifras en el orden que queremos. Lo dejamos por si acaso.
 			for(i=1;i<=4;i++){
				switch(i){
					case 1:
						System.out.print("\nLa primera cifra es: ");
					break;
					case 2:
						System.out.print("\nLa segunda cifra es: ");
					break;
					case 3:
						System.out.print("\nLa tercera cifra es: ");
					break;
					case 4:
						System.out.print("\nLa cuarta cifra es: ");
					break;
				}

				result=num%10;
				num=num/10;

				System.out.print(result);

			} */

			do { 
				System.out.print("\nQuiere repetir el programa? (0: SI // Otro numero: NO): ");
				try {
					repetir=Integer.parseInt(entrada.readLine());
				} catch (NumberFormatException e) {
					System.out.print("\n[ERROR]: El valor no es un numero.\nInfo del error:\n"+e+"\nIntroduzcalo otra vez: ");
					validNum=false;
				}
			} while (!validNum);

		}while(repetir==0);
		

	}

}
