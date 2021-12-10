package ejercicio00C;

import java.io.IOException;

import tools.*;

public class Main00C {

	public static void main(String[] args) throws IOException {
		Distancia dist = new Distancia();

		Entrada entrada = new Entrada();

		System.out.print("\nIntroduce un numero de millas para calcularlo en metros");
		float num = entrada.readFloat();
		
		float mm = dist.millasAMetros(num);
		System.out.print("\n"+num+" millas son "+mm+" metros.");

	}

}
