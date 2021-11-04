package actividades;

public class Actividad04 {

	public static void main(String[] args){
        /* Realiza un programa utilizando bucles que muestre la siguiente figura por
        pantalla: */

            // bucle control linea.
            for(int i=1;i<=5;i++){
                // bucle control columna.
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }

    }
}
