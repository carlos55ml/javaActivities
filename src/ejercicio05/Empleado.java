package ejercicio05;

public class Empleado {
    // atributos
    private String dni;
    private float sueldoBase, pagoXtraHora, irpf;
    private int numHijos, cantHorasXtra;
    private boolean casado;

    // constructores
    public Empleado(String dni, float sueldoBase, float pagoXtraHora, int cantHorasXtra, float irpf, int numHijos, boolean casado) {
        this.dni = dni;
        this.sueldoBase = sueldoBase;
        this.pagoXtraHora = pagoXtraHora;
        this.cantHorasXtra = cantHorasXtra;
        this.irpf = irpf;
        this.numHijos = numHijos;
        this.casado = casado;
    }

    // metodos



    // setters

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPagoXtraHora(float pagoXtraHora) {
        this.pagoXtraHora = pagoXtraHora;
    }

    public void setCantHorasXtra(int cantHorasXtra) {
        this.cantHorasXtra = cantHorasXtra;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setIrpf(float irpf) {
        this.irpf = irpf;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    // getters

    public String getDni() {
        return this.dni;
    }

    public float getSueldoBase() {
        return this.sueldoBase;
    }

    public float getPagoXtraHora() {
        return this.pagoXtraHora;
    }

    public int getCantHorasXtra() {
        return this.cantHorasXtra;
    }

    public float getIrpf() {
        return this.irpf;
    }

    public int getNumHijos() {
        return this.numHijos;
    }

    public boolean isCasado() {
        return this.casado;
    }

    // tostring

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", sueldoBase=" + sueldoBase +
                ", pagoXtraHora=" + pagoXtraHora +
                ", irpf=" + irpf +
                ", numHijos=" + numHijos +
                ", cantHorasXtra=" + cantHorasXtra +
                ", casado=" + casado +
                '}';
    }
}
