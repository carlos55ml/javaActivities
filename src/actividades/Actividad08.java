package actividades;

public class Actividad08 {
    public static void main(String[] args){
        /* Crea un algoritmo que te diga la suma total de los números pares existentes
        entre el 1 y el 100, y la suma total de los números impares existentes entre el 1
        y el 100. */

        int sumaPares=0,sumaImpares=0,result=0;

        for(int i=1;i<=100;i++){
            result=i%2;
            if(result==0){
                sumaPares=sumaPares+i;
            }
            if(result==1){
                sumaImpares=sumaImpares+i;
            }
        }
        System.out.println("Suma numeros pares entre 1 y 100: "+sumaPares);
        System.out.println("Suma numeros impares entre 1 y 100: "+sumaImpares);
    }

}
