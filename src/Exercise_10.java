import java.util.Scanner;

/**
 * Realizar la suma del 1 al número que indiquemos, este debe ser mayor que 1
 */
public class Exercise_10 {
    public static void main(String[] arg){

        int numero;
        //Habilitamos el scanner.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero mayor que 1: ");

        do {
            //Introducimos el numero y verificamos que sea mayor a 1.
            numero = scanner.nextInt();
            if(numero<=1){
                System.out.println("No introduciste un valor correcto, pone de nuevo el numerito");
            }
        } while (!(numero >= 1)); //Condicion para salir del ciclo.

        int suma=0;

        //Se realiza la suma y se imprime el resultado final
        for(int contador=1; contador <= numero; contador++){
            suma+=contador;
        }
        System.out.println("la suma es igual a "+suma);
    }
}
