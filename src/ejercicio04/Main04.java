package ejercicio04;

import tools.Entrada;

import java.io.IOException;

public class Main04 {
    public static void main(String[] args) throws IOException {
        Entrada entrada = new Entrada();

        Cafetera cafe1 = new Cafetera();
        Cafetera cafe2 = new Cafetera(100);
        Cafetera cafe3 = new Cafetera(100, 50);

        System.out.print(cafe1);
        System.out.print(cafe2);
        System.out.print(cafe3);

        System.out.print("\nIntroduce una cantidad a servir de cafe2:");
        cafe2.servirTaza(entrada.readInt());
        System.out.print(cafe2);

        System.out.print("\nIntroduce una cantidad para rellenar cafe3:");
        cafe3.agregarCafe(entrada.readInt());
        System.out.print(cafe3);

        System.out.print("\nVaciando cafe1");
        cafe1.vaciarCafetera();
        System.out.print(cafe1);

    }
}
