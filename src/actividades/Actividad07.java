package actividades;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad07 {

	public static void main(String[] args) throws IOException{
		/* Crea un programa que imprima todos los números múltiplos de 3 que existen
        entre el número 1 y otro número introducido por el usuario. */

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int repetir=0;

		do{
            boolean validNum=false;
            int num=0, cantMult=0;

            System.out.println("Vamos a calcular cuantos multiplos de 3 hay entre 1 y el numero que tu proporciones.");

            do {
                // controla que el numero sea mayor que 0.
                System.out.print("\nIntroduzca un numero mayor que cero: ");
                try {
                    num=Integer.parseInt(entrada.readLine());
                    validNum=true;
                } catch (NumberFormatException e) {
                    System.out.println("[ERROR]: El valor introducido no es un numero entero.");
                }
            } while (!validNum||num<=0);

            // bucle contador hasta numero objetivo
            for(int i=1;i<=num;i++){
                // calcula si el resto de contador entre 3 es 0.
                if(i%3==0){
                    // lo muestra por pantalla y lo añade a un contador total
                    System.out.println("[ES MULTIPLO]: "+i);
                    cantMult=cantMult+1;
                }
            }

            System.out.println("Hay "+cantMult+" multiplos de 3 entre 1 y "+num);

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
