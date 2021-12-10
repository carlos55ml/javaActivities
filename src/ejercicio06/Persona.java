package ejercicio06;

public class Persona {
    // atributos
    private String nombre;
    private int edad;

    // constructores

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // metodos

    // getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // tostring
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
