package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Actividad12 {

	public static void main(String[] args) throws IOException{
		/* Diseña un programa que pida tirar un dado n veces. Determinar cuántas veces
		ha salido cada una de las caras del lado. (Los resultados tienen que salir en
		porcentajes). */

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		Random random = new Random();

		int repetir=0;

		do {
			int nVeces=0, dado,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;
			float media=0;
			boolean validNum=false;
			// le pedimos al usuario el numero de veces que quiere tirar el dado
			// el numero de veces tiene que ser mayor que cero.
			do {
				System.out.print("\nIntroduce el numero de veces que vas a tirar el dado: ");
				try {
					nVeces=Integer.parseInt(entrada.readLine());
					validNum=true;
				} catch (NumberFormatException e) {
					System.out.print("\n[ERROR]: El valor introducido no es un numero");
					validNum=false;
				}
			} while (!validNum||nVeces<=0);

			// bucle para tirar el dado `nVeces`
			for(int i=1;i<=nVeces;i++){
				dado=random.nextInt(6)+1;
				// switch dependiendo del dado.
				// -> nos permite saber cuantas veces ha salido un numero de una forma muy compacta
				switch(dado){
					case 1:
						count1++;
					break;
					case 2:
						count2++;
					break;
					case 3:
						count3++;
					break;
					case 4:
						count4++;
					break;
					case 5:
						count5++;
					break;
					case 6:
						count6++;
					break;
				}
			}

			// tenemos que calcular la media. tenemos que controlar que no divida entre 0.

			if(count1>0){
				media=((float)count1/(float)nVeces)*100;
				System.out.print("\nVeces que sale 1: "+count1+". Porcentaje: "+media+"%");
			} else {
				System.out.print("\nEl 1 no ha salido ni una vez.");
			}

			if(count2>0){
				media=((float)count2/(float)nVeces)*100;
				System.out.print("\nVeces que sale 2: "+count2+". Porcentaje: "+media+"%");
			} else {
				System.out.print("\nEl 2 no ha salido ni una vez.");
			}

			if(count3>0){
				media=((float)count3/(float)nVeces)*100;
				System.out.print("\nVeces que sale 3: "+count3+". Porcentaje: "+media+"%");
			} else {
				System.out.print("\nEl 3 no ha salido ni una vez.");
			}

			if(count4>0){
				media=((float)count4/(float)nVeces)*100;
				System.out.print("\nVeces que sale 4: "+count4+". Porcentaje: "+media+"%");
			} else {
				System.out.print("\nEl 4 no ha salido ni una vez.");
			}

			if(count5>0){
				media=((float)count5/(float)nVeces)*100;
				System.out.print("\nVeces que sale 4: "+count5+". Porcentaje: "+media+"%");
			} else {
				System.out.print("\nEl 5 no ha salido ni una vez.");
			}

			if(count6>0){
				media=((float)count6/(float)nVeces)*100;
				System.out.print("\nVeces que sale 6: "+count6+". Porcentaje: "+media+"%");
			} else {
				System.out.print("\nEl 6 no ha salido ni una vez.");
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


		} while (repetir==0);

	}

}
