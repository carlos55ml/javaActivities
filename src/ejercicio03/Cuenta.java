package ejercicio03;

public class Cuenta {
    private static long numOrdenCuenta=1000001;

    private long numCuenta;
    private double saldoActual, interes;
    private String dni;

    // constructores

    public Cuenta() {
        this.numCuenta = numOrdenCuenta;
        this.dni = "Unknown";
        this.saldoActual = 0;
        this.interes = 0.0F;

        numOrdenCuenta++;
    }

    public Cuenta(long saldoActual, double interes, String dni) {
        this.numCuenta = numOrdenCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;

        numOrdenCuenta++;
    }

    // setters

    public void actualizarSaldo(double saldo) {
        this.saldoActual = (saldo*(this.interes/365));
    }

    public void ingresar(double cant) {
        this.saldoActual += cant;
    }

    public void retirar(double cant) {
        if (cant >= this.saldoActual) {
            this.saldoActual -= cant;
        } else {
            System.out.print("\nNo puedes sacar esa cantidad de dinero.");
        }
    }

    // getters

    public String getDni() {
        return this.dni;
    }

    public double getNumCuenta() {
        return this.numCuenta;
    }

    public double getSaldo() {
        return this.saldoActual;
    }

    public double getInteres() {
        return this.interes;
    }

    // otros

    // tostring

    public String toString() {
        return "\n{dni: \""+this.dni+"\", num_cuenta: \""+this.numCuenta+"\", saldo_actual: \""+this.saldoActual+"\", interes: \""+this.interes+"\"}";
    }

}
