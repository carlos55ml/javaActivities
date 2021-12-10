package ejercicio00B;

public class Numero {
    private int num;

    // constructores

    public Numero(){
        num = 0;
    }

    public Numero(int a) {
        num = a;
    }

    // metodos

    public void anade(int a) {
        num += a;
    }

    public void resta(int a) {
        num -= a;
    }

    // setters

    public void setNumero(int a) {
        num = a;
    }

    // getters

    public int getValor() {
        return this.num;
    }

    public int getDoble() {
        int r = this.num * 2;
        return r;
    }

    public int getTriple() {
        int r = this.num * 3;
        return r;
    }

}
