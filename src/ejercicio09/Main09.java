package ejercicio09;

import tools.*;

import java.io.IOException;

public class Main09 {
    public static void main(String[] args) throws IOException {
        Entrada ent = new Entrada();
        Salida sda = new Salida();

        boolean validOpt;

        sda.print("\nCuantos Kilos de PAPAS tiene el almacen?");
        float kgPapas = ent.readFloatGt0();

        sda.print("\nCuantos Kilos de CHOCOS tiene el almacen?");
        float kgChocos = ent.readFloatGt0();

        Almacen a1 = new Almacen(kgPapas, kgChocos);

        sda.print("\nSe puede dar de comer a "+a1.getComensales()+" comensales.");

        do {
            sda.print("\nQuiere añadir algo al almacen? (P, C, No):");
            String opt1 = ent.readString();
            if (!opt1.equalsIgnoreCase("no")) {
                validOpt = true;
                if (opt1.equalsIgnoreCase("p")) {
                    sda.print("\nIntroduce los kilos de papa a anadir:");
                    a1.addPapas(ent.readFloatGt0());
                } else if (opt1.equalsIgnoreCase("c")) {
                    sda.print("\nIntroduce los kilos de Choco a anadir:");
                    a1.addChocos(ent.readFloatGt0());
                } else {
                    sda.print("\nOpcion Invalida.");
                    validOpt = false;
                }
            } else if (opt1.equalsIgnoreCase("no")) {
                validOpt = true;
            } else {
                sda.print("\nOpcion Invalida.");
                validOpt = false;
            }
        } while (!validOpt);



    }
}
