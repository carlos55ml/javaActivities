package ejercicio02;

public class Vehiculo {
    private String model;
    private double power;
    private boolean cRuedas;

    // constructores

    public Vehiculo(String model) {
        this.model = model;
    }

    // setters

    public void setPotencia(double power) {
        this.power = power;
    }

    public void setCRuedas(boolean cRuedas) {
        this.cRuedas = cRuedas;
    }

    // getters

    public double getPotencia() {
        return this.power;
    }

    public boolean getCRuedas() {
        return this.cRuedas;
    }

    public String getModel() {
        return this.model;
    }

    // otros

    // to string

    public String toString() {
        return "\n{model: \""+this.model+"\", power: \""+this.power+"\", 4WD: \""+this.cRuedas+"\"}";
    }
}
