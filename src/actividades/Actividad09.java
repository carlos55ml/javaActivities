package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad09 {

	public static void main(String[] args) throws IOException{
		/* Realizar un programa que pida al usuario dos números por teclado.
		Posteriormente el programa mostrará un menú que le permitirá al usuario calcularlos. */

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int option=0;

		do{
			boolean validNum=false;
			float op1=0,op2=0,result=0;

			System.out.println("\n\nCalculadora.");

			do {
				// pedimos el primer operando.
				System.out.print("\nIntroduce el primer operando: ");
				try {
					op1=Float.parseFloat(entrada.readLine());
					validNum=true;
				} catch (NumberFormatException e) {
					System.out.println("[ERROR]: El valor introducido no es un numero.");
					validNum=false;
				}
			} while (!validNum);

			do {
				// pedimos el segundo operando
				System.out.print("\nIntroduce el segundo operando: ");
				try {
					op2=Float.parseFloat(entrada.readLine());
					validNum=true;
				} catch (NumberFormatException e) {
					System.out.println("[ERROR]: El valor introducido no es un numero.");
					validNum=false;
				}
			} while (!validNum);

			// mostramos al ususario las distintas opciones
			System.out.println("¿Que operacion quiere hacer?");
			System.out.println("(1) -> Sumar.");
			System.out.println("(2) -> Restar.");
			System.out.println("(3) -> Multiplicar.");
			System.out.println("(4) -> Dividir.");
			System.out.println("(5) -> Acabar el programa.");

			do {
				// pedimos que opcion quiere hacer
				System.out.print("\nOpcion: ");
				try {
					option=Integer.parseInt(entrada.readLine());
					validNum=true;
				} catch (NumberFormatException e) {
					System.out.println("[ERROR]: El valor introducido no es un numero.");
					validNum=false;
				}
			} while (!validNum||option>5||option<1);

			// utilizamos `switch` dependiendo de la opcion del usuario
			switch (option) {
				case 1:
					result=op1+op2;
					System.out.println(op1+" + "+op2+" = "+result);
					break;
				case 2:
					result=op1-op2;
					System.out.println(op1+" - "+op2+" = "+result);
					break;
				case 3:
					result=op1*op2;
					System.out.println(op1+" x "+op2+" = "+result);
					break;
				case 4:
				// caso 4: division. el segundo operando no puede ser 0. lo controlamos
					while(op2==0){
						System.out.print("\nEl segundo operando no puede ser cero. Introduzcalo otra vez: ");
						do {
							try{
								op2=Float.parseFloat(entrada.readLine());
								validNum=true;
							}catch(NumberFormatException e){
								System.out.print("\n[ERROR]: El valor introducido no es un numero. Introduzcalo otra vez:");
								validNum=false;
							}
						} while (!validNum);
					}
					result=op1/op2;
					System.out.println(op1+" / "+op2+" = "+result);
					break;
				case 5:
					System.out.println("Acabando programa...");
					break;
			}
			// el programa se repetira mientras que el usuario no elija la opcion 5.
		}while(option!=5);
	}

}
