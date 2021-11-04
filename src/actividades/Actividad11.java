package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad11 {

	public static void main(String[] args) throws IOException{
		/* realizar un programa que dados dos números introducidos por teclado indique
		si son amigos o no. El programa debe ofrecer la posibilidad de continuar. */

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int repetir=0;

		do{

			int num1=0, num2=0,sumDiv1=0, sumDiv2=0,result=0;
			boolean validNum=false,sonAmigos=false;

			System.out.print("\nCalculadora de numero amigos.\nIntroduce dos numeros para calcular si son amigos.");

			do{
				// controlamos que el numero sea mayor que 0.
				System.out.print("\nIntroduce el primer numero (mayor que 0): ");
				try{
					num1=Integer.parseInt(entrada.readLine());
					validNum=true;
				} catch(NumberFormatException e){
					System.out.print("\n[ERROR]: El valor introducido no es un numero.");
					validNum=false;
				}
			} while(!validNum||num1<=0);

			do{
				// segundo numero.
				System.out.print("\nIntroduce el segundo numero (mayor que 0): ");
				try{
					num2=Integer.parseInt(entrada.readLine());
					validNum=true;
				} catch(NumberFormatException e){
					System.out.print("\n[ERROR]: El valor introducido no es un numero.");
					validNum=false;
				}
			} while(!validNum||num2<=0);

			// calcula los divisores de numero 1.
			for(int i=1; i<=num1-1;i++){
				result=num1%i;
				// si es divisor, lo añade a una suma
				if(result==0){
					sumDiv1=sumDiv1+i;
				}
			}

			// repetimos bucle anterior para numero 2.
			for(int i=1; i<=num2-1; i++){
				result=num2%i;
				if(result==0){
					sumDiv2=sumDiv2+i;
				}
			}

			// si la suma es igual al otro numero en ambos casos, son amigos.
			if(sumDiv1==num2&&sumDiv2==num1){
				sonAmigos=true;
			} else {
				sonAmigos=false;
			}

			// comprobacion da resultado un boolean y mostramos mensaje segun boolean
			// -> he decidido hacer esto para darle otro uso al boolean y condiciones
			//	se puede poner directamente en el bucle anterior.

			if(sonAmigos){
				System.out.print("\nLos numeros "+num1+" y "+num2+" SI SON AMIGOS.");
			} else {
				System.out.print("\nLos numeros "+num1+" y "+num2+" NO SON AMIGOS.");
			}

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

		}while(repetir==0);

	}

}
