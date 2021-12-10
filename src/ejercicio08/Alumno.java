package ejercicio08;

import ejercicio07.Asignatura;
import tools.Entrada;

import java.io.IOException;

public class Alumno {
    Entrada entrada = new Entrada();
    // atributos
    private String nombreAlm;
    private int edad;
    private Asignatura asignatura;

    // constructores

    public Alumno(String nombreAlm, int edad, Asignatura asignatura) {
        this.nombreAlm = nombreAlm;
        this.edad = edad;
        this.asignatura = asignatura;
    }

    // metodos

    // TODO finish asignatura
    public void test() {
        asignatura.getAprobado();
    }

    // setters and getters
    public String getNombreAlm() {
        return nombreAlm;
    }

    public void setNombreAlm(String nombreAlm) {
        this.nombreAlm = nombreAlm;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // tostring
    @Override
    public String toString() {
        return "Alumno{" +
                "nombreAlm='" + nombreAlm + '\'' +
                ", edad=" + edad +
                '}';
    }
}
