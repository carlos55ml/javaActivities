package ejercicio00B;

import java.io.IOException;

import tools.*;

public class Main00B {

	public static void main(String[] args) throws IOException {

		Entrada entrada = new Entrada();

		Numero num1 = new Numero();

		System.out.print("\nValor de num1: "+num1.getValor());

		num1.setNumero(4);
		System.out.print("\nValor de num1: "+num1.getValor());

		int b = num1.getDoble();
		System.out.print("\nValor doble de num1: "+b);

		num1.anade(2);
		
		System.out.print("\nValor anadido de num1: "+num1.getValor());

		System.out.print("\nintroduce un numero para num2");
		Numero num2 = new Numero(entrada.readInt());

		System.out.print("\nEl valor de num2: "+num2.getValor());

	}

}
