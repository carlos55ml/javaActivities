package ejercicio04;

public class Cafetera {
    // atributos
    private int capMax, cantAct;

    // constructores
    public Cafetera() {
        this.capMax = 1000;
        this.cantAct = 0;
    }

    public Cafetera(int capMax) {
        this.capMax = capMax;
        this.cantAct = capMax;
    }

    public Cafetera(int capMax, int cantAct) {
        this.capMax = capMax;
        this.cantAct = Math.min(cantAct, capMax);
    }

    // metodos
    public void llenarCafetera() {
        this.cantAct = this.capMax;
    }

    public void vaciarCafetera() {
        this.cantAct = 0;
    }

    public void servirTaza(int cant) {
        if (cant > this.cantAct) {
            this.cantAct = 0;
        } else {
            this.cantAct -= cant;
        }
    }

    public void agregarCafe(int cant) {
        if (cant > this.capMax) {
            this.cantAct = this.capMax;
        } else {
            this.cantAct += cant;
        }
    }

    public String toString(){
        return "\n{\"cap_max\": "+this.capMax+", \"cant_act\": "+this.cantAct+"}";
    }
}
