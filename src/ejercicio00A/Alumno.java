package ejercicio00A;

import java.io.IOException;

import tools.*;

public class Alumno {
	Entrada entrada = new Entrada();
	Dni dnitool = new Dni();
	// atributos
	private String nombre = "Unknow";
	private String apellidos = "Unknow";
	private String dni = "00000000Z";
	private int edad = 0;

	// constructores

	public Alumno() {
		this.nombre = "Unknown";
		this.apellidos = "Unknown";
		this.dni = "00000000Z";
		this.edad = 0;
	}

	public Alumno(String name, String surname, String dni, int age) {
		this.nombre = name;
		this.apellidos = surname;
		this.dni = dni;
		this.edad = age;
	}

	public Alumno(boolean create) throws IOException {
		if (create) {
			System.out.print("\nIntroduce un nombre para crear un alumno");
			this.nombre = entrada.readString();
	
			System.out.print("\nIntroduce los apellidos de "+this.nombre);
			this.apellidos = entrada.readString();
	
			System.out.print("\nIntroduce el DNI de "+this.nombre);
			this.dni = entrada.readString();
	
			System.out.print("\nIntroduce una la edad de "+this.nombre);
			this.edad = entrada.readRangeInt(0, 150);
		} else {
			this.nombre = "Unknown";
			this.apellidos = "Unknown";
			this.dni = "00000000Z";
			this.edad = 0;
		}
	}


	// metodos

	public void presentarAlumno() {
		System.out.print("\nHola. Mi nombre es "+this.nombre+" "+this.apellidos+". Mi DNI es "+this.dni+" y mi edad es "+this.edad);
	}

	public void cambiarIdentidad() throws IOException {
		System.out.print("\nIntroduce un nuevo nombre para "+this.nombre);
		this.nombre = entrada.readString();

		System.out.print("\nIntroduce unos nuevos apellidos ");
		this.apellidos = entrada.readString();

		System.out.print("\nIntroduce un nuevo DNI ");
		this.dni = entrada.readString();

		System.out.print("\nIntroduce una nueva edad ");
		this.edad = entrada.readRangeInt(0, 150);
	}

	// seters
	
	// seters donde usuario pone parametro
	public void setNombre() throws IOException {
		System.out.print("\nIntroduce un nuevo nombre para "+this.nombre);
		this.nombre = entrada.readString();
	}

	public void setApellidos() throws IOException {
		System.out.print("\nIntroduce unos nuevos apellidos para "+this.nombre);
		this.apellidos = entrada.readString();
	}

	public void setDni() throws IOException {
		boolean validDni = false;
		do {
			System.out.print("\nIntroduce un nuevo DNI para "+this.nombre);
			String d = entrada.readString();
			validDni = dnitool.checkDni(d);
			// validDni = true;
			if (validDni) {
				this.dni = d;
			}
		} while (!validDni);
	}

	public void setEdad() throws IOException {
		System.out.print("\nIntroduce una nueva edad para "+this.nombre);
		this.edad = entrada.readRangeInt(0, 150);
	}

	// seters donde el programa pone parametros

	public void setNombreP(String a) {
		this.nombre = a;
	}

	public void setApellidosP(String a) {
		this.apellidos = a;
	}

	public void setDniP(String a) {
		this.dni = a;
	}

	public void setEdadP(int a) {
		this.edad = a;
	}

	// geters

	public String getNombre() {
		String r = this.nombre;
		return r;
	}

	public String getApellidos() {
		String r = this.apellidos;
		return r;
	}

	public String getDni() {
		String r = this.dni;
		return r;
	}

	public int getEdad() {
		int r = this.edad;
		return r;
	}
	

	// otros

	public String toString() {
		String a = "\n[Nombre: \""+this.nombre+"\", Apellidos: \""+this.apellidos+"\", DNI: \""+this.dni+"\", Edad: \""+this.edad+"\"]\n";
		return a;
	}
}
