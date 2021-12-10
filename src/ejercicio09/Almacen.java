package ejercicio09;

import tools.Salida;

public class Almacen {
    // tools
    Salida sda = new Salida();
    // atributos
    private float kgPapas, kgChocos;

    // constructores
    public Almacen(float kgPapas, float kgChocos) {
        this.kgPapas = kgPapas;
        this.kgChocos = kgChocos;
    }

    // metodos

    public void addPapas(float cant) {
        this.kgPapas += cant;
    }

    public void addChocos(float cant) {
        this.kgChocos += cant;
    }

    public void showPapas() {
        sda.print("\nHay "+this.kgPapas+" Kg de Papas en el almacen.\n");
    }

    public void showChocos() {
        sda.print("\nHay "+this.kgChocos+" Kg de Chocos en el almacen.\n");
    }

    public int getComensales() {
        float res1 = this.kgPapas/1.5F, res2 = this.kgChocos/0.5F;

        int a = (int)res1, b = (int)res2;

        return Math.min(a,b)*3;
    }
}
