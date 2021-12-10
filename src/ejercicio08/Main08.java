package ejercicio08;

import ejercicio07.Asignatura;
import tools.Salida;


public class Main08 {
    public static void main(String[] args) {
        Salida sda = new Salida();

        Asignatura asg1 = new Asignatura("Lengua", 5);
        Alumno a1 = new Alumno("Carlos", 20, asg1);
        sda.print("\nTest: "+a1);
    }
}
