package ejercicio07;

public class Asignatura {
    // atributos
    private static int numAsigCreated=0;
    private String nombre;
    private float nota;

    // constructores

    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
        numAsigCreated++;
    }

    // metodos

    public boolean isAprobado(){
        return this.nota >=5;
    }

    public String getAprobado(){
        if (this.nota >= 5) {
            return "Aprobado";
        } else {
            return "Suspenso";
        }
    }

    // getters

    public static int getNumAsigCreated() {
        return numAsigCreated;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }

    // setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    // tostring


    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
