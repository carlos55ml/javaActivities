package ejercicio00D;

public class Punto {
    // atributos
    int coordX, coordY;

    // constructores

    public Punto() {
        this.coordX = 0;
        this.coordY = 0;
    }

    public Punto(int x, int y) {
        this.coordX = x;
        this.coordY = y;
    }

    public Punto(Punto a) {
        this.coordX = a.coordX;
        this.coordY = a.coordY;
    }

    // metodos

    public void desplazarXY(int x, int y) {
        this.coordX += x;
        this.coordY += y;
    }

    public void desplazarX(int x) {
        this.coordX += x;
    }

    public void desplazarY(int y) {
        this.coordY = y;
    }

    // setters

    public void setX(int x) {
        this.coordX = x;
    }

    public void setY(int y) {
        this.coordY = y;
    }

    // getters

    public int getX() {
        return this.coordX;
    }

    public int getY() {
        return this.coordY;
    }

    // static

    public static boolean sonIguales(Punto a, Punto b) {
        return a.coordX == b.coordX && a.coordY == b.coordY;
    }

    // otros

    public String toString() {
        String r = "\n{coordX: "+this.coordX+", coordY: "+this.coordY+"}\n";
        return r;
    }
}
