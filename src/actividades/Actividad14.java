package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad14 {
    public static void main(String[] args) throws IOException {
        /*
         * Programa que calcule el sueldo líquido a percibir por un vendedor sabiendo
         * que el sueldo total incluye los siguientes conceptos:
         */
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        // valores en euros
        final float sueldo=1276.30F, desp=1F, dietas=60F, retenSs=150F ;
        
        // porcentajes
        final float coms=5F, retenIrpf=18F; 
        

        int repetir = 0;

        do {

            float impVentas=0, kmj=0, dias=0, result=0, total=0;

            boolean validNum=false;

            System.out.print("\nCalcular sueldo liquido a percibir: ");

            do {
                System.out.print("\nIntroduce el importe total de ventas (en euros): ");
                try {
                    impVentas=Float.parseFloat(entrada.readLine());
                    validNum=true;
                } catch (NumberFormatException e) {
                    System.out.print("\n[ERROR]: El valor introducido no es un numero");
                    validNum = false;
                }
            } while (!validNum);

            do {
                System.out.print("\nIntroduce el kilometraje realizado (en kilometros): ");
                try {
                    kmj=Float.parseFloat(entrada.readLine());
                    validNum=true;
                } catch (NumberFormatException e) {
                    System.out.print("\n[ERROR]: El valor introducido no es un numero");
                    validNum = false;
                }
                if (validNum && kmj<0){
                    System.out.print("\n[ERROR]: Los kilometros no pueden ser negativos.");
                    validNum = false;
                }
            } while (!validNum);

            do {
                System.out.print("\nIntroduce los dias trabajados: ");
                try {
                    dias=Float.parseFloat(entrada.readLine());
                    validNum=true;
                } catch (NumberFormatException e) {
                    System.out.print("\n[ERROR]: El valor introducido no es un numero");
                    validNum = false;
                }
                if (validNum && dias<1){
                    System.out.print("\n[ERROR]: Los dias no pueden ser menor que cero.");
                    validNum = false;
                }
            } while (!validNum);

            result = sueldo + (impVentas*(coms/100)) + (kmj*desp) + (dias*dietas);
            total = result - (result*(retenIrpf/100)) - retenSs;

            System.out.println("\nTotal a percibir: "+total+"€");

            // pregunta repeticion programa
            do {
                System.out.print("\nQuiere repetir el programa? (0 -> SI // Otro numero -> NO): ");
                try {
                    repetir = Integer.parseInt(entrada.readLine());
                    validNum = true;
                } catch (NumberFormatException e) {
                    System.out.print("\n[ERROR]: El valor introducido no es un numero.");
                    validNum = false;
                }
            } while (!validNum);

        } while (repetir == 0);
    }
}
