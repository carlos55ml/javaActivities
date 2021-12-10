package ejercicio00D;

import java.io.IOException;

import tools.Entrada;

public class Main00D {

	public static void main(String[] args) throws IOException {
		Entrada entrada = new Entrada();

		Punto p1 = new Punto();

		Punto p2 = new Punto(5, 15);

		Punto p2c = new Punto(p2);

		System.out.println("p1: "+p1);
		
		System.out.println("p2: "+p2);
		System.out.println("p2c: "+p2c);

		if (Punto.sonIguales(p2, p1)) {
			System.out.print("\nP2 y P1 son iguales");
		} else {
			System.out.print("\nP2 y P1 no son iguales");
		}

		System.out.print("\nIntroduce el valor X para p1");
		int x = entrada.readInt();

		System.out.print("\nIntroduce el valor Y para p1");
		int y = entrada.readInt();

		p1.desplazarXY(x, y);

		System.out.print("\nP1: "+p1);

		if (Punto.sonIguales(p2, p1)) {
			System.out.print("\nP2 y P1 son iguales");
		} else {
			System.out.print("\nP2 y P1 no son iguales");
		}


	}

}
