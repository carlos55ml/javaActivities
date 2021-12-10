package ejercicio00A;

import java.io.IOException;

import tools.*;

// import tools.*;

public class Main00A {

	public static void main(String[] args) throws IOException{

		Dni dnitools = new Dni();
		Entrada entrada = new Entrada();

		//Alumno carlos = new Alumno("Carlos", "Moran Lozano", "47426313Z", 19);

		// carlos.presentarAlumno();

		
		// carlos.setEdad();

		// carlos.presentarAlumno();

		
		// carlos.setNombre();
		
		// carlos.presentarAlumno();

		// carlos.setDni();

		// System.out.println(carlos);

		boolean valid = dnitools.checkDni(entrada.readString());

		if (valid) {
			System.out.println("Dni valido");
		} else {
			System.out.println("dni no valido");
		}

		
		// Alumno alumno2 = new Alumno(true);
		// alumno2.presentarAlumno();

		// System.out.println(carlos);
	}

}
